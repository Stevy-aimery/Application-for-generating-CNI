package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Main used to call the main stage containing the caller's graphical interface. 
 * @author StevyKabalera 
 * @version 1.0 
 *
 */
public class Main extends Application {  
	@Override
	/**
	 * Method to launch the primary stage
	 */
	  public void start(Stage primaryStage) {
		
		
		try {
						
			Parent root = FXMLLoader.load(getClass().getResource("../view/page_accueilCNI.fxml"));			
			Scene scene = new Scene(root);
			scene.setFill(Color.TRANSPARENT);
			scene.getStylesheets().add(getClass().getResource("../Mycss/style.css").toExternalForm());
			primaryStage.setTitle("Application Carte Nationale d'Identité");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) { 
			e.printStackTrace();
		}
		
		    }	   

	
	public static void main(String[] args) {
		launch(args);
	}
}