package inf.unideb.hu.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTimePicker;
import inf.unideb.hu.Database.DatabaseFactory;
import inf.unideb.hu.Database.DatabaseJSON;
import inf.unideb.hu.Database.IDatabase;
import inf.unideb.hu.Model.Time;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ControllerInsert {

    @FXML private AnchorPane paneInsert;
    @FXML private JFXButton btnExit;
    @FXML private JFXTextArea textfieldComment;
    @FXML private JFXTimePicker timeStart;
    @FXML private JFXTimePicker timeEnd;
    @FXML private Label labelError;

    @FXML
    void btnExit(ActionEvent event) {
        Stage stage = (Stage) paneInsert.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnInsert(ActionEvent event) {
        if (timeStart.getValue() == null || timeEnd.getValue() == null){
            labelError.setVisible(true);
            return;
        }
        IDatabase database = DatabaseFactory.get();
        database.load();
        database.insertDBTime(
                new Time(
                        timeStart.getValue().atDate(LocalDate.now()),
                        timeEnd.getValue().atDate(LocalDate.now()),
                        textfieldComment.getText()
                ) );
        database.save();
        labelError.setVisible(false);
        btnExit.fire();
    }

}
