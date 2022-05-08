module com.ufrpe.leucount {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ufrpe.leucount to javafx.fxml;
    exports com.ufrpe.leucount;
    exports com.ufrpe.leucount.controladores;
    opens com.ufrpe.leucount.controladores to javafx.fxml;
}