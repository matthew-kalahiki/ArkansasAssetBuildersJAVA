module com.aab.arkansasassetbuilders {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires java.sql.rowset;
    requires java.desktop;
    requires org.xerial.sqlitejdbc;


    opens com.aab.arkansasassetbuilders to javafx.fxml;
    exports com.aab.arkansasassetbuilders;
}