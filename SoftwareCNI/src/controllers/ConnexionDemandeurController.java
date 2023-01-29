package controllers;


import java.net.URL;

import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import model.ConnexionDemandeur;

/**
* ConnectionAgent Controller allows to implement the method which will make so that the requestor can conntate to its session
* @author StevyKabera
 *
 */

public class ConnexionDemandeurController implements Initializable {
	/**
	 * Login check the status of the connection to the database. If the connection is made correctly the requestort connects to his session 
	 * otherwise there is no connection
	 * @param event
	 * @throws SQLException
	 */
	
	// Declaration des variables de nos composants	
	@FXML private PasswordField numDemand;	
	
	// Methode for action button
	public void loginDemandeur(ActionEvent event) throws SQLException {
		
		ConnexionDemandeur conDemandeur = new ConnexionDemandeur();
		 
		if(conDemandeur.SeconnecterDemandeur(numDemand)) {			
			try {
				
				Parent root = FXMLLoader.load(getClass().getResource("../view/page_accueilDemandeurNew.fxml"));	

				Scene sceneA = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(sceneA);
				stage.show();
				
				Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
	    		stageActuel.close();
				
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			
		}
		else {
				Alert box = new Alert(AlertType.INFORMATION);
				box.setTitle("Alert Connexion");
				box.setHeaderText(null);
				box.setContentText("Votre numero de demande ne correspondent pas. Veuillez réessayer à nouveau");				
				box.show();			
		}						
		
	}
			

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	} 

}
