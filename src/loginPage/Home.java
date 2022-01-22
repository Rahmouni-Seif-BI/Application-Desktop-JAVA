package loginPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connectionn.DataBase;
import menus.AfficheEtat;
import menus.AffichePlace;
import menus.Afficher;
import menus.Supprimer;
import menus.ViderParking;
import menus.Welcome;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Home extends JFrame {

	private JPanel contentPane;

	public static JTable table_1,table_2;
	public static JTable table;
	public static  JTextField Timmat;
	public static  JTextField Tpos;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/menus/parking.png")));
		setSize(900, 800);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Liste de Voiture"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(420, 74, 426, 161);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] { 
				"Immat", "Marque", "Model", "Nombre de Porte","Reservation"
			}
		));
		table_1.getColumnModel().getColumn(3).setPreferredWidth(114);
		
		// Affichage
		Afficher.Afficher();
 
		
		
		JButton back = new JButton("LogOut");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				
				
				
			}
		});
		back.setBounds(10, 10, 85, 21);
		contentPane.add(back);
		
		JLabel lblNewLabel = new JLabel("Liste de Voiture");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(420, 10, 426, 35);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblEtatDeParking = new JLabel("Etat de Parking ");
		lblEtatDeParking.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtatDeParking.setForeground(Color.WHITE);
		lblEtatDeParking.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEtatDeParking.setBackground(Color.BLUE);
		lblEtatDeParking.setBounds(420, 270, 426, 35);
		contentPane.add(lblEtatDeParking);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(420, 315, 426, 153);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID_Parking", "Etat"
			}
		));
		
		AffichePlace.AfficherPlace();
		
		Timmat = new JTextField();
		Timmat.setBounds(46, 155, 96, 19);
		contentPane.add(Timmat);
		Timmat.setColumns(10);
		
		JButton supp = new JButton("Supprimer");
		supp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (Timmat.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Entrer L'immatriculation SVP ");
			}
			else 
				Supprimer.setazero();
			Supprimer.Delete(); 
				
			}
		});
		supp.setBounds(152, 154, 103, 21);
		contentPane.add(supp);
		
		JLabel lblSupprimerVoiture_1 = new JLabel("Vider Pos Parking");
		lblSupprimerVoiture_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSupprimerVoiture_1.setForeground(Color.WHITE);
		lblSupprimerVoiture_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblSupprimerVoiture_1.setBackground(Color.BLUE);
		lblSupprimerVoiture_1.setBounds(46, 252, 284, 54);
		contentPane.add(lblSupprimerVoiture_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Position  parking");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setBounds(46, 307, 209, 34);
		contentPane.add(lblNewLabel_1_1);
		
		Tpos = new JTextField();
		Tpos.setColumns(10);
		Tpos.setBounds(46, 357, 96, 25);
		contentPane.add(Tpos);
		
		JButton supp_1 = new JButton("Vider");
		supp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Tpos.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Entrer L'immatriculation SVP ");
				}
				else 
					
				ViderParking.Vider();
			}
		});
		supp_1.setBounds(150, 356, 96, 26);
		contentPane.add(supp_1);
		JLabel lblSupprimerVoiture_1_1 = new JLabel("Supprimer Voiture");
		lblSupprimerVoiture_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSupprimerVoiture_1_1.setForeground(Color.WHITE);
		lblSupprimerVoiture_1_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblSupprimerVoiture_1_1.setBackground(Color.BLUE);
		lblSupprimerVoiture_1_1.setBounds(46, 50, 284, 54);
		contentPane.add(lblSupprimerVoiture_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Immatriculation");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(46, 111, 209, 34);
		contentPane.add(lblNewLabel_1_1_1);
		JButton button = new JButton("Refresh");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); 
				
				Home h = new Home();
				h.show();
			}
		});
				
				JScrollPane scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(443, 578, 398, 87);
				contentPane.add(scrollPane_2);
		
		
				table_2 = new JTable();
				scrollPane_2.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID PARKING", "ETAT VIDE"
			}
		));
		
		
		
			AfficheEtat.affEtat(); 
			
			
			JLabel lblEtatDeParking_1 = new JLabel("PARK VIDE");
			lblEtatDeParking_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblEtatDeParking_1.setForeground(Color.WHITE);
			lblEtatDeParking_1.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblEtatDeParking_1.setBackground(Color.BLUE);
			lblEtatDeParking_1.setBounds(415, 533, 426, 35);
			contentPane.add(lblEtatDeParking_1);
			
			
			
		button.setBounds(757, 502, 85, 21);
		contentPane.add(button);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\new20\\Desktop\\2217435.jpg"));
		lblNewLabel_2.setBounds(0, 0, 896, 772);
		contentPane.add(lblNewLabel_2);
	

		
		
		
		
		
		
		
	}
}








