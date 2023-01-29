package dataBase;

import java.sql.ResultSet;
import java.sql.SQLException;

//import database.DBUtil;
//import database.DBUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Demandeur;
//import model.Student;

  /**
   	* DemandeurBD Requester accepts requests to query the DB
   * @author Tresor-007
   * 
   */
public class DemandeurBD {
	
  //*******************************
  //SELECT Demandeurs
  //*******************************
	public static ObservableList<Demandeur> loadDemandeurs(){
		 //Declare a SELECT statement
        String selectStmt = "SELECT * FROM demandeur";
        
      //Execute SELECT statement        
      //Get ResultSet from dbExecuteQuery method
        ResultSet rsdmds = loginDB_like_HMI.dbExecuteQuery(selectStmt);
        //Send ResultSet to the getStudentList method and get Student object
        ObservableList<Demandeur> dmdList = getDemandeur(rsdmds);
        //Return Student object
        return dmdList;		
		
	}
	//Select * from info operation
    private static ObservableList<Demandeur> getDemandeur(ResultSet rs) {
        //Declare a observable List which comprises of Demandeur objects
        ObservableList<Demandeur> dmdList = FXCollections.observableArrayList();
        try {
			while (rs.next()) {
			    Demandeur dmd = new Demandeur(rs.getString("num_demande"), rs.getString("nom"), rs.getString("type_demande"), rs.getString("date_du_jour"), rs.getString("civilite"), rs.getString("pays_naissance"));
			    //Add Student to the ObservableList
			    dmdList.add(dmd);
			}
		} catch (SQLException e) {
			System.out.println("Unable to read data : " + e);
		}
        //return stdList (ObservableList of Students)
        return dmdList;
    }
    
    
    
   /* 
    public static int insertStudent (Demandeur s) {
        //Declare a INSERT statement
        String updateStmt =
                        "INSERT INTO demandeur\n" +
                        "(name)\n" +
                        "VALUES\n" +
                        "('"+s.getName()+"');"; 
        //Execute INSERT operation
        
        return loginDB_like_HMI.dbExecuteUpdate(updateStmt);
        
    }
    */
  
    
    //*************************************
     /// Print Demande selected
    //*************************************
    /*
    public static void deleteStdWithId (String NumDemande) {
        //Declare a DELETE statement
        String PrintDemande =
                        "SELECT * FROM demandeur" +
                        "         WHERE id ="+ NumDemande +";";
        //Execute UPDATE operation
        
        loginDB_like_HMI.dbExecuteUpdate(PrintDemande);
        
    }
 // Using prepared statement method
    public static int deleteStd(String NumDemande) {
        //Declare a DELETE statement
        String updateStmt = "SELECT * FROM demandeur" +
                        "         WHERE id = ?;";
        //Execute UPDATE operation
        Object[] data = {NumDemande};
        return loginDB_like_HMI.dbExecuteUpdatePrepared(updateStmt, data);	

}*/
    
    
}
