package chef;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import main.Main;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ChefInfo extends JFrame {
	public String colNames[] = {"고객아이디","날짜","예약시간","인원","총금액"};
//	customer_id,date,bookstarttime,people_num,totalprice
	public DefaultTableModel model = new DefaultTableModel(colNames,0);
	public JPanel contentpanel = new JPanel();
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
	JPanel ChefMyRes = new JPanel();
	JPanel ChefBook = new JPanel();
	JPanel ChefMenu = new JPanel();
	JPanel ChefStatistic = new JPanel();
	public Main main;
	public JTable cheftable;
	public JTextField menu1;
	public JTextField price1;
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
	public JTextField textField_15;
	public JTextField textField_16;
	public JTextField textField_17;
	public JTextField textField_18;
	public JTextField textField_19;
	public JTextField textField_20;
	public JButton addbtn;
	public JButton backbtn;
	public JLabel chefpicture1;
	public JLabel chefpicture2;
	public JTextArea chefarea;
	public JLabel resname;
	public JTextArea detailmenu;
	
	
	
	/**
	 * Create the panel.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChefInfo frame = new ChefInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ChefInfo() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentpanel = new JPanel();
		contentpanel.setBackground(Color.WHITE);

		setContentPane(contentpanel);
		contentpanel.setLayout(null);

		tabbedPane.setBounds(0, 0, 800, 600);
		contentpanel.add(tabbedPane);
		
		tabbedPane.addTab("내식당", null, ChefMyRes, null);
		tabbedPane.add("내식당", ChefMyRes);
		ChefMyRes.setLayout(null);
		
		resname = new JLabel("\uACBD\uBBFC\uC774\uC758 \uC774\uBE60\uC774 \uC624\uC774\uC2DC \uB77C\uBA58");
		resname.setFont(new Font("Dialog", Font.BOLD, 24));
		resname.setBounds(50, 65, 350, 50);
		ChefMyRes.add(resname);
		
		chefpicture1 = new JLabel("\uC0AC\uC9C4");
		chefpicture1.setHorizontalAlignment(SwingConstants.CENTER);
		chefpicture1.setBackground(Color.LIGHT_GRAY);
		chefpicture1.setBounds(50, 160, 180, 140);
		ChefMyRes.add(chefpicture1);
		
		chefpicture2 = new JLabel("\uC0AC\uC9C4");
		chefpicture2.setHorizontalAlignment(SwingConstants.CENTER);
		chefpicture2.setBounds(50, 300, 180, 140);
		ChefMyRes.add(chefpicture2);
		
		chefarea = new JTextArea();
		chefarea.setBounds(300, 160, 400, 280);
		ChefMyRes.add(chefarea);
		
		tabbedPane.addTab("내예약", null, ChefBook, null);
		tabbedPane.add("내예약", ChefBook);
		ChefBook.setLayout(null);
		
		JLabel label_3 = new JLabel("\uC608\uC57D\uAD00\uB9AC");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Dialog", Font.BOLD, 22));
		label_3.setBounds(320, 5, 160, 80);
		ChefBook.add(label_3);
		
		cheftable = new JTable(model);
		cheftable.setBounds(80, 130, 640, 370);
		ChefBook.add(cheftable);
		
		tabbedPane.addTab("내통계", null, ChefStatistic, null);
		tabbedPane.add("내통계", ChefStatistic);
		ChefStatistic.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(499, 15, 100, 30);
		ChefStatistic.add(comboBox);
		
		JLabel label_5 = new JLabel("\uB9E4\uCD9C\uD1B5\uACC4");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Dialog", Font.BOLD, 20));
		label_5.setBounds(350, 30, 100, 30);
		ChefStatistic.add(label_5);
		//챠트
		JLabel chartlable = new JLabel("\uD1B5\uACC4");
		chartlable.setHorizontalAlignment(SwingConstants.CENTER);
		chartlable.setBounds(40, 110, 720, 380);
		ChefStatistic.add(chartlable);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(650, 15, 100, 30);
		ChefStatistic.add(comboBox_1);
		
		tabbedPane.addTab("메뉴등록", null, ChefMenu, null);
		tabbedPane.add("메뉴등록", ChefMenu);
		ChefMenu.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Dialog", Font.BOLD, 22));
		lblMenu.setBounds(347, 50, 78, 32);
		ChefMenu.add(lblMenu);
		
		menu1 = new JTextField();
		menu1.setText("\uBA54\uB2741");
		menu1.setHorizontalAlignment(SwingConstants.CENTER);
		menu1.setColumns(10);
		menu1.setBounds(372, 88, 158, 32);
		ChefMenu.add(menu1);
		
		price1 = new JTextField();
		price1.setText("\uAC00\uACA9\uC785\uB825");
		price1.setHorizontalAlignment(SwingConstants.CENTER);
		price1.setColumns(10);
		price1.setBounds(372, 147, 158, 32);
		ChefMenu.add(price1);
		
//		textField_3 = new JTextField();
//		textField_3.setText("\uBA54\uB2742");
//		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_3.setColumns(10);
//		textField_3.setBounds(90, 146, 158, 32);
//		ChefMenu.add(textField_3);
//		
//		textField_4 = new JTextField();
//		textField_4.setText("\uAC00\uACA9\uC785\uB825");
//		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_4.setColumns(10);
//		textField_4.setBounds(262, 144, 145, 32);
//		ChefMenu.add(textField_4);
//		
//		textField_5 = new JTextField();
//		textField_5.setText("\uBA54\uB274 \uC124\uBA85");
//		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_5.setColumns(10);
//		textField_5.setBounds(417, 146, 284, 32);
//		ChefMenu.add(textField_5);
//		
//		textField_6 = new JTextField();
//		textField_6.setText("\uBA54\uB274 \uC124\uBA85");
//		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_6.setColumns(10);
//		textField_6.setBounds(417, 190, 284, 32);
//		ChefMenu.add(textField_6);
//		
//		textField_7 = new JTextField();
//		textField_7.setText("\uAC00\uACA9\uC785\uB825");
//		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_7.setColumns(10);
//		textField_7.setBounds(262, 190, 145, 32);
//		ChefMenu.add(textField_7);
//		
//		textField_8 = new JTextField();
//		textField_8.setText("\uBA54\uB2743");
//		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_8.setColumns(10);
//		textField_8.setBounds(90, 190, 158, 32);
//		ChefMenu.add(textField_8);
//		
//		textField_9 = new JTextField();
//		textField_9.setText("\uBA54\uB2744");
//		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_9.setColumns(10);
//		textField_9.setBounds(90, 234, 158, 32);
//		ChefMenu.add(textField_9);
//		
//		textField_10 = new JTextField();
//		textField_10.setText("\uAC00\uACA9\uC785\uB825");
//		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_10.setColumns(10);
//		textField_10.setBounds(262, 234, 145, 32);
//		ChefMenu.add(textField_10);
//		
//		textField_11 = new JTextField();
//		textField_11.setText("\uBA54\uB274 \uC124\uBA85");
//		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_11.setColumns(10);
//		textField_11.setBounds(417, 234, 284, 32);
//		ChefMenu.add(textField_11);
//		
//		textField_12 = new JTextField();
//		textField_12.setText("\uBA54\uB2745");
//		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_12.setColumns(10);
//		textField_12.setBounds(90, 278, 158, 32);
//		ChefMenu.add(textField_12);
//		
//		textField_13 = new JTextField();
//		textField_13.setText("\uAC00\uACA9\uC785\uB825");
//		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_13.setColumns(10);
//		textField_13.setBounds(262, 278, 145, 32);
//		ChefMenu.add(textField_13);
//		
//		textField_14 = new JTextField();
//		textField_14.setText("\uBA54\uB274 \uC124\uBA85");
//		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_14.setColumns(10);
//		textField_14.setBounds(417, 278, 284, 32);
//		ChefMenu.add(textField_14);
//		
//		textField_15 = new JTextField();
//		textField_15.setText("\uBA54\uB2746");
//		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_15.setColumns(10);
//		textField_15.setBounds(90, 322, 158, 32);
//		ChefMenu.add(textField_15);
//		
//		textField_16 = new JTextField();
//		textField_16.setText("\uAC00\uACA9\uC785\uB825");
//		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_16.setColumns(10);
//		textField_16.setBounds(262, 322, 145, 32);
//		ChefMenu.add(textField_16);
//		
//		textField_17 = new JTextField();
//		textField_17.setText("\uBA54\uB274 \uC124\uBA85");
//		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_17.setColumns(10);
//		textField_17.setBounds(417, 322, 284, 32);
//		ChefMenu.add(textField_17);
//		
//		textField_18 = new JTextField();
//		textField_18.setText("\uBA54\uB2747");
//		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_18.setColumns(10);
//		textField_18.setBounds(90, 366, 158, 32);
//		ChefMenu.add(textField_18);
//		
//		textField_19 = new JTextField();
//		textField_19.setText("\uAC00\uACA9\uC785\uB825");
//		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_19.setColumns(10);
//		textField_19.setBounds(262, 366, 145, 32);
//		ChefMenu.add(textField_19);
//		
//		textField_20 = new JTextField();
//		textField_20.setText("\uBA54\uB274 \uC124\uBA85");
//		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
//		textField_20.setColumns(10);
//		textField_20.setBounds(417, 366, 284, 32);
//		ChefMenu.add(textField_20);
		
		addbtn = new JButton("\uCD94\uAC00");
		addbtn.setBounds(262, 438, 105, 27);
		ChefMenu.add(addbtn);
		
		backbtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backbtn.setBounds(409, 438, 105, 27);
		ChefMenu.add(backbtn);
		
		JLabel lblNewLabel = new JLabel("\uBA54\uB274");
		lblNewLabel.setBounds(258, 92, 102, 32);
		ChefMenu.add(lblNewLabel);
		
		JLabel label = new JLabel("\uAC00\uACA9");
		label.setBounds(258, 146, 102, 32);
		ChefMenu.add(label);
		 detailmenu = new JTextArea();
		detailmenu.setBounds(262, 189, 268, 205);
		ChefMenu.add(detailmenu);
		
//		public JLabel chefpicture1;
//		public JLabel chefpicture2;
//		public JTextArea chefarea;
		ChefController control = new ChefController(this);
		addbtn.addActionListener(control);
		backbtn.addActionListener(control);
		
		

	}
}
