package customerMVC;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;

import customer.CustomerView;

public class Select {

	public customer.CustomerView cv;

	public Select(customer.CustomerView cv) {
		this.cv = cv;
	}

	public void SelectTable_ReserveHistory() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String quary = "Select cus_no, first_name, manu, num from CUSTOMER";
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(quary);
			rs = ps.executeQuery();

			while (rs.next()) {
				String cus_no = rs.getString(1);
				String first_name = rs.getString(2);
				String manu = rs.getString(3);
				String num = rs.getString(4);

				cv.model.addRow(new String[] { cus_no, first_name, manu, num });

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void SelectTable_CoinHistory() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String quary = "Select cus_no, first_name, coin, price from CUSTOMER order by cus_no";

		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(quary);
			rs = ps.executeQuery();

			while (rs.next()) {
				String cus_no = rs.getString(1);
				String first_name = rs.getString(2);
				String coin = rs.getString(3);
				String price = rs.getString(4);

				cv.model_1.addRow(new Object[] { cus_no, first_name, coin, price });

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void SelectTable_ChefCheck() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String passport_no = null;
		String pass_date = null;
		String due_date = null;
		int chef_id = 0;

		String quary = "Select pass_date, due_date, chef_id from CHEF where chef_id = 1";

		try {

			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(quary);
			rs = ps.executeQuery();

			while (rs.next()) {
//				passport_no = rs.getString(1);
//				System.out.println("추가" + passport_no);
				pass_date = rs.getString(1);
				System.out.println("추가" + pass_date);
				due_date = rs.getString(2);
				System.out.println("추가" + due_date);
				chef_id = Integer.parseInt(rs.getString(3));
				System.out.println("추가" + chef_id);
			}

//			String passport_no1 = cv.Pass_No.getText();
			String pass_date1 = cv.Pass_Date.getText();
			String due_date1 = cv.Due_Date.getText();

			System.out.println(passport_no + pass_date + due_date  + pass_date1 + due_date1);

			if (pass_date1.isEmpty() || due_date1.isEmpty()) {
				cv.chef_test.setText("입력누락");
				JOptionPane.showMessageDialog(cv.p1, "입력이 누락되었습니다.", "누락", JOptionPane.QUESTION_MESSAGE);
				return;
			} else if (pass_date.equals(pass_date1) && due_date.equals(due_date1)) {
				cv.chef_test.setText("쉐프확인");
				JOptionPane.showMessageDialog(cv.p1, chef_id + " 이(가) 확인 되었습니다.", "확인", JOptionPane.PLAIN_MESSAGE);
			} else {
				cv.chef_test.setText("쉐프없음");
				JOptionPane.showMessageDialog(cv.p1, "1번에 해당하는 쉐프가 없습니다.", "쉐프없음", JOptionPane.WARNING_MESSAGE);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void test() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		ResultSet[] rss = { rs1, rs2, rs3 };
		List list = new List(3);
		String quary = "Select first_name from CUSTOMER";

		String[] str = new String[3];

		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(quary);
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(rs.getString(1));
			}

			cv.lv1.setText(list.getItem(0));
			cv.lv2.setText(list.getItem(1));
			cv.lv3.setText(list.getItem(2));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void testnext() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		ResultSet[] rss = { rs1, rs2, rs3 };
		List list = new List(3);
		String quary = "Select first_name from CUSTOMER";

		String[] str = new String[3];

		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(quary);
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(rs.getString(1));
			}

			cv.lv1.setText(list.getItem(cv.count));
			cv.lv2.setText(list.getItem(cv.count+1));
			cv.lv3.setText(list.getItem(cv.count+2));

		} catch (	SQLException e) {
			e.printStackTrace();
		}

	}

}
