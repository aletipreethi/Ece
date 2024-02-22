package Ece_DB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class show {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					show window = new show();
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
	public show() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 431, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookMyShow");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(158, 21, 181, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Javanese Text", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(42, 111, 67, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(78, 160, -8, 48);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Movie\r\n");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Javanese Text", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(38, 176, 80, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Javanese Text", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(38, 233, 96, 48);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(174, 110, 120, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "RRR", "OY", "PINDAM", "VARSHAM", "KGF-2"}));
		c1.setForeground(Color.BLACK);
		c1.setBounds(174, 186, 120, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		c2.setForeground(Color.BLACK);
		c2.setBounds(174, 244, 120, 22);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String sm=(String) c1.getSelectedItem();
				String nt=(String) c2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(sm.equals("RRR"))
				{
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movies:"+sm+
							"\n Tickets:"+t+
							"\n your Bill:"+bill);
				
			    }
				else if(sm.equals("OY"))
				{
					bill=200*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movies:"+sm+
							"\n Tickets:"+t+
							"\n your Bill:"+bill);
				}
				else if(sm.equals("PINDAM"))
				{
					bill=250*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movies:"+sm+
							"\n Tickets:"+t+
							"\n your Bill:"+bill);
				}
				else if(sm.equals("VARSHAM"))
				{
					bill=150*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movies:"+sm+
							"\n Tickets:"+t+
							"\n your Bill:"+bill);
				}
				else if(sm.equals("KGF-2"))
				{
					bill=350*t;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+n+
							"\n Selected Movies:"+sm+
							"\n Tickets:"+t+
							"\n your Bill:"+bill);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "please select the movie!");
				}  
			}
				
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(154, 310, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
