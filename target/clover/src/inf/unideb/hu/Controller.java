/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package inf.unideb.hu;

import com.jfoenix.controls.*;
import inf.unideb.hu.DBTimer.DBTimer;
import inf.unideb.hu.Database.DatabaseJSON;
import inf.unideb.hu.Database.IDatabase;
import inf.unideb.hu.Sender.Email;
import javafx.application.Platform;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;


import org.pmw.tinylog.*;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {public static class __CLR4_2_08888jgxkwyua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0074\u006f\u0074\u0068\u0061\u006c\u0065\u0078\u002f\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u002f\u0067\u0069\u0074\u0068\u0075\u0062\u002f\u0062\u006f\u006f\u006b\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1525778149362L,8589935092L,386,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML private Pane paneTimer;
    @FXML private Pane paneView;
    @FXML private Pane paneUtilities;
    @FXML private JFXTextField textfieldStopWatch;
    @FXML private JFXTextArea textareaComment;
    @FXML private Label labelStartPressed;
    @FXML private Label labelStartnPressed;
    @FXML private Label labelrun;
    @FXML private JFXTextField textfieldFrom;
    @FXML private JFXPasswordField passfieldGMAIL;
    @FXML private JFXTextField textfieldTo;
    @FXML private Label labelSent;
    @FXML private Label labelFailed;

    private IDatabase database = null;
    private DBTimer dbTimer = new DBTimer();
    private boolean STOP = false;
    private Timer timer = new Timer();

    @FXML
    public void btnExit(ActionEvent event){try{__CLR4_2_08888jgxkwyua.R.inc(296);
        __CLR4_2_08888jgxkwyua.R.inc(297);Platform.exit();
    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}
    @FXML
    public void btnTimer(ActionEvent event) {try{__CLR4_2_08888jgxkwyua.R.inc(298);
        __CLR4_2_08888jgxkwyua.R.inc(299);paneTimer.setVisible(true);
        __CLR4_2_08888jgxkwyua.R.inc(300);paneView.setVisible(false);
        __CLR4_2_08888jgxkwyua.R.inc(301);paneUtilities.setVisible(false);
    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}
    @FXML
    public void btnView(ActionEvent event) {try{__CLR4_2_08888jgxkwyua.R.inc(302);
        __CLR4_2_08888jgxkwyua.R.inc(303);paneView.setVisible(true);
        __CLR4_2_08888jgxkwyua.R.inc(304);paneTimer.setVisible(false);
        __CLR4_2_08888jgxkwyua.R.inc(305);paneUtilities.setVisible(false);
        __CLR4_2_08888jgxkwyua.R.inc(306);if ((((database == null)&&(__CLR4_2_08888jgxkwyua.R.iget(307)!=0|true))||(__CLR4_2_08888jgxkwyua.R.iget(308)==0&false)))
            {__CLR4_2_08888jgxkwyua.R.inc(309);database = new DatabaseJSON("database");
        }__CLR4_2_08888jgxkwyua.R.inc(310);database.load();

    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}
    @FXML
    public void btnUtilities(ActionEvent event){try{__CLR4_2_08888jgxkwyua.R.inc(311);
        __CLR4_2_08888jgxkwyua.R.inc(312);paneUtilities.setVisible(true);
        __CLR4_2_08888jgxkwyua.R.inc(313);paneView.setVisible(false);
        __CLR4_2_08888jgxkwyua.R.inc(314);paneTimer.setVisible(false);
    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}
    @FXML
    public void btnStart(ActionEvent event){try{__CLR4_2_08888jgxkwyua.R.inc(315);
        __CLR4_2_08888jgxkwyua.R.inc(316);try {
            __CLR4_2_08888jgxkwyua.R.inc(317);labelStartnPressed.setVisible(false);
            __CLR4_2_08888jgxkwyua.R.inc(318);labelrun.setVisible(true);
            __CLR4_2_08888jgxkwyua.R.inc(319);dbTimer.start();
            __CLR4_2_08888jgxkwyua.R.inc(320);Logger.info("Start button pressed!");
            __CLR4_2_08888jgxkwyua.R.inc(321);STOP = false;
            __CLR4_2_08888jgxkwyua.R.inc(322);textfieldStopWatch.setText("00h:00m");
            __CLR4_2_08888jgxkwyua.R.inc(323);timer.scheduleAtFixedRate(new TimerTask() {
                int h = 0;
                int m = 0;
                @Override
                public void run() {try{__CLR4_2_08888jgxkwyua.R.inc(324);
                    __CLR4_2_08888jgxkwyua.R.inc(325);if ((((STOP)&&(__CLR4_2_08888jgxkwyua.R.iget(326)!=0|true))||(__CLR4_2_08888jgxkwyua.R.iget(327)==0&false))) {__CLR4_2_08888jgxkwyua.R.inc(328);cancel();
                    }__CLR4_2_08888jgxkwyua.R.inc(329);m++;
                    __CLR4_2_08888jgxkwyua.R.inc(330);if((((m == 60)&&(__CLR4_2_08888jgxkwyua.R.iget(331)!=0|true))||(__CLR4_2_08888jgxkwyua.R.iget(332)==0&false))){{
                        __CLR4_2_08888jgxkwyua.R.inc(333);m = 0;
                    }
                    }__CLR4_2_08888jgxkwyua.R.inc(334);Logger.info("[" + h + ":" + m + "]");
                    __CLR4_2_08888jgxkwyua.R.inc(335);textfieldStopWatch.setText(
                            ((((h <= 9 )&&(__CLR4_2_08888jgxkwyua.R.iget(336)!=0|true))||(__CLR4_2_08888jgxkwyua.R.iget(337)==0&false))? "0" + h: (Integer.toString(h))) + "h:" +
                                    ((((m <= 9 )&&(__CLR4_2_08888jgxkwyua.R.iget(338)!=0|true))||(__CLR4_2_08888jgxkwyua.R.iget(339)==0&false))? "0" + m:(Integer.toString(m))) + "m");
                }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}
            }, 60*1000, 60*1000);
        } catch (Exception e) {
            __CLR4_2_08888jgxkwyua.R.inc(340);Logger.error(e.getMessage());
            __CLR4_2_08888jgxkwyua.R.inc(341);labelStartPressed.setVisible(true);
            __CLR4_2_08888jgxkwyua.R.inc(342);labelrun.setVisible(false);
            __CLR4_2_08888jgxkwyua.R.inc(343);return;
        }
    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}
    @FXML
    public void btnStop(ActionEvent event){try{__CLR4_2_08888jgxkwyua.R.inc(344);
        __CLR4_2_08888jgxkwyua.R.inc(345);try {
            __CLR4_2_08888jgxkwyua.R.inc(346);labelStartPressed.setVisible(false);
            __CLR4_2_08888jgxkwyua.R.inc(347);labelrun.setVisible(false);
            __CLR4_2_08888jgxkwyua.R.inc(348);dbTimer.stop();
            __CLR4_2_08888jgxkwyua.R.inc(349);database = new DatabaseJSON("database");
            __CLR4_2_08888jgxkwyua.R.inc(350);database.load();
            __CLR4_2_08888jgxkwyua.R.inc(351);database.insertDBTimer(dbTimer.getTime());
            __CLR4_2_08888jgxkwyua.R.inc(352);database.save();
            __CLR4_2_08888jgxkwyua.R.inc(353);dbTimer.reset();
            __CLR4_2_08888jgxkwyua.R.inc(354);STOP = true;

            __CLR4_2_08888jgxkwyua.R.inc(355);Logger.info("Stop button pressed!");
        } catch (Exception e){
            __CLR4_2_08888jgxkwyua.R.inc(356);Logger.error(e.getMessage());
            __CLR4_2_08888jgxkwyua.R.inc(357);labelStartnPressed.setVisible(true);
            __CLR4_2_08888jgxkwyua.R.inc(358);return;
        }
    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}
    @FXML
    public void btnComment(ActionEvent event){try{__CLR4_2_08888jgxkwyua.R.inc(359);
        __CLR4_2_08888jgxkwyua.R.inc(360);try{
            __CLR4_2_08888jgxkwyua.R.inc(361);Logger.info("Comment button pressed!");
            __CLR4_2_08888jgxkwyua.R.inc(362);dbTimer.addComment(textareaComment.getText());
            __CLR4_2_08888jgxkwyua.R.inc(363);Logger.info("Comment added!(" + textareaComment.getText() + ")");
            __CLR4_2_08888jgxkwyua.R.inc(364);textareaComment.setText("");
        }catch (Exception e){
            __CLR4_2_08888jgxkwyua.R.inc(365);Logger.error(e);
            __CLR4_2_08888jgxkwyua.R.inc(366);return;
        }
    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}

    @FXML
    public void btnSend(ActionEvent event){try{__CLR4_2_08888jgxkwyua.R.inc(367);
        __CLR4_2_08888jgxkwyua.R.inc(368);try {
            __CLR4_2_08888jgxkwyua.R.inc(369);database = (((database == null )&&(__CLR4_2_08888jgxkwyua.R.iget(370)!=0|true))||(__CLR4_2_08888jgxkwyua.R.iget(371)==0&false))? new DatabaseJSON("database") : database;
            __CLR4_2_08888jgxkwyua.R.inc(372);database.load();
            __CLR4_2_08888jgxkwyua.R.inc(373);String content = database.formatCSV();
            __CLR4_2_08888jgxkwyua.R.inc(374);if ((((content.length() == 0)&&(__CLR4_2_08888jgxkwyua.R.iget(375)!=0|true))||(__CLR4_2_08888jgxkwyua.R.iget(376)==0&false))) {__CLR4_2_08888jgxkwyua.R.inc(377);throw new Exception("Empty content");
            }__CLR4_2_08888jgxkwyua.R.inc(378);Email email = new Email(textfieldFrom.getText(), passfieldGMAIL.getText(), textfieldTo.getText());
            __CLR4_2_08888jgxkwyua.R.inc(379);email.send(content);
            __CLR4_2_08888jgxkwyua.R.inc(380);labelFailed.setVisible(false);
            __CLR4_2_08888jgxkwyua.R.inc(381);labelSent.setVisible(true);
        }catch (Exception ex){
            __CLR4_2_08888jgxkwyua.R.inc(382);Logger.error(ex);
            __CLR4_2_08888jgxkwyua.R.inc(383);labelSent.setVisible(false);
            __CLR4_2_08888jgxkwyua.R.inc(384);labelFailed.setVisible(true);
            __CLR4_2_08888jgxkwyua.R.inc(385);return;
        }
    }finally{__CLR4_2_08888jgxkwyua.R.flushNeeded();}}

}
