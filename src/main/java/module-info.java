module com.example.task4_programtech {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task4_programtech to javafx.fxml;
    exports com.example.task4_programtech;
}