package menus;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Connectionn.DataBase;
import loginPage.Home; 
public class ViderParking {
	
	
	public static void Vider() {
	try {
		// 1. Get a connection to data base
		Connection myConn = DataBase.getCon();
		
		// initialisation des attr
		String x = Home.Tpos.getText();
		String vide ="Vide";
		
		
		// 2. Create a statement
		
		// 3. Execute SQL query
		String sql = "update place set etat='"+vide+"' WHERE  nompark='"+x+"'";
		PreparedStatement stm = myConn.prepareStatement(sql);
		stm.executeUpdate(sql);
		// 4. Process the result set 
			
		
		 JOptionPane.showMessageDialog(null, "Parking Num : '"+x+"' is Ready  To  use ");
		
	
	
		 
		
		 Home.Tpos.setText("");
		 
	}
	catch (Exception exc) 
	{
		exc.printStackTrace();
	}
	
	
			
}

	
}








/* if (x.equals("p1"))
	 {
	 Parking.t1.setText("Vide");
	 Parking.t1.setForeground(Color.GREEN);
	 }
		 
		 if (x.equals("p2"))
		 {
		 Parking.t2.setText("Vide");
		 Parking.t2.setForeground(Color.GREEN);
		 }
		 
		 if (x.equals("p3"))
		 {
		 Parking.t3.setText("Vide");
		 Parking.t3.setForeground(Color.GREEN);
		 }
		 
		 if (x.equals("p4"))
		 {
		 Parking.t4.setText("Vide");
		 Parking.t4.setForeground(Color.GREEN);
		 }
		 
		 if (x.equals("p5"))
		 {
		 Parking.t5.setText("Vide");
		 Parking.t5.setForeground(Color.GREEN);
		 }
		 
		 if (x.equals("p6"))
		 {
		 Parking.t6.setText("Vide");
		 Parking.t6.setForeground(Color.GREEN);
		 }
		 
		 if (x.equals("p7"))
		 {
		 Parking.t7.setText("Vide");
		 Parking.t7.setForeground(Color.GREEN);
		 }
		 
		 if (x.equals("p8"))
		 {
		 Parking.t8.setText("Vide");
		 Parking.t8.setForeground(Color.GREEN);
		 }*/