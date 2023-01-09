package controllers;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import connexion.loginDB;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class ConnexionControllerAgent implements Initializable {
	
	// Declaration des variables de nos composants
	@FXML private TextField txtF;
	@FXML private PasswordField passF;
	@FXML private Label labeEtatCon;
	
	
	@FXML
	// Methode pour les buttons
	public void login(ActionEvent event) throws SQLException {
		
		// Lier the actions of laClass Connection à la BD		
		Connection con = loginDB.connect();
		
		//Objects pour gerer la connexion
		PreparedStatement stat = null;
		ResultSet res = null;
		
		//Requette de la connection		
		String sql = "SELECT * FROM user_agent WHERE code_agent =? AND mdp =?";
		
		try {
			stat = con.prepareStatement(sql);
			stat.setString(1, txtF.getText().toString());
			stat.setString(2, passF.getText().toString());
			
			// execution de la requette (Query)
			res = stat.executeQuery();
			//Affichage de l etat de connexion
			if(res.next()) {
				labeEtatCon.setText("Connexion reussit.");
			}else {
				labeEtatCon.setText("Le code agent ou le mot de passe ne correspond pas.");
				labeEtatCon.setText("Echec de la connexion.");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	} 

}
