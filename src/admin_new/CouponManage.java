package admin_new;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adminMVC.adminController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CouponManage extends JPanel {
	public JTable table;
	public JTextField idInputTf;
	public JButton deleteBtn;
	public JButton updateBtn;
	public JButton lookupBtn;
	public JButton publishBtn;
	public adminMain main;
	
	public String[] colNames = {"coupon_no", "discount_Type", "discount_price", "coupon_date", "customer_id"};
	public DefaultTableModel model = new DefaultTableModel(colNames, 0);
	

	
	/**
	 * Create the panel.
	 */

	public CouponManage(adminMain main) {
		this.main = main;
		setLayout(null);

	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 24, 619, 313);
		add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		publishBtn = new JButton();
		publishBtn.setText(" \uBC1C\uD589");
		publishBtn.setBounds(290, 349, 100, 43);
		add(publishBtn);
		
		idInputTf = new JTextField();
		idInputTf.setText("\uBC1C\uD589 \uBC1B\uC744 \uC544\uC774\uB514");
		idInputTf.setColumns(10);
		idInputTf.setBounds(24, 348, 252, 44);
		add(idInputTf);
		
		deleteBtn = new JButton();
		deleteBtn.setText("\uC0AD\uC81C");
		deleteBtn.setBounds(414, 349, 100, 43);
		add(deleteBtn);
		
		lookupBtn = new JButton();
		lookupBtn.setText("\uC870\uD68C");
		lookupBtn.setBounds(535, 349, 100, 43);
		add(lookupBtn);
		
//		adminController control = new adminController(main);
//		
//		publishBtn.addActionListener(control);
//		deleteBtn.addActionListener(control);
//		lookupBtn.addActionListener(control);
	}
}
