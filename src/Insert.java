package customerMVC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import customer.CustomerView;

public class Insert {

	public customer.CustomerView cv;

	public Insert(customer.CustomerView cv) {
		this.cv = cv;
	}

	public void SelectTable_InsertRes() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String quary = null;

		try {

			String res_name = cv.Res_Name.getText();
			String category = (String) cv.category.getSelectedItem();
			String country = cv.Country.getText();
			String city = cv.Res_City.getText();
			char[] pass = cv.Pass.getPassword();
			char[] passC = cv.PassC.getPassword();
			String password = String.valueOf(pass);
			String passwordC = String.valueOf(passC);

			quary = "INSERT into RESTAURANT(res_name, category, country, city) " + "values ('" + res_name + "', '" + category
					+ "', '" + country + "', '" + city + "')";

			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(quary);
			rs = ps.executeQuery();

			if (password.isEmpty() || passwordC.isEmpty()) {
				cv.chef_test.setText("입력누락");
				JOptionPane.showMessageDialog(cv.p2, "입력이 누락되었습니다.", "누락", JOptionPane.QUESTION_MESSAGE);
				return;
			} else if (password.equals(passwordC)) {
				cv.restaurant_test.setText("레스토랑비번확인");
				JOptionPane.showMessageDialog(cv.p2, res_name + " 이(가) 추가 되었습니다.", "확인", JOptionPane.PLAIN_MESSAGE);
			} else {
				cv.restaurant_test.setText("레스토랑비번틀림");
				JOptionPane.showMessageDialog(cv.p2, "레스토랑 비밀번호 확인이 틀렸습니다.", "비밀번호 확인 실패", JOptionPane.WARNING_MESSAGE);
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

}
