module com.example.infhotelplus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.infhotelplus to javafx.fxml;
    exports com.example.infhotelplus;
}