module com.example.anchorpaneexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anchorpaneexample to javafx.fxml;
    exports com.example.anchorpaneexample;
}