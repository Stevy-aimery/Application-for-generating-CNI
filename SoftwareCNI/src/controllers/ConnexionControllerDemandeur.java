package controllers;


import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import connexion.login_BD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ConnexionControllerDemandeur implements Initializable {

	@FXML
    private ImageView imageSceauRepub;
//	javafx.scene.image.Image sceauRep = new javafx.scene.image.Image("../issets/Sceau_de_la_Republique.jpeg");
//	Image sceauRep = new Image("../issets/Sceau_de_la_Republique.jpeg"); 
//	ImageView sceauRep = new ImageView("../issets/Sceau_de_la_Republique.jpeg");
	
    @FXML
    private Label labeEtatCon;    
    @FXML
    private PasswordField numDemand;
    
    @FXML
    private AnchorPane archorpane;

    @FXML
    private Button btnConn;
   

	// Method pour the buttons
	@FXML public void loginDemandeur (ActionEvent event) throws SQLException {
		
			// lier les actions à la Class de la connexion à la BD		
			Connection con = login_BD.connect();
			
			//Objects pour gerer la connexion
			PreparedStatement stat = null;
			ResultSet res = null;
			
			String sql = "SELECT * FROM user_demandeur WHERE N°Demande =?";			
			try {
				stat = con.prepareStatement(sql);				
				stat.setString(1, numDemand.getText().toString());
				
				// execution de la requette (Query)
				res = stat.executeQuery();
				
				//Affichage Etat de connexion
				if(res.next()) {
					labeEtatCon.setText("Connexion reussit.");
				}else {
					labeEtatCon.setText("Le code agent ou le mot de passe ne correspond pas.");
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
