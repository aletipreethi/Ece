package Ece_DB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;
	 int i=0;
	 int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 553, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setBounds(161, 32, 119, 28);
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 27));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(55, 87, 143, 197);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\02.png"));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(237, 87, 143, 197);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\03.png"));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("200/-");
		lblNewLabel_3.setBounds(102, 294, 62, 22);
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("180/-");
		lblNewLabel_4.setBounds(284, 295, 53, 33);
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setBounds(427, 32, 78, 28);
		lb.setFont(new Font("Cambria Math", Font.BOLD, 17));
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("Bill : 0");
		lb2.setFont(new Font("Cambria Math", Font.BOLD, 17));
		lb2.setBounds(427, 71, 78, 22);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton1 = new JButton("Add To Cart");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				bill=bill+200;
				lb2.setText("Bill :"+bill);
				
			}
		});
		btnNewButton1.setForeground(Color.RED);
		btnNewButton1.setFont(new Font("Cambria Math", Font.BOLD, 14));
		btnNewButton1.setBounds(54, 345, 125, 23);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Add To Cart");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				bill=bill+180;
				lb2.setText("Bill :"+bill);
				
			}
		});
		btnNewButton2.setForeground(Color.RED);
		btnNewButton2.setFont(new Font("Cambria Math", Font.BOLD, 14));
		btnNewButton2.setBounds(264, 344, 116, 23);
		frame.getContentPane().add(btnNewButton2);
		
		
	}
}
