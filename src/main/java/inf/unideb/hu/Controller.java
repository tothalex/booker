package inf.unideb.hu;

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

public class Controller {

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
    public void btnExit(ActionEvent event){
        Platform.exit();
    }
    @FXML
    public void btnTimer(ActionEvent event) {
        paneTimer.setVisible(true);
        paneView.setVisible(false);
        paneUtilities.setVisible(false);
    }
    @FXML
    public void btnView(ActionEvent event) {
        paneView.setVisible(true);
        paneTimer.setVisible(false);
        paneUtilities.setVisible(false);
        if (database == null)
            database = new DatabaseJSON("database");
        database.load();

    }
    @FXML
    public void btnUtilities(ActionEvent event){
        paneUtilities.setVisible(true);
        paneView.setVisible(false);
        paneTimer.setVisible(false);
    }
    @FXML
    public void btnStart(ActionEvent event){
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
                    if(m == 60){
                        m = 0;
                    }
                    Logger.info("[" + h + ":" + m + "]");
                    textfieldStopWatch.setText(
                            (h <= 9 ? "0" + h: (Integer.toString(h))) + "h:" +
                                    (m <= 9 ? "0" + m:(Integer.toString(m))) + "m");
                }
            }, 60*1000, 60*1000);
        } catch (Exception e) {
            Logger.error(e.getMessage());
            labelStartPressed.setVisible(true);
            labelrun.setVisible(false);
            return;
        }
    }
    @FXML
    public void btnStop(ActionEvent event){
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
        } catch (Exception e){
            Logger.error(e.getMessage());
            labelStartnPressed.setVisible(true);
            return;
        }
    }
    @FXML
    public void btnComment(ActionEvent event){
        try{
            Logger.info("Comment button pressed!");
            dbTimer.addComment(textareaComment.getText());
            Logger.info("Comment added!(" + textareaComment.getText() + ")");
            textareaComment.setText("");
        }catch (Exception e){
            Logger.error(e);
            return;
        }
    }

    @FXML
    public void btnSend(ActionEvent event){
        try {
            database = database == null ? new DatabaseJSON("database") : database;
            database.load();
            String content = database.formatCSV();
            if (content.length() == 0) throw new Exception("Empty content");
            Email email = new Email(textfieldFrom.getText(), passfieldGMAIL.getText(), textfieldTo.getText());
            email.send(content);
            labelFailed.setVisible(false);
            labelSent.setVisible(true);
        }catch (Exception ex){
            Logger.error(ex);
            labelSent.setVisible(false);
            labelFailed.setVisible(true);
            return;
        }
    }

}
