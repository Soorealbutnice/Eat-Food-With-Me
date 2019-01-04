package admin_new;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import adminMVC.adminController;
import main.Login;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.CardLayout;

public class adminMain extends JFrame{
	
	public adminCustomer adminCustomer;
	public adminChef adminChef;
	public adminStats adminStats;
	public adminCoupon adminCoupon;
//	public adminLogin adminLogin;
	
	public JPanel contentPane;
	public JButton cusManage;
	public JButton chefManage;
	public JButton stat;
	public JButton couponManage;
	public JButton btnLogout;
	public JPanel cardPanel;
	public JPanel btnPanel;
	public static Login login;
	public CardLayout card = new CardLayout();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminMain frame = new adminMain(login);
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
	public adminMain(Login login) {
		this.login = login;
		adminCustomer = new adminCustomer(this);
		adminChef = new adminChef(this);
		 adminStats = new adminStats(this);
		 adminCoupon = new adminCoupon(this);
//		 adminLogin = new adminLogin(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		adminCustomer.setBounds(0, 0, 708, 489);
		
		cardPanel = new JPanel();
		cardPanel.setBounds(0, 0, 780, 580);
		contentPane.add(cardPanel);
		cardPanel.setLayout(card);
		cardPanel.setVisible(false);
		
		cardPanel.add("screen1", adminCustomer);
		cardPanel.add("screen2", adminChef);
		cardPanel.add("screen3", adminStats);
		cardPanel.add("screen4", adminCoupon);
//		cardPanel.add("screen5", adminLogin);
		
		btnPanel = new JPanel();
		btnPanel.setBounds(0, 0, 780, 580);
		contentPane.add(btnPanel);
		btnPanel.setLayout(null);
		
		JLabel label = new JLabel("Eat Food With Me");
		label.setBounds(192, 50, 324, 46);
		btnPanel.add(label);
		label.setFont(label.getFont().deriveFont(label.getFont().getSize() + 21f));
		
		cusManage = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
		cusManage.setBounds(47, 165, 136, 241);
		btnPanel.add(cusManage);
		cusManage.setFont(new Font("굴림", Font.PLAIN, 21));
		cusManage.setBackground(Color.WHITE);
		
		chefManage =new JButton("\uC170\uD504\uAD00\uB9AC");
		chefManage.setBounds(230, 165, 136, 241);
		chefManage.setFont(new Font("굴림", Font.PLAIN, 21));
		chefManage.setBackground(Color.WHITE);
		btnPanel.add(chefManage);
		
		stat = new JButton("\uD1B5\uACC4");
		stat.setBounds(413, 165, 136, 241);
		stat.setFont(new Font("굴림", Font.PLAIN, 21));
		stat.setBackground(Color.WHITE);
		btnPanel.add(stat);
		
		couponManage = new JButton("\uCFE0\uD3F0\uAD00\uB9AC");
		couponManage.setBounds(596, 165, 136, 241);
		couponManage.setFont(new Font("굴림", Font.PLAIN, 21));
		couponManage.setBackground(Color.WHITE);
		btnPanel.add(couponManage);
		
		btnLogout = new JButton("Logout");
		btnLogout.setBounds(607, 91, 125, 29);
		btnPanel.add(btnLogout);
		
		adminController control = new adminController(this);	//다른 클래스는 다 main으로 인자를 줬는데 여기는 main이니까 this겠지..?
		
		btnLogout.addActionListener(control);
		couponManage.addActionListener(control);
		stat.addActionListener(control);
		chefManage.addActionListener(control);
		cusManage.addActionListener(control);
		adminCoupon.couponmake.makeBtn.addActionListener(control);
		adminCoupon.couponmanage.lookupBtn.addActionListener(control);
		adminCoupon.couponmanage.publishBtn.addActionListener(control);
		adminCoupon.couponmanage.deleteBtn.addActionListener(control);
		adminCustomer.selBtn.addActionListener(control);
		adminChef.conBtn.addActionListener(control);
		adminChef.refBtn.addActionListener(control);
		adminChef.delBtn.addActionListener(control);
	}
}
