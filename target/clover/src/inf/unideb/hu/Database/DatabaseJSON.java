/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu.Database;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import inf.unideb.hu.Model.Time;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.pmw.tinylog.Logger;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseJSON implements IDatabase{public static class __CLR4_2_03t3tjgxkv4so{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0074\u006f\u0074\u0068\u0061\u006c\u0065\u0078\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0067\u0069\u0074\u0068\u0075\u0062\u002f\u0062\u006f\u006f\u006b\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1525778063668L,8589935092L,207,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Gson GSON = new GsonBuilder().create();
    private String FILE_NAME = null;
    private List<Time> times = null;

    public DatabaseJSON(String fileName){try{__CLR4_2_03t3tjgxkv4so.R.inc(137);
        __CLR4_2_03t3tjgxkv4so.R.inc(138);FILE_NAME = fileName;
        __CLR4_2_03t3tjgxkv4so.R.inc(139);File file = new File(FILE_NAME + ".json");
        __CLR4_2_03t3tjgxkv4so.R.inc(140);if((((file.exists())&&(__CLR4_2_03t3tjgxkv4so.R.iget(141)!=0|true))||(__CLR4_2_03t3tjgxkv4so.R.iget(142)==0&false))) {{
            __CLR4_2_03t3tjgxkv4so.R.inc(143);File fileOld = new File(FILE_NAME + "old.json");
            __CLR4_2_03t3tjgxkv4so.R.inc(144);try {
                __CLR4_2_03t3tjgxkv4so.R.inc(145);FileUtils.copyFile(file,fileOld);
            } catch (IOException e) {
                __CLR4_2_03t3tjgxkv4so.R.inc(146);Logger.error(e);
                __CLR4_2_03t3tjgxkv4so.R.inc(147);return;
            }
        }
    }}finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}

    @Override
    public void load(){try{__CLR4_2_03t3tjgxkv4so.R.inc(148);
        __CLR4_2_03t3tjgxkv4so.R.inc(149);File file = new File(FILE_NAME + ".json");
        __CLR4_2_03t3tjgxkv4so.R.inc(150);if ((((!file.exists())&&(__CLR4_2_03t3tjgxkv4so.R.iget(151)!=0|true))||(__CLR4_2_03t3tjgxkv4so.R.iget(152)==0&false))){{
            __CLR4_2_03t3tjgxkv4so.R.inc(153);try {
                __CLR4_2_03t3tjgxkv4so.R.inc(154);file.createNewFile();
                __CLR4_2_03t3tjgxkv4so.R.inc(155);times = new ArrayList<>();
                __CLR4_2_03t3tjgxkv4so.R.inc(156);Logger.info(FILE_NAME + ".json file has been created!");
            } catch (IOException e) {
                __CLR4_2_03t3tjgxkv4so.R.inc(157);Logger.error(e.getMessage());
                __CLR4_2_03t3tjgxkv4so.R.inc(158);return;
            }
        }}else{{
            class __CLR4_2_0$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_2_03t3tjgxkv4so.R.inc(159);try(__CLR4_2_0$AC0 __CLR$ACI0=new __CLR4_2_0$AC0(){{__CLR4_2_03t3tjgxkv4so.R.inc(160);}};Reader reader = new FileReader(file)){
                __CLR4_2_03t3tjgxkv4so.R.inc(161);Type type = new TypeToken<ArrayList<Time>>(){}.getType();
                __CLR4_2_03t3tjgxkv4so.R.inc(162);times = GSON.fromJson(reader, type);
                __CLR4_2_03t3tjgxkv4so.R.inc(163);Logger.info("File has been read!");
            }catch (Exception e){
                __CLR4_2_03t3tjgxkv4so.R.inc(164);Logger.error(e);
                __CLR4_2_03t3tjgxkv4so.R.inc(165);times = new ArrayList<>();
                __CLR4_2_03t3tjgxkv4so.R.inc(166);Logger.info("New list been created!");
                __CLR4_2_03t3tjgxkv4so.R.inc(167);return;
            }
        }
    }}finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}

    @Override
    public void save(){try{__CLR4_2_03t3tjgxkv4so.R.inc(168);
        class __CLR4_2_0$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_2_03t3tjgxkv4so.R.inc(169);try(__CLR4_2_0$AC1 __CLR$ACI1=new __CLR4_2_0$AC1(){{__CLR4_2_03t3tjgxkv4so.R.inc(170);}};FileWriter fileWriter = new FileWriter(FILE_NAME + ".json")){
            __CLR4_2_03t3tjgxkv4so.R.inc(171);GSON.toJson(times, fileWriter);
            __CLR4_2_03t3tjgxkv4so.R.inc(172);Logger.info("File has been updated!");
        }catch (Exception e){
            __CLR4_2_03t3tjgxkv4so.R.inc(173);Logger.error(e);
            __CLR4_2_03t3tjgxkv4so.R.inc(174);return;
        }
    }finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}

    @Override
    public void insertDBTimer(Time time){try{__CLR4_2_03t3tjgxkv4so.R.inc(175);
        __CLR4_2_03t3tjgxkv4so.R.inc(176);if ((((times != null)&&(__CLR4_2_03t3tjgxkv4so.R.iget(177)!=0|true))||(__CLR4_2_03t3tjgxkv4so.R.iget(178)==0&false))){{
            __CLR4_2_03t3tjgxkv4so.R.inc(179);times.add(time);
        }}else {__CLR4_2_03t3tjgxkv4so.R.inc(180);Logger.error("List value is null!");
    }}finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}

    @Override
    public List<Time> getDatabaseListCurrentMonth(){try{__CLR4_2_03t3tjgxkv4so.R.inc(181);
        __CLR4_2_03t3tjgxkv4so.R.inc(182);return times.stream()
                .filter(x -> x.getStart().getMonth().equals(LocalDateTime.now().getMonth()))
                .collect(Collectors.toList());
    }finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}

    private String quote(String s){try{__CLR4_2_03t3tjgxkv4so.R.inc(183); __CLR4_2_03t3tjgxkv4so.R.inc(184);return "\"" + s.replace('\n', ';') + "\""; }finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}
    private String formatDuration(long d) {try{__CLR4_2_03t3tjgxkv4so.R.inc(185); __CLR4_2_03t3tjgxkv4so.R.inc(186);return DurationFormatUtils.formatDuration(d, "HH:mm"); }finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}

    @Override
    public String totalCurrentMonth(){try{__CLR4_2_03t3tjgxkv4so.R.inc(187);
        __CLR4_2_03t3tjgxkv4so.R.inc(188);return formatDuration(times.stream()
                .filter(x -> x.getEnd().getMonth().equals(LocalDateTime.now().getMonth()))
                .mapToLong(x -> x.getDuration())
                .sum());
    }finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}

    @Override
    public String formatCSV(){try{__CLR4_2_03t3tjgxkv4so.R.inc(189);
        __CLR4_2_03t3tjgxkv4so.R.inc(190);if((((times.isEmpty())&&(__CLR4_2_03t3tjgxkv4so.R.iget(191)!=0|true))||(__CLR4_2_03t3tjgxkv4so.R.iget(192)==0&false))) {__CLR4_2_03t3tjgxkv4so.R.inc(193);return "";

        }__CLR4_2_03t3tjgxkv4so.R.inc(194);StringBuilder stringBuilder = new StringBuilder();
        __CLR4_2_03t3tjgxkv4so.R.inc(195);DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        __CLR4_2_03t3tjgxkv4so.R.inc(196);stringBuilder.append("StartDate");
        __CLR4_2_03t3tjgxkv4so.R.inc(197);stringBuilder.append(";EndDate");
        __CLR4_2_03t3tjgxkv4so.R.inc(198);stringBuilder.append(";Comments");
        __CLR4_2_03t3tjgxkv4so.R.inc(199);stringBuilder.append(";Duration (Total: " + totalCurrentMonth() + ")");

        __CLR4_2_03t3tjgxkv4so.R.inc(200);times.forEach( x -> {
            __CLR4_2_03t3tjgxkv4so.R.inc(201);stringBuilder.append(System.lineSeparator());
            __CLR4_2_03t3tjgxkv4so.R.inc(202);if ((((x.getStart().getMonth().equals(LocalDateTime.now().getMonth()))&&(__CLR4_2_03t3tjgxkv4so.R.iget(203)!=0|true))||(__CLR4_2_03t3tjgxkv4so.R.iget(204)==0&false)))
            {__CLR4_2_03t3tjgxkv4so.R.inc(205);stringBuilder.append( quote(x.getStart().format(formatter))
                          + ";" + quote(x.getEnd().format(formatter))
                          + ";" + quote(x.getComment())
                          + ";" + quote(formatDuration(x.getDuration()))
            );
        }});

        __CLR4_2_03t3tjgxkv4so.R.inc(206);return stringBuilder.toString();
    }finally{__CLR4_2_03t3tjgxkv4so.R.flushNeeded();}}
}











