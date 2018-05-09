package inf.unideb.hu.Controllers;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import inf.unideb.hu.Database.DatabaseFactory;
import inf.unideb.hu.Database.IDatabase;
import inf.unideb.hu.Model.TimeRecursive;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.pmw.tinylog.Logger;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class ControllerView {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @FXML
    private JFXTreeTableView<TimeRecursive> table;
    @FXML
    private JFXTextField textfieldTotal;
    @FXML
    private JFXTimePicker timeStart;
    @FXML
    private JFXTimePicker timeEnd;

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    void btnRefresh(ActionEvent event) {
        IDatabase database = DatabaseFactory.get();
        initialize(database);
    }

    @FXML
    void btnInsert(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/view/insert.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 200);
            Stage stage = new Stage();
            stage.setTitle("Insert");
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
            stage.show();
        } catch (IOException e) {
            Logger.info(e);
            return;
        }
    }

    public void initialize(IDatabase database) {

        JFXTreeTableColumn<TimeRecursive, String> colStart = new JFXTreeTableColumn<>("Start");
        colStart.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getValue().getStart().format(formatter)));
        JFXTreeTableColumn<TimeRecursive, String> colEnd = new JFXTreeTableColumn<>("End");
        colEnd.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getValue().getEnd().format(formatter)));
        JFXTreeTableColumn<TimeRecursive, String> colComments = new JFXTreeTableColumn<>("Comments");
        colComments.setCellValueFactory(param -> new ReadOnlyStringWrapper(param.getValue().getValue().getComment()));
        JFXTreeTableColumn<TimeRecursive, String> colDur = new JFXTreeTableColumn<>("Duration");
        colDur.setCellValueFactory(param -> new ReadOnlyStringWrapper(DurationFormatUtils.formatDuration(param.getValue().getValue().getDuration(), "HH:mm")));

        colStart.setPrefWidth(150);
        colEnd.setPrefWidth(150);
        colDur.setPrefWidth(100);
        colComments.setPrefWidth(165);

        ObservableList<TimeRecursive> list = FXCollections.observableArrayList();

        database.load();
        if (database.getDatabaseListCurrentMonth().isEmpty()) return;
        database.getDatabaseListCurrentMonth().forEach(x -> list.add(new TimeRecursive(x)));

        final TreeItem<TimeRecursive> root = new RecursiveTreeItem<TimeRecursive>(list, RecursiveTreeObject::getChildren);
        table.getColumns().setAll(colStart, colEnd, colComments, colDur);
        table.setRoot(root);
        table.setShowRoot(false);
        textfieldTotal.setText(database.totalCurrentMonth());
    }
}
