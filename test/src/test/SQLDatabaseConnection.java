package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLDatabaseConnection {

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
    	String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
    			   "databaseName=AdventureWorks2019;user=sa;password=510510Ke!;";


        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
        	System.out.println("成功");

        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
