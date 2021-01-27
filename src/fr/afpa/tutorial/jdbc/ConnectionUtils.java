package fr.afpa.tutorial.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
 

/**
 * @author KESKES Taoufik
 * Cette classe nous permet d'appeler une connection Oracle ou MySQL
 */
public class ConnectionUtils {
 
    public static Connection getMyConnection() throws SQLException,
            ClassNotFoundException {
        // On doit commenter une ligne et laisser la ligne qui correspond 
    	// � la base de donn�e qu'on souhaite utiliser
    	
        // return MySQLConnUtils.getMySQLConnection();
    	// On utilise Oracle par d�faut
    	 return OracleConnUtils.getOracleConnection();
    }
 
    //
    // Test Connection ...
    //
    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        System.out.println("Get connection ... ");
        // Get a Connection object
        Connection conn = ConnectionUtils.getMyConnection();
 
        System.out.println("Get connection " + conn);
 
        System.out.println("Done!");
    }
 
}
