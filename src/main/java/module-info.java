module hi.style {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires validatorfx;
                requires org.kordamp.bootstrapfx.core;
            
    opens hi.style to javafx.fxml;
    exports hi.style;
}