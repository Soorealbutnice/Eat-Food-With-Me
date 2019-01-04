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
			// DB연결된 상태(세션)을 담은 객체
			
			conn = DBConnection.getConnection();
			System.out.println("DB에 연결");			
			
			String quary = "INSERT INTO coupon(coupon_no,discount_type,discount_price,coupon_date) values (?, ? , ?, ?)";
			pstmt = conn.prepareStatement(quary);
			
			pstmt.setString (1, main.adminCoupon.couponmake.couponNumTf.getText());
			pstmt.setString (2, (String) main.adminCoupon.couponmake.comboBox.getSelectedItem());
			pstmt.setString (3, main.adminCoupon.couponmake.discountPriceTf.getText());
			pstmt.setString(4, main.adminCoupon.couponmake.dateInputTf.getText());

			System.out.println(quary);
			pstmt.executeUpdate();

			// 6. DB 자원 반납

		} catch (SQLException sqle) {
			System.out.println("INSERT문에서 예외 발생");
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
//			// DB연결된 상태(세션)을 담은 객체
//			Connection conn = null; 
//			conn = DBConnection.getConnection();
//			System.out.println("DB에 연결");			
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
//			// 6. DB 자원 반납
//
//		} catch (SQLException sqle) {
//			System.out.println("INSERT문에서 예외 발생");
//			sqle.printStackTrace();
//		}
//	}
	
	
}
