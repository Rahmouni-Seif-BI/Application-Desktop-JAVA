package menus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import Connectionn.DataBase;
import loginPage.Home;

public class AfficheEtat {

	
	
	

	public static void affEtat() {
		// TODO Auto-generated method stub
		
try {
			
			//1. Connexion
			Connection myConn = DataBase.getCon();
		
		
			
		//2. statment 
		Statement myStmt = myConn.createStatement();
		
		//3.Execute requette
		String x="Vide"; 
		String sql ="SELECT * FROM place WHERE etat='"+x+"'";
		
		
		//4. Resultat SEt  
		ResultSet myRs = myStmt.executeQuery(sql);

		//affichage 
		

		
	
		
		while (myRs.next())
		{
			String nomp = myRs.getString("nompark");
			String et = myRs.getString("etat");
		
			
			// tableau pour enregistrer les donnes dans jtable
			
			String tbData[] = {nomp,et}; 
	
			
			DefaultTableModel tbModel = (DefaultTableModel)Home.table_2.getModel();
			
			tbModel.addRow(tbData); 		
			
		
		
		}
	
	
		
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
		
	}
}
