module com.example.tutorial_1_in2011 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tutorial_1_in2011 to javafx.fxml;
    exports com.example.tutorial_1_in2011;
}