package model;

import dataBase.DemandeurBD;
//import database.StudentDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PageAccueilAgent {
	 
	private final ObservableList<Demandeur> demandeurList;
	
	public PageAccueilAgent() {
        this.demandeurList = FXCollections.observableArrayList();
        demandeurList.addAll(DemandeurBD.loadDemandeurs());
    }
	
	public ObservableList<Demandeur> getDemandeurList() {
        return demandeurList;
    }
	
	
	// Pour Charger la BD	
	public void loadFromDB(){
        //this.studentList.clear();
        //this.studentList.addAll(StudentDB.loadStudents());
    	// setAll does the same as the two previous lines
        this.demandeurList.setAll(DemandeurBD.loadDemandeurs());
    }
    
	
}
