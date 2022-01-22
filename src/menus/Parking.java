package menus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connectionn.DataBase;
import loginPage.Home;
import loginPage.Login;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Parking extends JFrame {

	private JPanel contentPane;
	static JLabel t1,t2,t3,t4,t5,t6,t7,t8;
	static String var ;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parking frame = new Parking();
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
	public Parking() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/menus/parking.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Reservation Parking");
		setSize(900, 800);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton p2 = new JButton("Park 2");
		p2.setForeground(new Color(255, 255, 255));
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t2.getText().equals("reserver"))
					
					 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
					 
					else  
					{
						 var="p2"; 
					Reservation res = new Reservation(); 
					res.show();
					}
				
			}
		});
		p2.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p2.setBackground(Color.BLACK);
		p2.setBounds(330, 118, 130, 166);
		contentPane.add(p2);
		
		JButton p3 = new JButton("Park 3");
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t3.getText().equals("reserver"))
					
					 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
					 
					else  
					{
						 var="p3"; 
					Reservation res = new Reservation(); 
					res.show();
					}
				
			}
			
		});
		p3.setForeground(new Color(255, 255, 255));
		p3.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p3.setBackground(Color.BLACK);
		p3.setBounds(470, 118, 130, 166);
		contentPane.add(p3);
		
		JButton p4 = new JButton("Park 4");
		p4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t4.getText().equals("reserver"))
					
					 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
					 
					else  
					{
						 var="p4"; 
					Reservation res = new Reservation(); 
					res.show();
					}
			}
		});
		p4.setForeground(new Color(255, 255, 255));
		p4.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p4.setBackground(Color.BLACK);
		p4.setBounds(610, 118, 130, 166);
		contentPane.add(p4);
		
		JButton p5 = new JButton("Park 5");
		p5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t5.getText().equals("reserver"))
					
					 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
					 
					else  
					{
						 var="p5"; 
					Reservation res = new Reservation(); 
					res.show();
					}
			}
		});
		p5.setForeground(new Color(255, 255, 255));
		p5.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p5.setBackground(Color.BLACK);
		p5.setBounds(190, 440, 130, 166);
		contentPane.add(p5);
		
		JButton p6 = new JButton("Park 6");
		p6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (t6.getText().equals("reserver"))
					
					 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
					 
					else  
					{
						 var="p6"; 
					Reservation res = new Reservation(); 
					res.show();
					}
			}
		});
		p6.setForeground(new Color(255, 255, 255));
		p6.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p6.setBackground(Color.BLACK);
		p6.setBounds(330, 440, 130, 166);
		contentPane.add(p6);
		
		JButton p7 = new JButton("Park 7");
		p7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t7.getText().equals("reserver"))
					
					 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
					 
					else  
					{
						 var="p7"; 
					Reservation res = new Reservation(); 
					res.show();
					}
			}
		});
		p7.setForeground(new Color(255, 255, 255));
		p7.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p7.setBackground(Color.BLACK);
		p7.setBounds(470, 440, 130, 166);
		contentPane.add(p7);
		
		JButton p8 = new JButton("Park 8");
		p8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (t8.getText().equals("reserver"))
					
					 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
					 
					else  
					{
						 var="p8"; 
					Reservation res = new Reservation(); 
					res.show();
					}
			}
		});
		p8.setForeground(new Color(255, 255, 255));
		p8.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p8.setBackground(Color.BLACK);
		p8.setBounds(610, 440, 130, 166);
		contentPane.add(p8);
		
		
		
		
		JButton p1 = new JButton("Park 1");
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (t1.getText().equals("reserver"))
				 
				 JOptionPane.showMessageDialog(null, "Déja Reserver !!!!  SVP choisir  une autre Park");
				 
				else  
				{
					var="p1"; 
				Reservation res = new Reservation(); 
				res.show();
				}
			}
		});
		p1.setForeground(Color.WHITE);
		p1.setFont(new Font("Sylfaen", Font.BOLD, 20));
		p1.setBackground(Color.BLACK);
		p1.setBounds(190, 118, 130, 166);
		contentPane.add(p1);
		
		 t1 = new JLabel("Vide");
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Stencil", Font.BOLD, 18));
		t1.setBounds(190, 305, 130, 22);
		contentPane.add(t1);
		
		 t2 = new JLabel("Vide");
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("Stencil", Font.BOLD, 18));
		t2.setBounds(330, 305, 130, 22);
		contentPane.add(t2);
		
		 t3 = new JLabel("Vide");
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setFont(new Font("Stencil", Font.BOLD, 18));
		t3.setBounds(470, 305, 130, 22);
		contentPane.add(t3);
		
		 t4 = new JLabel("Vide");
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setFont(new Font("Stencil", Font.BOLD, 18));
		t4.setBounds(610, 305, 130, 22);
		contentPane.add(t4);
		
		 t8 = new JLabel("Vide");
		t8.setHorizontalAlignment(SwingConstants.CENTER);
		t8.setFont(new Font("Stencil", Font.BOLD, 18));
		t8.setBounds(610, 632, 130, 22);
		contentPane.add(t8);
		
		 t7 = new JLabel("Vide");
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		t7.setFont(new Font("Stencil", Font.BOLD, 18));
		t7.setBounds(470, 632, 130, 22);
		contentPane.add(t7);
		
		 t6 = new JLabel("Vide");
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setFont(new Font("Stencil", Font.BOLD, 18));
		t6.setBounds(330, 632, 130, 22);
		contentPane.add(t6);
		
		 t5 = new JLabel("Vide");
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setFont(new Font("Stencil", Font.BOLD, 18));
		t5.setBounds(190, 632, 130, 22);
		contentPane.add(t5);
		
		JButton back = new JButton("back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Welcome retoure = new Welcome();
				retoure.show();
				
				
				
			}
		});
		back.setBounds(36, 39, 85, 21);
		contentPane.add(back);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\new20\\Desktop\\mos.jpg"));
		lblNewLabel.setBounds(0, 0, 896, 772);
		contentPane.add(lblNewLabel);
		
		//////////////////////////////////////////////////////////////////////////
		
		try {
			// 1. Get a connection to data base
			Connection myConn = DataBase.getCon();
			
			// initialisation des attr
		//	String username = Login.getText();
		//	String Pass = Password.getText();	
			
			
			// 2. Create a statement
			Statement myStmt = myConn.createStatement(); 
			// 3. Execute SQL query
			String sql = "SELECT *  FROM place ";
			ResultSet myRs = myStmt.executeQuery(sql);
			// 4. Process the result set 
			
			String tab[]  = new String[9];
			int i=1 ; 
			while (myRs.next())
			{
		 
				tab[i] = myRs.getString("etat");
				i++ ; 
			
				
				
					
			
			
			}
		
			//-----------------------------------------
			String v1 = tab[1]; 
			 Parking.t1.setText(v1);
			 if (v1.equals("reserver"))
				 Parking.t1.setForeground(Color.RED);
				 else  
				 {
					 Parking.t1.setForeground(Color.GREEN);
				 }
				//-----------------------------------------
				//-----------------------------------------
				String v2 = tab[2]; 
				 Parking.t2.setText(v2);
				 if (v2.equals("reserver"))
					 Parking.t2.setForeground(Color.RED);
					 else  {
						 Parking.t2.setForeground(Color.GREEN);
					 }
					//-----------------------------------------
					//-----------------------------------------
					String v3 = tab[3]; 
					 Parking.t3.setText(v3);
					 if (v3.equals("reserver"))
						 Parking.t3.setForeground(Color.RED);
						 else  {
						
							Parking.t3.setForeground(Color.GREEN);
						 }
						//-----------------------------------------
						//-----------------------------------------
						String v4 = tab[4]; 
						 Parking.t4.setText(v4);
						 if (v4.equals("reserver"))
							 Parking.t4.setForeground(Color.RED);
							 else  
							 {
								 Parking.t4.setForeground(Color.GREEN);
							 }
							//-----------------------------------------
							//-----------------------------------------
							String v5 = tab[5]; 
							 Parking.t5.setText(v5);
							 if (v5.equals("reserver"))
								 Parking.t5.setForeground(Color.RED);
								 else  
								 {
									 Parking.t5.setForeground(Color.GREEN);
								 }
								//-----------------------------------------
								String v6 = tab[6]; 
								 Parking.t6.setText(v6);
								 if (v6.equals("reserver"))
									 Parking.t6.setForeground(Color.RED);
									 else  
									 {
										 Parking.t6.setForeground(Color.GREEN);
									 }
									//-----------------------------------------
								 
									String v7 = tab[7]; 
									 Parking.t7.setText(v7);
									 if (v7.equals("reserver"))
										 Parking.t7.setForeground(Color.RED);
										 else  
										 {
											 Parking.t7.setForeground(Color.GREEN);
										 }
									 
										//-----------------------------------------
									 
										String v8 = tab[8]; 
										 Parking.t8.setText(v8);
										 if (v8.equals("reserver"))
											 Parking.t8.setForeground(Color.RED);
											 else  
											 {
												 Parking.t8.setForeground(Color.GREEN);
											 }
									
								 
							 

			
		}	
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
				
		
		
	}

}
