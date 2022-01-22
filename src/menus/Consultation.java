package menus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import loginPage.Login;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Consultation extends JFrame {

	private JPanel contentPane;
	public static JTextField Tchercher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultation frame = new Consultation();
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
	public Consultation() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/menus/parking.png")));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Consulter Votre voiture");
		setSize(400,350);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rechercher Votre Voiture");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 376, 87);
		contentPane.add(lblNewLabel);
		
		Tchercher = new JTextField();
		Tchercher.setBounds(57, 159, 158, 19);
		contentPane.add(Tchercher);
		Tchercher.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Immatriculation :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNewLabel_1.setBounds(57, 113, 142, 19);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Chercher");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Voiture.Find();
			}
		});
		btnNewButton.setBounds(82, 218, 116, 21);
		contentPane.add(btnNewButton);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAnnuler.setBounds(208, 218, 85, 21);
		contentPane.add(btnAnnuler);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\new20\\Desktop\\photo-1465101162946-4377e57745c3.jpg"));
		lblNewLabel_2.setBounds(0, 0, 396, 322);
		contentPane.add(lblNewLabel_2);
	}

}
