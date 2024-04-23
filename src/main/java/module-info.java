module com.n0rthl1ght.vsu.cs.tasktwocg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.n0rthl1ght.vsu.cs.tasktwocg to javafx.fxml;
    exports com.n0rthl1ght.vsu.cs.tasktwocg;
}