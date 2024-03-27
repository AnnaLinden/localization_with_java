module com.example.localised_hello {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.localised_hello to javafx.fxml;
    exports com.example.localised_hello;
}