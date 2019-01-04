package customer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Reserve_com extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reserve_com frame = new Reserve_com();
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
	public Reserve_com() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(110, 90, 580, 380);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uC774 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		lblNewLabel.setBounds(50, 30, 400, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBA54\uB274\uBA85 : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(170, 115, 60, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC608\uC57D\uB0A0\uC9DC : ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(170, 145, 75, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC608\uC57D\uC2DC\uAC04 : ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(170, 175, 75, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC608\uC57D \uC778\uC6D0 : ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(170, 205, 80, 20);
		panel.add(lblNewLabel_4);		

		
		JLabel lblNewLabel_5 = new JLabel("\uACB0\uC81C\uD6C4 \uC794\uC561 : ");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(170, 235, 95, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uACBD\uBBFC\uC774\uC758 \uC624\uC774\uC2DC \uB77C\uBA58");
		lblNewLabel_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(230, 115, 180, 20);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("2018-03-16");
		lblNewLabel_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(250, 145, 160, 20);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("18:00 ~ 19:00 ");
		lblNewLabel_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(250, 175, 160, 20);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\uC6D0");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(270, 235, 140, 20);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("15,000\uC6D0");
		lblNewLabel_10.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(250, 205, 160, 20);
		panel.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("O K");
		btnNewButton.setForeground(new Color(0, 190, 190));
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnNewButton.setBounds(380, 290, 150, 60);
		panel.add(btnNewButton);
	}

}
