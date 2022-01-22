package menus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Connectionn.DataBase;
import loginPage.Home;
import loginPage.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class Reservation extends JFrame {

	private JPanel layout;
	private JTextField immat;
	private JTextField model;
	private JTextField marque;
	private JTextField nbporte;
	private JButton btnNewButton;
	private JButton annuler;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation frame = new Reservation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Reservation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/menus/parking.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,350);
		setLocationRelativeTo(null);
		setResizable(false);
		layout = new JPanel(); 
		layout.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(layout);
		layout.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Immatriculation");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(74, 60, 146, 22);
		layout.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Model");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(74, 92, 101, 22);
		layout.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Marque");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(74, 124, 101, 22);
		layout.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre de Protes");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(74, 154, 146, 22);
		layout.add(lblNewLabel_3);
		
		immat = new JTextField();
		immat.setBounds(254, 60, 96, 19);
		layout.add(immat);
		immat.setColumns(10);
		
		model = new JTextField();
		model.setColumns(10);
		model.setBounds(254, 92, 96, 19);
		layout.add(model);
		
		marque = new JTextField();
		marque.setColumns(10);
		marque.setBounds(254, 124, 96, 19);
		layout.add(marque);
		
		nbporte = new JTextField();
		nbporte.setColumns(10);
		nbporte.setBounds(254, 156, 96, 19);
		layout.add(nbporte);
		
		btnNewButton = new JButton("Reserver ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//********
				
				try {
					// 1. Get a connection to data base
					Connection myConn = DataBase.getCon();
					
					// initialisation des attr
					String vimmat = immat.getText();
					String vmodel = model.getText();	
					String vmarque = marque.getText();	
					String vnbporte = nbporte.getText();
					String reserver = "reserver"; 
					String nompark = Parking.var ; 
					int vnbp = Integer.parseInt(vnbporte);
					
					// 2. Create a statement
					Statement myStmt = myConn.createStatement(); 
					// 3. Execute SQL query
					String sql = "INSERT INTO voiture values('"+vimmat+"','"+vmodel+"','"+vmarque+"',"+vnbp+",'"+nompark+"')";
					String sql2 = "update place set etat='"+reserver+"' WHERE  nompark='"+nompark+"'";

					myStmt.executeUpdate(sql);
					myStmt.executeUpdate(sql2);
					
				
						
					 // changement de text 
					 if (nompark.equals("p1"))
					 {
					 Parking.t1.setText("Reserver");
					 Parking.t1.setForeground(Color.RED);
					 }
					  
					 if (nompark.equals("p2"))
					 {
					 Parking.t2.setText("Reserver");
					 Parking.t2.setForeground(Color.RED);
					 }
					 
					 if (nompark.equals("p3"))
					 {
					 Parking.t3.setText("Reserver");
					 Parking.t3.setForeground(Color.RED);
					 }
					 
					 if (nompark.equals("p4"))
					 {
					 Parking.t4.setText("Reserver");
					 Parking.t4.setForeground(Color.RED);
					 }
					 
					 if (nompark.equals("p5"))
					 {
					 Parking.t5.setText("Reserver");
					 Parking.t5.setForeground(Color.RED);
					 }
					 
					 if (nompark.equals("p6"))
					 {
					 Parking.t6.setText("Reserver");
					 Parking.t6.setForeground(Color.RED);
					 }
					 
					 if (nompark.equals("p7"))
					 {
					 Parking.t7.setText("Reserver");
					 Parking.t7.setForeground(Color.RED);
					 }
					 
					 if (nompark.equals("p8"))
					 {
					 Parking.t8.setText("Reserver");
					 Parking.t8.setForeground(Color.RED);
					 }
					 
					// 4. Process the result set 
							dispose();
					 JOptionPane.showMessageDialog(null, "Votre reservation  terminer avec succes");
			
					 
					
					
				}
				catch (Exception exc)
				{
					exc.printStackTrace();
				}
						}
				
			
				//*********
			
		});
		btnNewButton.setBounds(74, 206, 122, 22);
		layout.add(btnNewButton);
		
		annuler = new JButton("annuler");
		annuler.setFont(new Font("Times New Roman", Font.BOLD, 15));
		annuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		annuler.setBounds(206, 206, 122, 22);
		layout.add(annuler);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\new20\\Desktop\\background.jpg"));
		lblNewLabel_4.setBounds(0, 0, 396, 322);
		layout.add(lblNewLabel_4);
	}

}
