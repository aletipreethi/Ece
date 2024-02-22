package Ece_DB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroticketbooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticketbooking window = new metroticketbooking();
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
	public metroticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 450, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MetroTicketBooking");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 26));
		lblNewLabel.setBounds(81, 21, 329, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblNewLabel_1.setBounds(37, 104, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblNewLabel_2.setBounds(37, 157, 46, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblNewLabel_3.setBounds(37, 209, 46, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(37, 263, 56, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			private JComboBox c1;
			private JComboBox c2;
			private JComboBox c3;

			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String nt=(String) c3.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(fs.equals(ts))
				{
					JOptionPane.showMessageDialog(btnNewButton, "select valid station");
				}
				else
				{
					bill=t*40;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n From :"+fs+
							"\n To :"+ts+
							"\n Tickets :"+nt+
							"\n your Bill :"+bill);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 16));
		btnNewButton.setBounds(160, 317, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(160, 100, 115, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "nagole", "uppal", "stadium", "n.g.r.i", "tarnaka"}));
		c1.setBounds(160, 157, 115, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "miyapur", "kphb", "ameerpet", "jubliee hills", "kphb"}));
		c2.setBounds(160, 213, 115, 22);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c3.setBounds(160, 263, 115, 22);
		frame.getContentPane().add(c3);
	}

}
