module com.edf.api {
    requires javafx.controls;
    requires javafx.fxml;
    requires wiremock.jre8;
    requires spring.core;


    opens com.edf.api to javafx.fxml;
    exports com.edf.api;
}