module com.example.rsync4jmodulecompatibilityfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires rsync4j.core;


    opens com.example.rsync4jmodulecompatibilityfx to javafx.fxml;
    exports com.example.rsync4jmodulecompatibilityfx;
}