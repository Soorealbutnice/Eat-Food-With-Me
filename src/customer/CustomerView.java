package customer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import customerMVC.Select;
import main.Login;
import main.Main;
import customerMVC.CustomerController;
import customerMVC.CustomerServiceImpl;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class CustomerView extends JFrame {

	public JPanel contentPane;

	public JTable Reserve_Table;
	public String[] colName = { "¹øÈ£", "ÀÌ¸§", "¸Þ´º", "°³¼ö" };
	public DefaultTableModel model = new DefaultTableModel(colName, 0);

	public JTable Coin_table;
	public String[] colName_1 = { "¹øÈ£", "ÀÌ¸§", "¸Þ´º", "°³¼ö" };
	public DefaultTableModel model_1 = new DefaultTableModel(colName_1, 0);

	public JTextField name_mod;
	public JPanel p1;
	public JPanel p2;

	public JTextField Pass_No;
	public JTextField Pass_Date;
	public JTextField Due_Date;
	public JTextField Res_Name;
	public JTextField Country;
	public JTextField Res_City;
	public JTextField phone_mod;
	public JTextField email_mod;
	public JTextField address_mod;

	public JLabel BeAChef_3;
	public JLabel Reserve_Info;
	public JButton Register;
	public JButton res_test;
	public JButton coin_test;
	public JButton Chef_Register;
	public JButton Chef_Check;

	public Select select;
	public CustomerServiceImpl cs;
	public CustomerController cc;
	public JPasswordField password;
	public JPasswordField password_confirm;
	public String[] cuisine = { "ÇÑ½Ä", "Áß½Ä", "ÀÏ½Ä" };
	public JComboBox category = new JComboBox(cuisine);

	public JLabel chef_test;
	public JPasswordField Pass;
	public JPasswordField PassC;
	public JLabel restaurant_test;
	public JScrollPane scrollPane;
	public JScrollPane scrollPane_1;
	public JLabel name_mod_lv;
	private JLabel phone_mod_lv;
	private JLabel email_mod_lv;
	private JLabel address_mod_lv;
	private JLabel password_lv;
	private JLabel passwordC_lv;
	private JLabel Res_City_lv;
	private JLabel Pass_lv;
	private JLabel PassC_lv;
	public JLabel lv1;
	public JLabel lv2;
	public JLabel lv3;
	public JPanel test;
	public JButton testbtn = new JButton("New button");
	public JButton testnext = new JButton("New button");
	
	public int count = 0;

	public static Main main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerView frame = new CustomerView(main);
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
	public CustomerView() {
		this.main = main;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 784, 561);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(tabbedPane);

		JPanel reserve = new JPanel();
		reserve.setBackground(Color.WHITE);
		tabbedPane.addTab("¿¹¾à³»¿ª", null, reserve, null);
		reserve.setLayout(null);

		Reserve_Info = new JLabel("\uC608\uC57D\uB0B4\uC5ED\uC870\uD68C");
		Reserve_Info.setHorizontalAlignment(SwingConstants.CENTER);
		Reserve_Info.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		Reserve_Info.setBounds(70, 50, 200, 35);
		reserve.add(Reserve_Info);

		res_test = new JButton("New button");
		res_test.setBackground(new Color(255, 255, 224));
		res_test.setBounds(497, 59, 117, 29);
		reserve.add(res_test);

		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(40, 130, 700, 300);
		scrollPane.getViewport().setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 10));
		reserve.add(scrollPane);

		Reserve_Table = new JTable(model);
		scrollPane.setViewportView(Reserve_Table);

		JPanel coin = new JPanel();
		coin.setBackground(Color.WHITE);
		tabbedPane.addTab("ÄÚÀÎÃæÀü³»¿ª", null, coin, null);
		coin.setLayout(null);

		JLabel Coin_Info = new JLabel("\uCF54\uC778\uCDA9\uC804\uB0B4\uC5ED");
		Coin_Info.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		Coin_Info.setHorizontalAlignment(SwingConstants.CENTER);
		Coin_Info.setBounds(70, 50, 200, 35);
		coin.add(Coin_Info);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(40, 130, 700, 300);
		coin.add(scrollPane_1);

		Coin_table = new JTable(model_1);
		scrollPane_1.setViewportView(Coin_table);

		coin_test = new JButton("New button");
		coin_test.setBounds(540, 62, 97, 23);
		coin.add(coin_test);

		JPanel info = new JPanel();
		info.setBackground(Color.WHITE);
		tabbedPane.addTab("°³ÀÎÁ¤º¸¼öÁ¤", null, info, null);
		info.setLayout(null);

		JLabel Customer_mod = new JLabel("\uAC1C\uC778\uC815\uBCF4\uC218\uC815");
		Customer_mod.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		Customer_mod.setHorizontalAlignment(SwingConstants.CENTER);
		Customer_mod.setBounds(300, 80, 200, 25);
		info.add(Customer_mod);

		name_mod = new JTextField();
		name_mod.setBounds(280, 145, 240, 30);
		info.add(name_mod);
		name_mod.setColumns(10);

		phone_mod = new JTextField();
		phone_mod.setBounds(280, 185, 240, 30);
		info.add(phone_mod);
		phone_mod.setColumns(10);

		email_mod = new JTextField();
		email_mod.setBounds(280, 225, 240, 30);
		info.add(email_mod);
		email_mod.setColumns(10);

		address_mod = new JTextField();
		address_mod.setBounds(280, 265, 240, 30);
		info.add(address_mod);
		address_mod.setColumns(10);

		password = new JPasswordField();
		password.setBounds(280, 305, 240, 30);
		info.add(password);

		password_confirm = new JPasswordField();
		password_confirm.setBounds(280, 345, 240, 30);
		info.add(password_confirm);

		Register = new JButton("Register");
		Register.setBounds(350, 410, 100, 25);
		info.add(Register);

		name_mod_lv = new JLabel("\uC774\uB984");
		name_mod_lv.setBounds(177, 152, 57, 15);
		info.add(name_mod_lv);

		phone_mod_lv = new JLabel("\uC804\uD654\uBC88\uD638");
		phone_mod_lv.setBounds(177, 192, 57, 15);
		info.add(phone_mod_lv);

		email_mod_lv = new JLabel("\uC774\uBA54\uC77C");
		email_mod_lv.setBounds(177, 232, 57, 15);
		info.add(email_mod_lv);

		address_mod_lv = new JLabel("\uC8FC\uC18C");
		address_mod_lv.setBounds(177, 272, 57, 15);
		info.add(address_mod_lv);

		password_lv = new JLabel("\uBE44\uBC00\uBC88\uD638");
		password_lv.setBounds(177, 312, 57, 15);
		info.add(password_lv);

		passwordC_lv = new JLabel("\uBE44\uBC00\uBC88\uD638\uD655\uC778");
		passwordC_lv.setBounds(177, 352, 57, 15);
		info.add(passwordC_lv);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(172, 87, 62, 18);
		info.add(lblNewLabel);
		Register.addActionListener(cc);

		JPanel reg_chef = new JPanel();
		JPanel Panel_1 = new JPanel();
		Panel_1.setBackground(Color.WHITE);
		JPanel Panel_2 = new JPanel();
		Panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("½¦ÇÁµî·Ï", null, reg_chef, null);
		reg_chef.setLayout(new GridLayout(1, 2, 0, 0));
		reg_chef.add(Panel_1);
		Panel_1.setLayout(null);

		JLabel BeAChef_1 = new JLabel("Be a Chef");
		BeAChef_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		BeAChef_1.setHorizontalAlignment(SwingConstants.CENTER);
		BeAChef_1.setBounds(104, 80, 165, 30);
		Panel_1.add(BeAChef_1);

		JLabel BeAChef_2 = new JLabel("You can be a great chef just by");
		BeAChef_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		BeAChef_2.setHorizontalAlignment(SwingConstants.CENTER);
		BeAChef_2.setBackground(Color.WHITE);
		BeAChef_2.setBounds(31, 140, 331, 25);
		Panel_1.add(BeAChef_2);

		BeAChef_3 = new JLabel("registering your passport number");
		BeAChef_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		BeAChef_3.setHorizontalAlignment(SwingConstants.CENTER);
		BeAChef_3.setBackground(Color.WHITE);
		BeAChef_3.setBounds(31, 170, 331, 25);
		Panel_1.add(BeAChef_3);

		chef_test = new JLabel("New label");
		chef_test.setBounds(140, 478, 57, 15);
		Panel_1.add(chef_test);

//		JLabel pass_no_lv = new JLabel("\uC5EC\uAD8C\uBC88\uD638");
//		pass_no_lv.setBounds(6, 247, 57, 15);
//		Panel_1.add(pass_no_lv);
		
//		Pass_No = new JTextField();
//		Pass_No.setBounds(75, 240, 240, 30);
//		Panel_1.add(Pass_No);
//		Pass_No.setColumns(1);

		Pass_Date = new JTextField();
		Pass_Date.setBounds(75, 290, 240, 30);
		Panel_1.add(Pass_Date);
		Pass_Date.setColumns(1);

		Due_Date = new JTextField();
		Due_Date.setBounds(75, 340, 240, 30);
		Panel_1.add(Due_Date);
		Due_Date.setColumns(1);

		Chef_Check = new JButton("\uC870\uD68C");
		Chef_Check.setBounds(140, 430, 100, 25);
		Panel_1.add(Chef_Check);



		JLabel pass_date_lv = new JLabel("\uC5EC\uAD8C\uBC1C\uAE09\uC77C");
		pass_date_lv.setBounds(6, 297, 57, 15);
		Panel_1.add(pass_date_lv);

		JLabel due_date_lv = new JLabel("\uBE44\uC790\uB9CC\uB8CC\uC77C");
		due_date_lv.setBounds(6, 347, 57, 15);
		Panel_1.add(due_date_lv);
		reg_chef.add(Panel_2);
		Panel_2.setLayout(null);

		JLabel lblOpenMyRestaurant = new JLabel("Open my Restaurant");
		lblOpenMyRestaurant.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		lblOpenMyRestaurant.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpenMyRestaurant.setBounds(50, 80, 299, 42);
		Panel_2.add(lblOpenMyRestaurant);

		Res_Name = new JTextField();
		Res_Name.setBounds(80, 145, 240, 30);
		Panel_2.add(Res_Name);
		Res_Name.setColumns(1);
		category.setBackground(SystemColor.menu);

		category.setBounds(80, 185, 240, 30);
		Panel_2.add(category);

		Country = new JTextField();
		Country.setBounds(80, 225, 240, 30);
		Panel_2.add(Country);
		Country.setColumns(1);

		Res_City = new JTextField();
		Res_City.setBounds(80, 265, 240, 30);
		Panel_2.add(Res_City);
		Res_City.setColumns(1);

		Pass = new JPasswordField();
		Pass.setBounds(80, 305, 240, 30);
		Panel_2.add(Pass);

		PassC = new JPasswordField();
		PassC.setBounds(80, 345, 240, 30);
		Panel_2.add(PassC);

		Chef_Register = new JButton("\uB4F1\uB85D");
		Chef_Register.setBounds(140, 430, 100, 25);
		Panel_2.add(Chef_Register);

		restaurant_test = new JLabel("New label");
		restaurant_test.setBounds(157, 395, 163, 25);
		Panel_2.add(restaurant_test);

		JLabel Res_Name_lv = new JLabel("\uB808\uC2A4\uD1A0\uB791\uC774\uB984");
		Res_Name_lv.setBounds(11, 152, 57, 15);
		Panel_2.add(Res_Name_lv);

		JLabel category_lv = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		category_lv.setBounds(11, 193, 57, 15);
		Panel_2.add(category_lv);

		JLabel Nation_lv = new JLabel("\uB098\uB77C");
		Nation_lv.setBounds(11, 232, 57, 15);
		Panel_2.add(Nation_lv);

		Res_City_lv = new JLabel("\uB3C4\uC2DC");
		Res_City_lv.setBounds(11, 272, 57, 15);
		Panel_2.add(Res_City_lv);

		Pass_lv = new JLabel("\uBE44\uBC00\uBC88\uD638");
		Pass_lv.setBounds(11, 312, 57, 15);
		Panel_2.add(Pass_lv);

		PassC_lv = new JLabel("\uBE44\uBC88\uD655\uC778");
		PassC_lv.setBounds(11, 352, 57, 15);
		Panel_2.add(PassC_lv);
		
//		test = new JPanel();
//		tabbedPane.addTab("New tab", null, test, null);
//		test.setLayout(null);
//		
//		lv1 = new JLabel("New label");
//		lv1.setBounds(153, 220, 57, 15);
//		test.add(lv1);
//		
//		lv2 = new JLabel("New label");
//		lv2.setBounds(299, 230, 57, 15);
//		test.add(lv2);
//		
//		lv3 = new JLabel("New label");
//		lv3.setBounds(459, 230, 57, 15);
//		test.add(lv3);
//		
//
//		testbtn.setBounds(203, 309, 97, 23);
//		test.add(testbtn);
//		
//
//		testnext.setBounds(353, 309, 97, 23);
//		test.add(testnext);

		cc = new CustomerController(this);
		res_test.addActionListener(cc);
		coin_test.addActionListener(cc);
		Register.addActionListener(cc);
		Chef_Register.addActionListener(cc);
		Chef_Check.addActionListener(cc);
//		testbtn.addActionListener(cc);
//		testnext.addActionListener(cc);
	}



	public CustomerView(Main main2) {
		// TODO Auto-generated constructor stub
	}
}
