package inf.unideb.hu.Database;

import com.google.gson.Gson;
import inf.unideb.hu.Model.Time;
import org.junit.*;
import org.pmw.tinylog.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class DatabaseJSONTest {

    private static String path = "src/test/resources/";
    private static File file;
    private static Gson GSON = new Gson();
    private static List<Time> timeList;

    @BeforeClass
    public static void setUpClass() throws Exception {
        file = new File(path + "test" + ".json");
        file.createNewFile();
        Writer writer = new FileWriter(file);
        LocalDateTime now = LocalDateTime.now();
        timeList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            now.plusDays(i);
            Time time = new Time(now, now.plusMinutes(i), Integer.toString(i));
            timeList.add(time);
        }
        writer.write(GSON.toJson(timeList));
        writer.close();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        file.delete();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    private static boolean testLists(List<Time> list1, List<Time> list2) {
        for (Time t1 : list1){
            boolean ok = false;
            for (Time t2 : list2){
                if (t1.equals(t2)){
                    ok = true;
                    break;
                }
            }
            if (!ok) return false;
        }
        return true;
    }

    @Test
    public void load() {
        DatabaseJSON databaseJSON = new DatabaseJSON(path + "test", false);
        databaseJSON.load();
        if (!testLists(databaseJSON.getList(), timeList)) fail();
    }

    @Test
    public void insertDBTimer() {
        DatabaseJSON databaseJSON = new DatabaseJSON(path + "test", false);
        databaseJSON.load();
        Time time = new Time(LocalDateTime.now(), LocalDateTime.now().plusMinutes(30), "asd");
        databaseJSON.insertDBTime(time);
        List<Time> temp = new ArrayList<>(timeList);
        temp.add(time);
        if(!testLists(temp, databaseJSON.getList())) fail();
    }

    @Test
    public void getDatabaseListCurrentMonth() {
        DatabaseJSON databaseJSON = new DatabaseJSON(path + "test", false);
        databaseJSON.load();
        Time time = new Time(LocalDateTime.now().minusMonths(2), LocalDateTime.now().minusMonths(2).plusMinutes(30), "asd");
        databaseJSON.insertDBTime(time);
        for (Time t : databaseJSON.getDatabaseListCurrentMonth()){
            if (!t.getStart().getMonth().equals(LocalDateTime.now().getMonth())) fail();
        }
    }

    @Test
    public void totalCurrentMonth() {
        DatabaseJSON databaseJSON = new DatabaseJSON(path + "test", false);
        databaseJSON.load();
        databaseJSON.insertDBTime(new Time(LocalDateTime.now(), LocalDateTime.now().plusMinutes(30), "asd"));
        if ( !databaseJSON.totalCurrentMonth().equals("03:40") ) fail();

        databaseJSON.insertDBTime(new Time(LocalDateTime.now(), LocalDateTime.now().plusMinutes(20), "asd"));
        if ( !databaseJSON.totalCurrentMonth().equals("04:00") ) fail();

        databaseJSON.insertDBTime(new Time(LocalDateTime.now(), LocalDateTime.now().plusDays(1), "asd"));
        if ( !databaseJSON.totalCurrentMonth().equals("28:00") ) fail();

    }
}