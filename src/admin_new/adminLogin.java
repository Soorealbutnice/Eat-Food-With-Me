package admin_new;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import adminMVC.adminController;

public class adminLogin extends JPanel{
	public JTextField idInputTf;
	public JTextField pwInputTf;
	public JPanel cardPanel;
	public adminMain main;
	public JButton backBtn;
	public JButton loginBtn;

	
	
	CardLayout card = new CardLayout();
	/**
	 * Create the panel.
	 */
	public adminLogin(adminMain main) {
		this.main = main;
		setLayout(null);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(0, 0, 800, 600);
		add(btnPanel);
		btnPanel.setLayout(null);
		
		idInputTf = new JTextField();
		idInputTf.setBounds(248, 158, 303, 39);
		btnPanel.add(idInputTf);
		idInputTf.setHorizontalAlignment(SwingConstants.CENTER);
		idInputTf.setText("\uC544\uC774\uB514");
		idInputTf.setColumns(10);
		
		pwInputTf = new JTextField();
		pwInputTf.setBounds(248, 209, 303, 39);
		btnPanel.add(pwInputTf);
		pwInputTf.setHorizontalAlignment(SwingConstants.CENTER);
		pwInputTf.setText("\uD328\uC2A4\uC6CC\uB4DC");
		pwInputTf.setColumns(10);
		
		loginBtn = new JButton("LOGIN");
		loginBtn.setBounds(248, 290, 303, 27);
		btnPanel.add(loginBtn);
		
		backBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backBtn.setBounds(248, 355, 303, 27);
		btnPanel.add(backBtn);
		
		cardPanel = new JPanel();
		cardPanel.setBounds(0, 0, 800, 600);
		add(cardPanel);
		cardPanel.setLayout(card);
		

		adminController control = new adminController(main);
		
		backBtn.addActionListener(control);
		loginBtn.addActionListener(control);
	}
	

}
