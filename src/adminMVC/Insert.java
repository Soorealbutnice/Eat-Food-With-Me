package adminMVC;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import DAO.DBConnection;
import admin_new.adminCoupon;
import admin_new.adminMain;

public class Insert {
	Connection conn = null; 
	PreparedStatement pstmt = null;
	adminMain main;
	SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	public Insert(adminMain main) {
		this.main = main;
	}
	public void couponMake() throws ParseException {
		
	
		try {
			// DB����� ����(����)�� ���� ��ü
			
			conn = DBConnection.getConnection();
			System.out.println("DB�� ����");			
			
			String quary = "INSERT INTO coupon(coupon_no,discount_type,discount_price,coupon_date) values (?, ? , ?, ?)";
			pstmt = conn.prepareStatement(quary);
			
			pstmt.setString (1, main.adminCoupon.couponmake.couponNumTf.getText());
			pstmt.setString (2, (String) main.adminCoupon.couponmake.comboBox.getSelectedItem());
			pstmt.setString (3, main.adminCoupon.couponmake.discountPriceTf.getText());
			pstmt.setString(4, main.adminCoupon.couponmake.dateInputTf.getText());

			System.out.println(quary);
			pstmt.executeUpdate();

			// 6. DB �ڿ� �ݳ�

		} catch (SQLException sqle) {
			System.out.println("INSERT������ ���� �߻�");
			sqle.printStackTrace();
		}
		finally {
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
	
//	public void couponPublish() {
//		try {
//			// DB����� ����(����)�� ���� ��ü
//			Connection conn = null; 
//			conn = DBConnection.getConnection();
//			System.out.println("DB�� ����");			
//			PreparedStatement pstmt = null;
//			
//			
//			String quary = "INSERT INTO coupon values (?, ? ,?)";
//			pstmt = conn.prepareStatement(quary);
//			System.out.println(main.adminCoupon.couponmake.couponNumTf.getText());
//			System.out.println(main.adminCoupon.couponmake.comboBox.getSelectedItem());
//			System.out.println(main.adminCoupon.couponmake.discountPriceTf.getText());
//			
//			pstmt.setString (1,main.adminCoupon.couponmake.couponNumTf.getText());
//			pstmt.setString (2, (String) main.adminCoupon.couponmake.comboBox.getSelectedItem());
//			pstmt.setString (3, main.adminCoupon.couponmake.discountPriceTf.getText());
//			pstmt.setDate(4, (Date)sdformat.parse(main.adminCoupon.couponmake.dateInputTf.getText()));
//
//			System.out.println(quary);
//			pstmt.executeUpdate();
//
//			// 6. DB �ڿ� �ݳ�
//
//		} catch (SQLException sqle) {
//			System.out.println("INSERT������ ���� �߻�");
//			sqle.printStackTrace();
//		}
//	}
	
	
}
