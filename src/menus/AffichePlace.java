package menus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Connectionn.DataBase;
import loginPage.Home;

public class AffichePlace {
	
	
	public static void AfficherPlace() {
		try {
			//1. Connexion
				Connection myConn = DataBase.getCon();
			
			
				
			//2. statment 
			Statement myStmt = myConn.createStatement();
			
			//3.Execute requette
			String sql ="SELECT * FROM place";
			
			
			//4. Resultat SEt  
			ResultSet myRs = myStmt.executeQuery(sql);

			//affichage 
			

			
			while (myRs.next())
			{
				String nompos = myRs.getString("nompark");
				String etatpos = myRs.getString("etat");
				
				
				// tableau pour enregistrer les donnes dans jtable
				
				String tbData2[] = {nompos,etatpos}; 
		
				
				DefaultTableModel tbModel2 = (DefaultTableModel)Home.table.getModel();
				
				tbModel2.addRow(tbData2); 		
				
			
			
			}
		
			
		
		
	
	
		
		}
		catch (Exception exc){
			exc.printStackTrace();
		}

}
	
}


