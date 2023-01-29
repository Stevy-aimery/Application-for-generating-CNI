package controllers;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

//import dataBase.loginDB_like_HMI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class PageValidationDemandeAgentController  {


	@FXML
    private Button Accepter;

    @FXML
    private Button Rejeter;
    
    @FXML
    private TextField adresse;

    @FXML
    private DatePicker dateFid;

    @FXML
    private TextField jour;

    @FXML
    private TextField lieu;

    @FXML
    private TextField mail;

    @FXML
    private TextField nationalite;

    @FXML
    private TextField  nomFid;

    @FXML
    private TextField pays;

    @FXML
    private TextField prenom;

    @FXML
    private TextField profession;

    @FXML
    private TextField province;

    @FXML
    private TextField situation;

    @FXML
    private TextField tel;
    @FXML
    private Label CiviLabel;  
    
    
    @FXML
    void buttonAccepter(ActionEvent event) {
    	

    }

    @FXML
    void buttonRejeter(ActionEvent event) {
    	try {
			Parent parent = FXMLLoader.load(getClass().getResource("../view/page_accueilAgent.fxml"));	
			Scene sceneValidation = new Scene(parent );
			Stage stage1 = new Stage();
			stage1.setScene(sceneValidation);
			stage1.initStyle(StageStyle.UTILITY);
			stage1.show();				
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}	

    }
    
 
   
    @FXML
    private void infoCompte(ActionEvent event) { // private void save (mouseEvent event) { }


    }   

	@FXML
    void logoutBtn(ActionEvent event) {

    }
	

	
//	@Override
//	public void setPerson(Demandeur selectedPerson) {
//		// TODO Auto-generated method stub
//		
//		getNomFid().setText(selectedPerson.getnomDemandeur());
//		situation.setText(selectedPerson.getType_demandeProperty());
//		jour.setText(selectedPerson.getDate_du_jourProperty());		 
//		CiviLabel.setText(selectedPerson.getCiviliteProperty());
//    }
//
//	public TextField getNomFid() {
//		return nomFid;
//	}
//
//	public void setNomFid(TextField nomFid) {
//		this.nomFid = nomFid;
//	}
//
//	public TextField getNationalité() {
//		return nationalité;
//	}
//
//	public void setNationalité(TextField nationalité) {
//		this.nationalité = nationalité;
//	}
//
//	public TextField getMail() {
//		return mail;
//	}
//
//	public void setMail(TextField mail) {
//		this.mail = mail;
//	}
//		
	}


