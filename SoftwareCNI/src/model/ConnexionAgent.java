package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import dataBase.loginDB;
import dataBase.loginDB_like_HMI;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * ConnexionAgent Returns the status of the connection to BD
 * @author Tresork-007
 *
 */
public class ConnexionAgent{ 
		
	
	private PasswordField passF1;
	private TextField txtF1;
	/**
	* Seconnecter Verifies that the connection to the DB is made or not
	* @param txtF
	* @param passF
	* @return the connection status true when it's good and false otherwise
	*/
	public boolean Seconnecter(TextField txtF, PasswordField passF) {
		txtF1 = txtF;
		passF1 = passF;
		
				// Lier the actions of laClass Connection à la DB		
					Connection conn = loginDB_like_HMI.dbConnect();
					
					//Objects pour gerer la connexion
					PreparedStatement stat = null;
					ResultSet res = null;
					
					//Requette de la connection		
					String sql = "SELECT * FROM user_agent WHERE code_agent =? AND mdp =?";					
									
					// execution de la Query
					try {
						stat = conn.prepareStatement(sql);
						stat.setString(1, txtF1.getText());
						stat.setString(2, passF1.getText());
						res = stat.executeQuery();
						if(res.next()) {
							return true;
						}

						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return false;
					
		
	}
	
}
