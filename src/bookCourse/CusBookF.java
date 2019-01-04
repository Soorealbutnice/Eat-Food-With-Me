package bookCourse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class CusBookF extends JFrame {

	private JPanel contentPane;
	private JTextField selectedTimeTf;
	private JComboBox cusNumSelCombo;
	private JLabel label_1;
	private JButton addMenuBtn;
	private JButton delMenuBtn;
	private JButton payBtn;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusBookF frame = new CusBookF();
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
	public CusBookF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel timeSelL = new JLabel("\uC608\uC57D\uAC00\uB2A5\uD55C \uC2DC\uAC04\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694.");
		timeSelL.setBounds(52, 159, 298, 27);
		timeSelL.setHorizontalAlignment(SwingConstants.CENTER);
		timeSelL.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		contentPane.add(timeSelL);
		
		selectedTimeTf = new JTextField();
		selectedTimeTf.setBounds(84, 234, 232, 37);
		selectedTimeTf.setColumns(10);
		contentPane.add(selectedTimeTf);
		
		JComboBox timeSelCombo = new JComboBox();
		timeSelCombo.setBounds(84, 324, 232, 37);
		timeSelCombo.setBackground(Color.WHITE);
		contentPane.add(timeSelCombo);
		
		cusNumSelCombo = new JComboBox();
		cusNumSelCombo.setBounds(467, 137, 213, 43);
		cusNumSelCombo.setBackground(Color.WHITE);
		contentPane.add(cusNumSelCombo);
		
		label_1 = new JLabel("\uC608\uC57D\uC815\uBCF4");
		label_1.setBounds(426, 67, 80, 27);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		contentPane.add(label_1);
		
		addMenuBtn = new JButton("\uBA54\uB274\uCD94\uAC00");
		addMenuBtn.setBounds(417, 439, 100, 25);
		contentPane.add(addMenuBtn);
		
		delMenuBtn = new JButton("\uBA54\uB274\uC0AD\uC81C");
		delMenuBtn.setBounds(527, 439, 100, 25);
		contentPane.add(delMenuBtn);
		
		payBtn = new JButton("\uACB0\uC81C\uD558\uAE30");
		payBtn.setBounds(637, 439, 100, 25);
		contentPane.add(payBtn);
		
		JScrollPane bookInfoTable = new JScrollPane();
		bookInfoTable.setBounds(467, 268, 232, 121);
		contentPane.add(bookInfoTable);
		
		table = new JTable();
		bookInfoTable.setViewportView(table);
	}
}
