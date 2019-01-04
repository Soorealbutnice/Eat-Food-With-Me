package admin_new;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import adminMVC.adminController;

public class adminChef extends JPanel{
	public JTable table;
	public JButton conBtn;
	public JButton refBtn;
	public JButton selBtn;
	public JButton delBtn;
	public JButton backBtn;
	public adminMain main;
	
	public String[] colNames = {"�����ѹ�", "ȸ�����̵�", "�̸�","Ư��", "����", "���ο���"};
	public DefaultTableModel model = new DefaultTableModel(colNames, 0);

	/**
	 * Create the panel.
	 */
	public adminChef(adminMain main) {
		this.main = main;
		setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(98, 91, 608, 309);
		add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);

		selBtn = new JButton("\uC870\uD68C");
		selBtn.setBounds(87, 46, 125, 29);
		add(selBtn);

		delBtn = new JButton("\uC0AD\uC81C");
		delBtn.setBounds(570, 46, 125, 29);
		add(delBtn);

		
		conBtn = new JButton("\uC2B9\uC778");
		conBtn.setBounds(281, 424, 88, 29);
		add(conBtn);
		
		refBtn = new JButton("\uAC70\uC808");
		refBtn.setBounds(386, 424, 88, 29);
		add(refBtn);

		backBtn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		backBtn.setBounds(87, 425, 88, 29);
		add(backBtn);
		
		
		adminController control = new adminController(main);	//main�ΰ� this�ΰ� �װ��� �����δ�
		
		backBtn.addActionListener(control);
		conBtn.addActionListener(control);
		refBtn.addActionListener(control);
		selBtn.addActionListener(control);
		delBtn.addActionListener(control);
		backBtn.addActionListener(control);

	}



}
