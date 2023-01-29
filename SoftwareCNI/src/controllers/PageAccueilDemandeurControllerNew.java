package controllers;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

	public class PageAccueilDemandeurControllerNew implements Initializable {
		
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
		    

		    @FXML
		    void infoCompte(ActionEvent event) {

		    }

		    @FXML
		    void logoutBtn(ActionEvent event) {
		    	try {
		    		
		    		Alert alert = new Alert(AlertType.CONFIRMATION);
		        	alert.setTitle("Deconnexion");
		        	alert.setHeaderText(null);
		        	alert.setContentText("Souhaitez vous vous déconnecter.");
		        	Optional<ButtonType> result = alert.showAndWait();
		        	
		        	if (result.get() == ButtonType.OK){
		        	    // L'utilisateur a cliqué sur "OK"
		        		
		        		Parent parent = FXMLLoader.load(getClass().getResource("../view/../view/page_accueilCNI.fxml"));	
						Scene sceneValidation = new Scene(parent );
						Stage stage = new Stage();
						stage.setScene(sceneValidation);
						stage.show();
						
			    		Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
			    		stageActuel.close();
		        	} else {
		        	    // L'utilisateur a cliqué sur "Annuler" ou a fermé la boîte de dialogue
		        		Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
			    		stageActuel.show();
		        	}
		        	
		    		
					
				} catch (Exception e) {
					// TODO: handle exception
				}

		    }

		    

		    @FXML
		    void BtnFAQ(ActionEvent event) {
		    	
		    	try {
			    		Parent parent = FXMLLoader.load(getClass().getResource("../view/page_FAQ.fxml"));	
						Scene sceneValidation = new Scene(parent );
						Stage stage = new Stage();
						stage.setScene(sceneValidation);
//						stage.initStyle(StageStyle.UTILITY); 
						stage.show();
						
		    		Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
		    		stageActuel.hide();
						
					} catch (Exception e) {
						// TODO: handle exception
					}   

		    }    
		        

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
		    void BtnCreateOfDemande(ActionEvent event) {
		    	
		    	try {
					Parent root = FXMLLoader.load(getClass().getResource("../view/page_CreateDemande.fxml"));	
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
		    
		    @FXML
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
					
//					Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
//		    		stageActuel.hide();
									
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
					
//					Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
//		    		stageActuel.hide();
									
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
