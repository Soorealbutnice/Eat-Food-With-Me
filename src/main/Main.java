package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chef.ChefInfo;
import customer.CustomerView;
import mainMvc.MainController;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Main extends JFrame{

//	public Login login;



	CardLayout card = new CardLayout();

	public JPanel contentPane;
	public JButton chefMainBtn;
	public JButton cusMainBtn;
	public JButton logoBtn;
	public JButton logoutBtn;
	public JPanel mainBtnPanel;
	public JLabel label;
	public JComboBox comboBox;
	public JComboBox comboBox_1;
	public JComboBox comboBox_2;
	public JComboBox comboBox_3;
	public JTextField textField;
	public JButton button;
	public JButton button_1;
	public JButton button_2;
	public JLabel label_1;
	public JLabel label_2;
	public JLabel label_3;
	public JButton button_3;
	public JButton button_4;
	public JPanel panel_2;
	public JPanel cardPanel;
	
	public ChefInfo chefinfo; //°æ¹ÎÄÚµå
	public customer.CustomerView cv;
	public JLabel id;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
//		login = new Login();
		chefinfo = new ChefInfo(); //°æ¹ÎÃß°¡
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		mainBtnPanel = new JPanel();
		mainBtnPanel.setBounds(0, 0, 780, 544);
		contentPane.add(mainBtnPanel);
		mainBtnPanel.setLayout(null);
		mainBtnPanel.setVisible(false);
		
		logoBtn = new JButton(" ");
		logoBtn.setBounds(45, 12, 105, 27);
		mainBtnPanel.add(logoBtn);
		
		cusMainBtn = new JButton("\uACE0\uAC1D\uCC3D");
		cusMainBtn.setBounds(304, 12, 105, 27);
		mainBtnPanel.add(cusMainBtn);
		
		chefMainBtn = new JButton("\uC138\uD504\uCC3D");
		chefMainBtn.setBounds(423, 12, 105, 27);
		mainBtnPanel.add(chefMainBtn);
		
		logoutBtn = new JButton("logout");
		logoutBtn.setBounds(661, 12, 105, 27);
		mainBtnPanel.add(logoutBtn);
		
		MainController control = new MainController(this);
	
		
		
		
		label = new JLabel("\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015");
		label.setBounds(17, 54, 780, 10);
		mainBtnPanel.add(label);
		
		comboBox = new JComboBox();
		comboBox.setBounds(27, 79, 88, 27);
		mainBtnPanel.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(127, 79, 88, 27);
		mainBtnPanel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(232, 79, 88, 27);
		mainBtnPanel.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(329, 79, 88, 27);
		mainBtnPanel.add(comboBox_3);
		
		textField = new JTextField();
		textField.setBounds(585, 79, 156, 27);
		mainBtnPanel.add(textField);
		textField.setColumns(10);
		
		button = new JButton("New button");
		button.setBounds(504, 183, 150, 150);
		mainBtnPanel.add(button);
		
		button_1 = new JButton("New button");
		button_1.setBounds(304, 189, 150, 150);
		mainBtnPanel.add(button_1);
		
		button_2 = new JButton("New button");
		button_2.setBounds(99, 185, 150, 150);
		mainBtnPanel.add(button_2);
		
		label_1 = new JLabel("New label");
		label_1.setBounds(96, 335, 150, 50);
		mainBtnPanel.add(label_1);
		
		label_2 = new JLabel("New label");
		label_2.setBounds(304, 329, 150, 50);
		mainBtnPanel.add(label_2);
		
		label_3 = new JLabel("New label");
		label_3.setBounds(509, 336, 150, 50);
		mainBtnPanel.add(label_3);
		
		button_3 = new JButton("<prev");
		button_3.setBounds(252, 427, 80, 30);
		mainBtnPanel.add(button_3);
		
		button_4 = new JButton("next>");
		button_4.setBounds(415, 432, 80, 30);
		mainBtnPanel.add(button_4);
		
		id = new JLabel("id");
		id.setEnabled(false);
		id.setBounds(566, 12, 88, 27);
		mainBtnPanel.add(id);

		mainBtnPanel.setVisible(true);
		
	
	


//		panel.add(lg);
		

		

//		panel_2.setLayout(new CardLayout(0, 0));
		chefMainBtn.addActionListener(control);
		cusMainBtn.addActionListener(control);
		logoutBtn.addActionListener(control);
		logoBtn.addActionListener(control);
		
	}
}
