package admin_new;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import adminMVC.adminController;

public class adminCustomer extends JPanel{

	public JTable table;
	public JButton selBtn;
	public JButton delBtn;
	public JButton backBtn;
	public adminMain main;

	public String[] colNames = {"회원번호", "이름", "비밀번호","전화번호","이메일","포인트"};
	public DefaultTableModel model = new DefaultTableModel(colNames, 0);

	/**
	 * Create the panel.
	 */
	public adminCustomer(adminMain main) {
		this.main = main;
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(98, 91, 608, 309);
		add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		selBtn = new JButton("\uC870\uD68C");
		selBtn.setBounds(98, 41, 125, 29);
		add(selBtn);

		delBtn = new JButton("\uC0AD\uC81C");
		delBtn.setBounds(581, 41, 125, 29);
		add(delBtn);

		backBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backBtn.setBounds(87, 425, 88, 29);
		add(backBtn);

		adminController control = new adminController(main);	//이것도 this냐 main이냐..나는 무엇을 아는 것일까
		
		backBtn.addActionListener(control);
		selBtn.addActionListener(control);
		delBtn.addActionListener(control);
		backBtn.addActionListener(control);

	}

}

