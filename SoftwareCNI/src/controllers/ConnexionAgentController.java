package controllers;


import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import model.ConnexionAgent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
* ConnectionAgent Controller allows to implement the method which will make so that the agent can conntate to its session
* @author Tresork-007
 *
 */


public class ConnexionAgentController implements Initializable {
	
	// Declaration des variables de nos composants
	@FXML private TextField txtF;
	@FXML private PasswordField passF;
	@FXML private Label labeEtatCon;
	
	/**
	 * Login check the status of the connection to the database. If the connection is made correctly the agent connects to his session 
	 * otherwise there is no connection
	 * @param event
	 * @throws SQLException
	 */
	@FXML
	// Methode for action button
	public void login(ActionEvent event) throws SQLException {
		
		ConnexionAgent conAgent = new ConnexionAgent();
		 
		if(conAgent.Seconnecter(txtF,passF)) {
			
			try {
				Parent parent = FXMLLoader.load(getClass().getResource("../view/page_accueilAgent.fxml"));	
				Scene scene = new Scene(parent);
				Stage stage = new Stage();
				stage.setScene(scene);				
				stage.show();	
				
				Stage stage1  = (Stage)((Node) event.getSource()).getScene().getWindow();
	    		stage1.hide();
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			
		}
		else {
				Alert box = new Alert(AlertType.INFORMATION);
				box.setTitle("Alert Connexion");
				box.setHeaderText(null);
				box.setContentText("Votre code agent ou votre mot de passe ne correspondent pas.Veuillez réessayer à nouveau.");				
				box.show(); 
			
		}
						
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	} 
	

}
