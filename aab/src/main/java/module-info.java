module com.aab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aab to javafx.fxml;
    exports com.aab;
}
