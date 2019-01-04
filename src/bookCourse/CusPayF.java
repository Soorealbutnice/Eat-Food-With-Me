package bookCourse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CusPayF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusPayF frame = new CusPayF();
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
	public CusPayF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 12, 722, 510);
		contentPane.add(panel);
		panel.setLayout(null);

		String columnNames[] = { "»óÇ°¹øÈ£", "»óÇ°ÀÌ¸§", "»óÇ°°¡°Ý", "»óÇ°¼³¸í" };
		Object rowData[][] =
			{
			{ 1, "¸Àµ¿»ê", 100, "¿À¸®¿Â" },
			{ 2, "¾ÆÆú·Î", 200, "ºÒ·®½ÄÇ°" },
			{ 3, "Ä­ÃÝÄÚ", 300, "°úÀÚ°èÀÇ ·¹Àüµå" } };

		JLabel label_9 = new JLabel("\uACB0\uC81C\uC815\uBCF4\uD655\uC778");
		label_9.setBounds(76, 29, 132, 45);
		panel.add(label_9);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));

		JButton updateMenuBtn = new JButton("\uBA54\uB274\uC218\uC815");
		updateMenuBtn.setBounds(136, 405, 97, 23);
		panel.add(updateMenuBtn);

		JList couponList = new JList();
		couponList.setBounds(408, 93, 255, 40);
		panel.add(couponList);
		couponList.setBackground(Color.LIGHT_GRAY);

		JLabel myCouponListL = new JLabel("\uB0B4 \uCFE0\uD3F0");
		myCouponListL.setBounds(408, 35, 255, 40);
		panel.add(myCouponListL);
		myCouponListL.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label_1 = new JLabel("\uD560\uC778\uC561 : ");
		label_1.setBounds(408, 166, 123, 21);
		panel.add(label_1);
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JLabel label_2 = new JLabel("\uC6D0");
		label_2.setBounds(525, 166, 123, 21);
		panel.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JLabel label_4 = new JLabel("\uD604\uC7AC\uCF54\uC778\uC794\uC561 : ");
		label_4.setBounds(408, 252, 103, 21);
		panel.add(label_4);
		label_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JLabel label_3 = new JLabel("\uC6D0");
		label_3.setBounds(525, 199, 123, 21);
		panel.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JLabel label_5 = new JLabel("\uD560\uC778 \uD6C4 \uCD1D\uC561 : ");
		label_5.setBounds(408, 199, 123, 21);
		panel.add(label_5);
		label_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JLabel label_10 = new JLabel("\uC6D0");
		label_10.setBounds(525, 252, 123, 21);
		panel.add(label_10);
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JLabel label_6 = new JLabel("\uACB0\uC81C\uD6C4 \uCF54\uC778\uC794\uC561 : ");
		label_6.setBounds(408, 358, 123, 21);
		panel.add(label_6);
		label_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JLabel label_7 = new JLabel("\uC6D0");
		label_7.setBounds(550, 358, 123, 21);
		panel.add(label_7);
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));

		JButton chargeBtn = new JButton("\uCF54\uC778\uCD94\uAC00");
		chargeBtn.setBounds(401, 443, 95, 27);
		panel.add(chargeBtn);

		JButton payBtn = new JButton("\uACB0\uC81C\uD558\uAE30");
		payBtn.setBounds(566, 445, 97, 23);
		panel.add(payBtn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 98, 234, 239);
		panel.add(scrollPane);
		
		JTable jTable = new JTable(rowData, columnNames);
		scrollPane.setViewportView(jTable);
	}
}
