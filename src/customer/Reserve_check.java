package customer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import javax.swing.JRadioButton;

public class Reserve_check extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reserve_check frame = new Reserve_check();
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
	public Reserve_check() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		JPanel p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		JPanel p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		panel.add(p1);
		p2.setLayout(null);
		panel.add(p2);
		
		JLabel label = new JLabel("\uACB0\uC81C\uC815\uBCF4\uD655\uC778");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		label.setBounds(39, 90, 132, 45);
		p2.add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("5,000 \uCF54\uC778");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(65, 170, 120, 25);
		p2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("10,000 \uCF54\uC778");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(65, 210, 120, 25);
		p2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("30,000\uCF54\uC778");
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		rdbtnNewRadioButton_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setBounds(65, 250, 120, 25);
		p2.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("50,000\uCF54\uC778");
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		rdbtnNewRadioButton_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		rdbtnNewRadioButton_3.setBounds(65, 290, 120, 25);
		p2.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC\uCF54\uC778\uC794\uC561 : ");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel.setBounds(63, 380, 108, 15);
		p2.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\uACB0\uC81C\uD6C4 \uCF54\uC778\uC794\uC561 : ");
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(63, 420, 132, 15);
		p2.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("\uCF54\uC778\uCD94\uAC00");
		btnNewButton_2.setBounds(192, 330, 97, 23);
		p2.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC6D0");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(231, 380, 57, 15);
		p2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC6D0");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(231, 420, 57, 15);
		p2.add(lblNewLabel_4);
		p1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uACB0\uC81C\uC815\uBCF4\uD655\uC778");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 90, 132, 45);
		p1.add(lblNewLabel_1);	
		String[] columnType = {"1","2","3","4"};
	    Object[][] data = {
	    {"1", "±èÃ¶¼ö", "20", "³²¼º"},
	    {"2", "±è¿ÁÀÚ", "43", "¿©¼º"},
	    {"3", "ÀÌ¼ø½Å", "100", "³²¼º"},
	    {"4", "À¯°ü¼ø", "18", "¿©¼º"},
	    {"5", "ÀÌ µµ", "54", "³²¼º"}
	    };
		table = new JTable(data, columnType);
		table.setBounds(65, 160, 280, 190);
		p1.add(table);
		
		JButton btnNewButton = new JButton("\uACB0\uC81C\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(213, 390, 97, 23);
		p1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBA54\uB274\uCD94\uAC00");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(85, 390, 97, 23);
		p1.add(btnNewButton_1);
	}
}
