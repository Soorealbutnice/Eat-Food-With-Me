package adminMVC;

import java.sql.*;

import DAO.DBConnection;
import admin_new.adminCoupon;
import admin_new.adminMain;

public class Select {
	public adminCoupon ac;
	public adminMain main;

	public Select(adminMain main) {
		this.main = main;
	}


	public void couponSel() {
		try {
		Connection conn = null; // DB����� ����(����)�� ���� ��ü
        PreparedStatement pstm = null;  // SQL ���� ��Ÿ���� ��ü
        ResultSet rs = null;  // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
        
        String quary = "select * from coupon";
        
        conn = DBConnection.getConnection();
        pstm = conn.prepareStatement(quary);
        rs = pstm.executeQuery();
        
        while(rs.next()){
            String coupon_NO = rs.getString(1);
            String discount_Type = rs.getString(2);
            String discount_price = rs.getString(3);
            Date coupon_date = rs.getDate(4);
            String customer_id = rs.getString(5);
          
            main.adminCoupon.couponmanage.model.addRow(new Object[] {coupon_NO, discount_Type, discount_price, coupon_date,customer_id});
  
        }
        
        
		}catch(SQLException sqle) {
			System.out.println("SELECT������ ���� �߻�");
			sqle.printStackTrace();
		}
	}
	
//	// �������࿡�� �������� ���ÿ� �� ���� ����Ʈ�ϱ�
//	public void couponNum() {
//		try {
//		Connection conn = null; // DB����� ����(����)�� ���� ��ü
//        PreparedStatement pstm = null;  // SQL ���� ��Ÿ���� ��ü
//        ResultSet rs = null;  // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
//        
//        String quary = "select coupon_no from coupon";
//        
//        conn = DBConnection.getConnection();
//        pstm = conn.prepareStatement(quary);
//        rs = pstm.executeQuery();
//        
//        while(rs.next()){
//            String couponNum = rs.getString(1);
//            
//	            
//	         main.adminCoupon.couponmanage.model.addRow(new Object[] {couponNum});
//        }
//        
//        
//		}catch(SQLException sqle) {
//			System.out.println("INSERT������ ���� �߻�");
//			sqle.printStackTrace();
//		}
//	}
//	ȸ�� ���� �Ѹ���
	public void customerSel() {
		try {
		
		Connection conn = null; // DB����� ����(����)�� ���� ��ü
        PreparedStatement pstm = null;  // SQL ���� ��Ÿ���� ��ü
        ResultSet rs = null;  // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
        
        String quary = "select * from customer";
        
        conn = DBConnection.getConnection();
        System.out.println("db����");
        pstm = conn.prepareStatement(quary);
        rs = pstm.executeQuery();
        System.out.println(quary);
        while(rs.next()){
        	
            String customer_id = rs.getString(1);
            String customerName = rs.getString(2);
            String customerPW = rs.getString(3);
            String customerTell = rs.getString(4);
            String customerEmail = rs.getString(5);
            String customerPoint = rs.getString(6);
            
            main.adminCustomer.model.addRow(new Object[] {customer_id, customerName, customerPW, customerTell , customerEmail, customerPoint});

        }
       
        
		}catch(SQLException sqle) {
			System.out.println("SELECT������ ���� �߻�");
			sqle.printStackTrace();
		}
	}
	
	public void chefSel() {
		try {
		
		Connection conn = null; // DB����� ����(����)�� ���� ��ü
        PreparedStatement pstm = null;  // SQL ���� ��Ÿ���� ��ü
        ResultSet rs = null;  // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
        
        String quary = "select c.chef_id, c.customer_id, cu.first_name, r.category, r.country||', '||r.city, c.appro_check "
        			+ "from chef c, restaurant r, customer cu "
        			+ "WHERE c.chef_id = r.chef_id"
        			+ " and c.customer_id = cu.customer_id";
        
        conn = DBConnection.getConnection();
        System.out.println("db����");
        pstm = conn.prepareStatement(quary);
        rs = pstm.executeQuery();
        System.out.println(quary);
        while(rs.next()){
        	
            String chefId = rs.getString(1);
            String customerId = rs.getString(2);
            String chefName = rs.getString(3);
            String category = rs.getString(4);
            String region = rs.getString(5);
            String appro_check = rs.getString(6);

            main.adminChef.model.addRow(new Object[] {chefId, customerId, chefName, category, region, appro_check});

        }
        
        
		}catch(SQLException sqle) {
			System.out.println("SELECT������ ���� �߻�");
			sqle.printStackTrace();
		}
	}
	
	
}
