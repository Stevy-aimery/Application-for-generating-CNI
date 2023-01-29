package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * PageAccueilCNIcontroller class qui controle l'afficher de la page d'accueil principale du l'application.Qui est dedie pour les utilisateur qui aimeront faireune demande
 * @author StevyKabalera
 *
 */
public class PageAccueilCNIcontroller implements Initializable {
	
	 	@FXML
	    private Button Accueil;

	    @FXML
	    private Button Apropos;

	    @FXML
	    private Button Connexion;

	    @FXML
	    private Button CreatDemande;

	    @FXML
	    private Button FAQ;

	    @FXML
	    private MenuButton Services;

	    @FXML
	    private Button suivreDemande;
	    
	    
	    /**
	     * BtnFAQ method that calls the stage containing the pageFAQ from the action of the BtnFAQ botton
	     * @param event
	     */
	    @FXML
	    void BtnFAQ(ActionEvent event) {
	    	
	    	try {
		    		Parent parent = FXMLLoader.load(getClass().getResource("../view/page_FAQ.fxml"));	
					Scene sceneValidation = new Scene(parent );
					Stage stage = new Stage();
					stage.setScene(sceneValidation);
//					stage.initStyle(StageStyle.UTILITY); 
					stage.show();
					
	    		Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
	    		stageActuel.hide();
					
				} catch (Exception e) {
					// TODO: handle exception
				}   

	    }    
	        
	    /**
	     * * PageHomeCNIcontroller class which controls the display of the main home page of the application. Which is dedicated for users who would like to make PageHomeCNIcontrollet
	     * @param event
	     */
	    @FXML
	    void BtnApropos(ActionEvent event) { 
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/page_Apropos.fxml"));	
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
	    /**
	     * * BtnConnexion class which controls the display of the main home page of the application. Which is dedicated for users who would like to make a BtnConnexion
	     * @param event
	     */
	    @FXML
	    void BtnConnexion(ActionEvent event) {
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/authentif_demandeur.fxml"));	
				Scene sceneA = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(sceneA);
				stage.initStyle(StageStyle.UTILITY);
				stage.showAndWait();	
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

	    }

	    @FXML
	    
	    /**
	     * * BtnCreateOfDemande class which controls the display of the main home page of the application. Which is dedicated for users who would like to make a BtnConnexion
	     * @param event
	     */
	    void BtnCreateOfDemande(ActionEvent event) {
	    	
	    	
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/page_CreateDemande.fxml"));	
				Scene sceneA = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(sceneA);
				stage.show();
				
//				Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
//	    		stageActuel.close();
				
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
	    }
	    
	    @FXML
	    /**
	     * * BtnCreerVotreDemande class which controls the display of the main home page of the application. Which is dedicated for users who would like to make a BtnCreerVotreDemande
	     * @param event
	     */
	    void BtnCreerVotreDemande(ActionEvent event) {
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/page_CreateDemande.fxml"));	
				Scene sceneA = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(sceneA);
				stage.show();
				
				Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
	    		stageActuel.hide();		
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

	    }
	    
	   

	    @FXML
	    void BtnSuivreDemande(ActionEvent event) {
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/authentif_demandeur.fxml"));	
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initStyle(StageStyle.UTILITY);
				stage.setScene(scene);
				stage.showAndWait();
				
//				Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
//	    		stageActuel.hide();
								
				}catch (Exception e) {
					e.printStackTrace();
				}

	    }
	    
	    @FXML
	    void BtnSuivreOrModifDemande(ActionEvent event) {
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/authentif_demandeur.fxml"));	
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.showAndWait();
				
//				Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
//	    		stageActuel.hide();
								
				}catch (Exception e) {
					e.printStackTrace();
				}

	    }
	    
	    public void BtnAccueil(ActionEvent event) { 
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/#"));	
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

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}

}
