module com.example.demo6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.demo6 to javafx.fxml;
    exports com.example.demo6;
}