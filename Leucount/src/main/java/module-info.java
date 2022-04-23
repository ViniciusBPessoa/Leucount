module com.example.leucount {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.leucount to javafx.fxml;
    exports com.example.leucount;
}