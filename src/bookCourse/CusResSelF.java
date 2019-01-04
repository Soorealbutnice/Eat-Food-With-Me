package bookCourse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class CusResSelF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusResSelF frame = new CusResSelF();
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
	public CusResSelF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uACBD\uBBFC\uC774\uC758 \uC774\uBE60\uC774 \uC624\uC774\uC2DC \uB77C\uBA58");
		label.setFont(new Font("±¼¸²", Font.BOLD, 24));
		label.setBounds(55, 37, 353, 49);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC0AC\uC9C4");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(Color.YELLOW);
		label_1.setBounds(27, 142, 227, 127);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC0AC\uC9C4");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(27, 312, 227, 127);
		contentPane.add(label_2);
		
		JTextArea Ta = new JTextArea();
		Ta.setBounds(312, 142, 439, 284);
		contentPane.add(Ta);
		
		JButton bookBtn = new JButton("\uC608\uC57D\uD558\uAE30");
		bookBtn.setBounds(606, 488, 116, 33);
		contentPane.add(bookBtn);
	}
}
