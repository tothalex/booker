package inf.unideb.hu.Controllers;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import inf.unideb.hu.DBTimer.DBTimer;
import inf.unideb.hu.Database.DatabaseJSON;
import inf.unideb.hu.Database.IDatabase;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.pmw.tinylog.Logger;

import javax.naming.event.EventContext;
import java.util.Timer;
import java.util.TimerTask;

public class ControllerTimer {

    private IDatabase database = null;
    private DBTimer dbTimer = new DBTimer();
    private boolean STOP = false;
    private Timer timer = new Timer();

    @FXML private JFXTextField textfieldStopWatch;
    @FXML private JFXTextArea textareaComment;
    @FXML protected Label labelStartPressed;
    @FXML private Label labelStartnPressed;
    @FXML private Label labelrun;

    @FXML
    public void btnStart(Event event) {
        try {
            labelStartnPressed.setVisible(false);
            labelrun.setVisible(true);
            dbTimer.start();
            Logger.info("Start button pressed!");
            STOP = false;
            textfieldStopWatch.setText("00h:00m");
            timer.scheduleAtFixedRate(new TimerTask() {
                int h = 0;
                int m = 0;

                @Override
                public void run() {
                    if (STOP) cancel();
                    m++;
                    if (m == 60) {
                        m = 0;
                    }
                    Logger.info("[" + h + ":" + m + "]");
                    textfieldStopWatch.setText(
                            (h <= 9 ? "0" + h : (Integer.toString(h))) + "h:" +
                                    (m <= 9 ? "0" + m : (Integer.toString(m))) + "m");
                }
            }, 60 * 1000, 60 * 1000);
        } catch (Exception e) {
            Logger.error(e.getMessage());
            labelStartPressed.setVisible(true);
            labelrun.setVisible(false);
            return;
        }
    }

    @FXML
    public void btnStop(Event event) {
        try {
            labelStartPressed.setVisible(false);
            labelrun.setVisible(false);
            dbTimer.stop();
            database = new DatabaseJSON("database");
            database.load();
            database.insertDBTimer(dbTimer.getTime());
            database.save();
            dbTimer.reset();
            STOP = true;

            Logger.info("Stop button pressed!");
        } catch (Exception e) {
            Logger.error(e.getMessage());
            labelStartnPressed.setVisible(true);
            return;
        }
    }

    @FXML
    public void btnComment(Event event) {
        try {
            Logger.info("Comment button pressed!");
            dbTimer.addComment(textareaComment.getText());
            Logger.info("Comment added!(" + textareaComment.getText() + ")");
            textareaComment.setText("");
        } catch (Exception e) {
            Logger.error(e);
            return;
        }
    }

}
