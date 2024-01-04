package AlstonStone.TaskMaster;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreateTaskDisplayController {

    @FXML
    private Button CreateTaskButton;

    @FXML
    private TextField TaskTextField;

    @FXML
    void CreateTask(ActionEvent event) {
    	System.out.println(TaskTextField.getText());

    }

}
