package inf.unideb.hu.Controllers;

import com.jfoenix.controls.*;
import inf.unideb.hu.DBTimer.DBTimer;
import inf.unideb.hu.Database.DatabaseJSON;
import inf.unideb.hu.Database.IDatabase;
import inf.unideb.hu.Sender.Email;
import javafx.application.Platform;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


import javafx.stage.Stage;
import org.pmw.tinylog.*;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {


    @FXML private BorderPane borderPane;

    private static Parent timer = loadFXML("timer");
    private static Parent email = loadFXML("email");
    private static Parent view = loadFXML("View");

    @FXML
    void btnEmail(ActionEvent event) {
        borderPane.setCenter(email);
    }

    @FXML
    void btnTimer(ActionEvent event) {
        borderPane.setCenter(timer);
    }

    @FXML
    void btnView(ActionEvent event) {
        borderPane.setCenter(view);
    }

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

}
