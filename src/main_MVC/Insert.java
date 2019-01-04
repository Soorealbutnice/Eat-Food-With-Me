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
			Connection conn = null; // DB����� ����(����)�� ���� ��ü
			  PreparedStatement pstmt = null;
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soojin", "soojin");
			System.out.println("DB�� ����");

			String quary = "INSERT INTO CUSTOMER(CUSTOMER_ID,FIRST_NAME,PASSWORD,TEL,EMAIL) values (?,?,?,?,?)";// ""�� �ڹ�,''�� ����Ŭ

			// 3. Statement ��� => Connection ���ؼ�
			pstmt = conn.prepareStatement(quary);
			pstmt.setString(1, login.su.id.getText());
			pstmt.setString(2, login.su.name.getText());
			pstmt.setString(3, login.su.pw.getText());
			pstmt.setString(4, login.su.num.getText());
			pstmt.setString(5, login.su.email.getText());
			System.out.println(quary);
			pstmt.executeUpdate();
			JOptionPane.showMessageDialog(login, "ȸ�������� ���ϵ帳�ϴ�", "�˸�", JOptionPane.PLAIN_MESSAGE);
		
			// 4. SQL�� �ۼ� => INSERT�� �ۼ�


			// 6. DB �ڿ� �ݳ�

		} catch (SQLException sqle) {
		System.out.println("�α��ο���");
		JOptionPane.showMessageDialog(login.su, "ȸ�����Խ���", "�˸�", JOptionPane.PLAIN_MESSAGE);
			sqle.printStackTrace();
		}
	}
}
