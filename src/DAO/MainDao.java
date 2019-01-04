package DAO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.Main;

public class MainDao {
	Main main;
	BufferedImage resimg;
	Connection conn = null; // DB����� ����(����)�� ���� ��ü
	PreparedStatement pstm = null; // SQL ���� ��Ÿ���� ��ü
	ResultSet rs = null; // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
	
	public MainDao(Main main) {
		this.main = main;
	}

	public void SelectRestaurant() {
		try {
			

			String quary = "select res_name,restaurant_detail,res_picture from restaurant";

			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(quary);
			rs = pstm.executeQuery();

			while (rs.next()) {
				String res_name = rs.getString(1);
				String res_detail = rs.getString(2);
				String res_picture = rs.getString(3);
				System.out.println(res_name + "\t" + res_detail + "\t" + res_picture);
				try {
				
					resimg = ImageIO.read(new File("./img/" + res_picture));
					
					System.out.println("./img/" + res_picture);
					main.chefinfo.chefpicture1.setIcon(new ImageIcon(resimg));
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				main.chefinfo.resname.setText(res_name);
				main.chefinfo.chefarea.append(res_detail+"\n");
			}
			

		} catch (SQLException sqle) {
			System.out.println("INSERT������ ���� �߻�");
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
	
	public void selectReservation() {
			try {

	        
	        String quary = "select total_price,res_date,people_num,bookstarttime,customer_id from reservationinfo";
	        
	        conn = DBConnection.getConnection();
	        pstm = conn.prepareStatement(quary);
	        rs = pstm.executeQuery();
	        
	        while(rs.next()){
	            String totalprice = rs.getString(1);
	            String date = rs.getString(2);
	            int people_num = rs.getInt(3);
	            String bookstarttime = rs.getString(4);
	            String customer_id = rs.getString(5);
	            
	            main.chefinfo.model.addRow(new Object[]{customer_id,date,bookstarttime,people_num,totalprice});


	           
	        
	        }
	        
	        
			}catch(SQLException sqle) {
				System.out.println("select������ ���� �߻�");
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
}
