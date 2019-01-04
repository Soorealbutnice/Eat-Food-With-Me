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
	

	//JDBC �޼ҵ带 static �༭ ����Ϸ��� �ϴϱ� �� �ȿ� �ִ� �ʵ尪�� static���� �ؾ��Ѵٰ� �ؼ� ���� �� �ٵ� static���� �ٲ���

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
		
		tabbedPane.add("��������", couponmake);
//		tabbedPane.add("��������", coupongive);
		tabbedPane.add("��������", couponmanage);
		
		adminController control = new adminController(main);	//���⵵ main�ΰ� this�ΰ� �װ��� �����δپ�
		
		btnBack.addActionListener(control);

	}
}
