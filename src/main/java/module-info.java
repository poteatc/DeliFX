module com.pluralsight.deli {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pluralsight.deli to javafx.fxml;
    exports com.pluralsight.deli;
}