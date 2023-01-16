package controllers;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import dataBase.loginDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class ConControllerDemandeur implements Initializable {
	
	// Declaration des variables de nos composants
//	@FXML private TextField txtF;
//	@FXML private PasswordField passF;
//	@FXML private Label labeEtatCon;
	
	
	@FXML
	// Methode for action button
	public void login(ActionEvent event) throws SQLException {
		
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/page_accueil_agent.fxml"));			

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
//			
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	} 

}
