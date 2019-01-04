package admin_new;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import adminMVC.adminController;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class CouponMake extends JPanel {
	public JTextField couponNumTf;
	public JTextField discountPriceTf;
	public JButton makeBtn;
	public String[] couponType = {"적립금", "할인율"};
	public JComboBox<String> comboBox = new JComboBox<String>(couponType);
	public adminMain main;
	public JTextField dateInputTf;
	private JLabel dateInputL;
	
	/**
	 * Create the panel.
	 */
	

	public CouponMake(adminMain main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCFE0\uD3F0\uBC88\uD638");
		lblNewLabel.setBounds(14, 12, 155, 42);
		add(lblNewLabel);
		
		couponNumTf = new JTextField("8자리 숫자를 입력하세요");

		couponNumTf.setBounds(14, 53, 217, 42);
		add(couponNumTf);
		couponNumTf.setColumns(10);
	
		comboBox.setBounds(14, 108, 217, 50);
		add(comboBox);
		
		JLabel label = new JLabel("\uD560\uC778\uAE08\uC561");
		label.setBounds(14, 208, 217, 42);
		add(label);
		
		discountPriceTf = new JTextField();
		discountPriceTf.setBounds(14, 246, 264, 50);
		add(discountPriceTf);
		discountPriceTf.setColumns(10);

		
		dateInputTf = new JTextField();
		dateInputTf.setBounds(14, 384, 264, 50);
		add(dateInputTf);
		dateInputTf.setColumns(10);
		
		makeBtn = new JButton("\uCFE0\uD3F0\uC0DD\uC131");
		makeBtn.setBounds(462, 336, 155, 52);
		add(makeBtn);
		
		dateInputL = new JLabel("\uCFE0\uD3F0 \uC720\uD6A8 \uAE30\uAC04");
		dateInputL.setBounds(14, 341, 217, 42);
		add(dateInputL);

		
		
	}
}
