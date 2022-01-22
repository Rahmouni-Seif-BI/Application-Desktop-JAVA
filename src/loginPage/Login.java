package loginPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connectionn.DataBase;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	public static  JTextField Login;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/menus/parking.png")));

		setTitle("Login Administration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450,300);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Login = new JTextField();
		Login.setBounds(226, 36, 96, 38);
		contentPane.add(Login);
		Login.setColumns(10);
		
		
		Password = new JPasswordField();
		Password.setBounds(226, 97, 96, 38);
		contentPane.add(Password);
		
		
		JLabel LOGIN = new JLabel("LOGIN");
		LOGIN.setForeground(new Color(240, 255, 240));
		LOGIN.setFont(new Font("Snap ITC", Font.BOLD, 25));
		LOGIN.setBounds(21, 37, 170, 35);
		contentPane.add(LOGIN);
		
		JLabel PASSWORD = new JLabel("PASSWORD");
		PASSWORD.setForeground(new Color(240, 248, 255));
		PASSWORD.setFont(new Font("Snap ITC", Font.PLAIN, 25));
		PASSWORD.setBounds(21, 98, 170, 35);
		contentPane.add(PASSWORD);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 128, 0));
		btnLogin.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// 1. Get a connection to data base
					Connection myConn = DataBase.getCon();
					
					// initialisation des attr
					String username = Login.getText();
					String Pass = Password.getText();	
					
					
					// 2. Create a statement
					Statement myStmt = myConn.createStatement(); 
					// 3. Execute SQL query
					String sql = "SELECT *  FROM user WHERE  Login='"+username+"' and Password='"+Pass+"'";
					ResultSet myRs = myStmt.executeQuery(sql);
					// 4. Process the result set 
						if (myRs.next())
						{	// if  login  and  password  are true 
						//	dispose(); // close fenetre login 
							dispose();
						
							Home hpage = new Home(); //afficha de page Home 
							hpage.setVisible(true);
							
						}
						else { 
							JOptionPane.showMessageDialog(null,
									"Login  Or Password Wrong !");
							Login.setText("");
							Password.setText("");
						}
				
					
				}
				catch (Exception exc)
				{
					exc.printStackTrace();
				}
						}
		} );
		btnLogin.setBounds(85, 171, 106, 47);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(0, 0, 255));
		btnReset.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.setText("");
				Password.setText("");
			}
		});
		btnReset.setBounds(205, 171, 117, 47);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\new20\\Desktop\\futur-fond-technologie-abstraite_1406-110.jpg"));
		lblNewLabel.setBounds(0, 0, 446, 272);
		contentPane.add(lblNewLabel);
	
	
		
	
		
	}
}
