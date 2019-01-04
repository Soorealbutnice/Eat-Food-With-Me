package adminMVC;

import java.sql.*;

import DAO.DBConnection;
import admin_new.adminCoupon;
import admin_new.adminMain;
import main.Login;

public class Delete {
	Login login;
	adminMain main = new adminMain(login);
	Statement stmt = null;
	
	public Delete(adminMain main) {
		this.main = main;
	}
	
	public void couponDel(){
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = DBConnection.getConnection();
			
			int row = main.adminCoupon.couponmanage.table.getSelectedRow();
			int column = main.adminCoupon.couponmanage.table.getSelectedColumn();
			String id =  (String) main.adminCoupon.couponmanage.table.getValueAt(row, column);
			
			System.out.println(id);
			String quary = "DELETE FROM COUPON WHERE COUPON_NO = '"+id+"' ";
//			quary += "WHERE COUPON_NO = '" + main.adminCoupon.couponmanage.table.getValueAt(row, column)+"'";
			System.out.println(quary);
			stmt = conn.prepareStatement(quary);
	        stmt.executeUpdate(quary);
	        
			System.out.println("Record is deleted!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				stmt.close();
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
	
	
	public void customerDelete() throws SQLException {
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = DBConnection.getConnection();
			
			int row = main.adminCustomer.table.getSelectedRow();
			int column = main.adminCustomer.table.getSelectedColumn();
			String id =  (String) main.adminCustomer.table.getValueAt(row, column);
			
			System.out.println(id);
			String quary = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = '"+id+"' ";
//			quary += "WHERE COUPON_NO = '" + main.adminCoupon.couponmanage.table.getValueAt(row, column)+"'";
			System.out.println(quary);
			stmt = conn.prepareStatement(quary);
	        stmt.executeUpdate(quary);
	        
			System.out.println("Record is deleted!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	public void chefDelete() throws SQLException {
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			conn = DBConnection.getConnection();
			
			int row = main.adminChef.table.getSelectedRow();
			int column = main.adminChef.table.getSelectedColumn();
			String id =  (String) main.adminChef.table.getValueAt(row, column);
			String quary = "DELETE FROM CHEF WHERE Chef_ID = '"+id+"' ";

			stmt = conn.prepareStatement(quary);
	        stmt.executeUpdate(quary);
	        
			System.out.println("Record is deleted!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} finally {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	
}
