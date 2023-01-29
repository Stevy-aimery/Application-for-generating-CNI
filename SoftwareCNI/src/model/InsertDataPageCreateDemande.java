package model;

import java.sql.Connection;
import java.sql.Date;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import dataBase.loginDB_like_HMI;

/**
 * InsertDataPageCreateDemande add data to the Requestor table of our database via the method insertData
 * @author tresork-007
 *
 */
public class InsertDataPageCreateDemande {
	/**
	 * InsertData Allows the addition of data from the applicant table
	 * @param civilite Civility of demander
	 * @param nom Name demander
	 * @param prenom Surname demander
	 * @param date_naisssance Birthday demander
	 * @param lieu_naissance Lieu birth  demander
	 * @param province_naissance City demander
	 * @param pays_naissance country birthday demander
	 * @param profession job demander
	 * @param nationalite_origine nationality demander
	 * @param situation_famillialle family situation demander
	 * @param adresse_residence address demander
	 * @param adresse_mail mail demander
	 * @param tel phone demander
	 * @param type_demande type request of demander
	 * @param date_du_jour date of request of demander
	 * @param ancien_num_matricule Old number card of demander
	 */
	
	 public static void insertData(String civilite, String nom, String prenom,LocalDate date_naisssance,String lieu_naissance, String province_naissance,String pays_naissance, String profession, String nationalite_origine, String situation_famillialle, String adresse_residence, String adresse_mail,String tel,String type_demande, LocalDate date_du_jour, String ancien_num_matricule) {
			
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        
	        try {
	            connection = loginDB_like_HMI.dbConnect();
	            String sql = "INSERT INTO demandeur (civilite, nom, prenom, date_naisssance, lieu_naissance, province_naissance, pays_naissance, profession, nationalite_origine, situation_famillialle, adresse_residence, adresse_mail, tel, type_demande, date_du_jour, ancien_num_matricule) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, civilite);
	            preparedStatement.setString(2, nom);
	            preparedStatement.setString(3,prenom);
	            preparedStatement.setDate(4, Date.valueOf(date_naisssance));
	            preparedStatement.setString(5,lieu_naissance );
	            preparedStatement.setString(6,province_naissance );
	            preparedStatement.setString(7, pays_naissance);
	            preparedStatement.setString(8,profession );
	            preparedStatement.setString(9,nationalite_origine );
	            preparedStatement.setString(10,situation_famillialle );
	            preparedStatement.setString(11,adresse_residence );
	            preparedStatement.setString(12,adresse_mail );
	            preparedStatement.setString(13,tel );
	            preparedStatement.setString(14, type_demande);
	            preparedStatement.setDate(15, Date.valueOf(date_du_jour));
	            preparedStatement.setString(16,ancien_num_matricule );
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (preparedStatement != null) {
	                    preparedStatement.close();
	                }
	                if (connection != null) {
	                    connection.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        
	    }
	 
	 }