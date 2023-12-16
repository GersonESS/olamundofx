module com.mycompany.olamundojavfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.olamundojavfx to javafx.fxml;
    exports com.mycompany.olamundojavfx;
}
