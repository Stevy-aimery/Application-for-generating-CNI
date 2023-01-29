package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataBase.loginDB_like_HMI;

import javafx.scene.control.PasswordField;

/**
 * ConnexionDemandeur Returns the status of the connection to BD
 * @author StevyKabalera
 *
 */
public class ConnexionDemandeur {	
 
	/**
	* SeconnecterDemandeur Verifies that the connection to the DB is made or not
	* @param passwordF;
	* @return the connection status true when it's good and false otherwise
	*/
	

	public boolean SeconnecterDemandeur(PasswordField passwordF) {
		
		
				// Lier the actions of laClass Connection à la DB		
					Connection conn = loginDB_like_HMI.dbConnect();
					
					//Objects pour gerer la connexion
					PreparedStatement stat = null;
					ResultSet res = null;
					
					//Requette de la connection		
					String sql = "SELECT * FROM user_demandeur WHERE Num_demande =?";					
									
					// execution de la Query
					try {
						stat = conn.prepareStatement(sql);
						stat.setString(1, passwordF.getText());
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
