package bookCourse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class CusCoinF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusCoinF frame = new CusCoinF();
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
	public CusCoinF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(171, 35, 385, 297);
		contentPane.add(panel);
		
		JRadioButton fivThouWonBtn = new JRadioButton("5,000 \uC6D0");
		fivThouWonBtn.setBounds(133, 83, 121, 23);
		panel.add(fivThouWonBtn);
		
		JRadioButton tenThouWonBtn = new JRadioButton("10,000 \uC6D0");
		tenThouWonBtn.setBounds(133, 111, 121, 23);
		panel.add(tenThouWonBtn);
		
		JRadioButton thirtyThouWonBtn = new JRadioButton("30,000 \uC6D0");
		thirtyThouWonBtn.setBounds(133, 139, 121, 23);
		panel.add(thirtyThouWonBtn);
		
		JRadioButton fiftyThouWonBtn = new JRadioButton("50,000 \uC6D0");
		fiftyThouWonBtn.setBounds(133, 167, 121, 23);
		panel.add(fiftyThouWonBtn);
		
		JLabel presentCoinWonL = new JLabel("\uC6D0");
		presentCoinWonL.setHorizontalAlignment(SwingConstants.RIGHT);
		presentCoinWonL.setBounds(418, 358, 57, 15);
		contentPane.add(presentCoinWonL);
		
		JLabel presentCoinL = new JLabel("\uD604\uC7AC \uCF54\uC778     : ");
		presentCoinL.setBounds(241, 358, 136, 15);
		contentPane.add(presentCoinL);
		
		JLabel aftChargeCoinL = new JLabel("\uCDA9\uC804 \uD6C4 \uCF54\uC778 : ");
		aftChargeCoinL.setBounds(241, 382, 136, 15);
		contentPane.add(aftChargeCoinL);
		
		JLabel aftChargeCoinWonL = new JLabel("\uC6D0");
		aftChargeCoinWonL.setHorizontalAlignment(SwingConstants.RIGHT);
		aftChargeCoinWonL.setBounds(418, 382, 57, 15);
		contentPane.add(aftChargeCoinWonL);
		
		JButton backBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backBtn.setBounds(421, 453, 97, 23);
		contentPane.add(backBtn);
		
		JButton chargeBtn = new JButton("\uCDA9\uC804");
		chargeBtn.setBounds(217, 453, 97, 23);
		contentPane.add(chargeBtn);
	}
}
