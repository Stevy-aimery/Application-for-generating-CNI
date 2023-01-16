package dataBase;


import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;


public class loginDB {
	
	public static Connection connect() {
		
		try {
			// 1 Charger le driver MySQL 	
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2 Create  the connexion			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet_java_hmi","root","");
			
			return con;			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR:"+e.getMessage());
		}
		return null;

	}

//	public PreparedStatement prepareStatement(String sql) {
//		// TODO Auto-generated method stub
//		return null;
//	}


}
