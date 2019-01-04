package admin_new;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import javax.swing.JButton;
import javax.swing.JTextField;

import adminMVC.adminController;
import adminMVC.Select;

public class CouponGive extends JPanel {
	public JTextField textField;
	public static JButton publishBtn;
	
	public adminMain main;
	
	Select cs = new Select(main);
	
//	public String[] couponNum = {"111", "222"};
	public JComboBox<String> comboBox = new JComboBox<String>();

	/**
	 * Create the panel.
	 */


	public CouponGive(adminMain main) {
		this.main = main;
		setLayout(null);
		
		JLabel couponNumL = new JLabel("\uCFE0\uD3F0\uBC88\uD638");
		couponNumL.setBounds(14, 114, 125, 36);
		add(couponNumL);
		
		JLabel selCouponNumL = new JLabel("FDSE8F5DF8");
		selCouponNumL.setBounds(14, 151, 226, 44);
		add(selCouponNumL);
		
		JLabel label = new JLabel("\uBC1C\uD589 \uCFE0\uD3F0 \uC120\uD0DD");
		label.setBounds(14, 12, 125, 36);
		add(label);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(14, 45, 203, 44);
		add(comboBox);
		
		JLabel label_1 = new JLabel("\uAE08\uC561");
		label_1.setBounds(14, 194, 125, 36);
		add(label_1);
		
		publishBtn = new JButton("\uBC1C\uD589");
		publishBtn.setBounds(541, 361, 105, 27);
		add(publishBtn);
		
		JLabel label_2 = new JLabel("2,000");
		label_2.setBounds(14, 230, 226, 44);
		add(label_2);
		
		JLabel label_3 = new JLabel("\uC544\uC774\uB514");
		label_3.setBounds(14, 262, 125, 36);
		add(label_3);
		
		textField = new JTextField();
		textField.setText("\uBC1C\uD589 \uBC1B\uC744 \uC544\uC774\uB514");
		textField.setBounds(14, 310, 208, 44);
		add(textField);
		textField.setColumns(10);

		adminController control = new adminController(main);
		
		publishBtn.addActionListener(control);

	}
}
