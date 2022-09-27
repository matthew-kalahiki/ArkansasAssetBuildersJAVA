package SQLite;

import javax.sql.rowset.*;
import java.sql.*;
import java.util.ArrayList;

public class DB {

    private static Connection connection = null;

    public static void connect(){
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:src/AAB.db");
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public static void disconnect(){
        try{
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }

    public static ResultSet executeQuery(String query){
        Statement stmt = null;
        ResultSet rs = null;

        CachedRowSet crs = null;


        try {
            connect();
            //c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = connection.createStatement();
            rs = stmt.executeQuery(query);

            crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs);

            rs.close();
            stmt.close();
            disconnect();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        return crs;
    }

    public static void update(String sqlStmt){
        Statement stmt = null;
        try{
            connect();
            stmt = connection.createStatement();
            stmt.executeUpdate(sqlStmt);

            stmt.close();
            disconnect();
        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void main(String args[]){
        connect();
    }
}
