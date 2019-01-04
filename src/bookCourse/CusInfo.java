package bookCourse;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import main.Main;

import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class CusInfo extends JPanel {

	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_11;
	public JTextField textField_12;
	public JTextField textField_13;
	public JTextField textField_14;
	public JTable table;
	public JTable table_1;
	public JLabel label_2;
	public JButton button;
	public JLabel label_4;
	public JLabel label_5;
	public JLabel label_6;
	public JButton button_2;
	public JButton button_1;
	public JLabel label_3;
	public JLabel label;
	public JLabel label_1;
	public JPanel panel_2;
	public JPanel panel_4;
	public JPanel panel_5;
	public JPanel panel_3;
	public JPanel panel;
	public JPanel panel_1;
	public Main main;

	/**
	 * Create the panel.
	 */
	public CusInfo(Main main) {
		this.main = main;
		setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 780, 500);
		add(tabbedPane);

		String[] columnType1 = { "1", "2", "3", "4" };
		Object[][] data1 = { { "1", "±èÃ¶¼ö", "20", "³²¼º" }, { "2", "±è¿ÁÀÚ", "43", "¿©¼º" }, { "3", "ÀÌ¼ø½Å", "100", "³²¼º" },
				{ "4", "À¯°ü¼ø", "18", "¿©¼º" }, { "5", "ÀÌ µµ", "54", "³²¼º" } };

		String[] columnType = { "1", "2", "3", "4" };
		Object[][] data = { { "1", "±èÃ¶¼ö", "20", "³²¼º" }, { "2", "±è¿ÁÀÚ", "43", "¿©¼º" }, { "3", "ÀÌ¼ø½Å", "100", "³²¼º" },
				{ "4", "À¯°ü¼ø", "18", "¿©¼º" }, { "5", "ÀÌ µµ", "54", "³²¼º" } };

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("°³ÀÎÁ¤º¸¼öÁ¤", null, panel_2, null);
		panel_2.setLayout(null);

		label_2 = new JLabel("\uAC1C\uC778\uC815\uBCF4\uC218\uC815");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		label_2.setBounds(266, 37, 200, 25);
		panel_2.add(label_2);

		textField = new JTextField("");
		textField.setColumns(10);
		textField.setBounds(246, 102, 240, 30);
		panel_2.add(textField);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(246, 142, 240, 30);
		panel_2.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(246, 182, 240, 30);
		panel_2.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(246, 222, 240, 30);
		panel_2.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(246, 262, 240, 30);
		panel_2.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(246, 302, 240, 30);
		panel_2.add(textField_5);

		button = new JButton("Register");
		button.setBounds(316, 367, 100, 25);
		panel_2.add(button);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("½¦ÇÁµî·Ï", null, panel_3, null);
		panel_3.setLayout(null);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(12, 10, 384, 451);
		panel_3.add(panel_4);
		panel_4.setLayout(null);

		label_4 = new JLabel("Be a Chef");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		label_4.setBounds(97, 40, 165, 30);
		panel_4.add(label_4);

		label_5 = new JLabel("You can be a great chef just by");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(24, 100, 331, 25);
		panel_4.add(label_5);

		label_6 = new JLabel("registering your passport number");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(24, 130, 331, 25);
		panel_4.add(label_6);

		textField_12 = new JTextField();
		textField_12.setColumns(1);
		textField_12.setBounds(68, 200, 240, 30);
		panel_4.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(1);
		textField_13.setBounds(68, 250, 240, 30);
		panel_4.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(1);
		textField_14.setBounds(68, 300, 240, 30);
		panel_4.add(textField_14);

		button_2 = new JButton("\uC870\uD68C");
		button_2.setBounds(133, 390, 100, 25);
		panel_4.add(button_2);

		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(403, 10, 360, 451);
		panel_3.add(panel_5);
		panel_5.setLayout(null);

		label_3 = new JLabel("Open my Restaurant");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		label_3.setBounds(31, 28, 299, 42);
		panel_5.add(label_3);

		textField_6 = new JTextField();
		textField_6.setColumns(1);
		textField_6.setBounds(63, 96, 240, 30);
		panel_5.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(1);
		textField_7.setBounds(63, 136, 240, 30);
		panel_5.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(1);
		textField_8.setBounds(63, 176, 240, 30);
		panel_5.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(1);
		textField_9.setBounds(63, 216, 240, 30);
		panel_5.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(1);
		textField_10.setBounds(63, 256, 240, 30);
		panel_5.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(1);
		textField_11.setBounds(63, 296, 240, 30);
		panel_5.add(textField_11);

		button_1 = new JButton("\uB4F1\uB85D");
		button_1.setBounds(123, 381, 100, 25);
		panel_5.add(button_1);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("¿¹¾à³»¿ª", null, panel, null);
		panel.setLayout(null);

		label = new JLabel("\uC608\uC57D\uB0B4\uC5ED\uC870\uD68C");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		label.setBounds(67, 56, 200, 35);
		panel.add(label);
		table = new JTable(data1, columnType1);
		table.setBounds(90, 135, 530, 258);
		panel.add(table);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("ÄÚÀÎÃæÀü³»¿ª", null, panel_1, null);
		panel_1.setLayout(null);

		label_1 = new JLabel("\uCF54\uC778\uCDA9\uC804\uB0B4\uC5ED");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		label_1.setBounds(63, 60, 200, 35);
		panel_1.add(label_1);
		table_1 = new JTable(data, columnType);
		table_1.setBounds(40, 110, 700, 325);
		panel_1.add(table_1);
	}
}
