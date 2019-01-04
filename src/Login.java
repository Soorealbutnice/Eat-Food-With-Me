package main;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import admin_new.adminMain;
import main_MVC.loginController;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Login extends JFrame  {
	BufferedImage m_numberImage;
	public JPanel contentPane;
	public JTextField idTF;
	public JPasswordField pwTF;
	public JButton login;
	public JButton signUp;
	public JLabel lblNewLabel_3;
	public signUp su;
	public Main main;
	public adminMain admain;
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
		
		main = new Main();
		su = new signUp();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel.setBounds(411, 229, 37, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("pw");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_1.setBounds(408, 281, 78, 21);
		contentPane.add(lblNewLabel_1);
		
		idTF = new JTextField();
		idTF.setBounds(465, 228, 156, 27);
		contentPane.add(idTF);
		idTF.setColumns(10);
		
		pwTF = new JPasswordField();
		pwTF.setBounds(465, 278, 156, 27);
		contentPane.add(pwTF);
		
		
		login = new JButton("·Î±×ÀÎ");
		login.setBounds(361, 343, 125, 29);
		
		contentPane.add(login);
	
		signUp = new JButton("È¸¿ø°¡ÀÔ");
		signUp.setBounds(519, 343, 125, 29);
		contentPane.add(signUp);
		
		JLabel lblNewLabel_2 = new JLabel("Eat Food With Me");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 27));
		lblNewLabel_2.setBounds(391, 33, 279, 327);
		contentPane.add(lblNewLabel_2);
		
		try {
			m_numberImage = ImageIO.read(new File("./img/main.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(m_numberImage));
	
		lblNewLabel_3.setBounds(0, 20, 740, 640);
		contentPane.add(lblNewLabel_3);
		

		loginController control = new loginController(this);
		signUp.addActionListener(control);//
		login.addActionListener(control);
		
		su.BtnBack.addActionListener(control);
		su.BtnRe.addActionListener(control);
		
		

		
		
	}

	
}
