module com.example.billiards {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.billiards to javafx.fxml;
    exports com.example.billiards;
}