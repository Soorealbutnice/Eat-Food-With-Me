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
		JOptionPane.showMessageDialog(login.su, "비밀번호를 다시 입력해주세요서비스2", "알림", JOptionPane.PLAIN_MESSAGE);
//		return;
		}
		
		if ((login.su.id.getText().equals(null)) || (login.su.pw.getText().equals(null))) {
			System.out.println(login.su.id.getText() + "id");
			System.out.println(login.su.pw.getText() + "pw");
//			JOptionPane.showMessageDialog(login.su, "정보 입력 오류서비스", "회원가입 실패", JOptionPane.WARNING_MESSAGE);
		
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
		else if (memberDto != null) {// 로그인 성공
			login.setVisible(false);
			login.main.setVisible(true);
			login.main.id.setText(id);

		} else {// 로그인 실패
			JOptionPane.showMessageDialog(login, "아이디 또는 비밀번호 확인후 다시 로그인하세요", "로그인실패",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		
	}
}




