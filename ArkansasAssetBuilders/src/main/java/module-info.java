module com.aab.arkansasassetbuilders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aab.arkansasassetbuilders to javafx.fxml;
    exports com.aab.arkansasassetbuilders;
}