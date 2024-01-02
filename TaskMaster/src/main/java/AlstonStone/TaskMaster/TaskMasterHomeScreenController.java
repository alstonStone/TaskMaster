package AlstonStone.TaskMaster;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TaskMasterHomeScreenController {

    @FXML
    private Button AddTaskButton;

    @FXML
    private Button PastTasksButton;

    @FXML
    private ScrollPane TaskDisplay;

    @FXML
    private Label TitleLable;

    @FXML
    void OpenAddTaskDisplay(ActionEvent event) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateTaskDisplay.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void OpenPastTasksDisplay(ActionEvent event) {

    }

}
