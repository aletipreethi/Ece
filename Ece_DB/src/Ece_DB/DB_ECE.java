package Ece_DB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class DB_ECE {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DB_ECE window = new DB_ECE();
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
	public DB_ECE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(221, 11, 201, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(115, 94, 99, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Roll no ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(121, 156, 93, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(121, 209, 93, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(221, 107, 119, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(221, 164, 129, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JComboBox t3 = new JComboBox();
		t3.setModel(new DefaultComboBoxModel(new String[] {"Select", "ECE", "CSE", "MECH", "CIVIL", "AIML", "DS", "EEE"}));
		t3.setBounds(221, 216, 141, 22);
		frame.getContentPane().add(t3);
		
		JButton c1 = new JButton("Submit");
		c1.addActionListener(new ActionListener() {
			private Component btnNewButton;

			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String n1=t2.getText();
				String d=(String) t3.getSelectedItem();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ece","root","mrec");
					String q="insert into student values('"+n+"','"+n1+"','"+d+"')";
					Statement sta=con.createStatement();		
					sta.execute(q);
					con.close();
			        JOptionPane.showMessageDialog(btnNewButton, "Done");
						} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		c1.setFont(new Font("Tahoma", Font.BOLD, 22));
		c1.setBounds(169, 296, 154, 35);
		frame.getContentPane().add(c1);
	}
}
