package WOTS;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;


public class DBConnector {
	
	private static DBConnector instance = new DBConnector();
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/NB_Gardens?useSSL=false";

	  static final String USER = "root";
	  static final String PASS = "password";
	  
	  
	  static Connection createConnection() {
		  
	        Connection connection = null;
	        Statement stmt = null;
	        try {
	            //Step 3: Establish Java MySQL connection
	            connection = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
	            System.out.println("Connected!");
	            
	            System.out.println("Creating statement...");
	  	  	  stmt = connection.createStatement();
	  	  	  String sql2 = "SELECT * FROM customerOrders";
	  	  	  ResultSet rs = stmt.executeQuery(sql2);
	  	  	  while (rs.next()) {
	  	  	    int id = rs.getInt("orderID");
	  	  	    String name = rs.getString("firstName");
	  	  	    float subtotal = rs.getInt("subtotal");
	  	  	    System.out.println("ID: " + id +    ", name: " + name + ", subtotal: " +     subtotal);
	  	  	    }
	  	  	  rs.close();
	            
	            
	            
	            
	        } catch (SQLException e) {
	            System.out.println("ERROR: Unable to Connect to Database.");
	        }
	        return connection;
	        
	       
	    }
	  
	  

	  
	  

}
