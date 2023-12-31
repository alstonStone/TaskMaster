module AlstonStone.TaskMaster {
    requires javafx.controls;
    requires javafx.fxml;

    opens AlstonStone.TaskMaster to javafx.fxml;
    exports AlstonStone.TaskMaster;
}
