package customer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class Reserve extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reserve frame = new Reserve();
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
	public Reserve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		JPanel p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		panel.add(p1);
		p1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uAC00\uB2A5\uD55C \uC2DC\uAC04\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694.");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 85, 366, 34);
		p1.add(lblNewLabel);
		
		JComboBox<String> comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(77, 275, 236, 32);
		p1.add(comboBox_1);
		comboBox_1.addItem("09:00 ~ 10:00");
		comboBox_1.addItem("10:00 ~ 11:00");
		comboBox_1.addItem("11:00 ~ 12:00");
		comboBox_1.addItem("12:00 ~ 13:00");
		comboBox_1.addItem("13:00 ~ 14:00");
		comboBox_1.addItem("14:00 ~ 15:00");
		comboBox_1.addItem("15:00 ~ 16:00");
		comboBox_1.addItem("16:00 ~ 17:00");
		comboBox_1.addItem("17:00 ~ 18:00");
		comboBox_1.addItem("18:00 ~ 19:00");
		comboBox_1.addItem("19:00 ~ 20:00");
		
		textField = new JTextField();
		textField.setBounds(75, 190, 240, 35);
		p1.add(textField);
		textField.setColumns(10);
		panel.add(p2);
		p2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uC608\uC57D\uC815\uBCF4");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 40, 132, 45);
		p2.add(lblNewLabel_1);
		
		JComboBox<String> comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(65, 125, 235, 30);
		p2.add(comboBox_2);
		comboBox_2.addItem("1");
		comboBox_2.addItem("2");
		comboBox_2.addItem("3");
		comboBox_2.addItem("4");
		comboBox_2.addItem("5");
		comboBox_2.addItem("6");
		
		JComboBox<String> comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(65, 165, 235, 30);
		p2.add(comboBox_3);
		comboBox_3.addItem("°æ¹ÎÀÌÀÇ ¿ÀÀÌ½Ã ¶ó¸à");

		String[] columnType = {"1","2","3","4"};
	    Object[][] data = {
	    {"1", "±èÃ¶¼ö", "20", "³²¼º"},
	    {"2", "±è¿ÁÀÚ", "43", "¿©¼º"},
	    {"3", "ÀÌ¼ø½Å", "100", "³²¼º"},
	    {"4", "À¯°ü¼ø", "18", "¿©¼º"},
	    {"5", "ÀÌ µµ", "54", "³²¼º"}
	    };
		table = new JTable(data, columnType);
		table.setBounds(65, 210, 280, 190);
		p2.add(table);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(270, 430, 100, 25);
		p2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBA54\uB274\uCD94\uAC00");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(50, 430, 100, 25);
		p2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uBA54\uB274\uC0AD\uC81C");
		btnNewButton_2.setBounds(160, 430, 100, 25);
		p2.add(btnNewButton_2);
	}
}
