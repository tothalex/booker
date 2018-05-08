/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu.Database;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import inf.unideb.hu.Model.Time;
import junit.framework.TestCase;
import org.pmw.tinylog.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DatabaseJSONTest extends TestCase {static class __CLR4_2_07m7mjgxkv4vk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0074\u006f\u0074\u0068\u0061\u006c\u0065\u0078\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0067\u0069\u0074\u0068\u0075\u0062\u002f\u0062\u006f\u006f\u006b\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1525778063965L,8589935092L,296,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private File file;
    private static Gson gson = new GsonBuilder().create();
    private List<Time> times;

    public void setUp() throws Exception {try{__CLR4_2_07m7mjgxkv4vk.R.inc(274);
        __CLR4_2_07m7mjgxkv4vk.R.inc(275);file = new File("test.json");
        __CLR4_2_07m7mjgxkv4vk.R.inc(276);file.createNewFile();
        __CLR4_2_07m7mjgxkv4vk.R.inc(277);Writer writer = new FileWriter("test.json");
        __CLR4_2_07m7mjgxkv4vk.R.inc(278);times = new ArrayList<>();
        __CLR4_2_07m7mjgxkv4vk.R.inc(279);LocalDateTime now = LocalDateTime.now();
        __CLR4_2_07m7mjgxkv4vk.R.inc(280);for(int i=0; (((i<10)&&(__CLR4_2_07m7mjgxkv4vk.R.iget(281)!=0|true))||(__CLR4_2_07m7mjgxkv4vk.R.iget(282)==0&false)); i++){{
            __CLR4_2_07m7mjgxkv4vk.R.inc(283);Time time = new Time(now.plusDays(i).plusMinutes( 2 * i), now.plusDays(i).plusMinutes( i * 3), Integer.toString(i));
            __CLR4_2_07m7mjgxkv4vk.R.inc(284);times.add(time);
        }
        }__CLR4_2_07m7mjgxkv4vk.R.inc(285);Logger.info(gson.toJson(times));
        __CLR4_2_07m7mjgxkv4vk.R.inc(286);writer.write(gson.toJson(times));
        __CLR4_2_07m7mjgxkv4vk.R.inc(287);writer.close();
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}

    public void tearDown() throws Exception {try{__CLR4_2_07m7mjgxkv4vk.R.inc(288);
        __CLR4_2_07m7mjgxkv4vk.R.inc(289);file.delete();
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}

    public void testLoad() {__CLR4_2_07m7mjgxkv4vk.R.globalSliceStart(getClass().getName(),290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_03p7l7l82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_07m7mjgxkv4vk.R.rethrow($CLV_t2$);}finally{__CLR4_2_07m7mjgxkv4vk.R.globalSliceEnd(getClass().getName(),"inf.unideb.hu.Database.DatabaseJSONTest.testLoad",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),290,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_03p7l7l82(){try{__CLR4_2_07m7mjgxkv4vk.R.inc(290);
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}

    public void testSave() {__CLR4_2_07m7mjgxkv4vk.R.globalSliceStart(getClass().getName(),291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0mtl08a83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_07m7mjgxkv4vk.R.rethrow($CLV_t2$);}finally{__CLR4_2_07m7mjgxkv4vk.R.globalSliceEnd(getClass().getName(),"inf.unideb.hu.Database.DatabaseJSONTest.testSave",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),291,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0mtl08a83(){try{__CLR4_2_07m7mjgxkv4vk.R.inc(291);
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}

    public void testInsertDBTimer() {__CLR4_2_07m7mjgxkv4vk.R.globalSliceStart(getClass().getName(),292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0z5ihur84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_07m7mjgxkv4vk.R.rethrow($CLV_t2$);}finally{__CLR4_2_07m7mjgxkv4vk.R.globalSliceEnd(getClass().getName(),"inf.unideb.hu.Database.DatabaseJSONTest.testInsertDBTimer",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),292,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0z5ihur84(){try{__CLR4_2_07m7mjgxkv4vk.R.inc(292);
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}

    public void testGetDatabaseListCurrentMonth() {__CLR4_2_07m7mjgxkv4vk.R.globalSliceStart(getClass().getName(),293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_023u7kl85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_07m7mjgxkv4vk.R.rethrow($CLV_t2$);}finally{__CLR4_2_07m7mjgxkv4vk.R.globalSliceEnd(getClass().getName(),"inf.unideb.hu.Database.DatabaseJSONTest.testGetDatabaseListCurrentMonth",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),293,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_023u7kl85(){try{__CLR4_2_07m7mjgxkv4vk.R.inc(293);
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}

    public void testTotalCurrentMonth() {__CLR4_2_07m7mjgxkv4vk.R.globalSliceStart(getClass().getName(),294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0obu2zk86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_07m7mjgxkv4vk.R.rethrow($CLV_t2$);}finally{__CLR4_2_07m7mjgxkv4vk.R.globalSliceEnd(getClass().getName(),"inf.unideb.hu.Database.DatabaseJSONTest.testTotalCurrentMonth",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),294,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0obu2zk86(){try{__CLR4_2_07m7mjgxkv4vk.R.inc(294);
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}

    public void testFormatCSV() {__CLR4_2_07m7mjgxkv4vk.R.globalSliceStart(getClass().getName(),295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0u8jbcs87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_07m7mjgxkv4vk.R.rethrow($CLV_t2$);}finally{__CLR4_2_07m7mjgxkv4vk.R.globalSliceEnd(getClass().getName(),"inf.unideb.hu.Database.DatabaseJSONTest.testFormatCSV",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),295,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0u8jbcs87(){try{__CLR4_2_07m7mjgxkv4vk.R.inc(295);
    }finally{__CLR4_2_07m7mjgxkv4vk.R.flushNeeded();}}
}