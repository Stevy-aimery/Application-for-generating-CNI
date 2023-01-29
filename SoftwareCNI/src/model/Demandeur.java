package model;

import javafx.beans.property.SimpleStringProperty;


/**
 * Requester represents the requester table of our DB by providing the types of its records (the types of Valuers of the fields)
  * @author StevyKabalera
 *
 */ 

public class Demandeur {
	
	private SimpleStringProperty num_demande = new SimpleStringProperty() ;
	private SimpleStringProperty nom = new SimpleStringProperty(); 
	private SimpleStringProperty type_demande = new SimpleStringProperty();
	private SimpleStringProperty date_du_jour = new SimpleStringProperty();
	private SimpleStringProperty pays_naissance = new SimpleStringProperty();
	private SimpleStringProperty civilite = new SimpleStringProperty();
	
	
	public Demandeur() {
		// TODO Auto-generated constructor stub
		super();		 
	}
	//	Constructor
	public Demandeur(String num_demande, String nom, String type_demande , String date_du_jour , String civilite, String pays_naissance) {
		setNum_demande(num_demande);
		setNomDemandeur(nom);
		settype_demande(type_demande);
		setdate_du_jour(date_du_jour);
		setcivilite(civilite);
		setdate_naisssance(pays_naissance);
	}	

	
	public SimpleStringProperty Num_demandeProperty() {
		return num_demande;
	}
	public String getNum_demande() {
		return num_demande.get();		
	}	
	public void setNum_demande(String num_demande) {
		this.num_demande.set(num_demande);
	}	
		

	public SimpleStringProperty NomDemandeurProperty() {
		return nom;
	}
	public String getnomDemandeur() {
		return nom.get();		
	}	
	public void setNomDemandeur( String nom) {
		this.nom.set(nom);
	}
	
	
	public SimpleStringProperty type_demandeProperty() {
		return type_demande;
	}
	public String getType_demandeProperty() {
		return type_demande.get();		
	}	
	private void settype_demande(String type_demande) {
		// TODO Auto-generated method stub
		this.type_demande.set(type_demande);		
	}
	
	
	public SimpleStringProperty date_du_jourProperty() {
		return date_du_jour;
	}
	public String getDate_du_jourProperty() {
		return date_du_jour.get();		
	}
	private void setdate_du_jour(String date_du_jour) {
		// TODO Auto-generated method stub
		this.date_du_jour.set(date_du_jour);		
	}
	
	
	public SimpleStringProperty civiliteProperty() {
		return civilite;
	}
	public String getCiviliteProperty() {
		return civilite.get();		
	}
	private void setcivilite(String civilite) {		
		this.civilite.set(civilite);
	}
	
	
	
	public SimpleStringProperty pays_naissanceProperty() {
		return pays_naissance;
	}
	public String getPays_naissanceProperty() {
		return pays_naissance.get();		
	}	
	private void setdate_naisssance(String pays_naissance) {		
		this.pays_naissance.set(pays_naissance);
	}
	
}

//public String get----Property() {
//	return c---.get();		
//}
