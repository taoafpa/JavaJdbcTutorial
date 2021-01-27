package fr.afpa.tutorial.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class OracleConnUtils {
 
    // Connect to Oracle.
    public static Connection getOracleConnection() throws SQLException,
            ClassNotFoundException {
        String hostName = "localhost";
        String sid = "orcl";
        String userName = "simplerh";
        String password = "root";
 
        return getOracleConnection(hostName, sid, userName, password);
    }
 
    public static Connection getOracleConnection(String hostName, String sid,
            String userName, String password) throws ClassNotFoundException,
            SQLException {
        
        // Declare the class Driver for ORACLE DB
        // This is necessary with Java 5 (or older)
        // Java6 (or newer) automatically find the appropriate driver.
        // If you use Java> 5, then this line is not needed.        
        Class.forName("oracle.jdbc.driver.OracleDriver");
 
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
 
        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }
}
