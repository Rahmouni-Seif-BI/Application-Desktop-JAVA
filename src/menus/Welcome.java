package menus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import loginPage.Login;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.Font;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JButton Breservation;
	private JButton Badmin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Welcome To Parking");
		setSize(900, 800);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Breservation = new JButton("R\u00E9servation");
		Breservation.setFont(new Font("Rockwell", Font.BOLD, 29));
		Breservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Parking park = new Parking(); 
				park.show();
			}
		});
		Breservation.setBounds(270, 279, 220, 104);
		contentPane.add(Breservation);
			JLabel lblNewLabel_1 = new JLabel("Gestion de Parking");
			lblNewLabel_1.setBackground(new Color(255, 255, 224));
			lblNewLabel_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 45));
		lblNewLabel_1.setBounds(209, 30, 492, 86);
		contentPane.add(lblNewLabel_1);
		
		JButton Badmin = new JButton("Admin");
		Badmin.setFont(new Font("Rockwell", Font.BOLD, 35));
		Badmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login(); 
				log.show();
			} 
		});
		Badmin.setBounds(41, 277, 175, 104);
		contentPane.add(Badmin);
		
		JButton btnNewButton_2 = new JButton("Consulter Votre Voiture");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Consultation cons = new Consultation(); 
				cons.show();
			}
		});
		btnNewButton_2.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(515, 277, 345, 104);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\new20\\Desktop\\background.jpg"));
		lblNewLabel.setBounds(0, 0, 886, 772);
		contentPane.add(lblNewLabel);
	
	
		
	}
}
