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
			 // DB����� ����(����)�� ���� ��ü
			
			conn = DBConnection.getConnection();
			System.out.println("DB�� ����");
			
			String quary = "INSERT INTO menu values (?,?,?)";
			pstmt = conn.prepareStatement(quary); 
			pstmt.setString(1, ci.menu1.getText());
			pstmt.setString(2, ci.price1.getText());
			pstmt.setString(3, ci.detailmenu.getText());
			System.out.println(quary);
			pstmt.executeUpdate();
			// 4. SQL�� �ۼ� => INSERT�� �ۼ�

			
	

			// 6. DB �ڿ� �ݳ�

		} catch (SQLException sqle) {
			System.out.println("select������ ���� �߻�");
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
