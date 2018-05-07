package inf.unideb.hu.Database;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import inf.unideb.hu.Model.Time;
import org.apache.commons.io.FileUtils;
import org.pmw.tinylog.Logger;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DatabaseJSON implements IDatabase{

    private static Gson GSON = new GsonBuilder().create();
    private String FILE_NAME = null;
    private List<Time> times = null;

    public DatabaseJSON(String fileName){
        FILE_NAME = fileName;
        File file = new File(FILE_NAME + ".json");
        if(file.exists()) {
            File fileOld = new File(FILE_NAME + "old.json");
            try {
                FileUtils.copyFile(file,fileOld);
            } catch (IOException e) {
                Logger.error(e);
                return;
            }
        }
    }

    @Override
    public void load(){
        File file = new File(FILE_NAME + ".json");
        if (!file.exists()){
            try {
                file.createNewFile();
                times = new ArrayList<>();
                Logger.info(FILE_NAME + ".json file has been created!");
            } catch (IOException e) {
                Logger.error(e.getMessage());
                return;
            }
        }else{
            try(Reader reader = new FileReader(file)){
                Type type = new TypeToken<ArrayList<Time>>(){}.getType();
                times = GSON.fromJson(reader, type);
                Logger.info("File has been read!");
            }catch (Exception e){
                Logger.error(e);
                times = new ArrayList<>();
                Logger.info("New list been created!");
                return;
            }
        }
    }

    @Override
    public void save(){
        try(FileWriter fileWriter = new FileWriter(FILE_NAME + ".json")){
            GSON.toJson(times, fileWriter);
            Logger.info("File has been updated!");
        }catch (Exception e){
            Logger.error(e);
            return;
        }
    }

    @Override
    public void insertDBTimer(Time time){
        if (times != null){
            times.add(time);
        }else Logger.error("List value is null!");
    }

    @Override
    public List<Time> getDatabaseArray(){
        return times;
    }
}
