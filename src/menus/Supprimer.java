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

public class Supprimer {
	
	

	
	
	
	
	
	
	
	public static void setazero() {
		try {
			// 1. Get a connection to data base
			Connection myConn = DataBase.getCon();
			
			// initialisation des attr
			String x = Home.Timmat.getText();
			
			
			
			// 2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			
			String sql2 = "SELECT *   FROM voiture WHERE  immat='"+x+"'";

			ResultSet myRs = myStmt.executeQuery(sql2);
			String pos ;
			 String y;
			// 4. Process the result set 
				
			 if (myRs.next())
				
			 {	 pos = myRs.getString("reservation");
				
				y ="Vide";
				String sql3 = "Update place set etat='"+y+"' WHERE  nompark='"+pos+"'";
				myStmt.executeUpdate(sql3);
			
			
			 }
			
			 
		
		}
		catch (Exception exc) 
		{
			exc.printStackTrace();
		}
		
				
	}




public static void Delete() {
try {
	// 1. Get a connection to data base
	Connection myConn = DataBase.getCon();
	
	// initialisation des attr
	String x = Home.Timmat.getText();
	
	
	
	// 2. Create a statement
	
	// 3. Execute SQL query
	String sql = "DELETE   FROM voiture WHERE  immat='"+x+"'";

	PreparedStatement stm = myConn.prepareStatement(sql);
	stm.executeUpdate(sql);
	// 4. Process the result set 
		
	
	 JOptionPane.showMessageDialog(null, "Position de Parking ready to use ");
	 Home.Timmat.setText("");
	
	 
	 
	 Home.table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] { 
					"Immat", "Marque", "Model", "Nombre de Porte","Reservation"
				}
			));
			Home.table_1.getColumnModel().getColumn(3).setPreferredWidth(114);
			
	 Afficher.Afficher();
	 
	 JOptionPane.showMessageDialog(null, "Voiture Supprimer avec succes");
	 Home.Timmat.setText("");
}
catch (Exception exc) 
{
	exc.printStackTrace();
}

		
}
}


