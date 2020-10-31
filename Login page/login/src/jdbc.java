import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	
	
	public static Connection initializeDatabase() 
			throws SQLException, ClassNotFoundException 
		{ 
			// Initialize all the information regarding 
			// Database Connection 
			String dbDriver = "com.mysql.jdbc.Driver"; 
			String url = "jdbc:mysql://localhost:3306/loginpage"; 
			// Database name to access 
			String username = "root"; 
		
			String password = ""; 
			

			Class.forName(dbDriver); 
			Connection con = DriverManager.getConnection(url,username,password); 
			
			return con; 
		} 

}
