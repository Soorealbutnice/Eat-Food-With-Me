package bookCourse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CusComMsgF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusComMsgF frame = new CusComMsgF();
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
	public CusComMsgF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(61, 52, 659, 465);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uC608\uC57D\uC774 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		label.setBounds(48, 29, 406, 32);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\uBA54\uB274\uBA85 : ");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_1.setBounds(170, 115, 58, 20);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\uC608\uC57D\uB0A0\uC9DC : ");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_2.setBounds(170, 145, 73, 20);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\uC608\uC57D\uC2DC\uAC04 : ");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_3.setBounds(170, 175, 73, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\uC608\uC57D \uC778\uC6D0 : ");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_4.setBounds(170, 205, 78, 20);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\uACB0\uC81C\uD6C4 \uC794\uC561 : ");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_5.setBounds(170, 235, 93, 20);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("\uACBD\uBBFC\uC774\uC758 \uC624\uC774\uC2DC \uB77C\uBA58");
		label_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_6.setBounds(230, 115, 182, 20);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("2018-03-16");
		label_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_7.setBounds(250, 145, 162, 20);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("18:00 ~ 19:00 ");
		label_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_8.setBounds(250, 175, 162, 20);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("\uC6D0");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_9.setBounds(270, 235, 117, 20);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("15,000\uC6D0");
		label_10.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		label_10.setBounds(250, 205, 162, 20);
		panel.add(label_10);
		
		JButton conFirmBtn = new JButton("\uD655\uC778");
		conFirmBtn.setBounds(502, 388, 105, 27);
		panel.add(conFirmBtn);
	}

}
