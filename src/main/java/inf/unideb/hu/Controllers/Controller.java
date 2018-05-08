package inf.unideb.hu.Controllers;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.pmw.tinylog.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private BorderPane borderPane;
    private static Parent timer;
    private static Parent email;
    private static Parent view;

    @FXML void btnEmail(ActionEvent event) { borderPane.setCenter(email); }
    @FXML void btnTimer(ActionEvent event) { borderPane.setCenter(timer); }
    @FXML void btnView(ActionEvent event) { borderPane.setCenter(view); }

    @FXML
    void btnExit(ActionEvent event){
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();
    }

    private static Parent loadFXML(String fxml){
        Parent root = null;
        try {
            root = FXMLLoader.load(Controller.class.getResource("/view/" + fxml + ".fxml"));
        }catch (IOException e){
            Logger.error(e);
        }
        return root;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timer = loadFXML("timer");
        email = loadFXML("email");
        view = loadFXML("view");
    }
}
