/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu.Model;

import org.apache.commons.lang3.time.DurationFormatUtils;

import java.beans.Transient;
import java.time.Duration;
import java.time.LocalDateTime;
import org.pmw.tinylog.*;

public class Time {public static class __CLR4_2_05r5rjgxkv4t0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0074\u006f\u0074\u0068\u0061\u006c\u0065\u0078\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0067\u0069\u0074\u0068\u0075\u0062\u002f\u0062\u006f\u006f\u006b\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1525778063668L,8589935092L,226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LocalDateTime Start;
    private LocalDateTime End;
    private String Comment = "";

    public Time() {try{__CLR4_2_05r5rjgxkv4t0.R.inc(207); }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}

    public Time(LocalDateTime start, LocalDateTime end, String comment) {try{__CLR4_2_05r5rjgxkv4t0.R.inc(208);
        __CLR4_2_05r5rjgxkv4t0.R.inc(209);Start = start;
        __CLR4_2_05r5rjgxkv4t0.R.inc(210);End = end;
        __CLR4_2_05r5rjgxkv4t0.R.inc(211);this.Comment = comment;
    }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}

    public LocalDateTime getStart() {try{__CLR4_2_05r5rjgxkv4t0.R.inc(212); __CLR4_2_05r5rjgxkv4t0.R.inc(213);return Start; }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}
    public void setStart(LocalDateTime start) {try{__CLR4_2_05r5rjgxkv4t0.R.inc(214); __CLR4_2_05r5rjgxkv4t0.R.inc(215);Start = start; }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}
    public LocalDateTime getEnd() {try{__CLR4_2_05r5rjgxkv4t0.R.inc(216); __CLR4_2_05r5rjgxkv4t0.R.inc(217);return End; }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}
    public void setEnd(LocalDateTime end) {try{__CLR4_2_05r5rjgxkv4t0.R.inc(218); __CLR4_2_05r5rjgxkv4t0.R.inc(219);End = end; }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}
    public void setComment(String comment) {try{__CLR4_2_05r5rjgxkv4t0.R.inc(220); __CLR4_2_05r5rjgxkv4t0.R.inc(221);Comment = comment; }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}
    public String getComment() {try{__CLR4_2_05r5rjgxkv4t0.R.inc(222); __CLR4_2_05r5rjgxkv4t0.R.inc(223);return Comment; }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}
    @Transient
    public long getDuration(){try{__CLR4_2_05r5rjgxkv4t0.R.inc(224); __CLR4_2_05r5rjgxkv4t0.R.inc(225);return Duration.between(Start, End).toMillis(); }finally{__CLR4_2_05r5rjgxkv4t0.R.flushNeeded();}}
}
