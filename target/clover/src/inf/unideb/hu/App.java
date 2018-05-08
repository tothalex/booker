/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu;

import inf.unideb.hu.Sender.Email;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.apache.commons.lang3.time.DurationFormatUtils;

import javax.mail.MessagingException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App extends Application
{public static class __CLR4_2_000jgxkv4oz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0074\u006f\u0074\u0068\u0061\u006c\u0065\u0078\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0067\u0069\u0074\u0068\u0075\u0062\u002f\u0062\u006f\u006f\u006b\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1525778063668L,8589935092L,16,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{try{__CLR4_2_000jgxkv4oz.R.inc(0);
        __CLR4_2_000jgxkv4oz.R.inc(1);Parent root = FXMLLoader.load(getClass().getResource("/scheme.fxml"));
        __CLR4_2_000jgxkv4oz.R.inc(2);primaryStage.setTitle("booker");
        __CLR4_2_000jgxkv4oz.R.inc(3);primaryStage.setScene(new Scene(root, 750, 400));
        __CLR4_2_000jgxkv4oz.R.inc(4);primaryStage.initStyle(StageStyle.UNDECORATED);
        __CLR4_2_000jgxkv4oz.R.inc(5);primaryStage.show();

        __CLR4_2_000jgxkv4oz.R.inc(6);root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {try{__CLR4_2_000jgxkv4oz.R.inc(7);
                __CLR4_2_000jgxkv4oz.R.inc(8);xOffset = event.getSceneX();
                __CLR4_2_000jgxkv4oz.R.inc(9);yOffset = event.getSceneY();
            }finally{__CLR4_2_000jgxkv4oz.R.flushNeeded();}}
        });
        __CLR4_2_000jgxkv4oz.R.inc(10);root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {try{__CLR4_2_000jgxkv4oz.R.inc(11);
                __CLR4_2_000jgxkv4oz.R.inc(12);primaryStage.setX(event.getScreenX() - xOffset);
                __CLR4_2_000jgxkv4oz.R.inc(13);primaryStage.setY(event.getScreenY() - yOffset);
            }finally{__CLR4_2_000jgxkv4oz.R.flushNeeded();}}
        });
    }finally{__CLR4_2_000jgxkv4oz.R.flushNeeded();}}

    public static void main(String[] args) throws MessagingException {try{__CLR4_2_000jgxkv4oz.R.inc(14);
        __CLR4_2_000jgxkv4oz.R.inc(15);launch(args);
    }finally{__CLR4_2_000jgxkv4oz.R.flushNeeded();}}

}
