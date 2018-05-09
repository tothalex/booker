package inf.unideb.hu.Controllers;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import inf.unideb.hu.Database.DatabaseFactory;
import inf.unideb.hu.Database.IDatabase;
import inf.unideb.hu.Sender.Email;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.pmw.tinylog.Logger;

public class ControllerEmail {

    @FXML private JFXTextField textfieldFrom;
    @FXML private JFXPasswordField passfieldGMAIL;
    @FXML private JFXTextField textfieldTo;
    @FXML private Label labelSent;
    @FXML private Label labelFailed;

    @FXML
    void btnSend(ActionEvent event) {
        try {
            IDatabase database = DatabaseFactory.get();
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
