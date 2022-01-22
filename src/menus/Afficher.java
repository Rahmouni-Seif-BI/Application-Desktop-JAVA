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

public class Afficher {
	
	
	public static void Afficher() {
		try {
			
			//1. Connexion
			Connection myConn = DataBase.getCon();
		
		
			
		//2. statment 
		Statement myStmt = myConn.createStatement();
		
		//3.Execute requette
		String sql ="SELECT * FROM voiture";
		
		
		//4. Resultat SEt  
		ResultSet myRs = myStmt.executeQuery(sql);

		//affichage 
		

		
	
		
		while (myRs.next())
		{
			String immat = myRs.getString("immat");
			String model = myRs.getString("model");
			String marque = myRs.getString("marque");
			String nbporte = String.valueOf(myRs.getInt("nbporte"));
			String reservation = myRs.getString("reservation");
			
			// tableau pour enregistrer les donnes dans jtable
			
			String tbData[] = {immat,marque,model,nbporte,reservation}; 
	
			
			DefaultTableModel tbModel = (DefaultTableModel)Home.table_1.getModel();
			
			tbModel.addRow(tbData); 		
			
		
		
		}
	
	
		
		}
		catch (Exception exc){
			exc.printStackTrace();
		}
			
}
}


