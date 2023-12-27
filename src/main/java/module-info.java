module com.example.pond_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pond_project to javafx.fxml;
    exports com.example.pond_project;
}