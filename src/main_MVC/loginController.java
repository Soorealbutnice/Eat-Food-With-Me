package main_MVC;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import main.*;

public class loginController implements ActionListener {

	Login login;
	Main main;
	signUp su;
	boolean flag;
	public MemberService memberService;
	public BufferedImage m_numberImage;
	public loginController lgController;
	loginService ls;

	public loginController(Login login) {
		this.login = login;
		memberService = new MemberServiceImpl();
		ls = new loginService(login);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		try {
			
			m_numberImage = ImageIO.read(new File("./img/main.jpg"));
//			 login.lblNewLabel_3.setIcon(new ImageIcon(m_numberImage));

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (ob == login.signUp) {
			login.su.setVisible(true);

		} else if (ob == login.su.BtnBack) {
			login.setVisible(true);
			login.su.setVisible(false);

		} else if (ob == login.su.BtnRe ) {
			System.out.println(login.su.pw);
			System.out.println(login.su.pw2);
			ls.Result();
			ls.insert();
			login.su.id.setText("");
			login.su.pw.setText("");
			login.su.name.setText("");
			login.su.email.setText("");
			login.su.num.setText("");
			login.su.pw2.setText("");
			login.su.setVisible(false);

		} else if(ob == login.login) {
		
			System.out.println(login.idTF.getText());
			ls.logincoll();
		
		}
	}
	


}

// if (ob == login.su.btnBack) {
// System.out.println("로그인버튼");
// login.btnPanel.setVisible(false);
// login.signUpP.setVisible(false);
// main.setVisible(true);
//
// } else if (ob == login.su.regisBtn) {
// login.btnPanel.setVisible(true);
// login.signUpP.setVisible(false);
// //로그인
// }else if ( ob == login.signUpBtn) {
// login.signUpP.setVisible(true);
// login.btnPanel.setVisible(false);
//
// } else if (ob == login.loginBtn) {
// login.signUpP.setVisible(false);
// login.btnPanel.setVisible(false);
//
//
// }
