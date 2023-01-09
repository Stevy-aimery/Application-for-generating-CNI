package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class login_BD {
	private static final String url = "jdbc:mysql://localhost:8080/projet_java_hmi";
	private static final String user = "root";
	private static final String pwd = "";
	
	public static Connection connect() throws SQLException{
		try {
//			String url = "jdbc:mysql://localhost:8080/projet_java_hmi";
//			String user = "root";
//			String pwd = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			Logger.getLogger(login_BD.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
//			System.out.println("ERROR:"+e.getMessage());
		}
		return null;
	}

}
