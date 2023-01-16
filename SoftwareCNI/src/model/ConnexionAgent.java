package model;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import dataBase.loginDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class ConnexionAgent {
	
	// Lier the actions of laClass Connection à la DB		
			Connection con = loginDB.connect();
			
			//Objects pour gerer la connexion
			PreparedStatement stat = null;
			ResultSet res = null;
			
			//Requette de la connection		
			String sql = "SELECT * FROM user_agent WHERE code_agent =? AND mdp =?";
			
	}

	


