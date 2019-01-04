package admin_new;

import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTabbedPane;

import adminMVC.adminController;

import javax.swing.JComboBox;

public class adminStats extends JPanel{
	public JButton btnNewButton_1;
	public JButton btnBack;
	public adminMain main;
	public JComboBox<String> comboBox;

	/**
	 * Create the panel.
	 */
	public adminStats(adminMain main) {
		this.main = main;
		setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(44, 69, 625, 336);
		add(tabbedPane);
		
		btnNewButton_1 = new JButton("New button");
		tabbedPane.addTab("연령별", null, btnNewButton_1, null);
		
		JButton btnNewButton_2 = new JButton("New button");
		tabbedPane.addTab("음식별", null, btnNewButton_2, null);
		
		JButton btnNewButton = new JButton("New button");
		tabbedPane.addTab("지역별", null, btnNewButton, null);
		
//		comboBox = new JComboBox<String>();
//		comboBox.setToolTipText("");
//		comboBox.setBounds(588, 33, 81, 24);
//		add(comboBox);
		
		btnBack = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnBack.setBounds(87, 425, 88, 29);
		add(btnBack);
		
		
		adminController control = new adminController(main);

		btnBack.addActionListener(control);
	}
}
