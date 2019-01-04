package admin_new;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import adminMVC.adminController;

import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class adminCoupon extends JPanel{
	public JButton btn_cr;
	public adminMain main;
	public JButton btnBack;
	
	public CouponMake couponmake = new CouponMake(main);
//	public CouponGive coupongive = new CouponGive(main);
	public CouponManage couponmanage = new CouponManage(main);
	

	//JDBC 메소드를 static 줘서 사용하려고 하니까 그 안에 있는 필드값도 static으로 해야한다고 해서 위에 두 줄도 static으로 바꿔줌

	/**
	 * Create the panel.
	 */
	public adminCoupon(adminMain main) {
		this.main = main;
		setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 780, 500);
		add(tabbedPane);

		btnBack = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnBack.setBounds(678, 512, 88, 29);
		add(btnBack);
		
		tabbedPane.add("쿠폰생성", couponmake);
//		tabbedPane.add("쿠폰발행", coupongive);
		tabbedPane.add("쿠폰관리", couponmanage);
		
		adminController control = new adminController(main);	//여기도 main인가 this인가 그것이 문제로다아
		
		btnBack.addActionListener(control);

	}
}
