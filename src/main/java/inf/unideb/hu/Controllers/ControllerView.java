package inf.unideb.hu.Controllers;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import inf.unideb.hu.Database.DatabaseFactory;
import inf.unideb.hu.Database.IDatabase;
import inf.unideb.hu.Model.TimeRecursive;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.time.format.DateTimeFormatter;

public class ControllerView {

    @FXML private JFXTreeTableView<TimeRecursive> table;
    @FXML private JFXTextField textfieldTotal;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @FXML void btnRefresh(ActionEvent event) {
        IDatabase database = DatabaseFactory.get();
        initialize(database);
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
