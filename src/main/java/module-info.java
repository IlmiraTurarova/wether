module com.example.wether {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.example.wether to javafx.fxml;
    exports com.example.wether;
}