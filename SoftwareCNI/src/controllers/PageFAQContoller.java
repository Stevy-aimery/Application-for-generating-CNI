package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.input.ContextMenuEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class PageFAQContoller {
	
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
	    void BtnAccueil(ActionEvent event) {
		  try {
	    		Parent parent = FXMLLoader.load(getClass().getResource("../view/page_accueilCNI.fxml"));	
				Scene sceneValidation = new Scene(parent );
				Stage stage = new Stage();
				stage.setScene(sceneValidation);
//				stage.initStyle(StageStyle.UTILITY);
				stage.show();
				
	    		Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
	    		stageActuel.hide();
				
			} catch (Exception e) {
				// TODO: handle exception
			}		  

	    }
	  
	    public void BtnCreateOfDemande(ActionEvent event) {
	    	
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/page_CreateDemande.fxml"));	
				Scene sceneA = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(sceneA);
				stage.show();		
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
	    }  

//	    @FXML
	    public void BtnSuivreOrModifDemande(ActionEvent event) {
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/authentif_demandeur.fxml"));	
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.initStyle(StageStyle.UTILITY);
				stage.showAndWait();
								
				}catch (Exception e) {
					e.printStackTrace();
				}

	    }

	    @FXML
	    void BtnConnexion(ActionEvent event) {
	    	 try {
		    		Parent parent = FXMLLoader.load(getClass().getResource("../view/authentif_demandeur.fxml"));	
					Scene sceneValidation = new Scene(parent );
					Stage stage = new Stage();
					stage.setScene(sceneValidation);
					stage.initStyle(StageStyle.UTILITY); 
					stage.show();
					
//		    		Stage stageActuel  = (Stage)((Node) event.getSource()).getScene().getWindow();
//		    		stageActuel.hide();
					
				} catch (Exception e) {
					// TODO: handle exception
				}

	    }


	    @FXML
	    void MenuBtnServices(ActionEvent event) {
	    	 try {
		    		Parent parent = FXMLLoader.load(getClass().getResource("../view/#"));	
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
	    

	    @FXML
	    void BtnFAQ(ActionEvent event) { 
	    	

	    }
	    
}
