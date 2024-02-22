package Ece_DB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Registration {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 496, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBackground(new Color(255, 200, 0));
		lblNewLabel.setBounds(91, 11, 315, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(42, 85, 46, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(42, 151, 59, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(42, 221, 59, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("programming");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(42, 273, 131, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(174, 93, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "CSE", "EEE", "ECE", "MINING", "AIML", "CIVIL", "MECHANIVAL", "CSC"}));
		cb1.setBounds(174, 158, 143, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setBounds(174, 219, 59, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setBounds(275, 219, 52, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JCheckBox c1 = new JCheckBox("java");
		c1.setBounds(156, 277, 52, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("python");
		c2.setBounds(220, 277, 59, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("c");
		c3.setBounds(290, 277, 46, 23);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e, Component btnNewButton) {
				String n=tb1.getText();
				String b=(String) cb1.getSelectedItem();
				String g;
				if(r1.isSelected())
				{
					g="female";
				}
				else if(r2.isSelected())
				{
					g="male";
				}
				else
				{
					g="invalid";
				}
				String pl="";
				if(c1.isSelected())
				{
					pl=pl+"java";
				}
				if(c2.isSelected())
				{
					pl=pl+"python";
				}
				if(c3.isSelected())
				{
					pl=pl+"c";
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Hello "+n+
						"\nPlease Confirm Your Details : \nBranch:"+b+
						"\n Gender "+g+"\n Programming: "+pl);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Registration Done!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Registration Cancelled");
						}
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(190, 353, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
