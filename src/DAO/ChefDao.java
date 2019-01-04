package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.ws.FaultAction;

import chef.ChefInfo;

public class ChefDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ChefInfo ci;
	public ChefDao(ChefInfo ci){
		this.ci = ci;
	}
	public void addMenu() {
		try {
			 // DB연결된 상태(세션)을 담은 객체
			
			conn = DBConnection.getConnection();
			System.out.println("DB에 연결");
			
			String quary = "INSERT INTO menu values (?,?,?)";
			pstmt = conn.prepareStatement(quary); 
			pstmt.setString(1, ci.menu1.getText());
			pstmt.setString(2, ci.price1.getText());
			pstmt.setString(3, ci.detailmenu.getText());
			System.out.println(quary);
			pstmt.executeUpdate();
			// 4. SQL문 작성 => INSERT문 작성

			
	

			// 6. DB 자원 반납

		} catch (SQLException sqle) {
			System.out.println("select문에서 예외 발생");
			sqle.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					}
	}
}
