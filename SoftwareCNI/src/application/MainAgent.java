package application;
	
//import controllers.FormController;
//import controllers.PageAccueilAgentController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * The Main class makes it possible to call the main stage containing the connection interface of the agents who will process the requests.
 * @author Tresork-007
 * @version 1.0 
 *
 */

public class MainAgent extends Application {  
	
	
	/***
	 * Method to launch the primary stage
	 */
	@Override
	
	  public void start(Stage primaryStage) {
		
		
		
		try {

			Parent root = FXMLLoader.load(getClass().getResource("../view/authentif_Agent.fxml"));			

			Scene scene = new Scene(root);
			scene.setFill(Color.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("../Mycss/style.css").toExternalForm());
			primaryStage.setTitle("Application Carte Nationale d'Identité");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) { 
			e.printStackTrace();
		}
		
//		
//		try {
//    		// Charger la vue de la tableView et récupérer son contrôleur
//	        FXMLLoader tableViewLoader = new FXMLLoader(getClass().getResource("../view/page_accueilAgent.fxml"));
//	        Parent tableViewParent = tableViewLoader.load();
//	        PageAccueilAgentController tableViewController = tableViewLoader.getController();
//
//	        // Charger la vue du formulaire et récupérer son contrôleur
//	        FXMLLoader formLoader = new FXMLLoader(getClass().getResource("../view/page_ValidationDemande_Agent.fxml"));
//	        Parent formParent = formLoader.load();
//	        FormController formController = formLoader.getController();
//
//	        // Lier les contrôleurs ensemble
//	        tableViewController.setFormController(formController);
//
//	        // Afficher les deux stages
//	        Stage formStage = new Stage();
//	        Scene formScene = new Scene(formParent);
//	        formScene.setFill(Color.TRANSPARENT);
//	        formStage.setScene(formScene);
////	        formStage.initStyle(StageStyle.TRANSPARENT);
//	        formStage.show();
//	        
//	        Stage stage1 = new Stage();
//	        Scene tableViewScene = new Scene(tableViewParent);
//	        stage1.setScene(tableViewScene);
//	        stage1.show();

	        
	        
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
    }
	   

	
	public static void main(String[] args) {
		launch(args);
	}
}
