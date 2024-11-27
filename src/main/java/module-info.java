module ash_a9236.example.pr02_finalproject1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens ash_a9236.example.pr02_finalproject1 to javafx.fxml;
    exports ash_a9236.example.pr02_finalproject1;
}