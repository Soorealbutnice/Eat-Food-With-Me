package main_MVC;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import admin_new.adminMain;
import main.*;


public class loginService {
	Login login;
	Main main;
	signUp su;
	String id;
	public MemberService memberService;
	MemberDto memberDto;
	boolean flag;
	public MemberDto a;
	adminMain admain;

	public loginService(Login login) {
		this.login = login;
		memberService = new MemberServiceImpl();
		

	}

	public void insert() {
		Insert insert = new Insert(login);
		insert.insertJoin();
	}

	public void Result() {
		
		if (login.su.pw.getText().equals(login.su.pw2.getText())) {
			
		}else {
		JOptionPane.showMessageDialog(login.su, "��й�ȣ�� �ٽ� �Է����ּ��伭��2", "�˸�", JOptionPane.PLAIN_MESSAGE);
//		return;
		}
		
		if ((login.su.id.getText().equals(null)) || (login.su.pw.getText().equals(null))) {
			System.out.println(login.su.id.getText() + "id");
			System.out.println(login.su.pw.getText() + "pw");
//			JOptionPane.showMessageDialog(login.su, "���� �Է� ��������", "ȸ������ ����", JOptionPane.WARNING_MESSAGE);
		
		}
	}

	public void logincoll() {
		String id = login.idTF.getText().trim();
		String pass = new String(login.pwTF.getPassword());
		a = new MemberDto();
		System.out.println("controller >>>>>>>> " + id + "                  " + pass);
		MemberDto memberDto = memberService.login(id, pass);
		if(id.equals("admin")) {
			admain = new adminMain(login);
			admain.setVisible(true);
		}
		else if (memberDto != null) {// �α��� ����
			login.setVisible(false);
			login.main.setVisible(true);
			login.main.id.setText(id);

		} else {// �α��� ����
			JOptionPane.showMessageDialog(login, "���̵� �Ǵ� ��й�ȣ Ȯ���� �ٽ� �α����ϼ���", "�α��ν���",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		
	}
}




