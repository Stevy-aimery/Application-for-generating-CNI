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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Demandeur;
import model.PageAccueilAgent;


/**
* PageAccueilAgentController allows to control all actions of events and formatting in the home page of the agent
* @author tresork-007
 *
 */

public class PageAccueilAgentController implements Initializable  { 
	
	
		@FXML
		private TableView<Demandeur> tableView;
		
	    @FXML
	    private TableColumn<Demandeur, String> nomDemandeur;
	    @FXML
	    private TableColumn<Demandeur, String> dateDemande;
	    @FXML
	    private TableColumn<Demandeur, String> numDemande;	    
	    @FXML
	    private TableColumn<Demandeur, String> typeDemande;
	    @FXML
	    private TableColumn<Demandeur, String> civiliteDemandeur;
	    @FXML
	    private TableColumn<Demandeur, String> paysNaissance;
	    
	    @FXML
	    private Button afficher;

	    @FXML
	    private Button chargerImg;
	    
	    
	    private PageAccueilAgent pageAccueilAgent = new PageAccueilAgent();
	    
	    
	    /**
    	 * Used to initialize and populate the array when loading the page or stage
    	 */
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
	    	
			// TODO Auto-generated method stub
	    	tableView.setItems(pageAccueilAgent.getDemandeurList());
//			nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
	    	nomDemandeur.setCellValueFactory(cellData -> cellData.getValue().NomDemandeurProperty());
	    	numDemande.setCellValueFactory(cellData -> cellData.getValue().Num_demandeProperty());
	    	typeDemande.setCellValueFactory(cellData -> cellData.getValue().type_demandeProperty());
	    	dateDemande.setCellValueFactory(cellData -> cellData.getValue().date_du_jourProperty());
	    	civiliteDemandeur.setCellValueFactory(cellData -> cellData.getValue().civiliteProperty());
	    	paysNaissance.setCellValueFactory(cellData -> cellData.getValue().pays_naissanceProperty());
			pageAccueilAgent.loadFromDB();
		}
	    
	    
	    /**
	     * buttonDisplay method that allows to call and display the validation stage of the request made by the requesting user
    	 */
	    @FXML
	    public void buttonAfficher(ActionEvent event) {	    	
	    	
	    	try {
				Parent parent = FXMLLoader.load(getClass().getResource("../view/page_ValidationDemande_Agent.fxml"));	
				Scene sceneValidation = new Scene(parent );
				Stage stage = new Stage();
				stage.setScene(sceneValidation);
				stage.initStyle(StageStyle.UTILITY);
				stage.show();				
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
	    }

	    @FXML
	    void infoCompte(ActionEvent event) {

	    }
	    
	    /**
	     * logout Btn method that will allow an agent to disconnect from his session
	     */

	    @FXML
	    void logoutBtn(ActionEvent event) {
	    	try {
	    		
	    		Alert alert = new Alert(AlertType.CONFIRMATION);
	        	alert.setTitle("Deconnexion");
	        	alert.setHeaderText(null);
	        	alert.setContentText("Souhaitez vous vous déconnecter.");
//	        	alert.showAndWait(); 
	        	Optional<ButtonType> result = alert.showAndWait();
	        	if (result.get() == ButtonType.OK){
	        	    // L'utilisateur a cliqué sur "OK"
	        		
	        		Parent parent = FXMLLoader.load(getClass().getResource("../view/authentif_Agent.fxml"));	
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
	    void BtnchargerImg(ActionEvent event) {

	    }	

}
