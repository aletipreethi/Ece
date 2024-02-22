package Ece_DB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class signin {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JPasswordField p1;
	private JPasswordField p2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signin window = new signin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 537, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("user");
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblNewLabel_2.setBounds(23, 98, 46, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("pwd");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblNewLabel.setBounds(23, 178, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(105, 99, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("user");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblNewLabel_1.setBounds(269, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("pwd");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lblNewLabel_3.setBounds(269, 178, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb2 = new JTextField();
		tb2.setBounds(359, 99, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton = new JButton("sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String pwd=p1.getText();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/preethi","root","mrec");
					PreparedStatement stn=con.prepareStatement("select user,pwd from users where user=?and pwd=?");
					stn.setString(1, user);
					stn.setString(2, pwd);
					ResultSet rs=stn.executeQuery();
					if(rs.next ()) {
						JOptionPane.showMessageDialog(btnNewButton, "valid user");
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Invalid user");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 17));
		btnNewButton.setBounds(76, 251, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("sign up");
		btnNewButton_1.setFont(new Font("Cambria Math", Font.BOLD, 17));
		btnNewButton_1.setBounds(327, 251, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		p1 = new JPasswordField();
		p1.setBounds(105, 175, 86, 20);
		frame.getContentPane().add(p1);
		
		p2 = new JPasswordField();
		p2.setBounds(359, 175, 86, 20);
		frame.getContentPane().add(p2);
	}
}
