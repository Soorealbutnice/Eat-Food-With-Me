package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class signUp extends JFrame {

	public JPanel contentPane;
	public JTextField name;
	public JTextField num;
	public JTextField email;
	public JTextField id;
	public JTextField pw;
	public JTextField pw2;
	public JButton BtnRe;
	public JButton BtnBack;


	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public signUp() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New to EFWM");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(240, 43, 214, 61);
		contentPane.add(label);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.LEFT);
		name.setColumns(10);
		name.setBounds(276, 164, 315, 37);
		contentPane.add(name);
		
		num = new JTextField();
		num.setHorizontalAlignment(SwingConstants.LEFT);
		num.setColumns(10);
		num.setBounds(276, 216, 315, 37);
		contentPane.add(num);
		
		email = new JTextField();
		email.setHorizontalAlignment(SwingConstants.LEFT);
		email.setColumns(10);
		email.setBounds(276, 265, 315, 37);
		contentPane.add(email);
		
		id = new JTextField();
		id.setHorizontalAlignment(SwingConstants.LEFT);
		id.setColumns(10);
		id.setBounds(276, 112, 315, 37);
		contentPane.add(id);
		
		pw = new JTextField();
		pw.setHorizontalAlignment(SwingConstants.LEFT);
		pw.setColumns(10);
		pw.setBounds(276, 317, 315, 37);
		contentPane.add(pw);
		
		pw2 = new JTextField();
		pw2.setHorizontalAlignment(SwingConstants.LEFT);
		pw2.setColumns(10);
		pw2.setBounds(276, 366, 315, 37);
		contentPane.add(pw2);
		
		BtnRe = new JButton("Register");
		BtnRe.setBounds(220, 434, 110, 37);
		contentPane.add(BtnRe);
		
		BtnBack = new JButton("Back");
		BtnBack.setBounds(381, 434, 110, 37);
		contentPane.add(BtnBack);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(126, 120, 78, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(126, 172, 78, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_2.setBounds(126, 224, 78, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(126, 273, 78, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_4.setBounds(126, 325, 78, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_5.setBounds(126, 374, 133, 21);
		contentPane.add(lblNewLabel_5);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUp frame = new signUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
