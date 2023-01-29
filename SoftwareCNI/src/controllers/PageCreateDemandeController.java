package controllers;

//import java.text.DecimalFormat;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.InsertDataPageCreateDemande;
//import model.Insertdata;

public class PageCreateDemandeController {

    @FXML
    private Button Enregistrer;

    @FXML
    private TextField adresse;

    @FXML
    private ComboBox<String> civilite;

    @FXML
    private DatePicker date;

    @FXML
    private DatePicker jour;

    @FXML
    private TextField lieu;

    @FXML
    private TextField mail;

    @FXML
    private TextField nationalite;

    @FXML
    private TextField nom;

    @FXML
    private TextField oldcarte;

    @FXML
    private TextField pays;

    @FXML
    private TextField prenom;

    @FXML
    private TextField profession;

    @FXML
    private TextField province;

    @FXML
    private ComboBox<String> situation;

    @FXML
    private TextField tel;

    @FXML
    private ComboBox<String> type;
    
    
    
    @FXML
    void BtnFAQ(ActionEvent event) {
    	
    	try {
	    		Parent parent = FXMLLoader.load(getClass().getResource("../view/page_FAQ.fxml"));	
				Scene sceneValidation = new Scene(parent );
				Stage stage = new Stage();
				stage.setScene(sceneValidation); 
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

//    @FXML
    public void BtnCreateOfDemande(ActionEvent event) {
    	
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/#"));	
			Scene sceneA = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(sceneA);
			stage.show();		
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
    }  

//    @FXML
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
    
    public void BtnAccueil(ActionEvent event) { 
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/page_accueilCNI.fxml"));	
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
    
       

    // Pattern pour valider le nom
    private static final Pattern Nomp = Pattern.compile("^[A-Za-z\\p{L} \\s]+$");
    private static final Pattern Prenomp = Pattern.compile("^[A-Za-z\\p{L} \\s]+$");
    //private static final Pattern Datep = Pattern.compile("^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$");
    private static final Pattern Lieup = Pattern.compile("^[A-Za-z\\p{L} \\s]+$");
    private static final Pattern Provincep = Pattern.compile("^[A-Za-z\\p{L} \\s]+$");
    private static final Pattern Professionp = Pattern.compile("^[A-Za-z\\p{L} \\s]+$");
    private static final Pattern Nationalitep = Pattern.compile("^[a-zA-Z \\p{L} \\s]+$");
    private static final Pattern Telp = Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{10,15}$"); 
    //  ^[0][0-9]{9}$   ^(\\+\\d{1,3}[- ]?)?\\d{10,15}$  ^(\+\d{1,3}[- ]?)?\d{10,14}$
    private static final Pattern Mailp = Pattern.compile("^[a-z0-9._%+-]+\\@[a-z0-9.-]+\\.[a-z]{2,4}$");
    private static final Pattern Paysp = Pattern.compile("^[A-Za-z\\p{L} \\s]+$"); 
    //private static final Pattern Oldcartep = Pattern.compile("^RG[0-9]{4}$");
    private static final Pattern Adressep = Pattern.compile("^[A-Za-z0-9 \\p{L} \\s]*$");
    
                
     @FXML
     public void initialize() {
     addAutoValidation();
     
     
     //ajout des items au sein des combobox
     civilite.getItems().addAll("Monsieur", "Mademoiselle", "Madame");
     addAutoValidation();
     
     type.getItems().addAll("Nouvelle demande", "Renouvellement");
     addAutoValidation();
     
     situation.getItems().addAll("Célibataire", "Veuf", "Marié");
     addAutoValidation();
     }
                
     private void addAutoValidation() {
    	 
    	 
    	// Ajoutez la validation automatique pour chaque champ de saisi
    	 date.valueProperty().addListener((obs, oldVal, newVal) -> {
     	    if (newVal != null) {
     	        date.setStyle("-fx-border-color: null;");
     	       nom.setPromptText("Entrer une date valide");
     	    }
     	});
    	 jour.valueProperty().addListener((obs, oldVal, newVal) -> {
     	    if (newVal != null) {
     	        jour.setStyle("-fx-border-color: null;");
     	       jour.setPromptText("Entrer une date valide");
     	    }
     	});
    	 
        
     nom.focusedProperty().addListener((arg0, oldValue, newValue) -> {
          if (!newValue) {
              if (!Nomp.matcher(nom.getText()).matches()) {
                   nom.setStyle("-fx-border-color: red;");
                   nom.setPromptText("Entrer un nom valide");
              } else {
                   nom.setStyle("-fx-border-color: green;");
              }
         }
      });
                
     
     prenom.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Prenomp.matcher(prenom.getText()).matches()) {
                 prenom.setStyle("-fx-border-color: red;");
                 prenom.setPromptText("Entrer un prenom valide");
             } else {
                 prenom.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     
     lieu.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Lieup.matcher(lieu.getText()).matches()) {
                 lieu.setStyle("-fx-border-color: red;");
                 lieu.setPromptText("Entrer un lieu valide");
             } else {
                 lieu.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     province.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Provincep.matcher(province.getText()).matches()) {
                 province.setStyle("-fx-border-color: red;");
                 province.setPromptText("Entrer une province valide");
             } else {
                 province.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     profession.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Professionp.matcher(profession.getText()).matches()) {
                 profession.setStyle("-fx-border-color: red;");
                 profession.setPromptText("Entrer une profession valide");
             } else {
                 profession.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     
     nationalite.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Nationalitep.matcher(nationalite.getText()).matches()) {
                 nationalite.setStyle("-fx-border-color: red;");
                 nationalite.setPromptText("Entrer une nationalité valide");
             } else {
                 nationalite.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     
     tel.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Telp.matcher(tel.getText()).matches()) {
                 tel.setStyle("-fx-border-color: red;");
                 tel.setPromptText("Entrer un numéro valide");
             } else {
                 tel.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     mail.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Mailp.matcher(mail.getText()).matches()) {
                 mail.setStyle("-fx-border-color: red;");
                 mail.setPromptText("Entrer un mail valide");
             } else {
                 mail.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     adresse.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Adressep.matcher(adresse.getText()).matches()) {
                 adresse.setStyle("-fx-border-color: red;");
                 adresse.setPromptText("Entrer une adresse valide");
             } else {
                 adresse.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     pays.focusedProperty().addListener((arg0, oldValue, newValue) -> {
         if (!newValue) {
             if (!Paysp.matcher(pays.getText()).matches()) {
                 pays.setStyle("-fx-border-color: red;");
                 pays.setPromptText("Entrer un pays valide");
             } else {
                 pays.setStyle("-fx-border-color: green;");
             }
         }
     });
     
     
    
   //  oldcarte.focusedProperty().addListener((arg0, oldValue, newValue) -> {
      //   if (!newValue) {
          //   if (!Oldcartep.matcher(oldcarte.getText()).matches()) {
            //     oldcarte.setStyle("-fx-border-color: red;");
               //  oldcarte.setPromptText("Entrer un nom valide");
             //} else {
              //   oldcarte.setStyle("-fx-border-color: green;");
            // }
        // }
   //  });
     
     
 }
                    
                    
                    
                    

@FXML
void BtnEnregistrer(ActionEvent event) {
	
	try {
		
    	//Demande demandeurCarte = new Demande();
    	
    	 // Récupérer les valeurs des champs
        String Nom = nom.getText();
        String Prenom = prenom.getText();
        LocalDate Date = date.getValue();
        String Lieu = lieu.getText();
        LocalDate Jour = jour.getValue();
        String Pays = pays.getText();
        String Province = province.getText();
        String Nationalite = nationalite.getText();
        String Profession = profession.getText();
        String Mail = mail.getText();
        String Telephone = tel.getText();
        String Adresse = adresse.getText();
        String Civilite =  civilite.getValue();
        String Situation =  situation.getValue();
        String Oldcarte = oldcarte.getText();
        String Type =  type.getValue();
//        int Numero_telephone = Integer.parseInt(tel.getText());
        
        
		boolean isNomValid= true, isJourValid= true ,isPrenomValid  = true, isDateValid  = true,isLieuValid  = true, isPaysValid  = true, isProvinceValid  = true, isNationaliteValid  = true, isProfessionValid  = true, isMailValid  = true, isTelValid  = true,isSituationValid  = true,isAdresseValid  = true;
                       
		
        // Valider le nom
        if (Nom.isEmpty() || !Nomp.matcher(Nom).matches()) {
            // Souligner le champ de nom en rouge
            nom.setStyle("-fx-border-color: red;");
            nom.setPromptText("Entrer un nom valide");
            isNomValid = false;
        } else {
            // Retirer le soulignement rouge
            nom.setStyle("");
        }
        
        // Valider le prenom
        if (Prenom.isEmpty() || !Prenomp.matcher(Prenom).matches()) {
            // Souligner le champ de nom en rouge
        	prenom.setStyle("-fx-border-color: red;");
        	prenom.setPromptText("Entrer un prenom valide");
        	isPrenomValid = false;
        } else {
            // Retirer le soulignement rouge
        	prenom.setStyle("");
        }              
    
        
        // Valider le Lieu
        if (Lieu.isEmpty() || !Lieup.matcher(Lieu).matches()) {
            // Souligner le champ de nom en rouge
            lieu.setStyle("-fx-border-color: red;");
            lieu.setPromptText("Entrer un lieu valide");
            isLieuValid = false;
        } else {
            // Retirer le soulignement rouge
            lieu.setStyle("");
        }
        // valider la Date
        if (Date == null) {
        	date.setStyle("-fx-border-color: red;");
        	date.setPromptText("Entrer une date valide");
          	isDateValid = false;
        }else {
        	date.setStyle("");
        	
        }
     // valider la jour
        if (Jour == null) {
        	jour.setStyle("-fx-border-color: red;");
        	jour.setPromptText("Entrer une date valide");
          	isJourValid = false;
        }else {
        	jour.setStyle("");
        	
        }
        
        // Valider la profession
        if (Profession.isEmpty() || !Professionp.matcher(Profession).matches()) {
            // Souligner le champ de nom en rouge
            profession.setStyle("-fx-border-color: red;");
            profession.setPromptText("Entrer une profession valide");
            isProfessionValid = false;
        } else {
            // Retirer le soulignement rouge
            profession.setStyle("");
        }
        
        // Valider la Province
        if (Province.isEmpty() || !Provincep.matcher(Province).matches()) {
            // Souligner le champ de nom en rouge
            province.setStyle("-fx-border-color: red;");
            province.setPromptText("Entrer une province valide");
            isProvinceValid = false;
        } else {
            // Retirer le soulignement rouge
            province.setStyle("");
        }
        
        // Valider le Tel
        if (Telephone.isEmpty() || !Telp.matcher(Telephone).matches()) {
            // Souligner le champ de nom en rouge
            tel.setStyle("-fx-border-color: red;");
            tel.setPromptText("Entrer un telephone valide");
            isTelValid = false;
        } else {
        	        // Retirer le soulignement rouge
        	        tel.setStyle("");
//        	        int numTel = Integer.parseInt(Telephone);
        	        
        	    }        	
         
        
//         Valider le Mail
        if (Mail.isEmpty() || !Mailp.matcher(Mail).matches()) {
            // Souligner le champ de nom en rouge
            mail.setStyle("-fx-border-color: red;");
            mail.setPromptText("Entrer un mail valide");
            isMailValid = false;
        } else {
            // Retirer le soulignement rouge
            mail.setStyle("");
        }
        
        // Valider l Adress
        if (Adresse.isEmpty() || !Adressep.matcher(Adresse).matches()) {
            // Souligner le champ de nom en rouge
            adresse.setStyle("-fx-border-color: red;");
            adresse.setPromptText("Entrer une adresse valide");
            isAdresseValid = false;
        } else {
            // Retirer le soulignement rouge
            adresse.setStyle("");
        }
        
        // Valider le Pays
        if (Pays.isEmpty() || !Paysp.matcher(Pays).matches()) {
            // Souligner le champ de nom en rouge
            pays.setStyle("-fx-border-color: red;"); 
            pays.setPromptText("Entrer un pays valide");
            isPaysValid = false;
        } else {
            // Retirer le soulignement rouge
            pays.setStyle("");
        }
        
        // Valider le Nationalite
        if (Nationalite.isEmpty() || !Nationalitep.matcher(Nationalite).matches()) {
            // Souligner le champ de nom en rouge
            nationalite.setStyle("-fx-border-color: red;");
            nationalite.setPromptText("Entrer un nationalite valide");
            isNationaliteValid = false;
        } else {
            // Retirer le soulignement rouge
            nationalite.setStyle("");     		
			
        }
                
        
        if(isAdresseValid && isJourValid && isDateValid && isLieuValid && isMailValid && isNationaliteValid && isNomValid && isPaysValid && isPrenomValid && isProfessionValid && isProvinceValid && isSituationValid && isTelValid) {
			
        	InsertDataPageCreateDemande.insertData(Civilite, Nom, Prenom, Date, Lieu, Province, Pays, Profession, Nationalite, Situation, Adresse, Mail, Telephone, Type, Jour,Oldcarte );
        	        	
        	Alert alert = new Alert(AlertType.INFORMATION);
        	alert.setTitle("Envoie");
        	alert.setHeaderText(null);
        	alert.setContentText("Votre demande a été enregistrée avec succes.");
        	alert.showAndWait();               	
        	
        	Parent root = FXMLLoader.load(getClass().getResource("../view/page_accueilCNI.fxml"));	

			Scene sceneA = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(sceneA);
			stage.show();			
			
			Stage stage1  = (Stage)((Node) event.getSource()).getScene().getWindow();
    		stage1.close();
    		
        	//InsertDataPageCreateDemande.insertData(Civilité, Nom, Prenom, Date, Lieu, Province, Pays, Profession, Nationalité, Situation, Adresse, Mail, Telephone, Type, Jour,Oldcarte );

    		
    		
    		
        }
        else {
        	Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("Envoie");
        	alert.setHeaderText(null);
        	alert.setContentText("Veuillez remplir correctement les champs marqués en rouge s'il vous plaît.");
        	alert.show();
        	                	
        	} 
        
        }catch(Exception e) {
        	
        }
        
        
    }
           

	
	}






           

	
	