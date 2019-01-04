package adminMVC;

import java.sql.*;

import DAO.DBConnection;
import admin_new.adminMain;
import main.Login;

public class update {
	Login login;
	Connection conn = null; // DB����� ����(����)�� ���� ��ü
    PreparedStatement pstm = null;  // SQL ���� ��Ÿ���� ��ü
    ResultSet rs = null;  // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
	adminMain main = new adminMain(login);
	Statement stmt = null;
	
	public update(adminMain main) {
		this.main = main;
	}
	
	public void chefUpdate() {
		try {

        String quary = "select * from chefinfo";
        
        //st.executeUpdate("UPDATE COFFEES SET PRICE=4.99 WHERE COF_NAME='BREAKFAST BLEND'");
        
        conn = DBConnection.getConnection();
        System.out.println("db����");
        pstm = conn.prepareStatement(quary);
        rs = pstm.executeQuery();
        System.out.println(quary);
        while(rs.next()){
        	
            String chefNum = rs.getString(1);
            String chefId = rs.getString(2);
            String chefSpeical = rs.getString(3);
            String chefRegion = rs.getString(4);

            String result = chefNum+" "+chefId+" "+chefSpeical+""+chefRegion+"";
//          main.adminCustomer.model.addRow(new Object[] {chefNum, chefId, chefSpeical, chefRegion});
            main.adminChef.model.addRow(new Object[] {chefNum, chefId, chefSpeical, chefRegion});
         
            System.out.println(result);
        }
        
        
		}catch(SQLException sqle) {
			System.out.println("SELECT������ ���� �߻�");
			sqle.printStackTrace();
		}finally {
			
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pstm.close();
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
	

	
	public void couponPublish() {
	try {
		// DB����� ����(����)�� ���� ��ü
		
		conn = DBConnection.getConnection();
		String id = main.adminCoupon.couponmanage.idInputTf.getText();
		int row = main.adminCoupon.couponmanage.table.getSelectedRow();
		int column = main.adminCoupon.couponmanage.table.getSelectedColumn();
		
		String quary = "UPDATE COUPON SET CUSTOMER_ID = '"+id+"' ";
		quary += "WHERE COUPON_NO = '" + main.adminCoupon.couponmanage.table.getValueAt(row, column)+"'";
						
		stmt = conn.prepareStatement(quary);
        stmt.executeUpdate(quary);
	
		// 6. DB �ڿ� �ݳ�

	} catch (SQLException sqle) {
		System.out.println("INSERT������ ���� �߻�");
		sqle.printStackTrace();
	} finally {
		
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}
	
	public void chefApp() {
		try {
			// DB����� ����(����)�� ���� ��ü
			
			conn = DBConnection.getConnection();
			

			int row = main.adminChef.table.getSelectedRow();
			int column = main.adminChef.table.getSelectedColumn();
			
			String quary = "UPDATE CHEF SET APPRO_CHECK = '"+ 1 +"' ";
			quary += "WHERE CHEF_ID = '" + main.adminChef.table.getValueAt(row, column)+"'";
							
			stmt = conn.prepareStatement(quary);
	        stmt.executeUpdate(quary);
		
			// 6. DB �ڿ� �ݳ�

		} catch (SQLException sqle) {
			System.out.println("INSERT������ ���� �߻�");
			sqle.printStackTrace();
		} finally {
			
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
	}

	public void chefRef() {
		try {
			// DB����� ����(����)�� ���� ��ü
			
			conn = DBConnection.getConnection();
			

			int row = main.adminChef.table.getSelectedRow();
			int column = main.adminChef.table.getSelectedColumn();
			
			String quary = "UPDATE CHEF SET APPRO_CHECK = '"+ 0 +"' ";
			quary += "WHERE CHEF_ID = '" + main.adminChef.table.getValueAt(row, column)+"'";
							
			stmt = conn.prepareStatement(quary);
	        stmt.executeUpdate(quary);
		
			// 6. DB �ڿ� �ݳ�

		} catch (SQLException sqle) {
			System.out.println("INSERT������ ���� �߻�");
			sqle.printStackTrace();
		} finally {
			
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		
	}

}
