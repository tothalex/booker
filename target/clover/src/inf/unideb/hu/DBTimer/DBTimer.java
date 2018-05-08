/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu.DBTimer;

import inf.unideb.hu.Model.Time;

import java.time.LocalDateTime;

public class DBTimer {public static class __CLR4_2_02y2yjgxkv4rr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0074\u006f\u0074\u0068\u0061\u006c\u0065\u0078\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0067\u0069\u0074\u0068\u0075\u0062\u002f\u0062\u006f\u006f\u006b\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1525778063668L,8589935092L,137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Time time;

    public DBTimer(){try{__CLR4_2_02y2yjgxkv4rr.R.inc(106);
        __CLR4_2_02y2yjgxkv4rr.R.inc(107);time = new Time();
    }finally{__CLR4_2_02y2yjgxkv4rr.R.flushNeeded();}}

    public void start() throws Exception {try{__CLR4_2_02y2yjgxkv4rr.R.inc(108);
        __CLR4_2_02y2yjgxkv4rr.R.inc(109);if ((((time.getStart() == null)&&(__CLR4_2_02y2yjgxkv4rr.R.iget(110)!=0|true))||(__CLR4_2_02y2yjgxkv4rr.R.iget(111)==0&false))) {__CLR4_2_02y2yjgxkv4rr.R.inc(112);time.setStart(LocalDateTime.now());
        }else {__CLR4_2_02y2yjgxkv4rr.R.inc(113);throw new Exception("DBTimer has been already started!");
    }}finally{__CLR4_2_02y2yjgxkv4rr.R.flushNeeded();}}

    public void stop() throws Exception {try{__CLR4_2_02y2yjgxkv4rr.R.inc(114);
        __CLR4_2_02y2yjgxkv4rr.R.inc(115);if ((((time.getStart() != null)&&(__CLR4_2_02y2yjgxkv4rr.R.iget(116)!=0|true))||(__CLR4_2_02y2yjgxkv4rr.R.iget(117)==0&false))) {{
            __CLR4_2_02y2yjgxkv4rr.R.inc(118);time.setEnd(LocalDateTime.now());
        }
        }else {__CLR4_2_02y2yjgxkv4rr.R.inc(119);throw new Exception("DBTimer has not been started!");
    }}finally{__CLR4_2_02y2yjgxkv4rr.R.flushNeeded();}}

    public Time getTime(){try{__CLR4_2_02y2yjgxkv4rr.R.inc(120);__CLR4_2_02y2yjgxkv4rr.R.inc(121);return time;}finally{__CLR4_2_02y2yjgxkv4rr.R.flushNeeded();}}
    public void addComment(String comment) throws Exception {try{__CLR4_2_02y2yjgxkv4rr.R.inc(122);
        __CLR4_2_02y2yjgxkv4rr.R.inc(123);if((((time.getStart() != null)&&(__CLR4_2_02y2yjgxkv4rr.R.iget(124)!=0|true))||(__CLR4_2_02y2yjgxkv4rr.R.iget(125)==0&false)))
            {__CLR4_2_02y2yjgxkv4rr.R.inc(126);if((((time.getComment().length() > 0)&&(__CLR4_2_02y2yjgxkv4rr.R.iget(127)!=0|true))||(__CLR4_2_02y2yjgxkv4rr.R.iget(128)==0&false)))
                {__CLR4_2_02y2yjgxkv4rr.R.inc(129);time.setComment( time.getComment() + System.lineSeparator() + comment );
            }else {__CLR4_2_02y2yjgxkv4rr.R.inc(130);time.setComment(comment);
        }}else {__CLR4_2_02y2yjgxkv4rr.R.inc(131);throw new Exception("DBTimer has not been started!");
    }}finally{__CLR4_2_02y2yjgxkv4rr.R.flushNeeded();}}

    public void reset(){try{__CLR4_2_02y2yjgxkv4rr.R.inc(132);__CLR4_2_02y2yjgxkv4rr.R.inc(133);this.time.setStart(null); __CLR4_2_02y2yjgxkv4rr.R.inc(134);this.time.setComment("");}finally{__CLR4_2_02y2yjgxkv4rr.R.flushNeeded();}}
    public String getComments(){try{__CLR4_2_02y2yjgxkv4rr.R.inc(135); __CLR4_2_02y2yjgxkv4rr.R.inc(136);return time.getComment(); }finally{__CLR4_2_02y2yjgxkv4rr.R.flushNeeded();}}

}
