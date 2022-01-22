package menus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Connectionn.DataBase;
import loginPage.Home;

public class Voiture {
	
	
	
	public static void Find()
	{
		
		try {
			// 1. Get a connection to data base
			Connection myConn = DataBase.getCon();
			
			// initialisation des attr
			String Rech = Consultation.Tchercher.getText();
				
			
			
			// 2. Create a statement
			Statement myStmt = myConn.createStatement(); 
			// 3. Execute SQL query
			String sql = "SELECT *  FROM voiture WHERE  immat='"+Rech+"'";
			ResultSet myRs = myStmt.executeQuery(sql);
			// 4. Process the result set 
				if (myRs.next())
				{	// if  login  and  password  are true 
				
					JOptionPane.showMessageDialog(null,"Votre Voiture existe Dans Park num :"+myRs.getString("reservation"));
				
				}
				else { 
					JOptionPane.showMessageDialog(null,"Aucun Voiture Enregistrer Avec cet Immat !! ");
					Consultation.Tchercher.setText("");
					
				}
		
			
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
