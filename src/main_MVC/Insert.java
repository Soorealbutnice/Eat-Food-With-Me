package main_MVC;

import java.sql.*;

import javax.swing.JOptionPane;

import DAO.DBConnection;
import main.Login;

public class Insert {
	Login login;
	MemberDto dto;

	public Insert(Login login) {
		this.login = login;
	}

	public void insertJoin() {
		try {
			Connection conn = null; // DB연결된 상태(세션)을 담은 객체
			  PreparedStatement pstmt = null;
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soojin", "soojin");
			System.out.println("DB에 연결");

			String quary = "INSERT INTO CUSTOMER(CUSTOMER_ID,FIRST_NAME,PASSWORD,TEL,EMAIL) values (?,?,?,?,?)";// ""는 자바,''는 오라클

			// 3. Statement 얻기 => Connection 통해서
			pstmt = conn.prepareStatement(quary);
			pstmt.setString(1, login.su.id.getText());
			pstmt.setString(2, login.su.name.getText());
			pstmt.setString(3, login.su.pw.getText());
			pstmt.setString(4, login.su.num.getText());
			pstmt.setString(5, login.su.email.getText());
			System.out.println(quary);
			pstmt.executeUpdate();
			JOptionPane.showMessageDialog(login, "회원가입을 축하드립니다", "알림", JOptionPane.PLAIN_MESSAGE);
		
			// 4. SQL문 작성 => INSERT문 작성


			// 6. DB 자원 반납

		} catch (SQLException sqle) {
		System.out.println("로그인오류");
		JOptionPane.showMessageDialog(login.su, "회원가입실패", "알림", JOptionPane.PLAIN_MESSAGE);
			sqle.printStackTrace();
		}
	}
}
