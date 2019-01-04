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
				cv.chef_test.setText("�Է´���");
				JOptionPane.showMessageDialog(cv.p2, "�Է��� �����Ǿ����ϴ�.", "����", JOptionPane.QUESTION_MESSAGE);
				return;
			} else if (password.equals(passwordC)) {
				cv.restaurant_test.setText("����������Ȯ��");
				JOptionPane.showMessageDialog(cv.p2, res_name + " ��(��) �߰� �Ǿ����ϴ�.", "Ȯ��", JOptionPane.PLAIN_MESSAGE);
			} else {
				cv.restaurant_test.setText("����������Ʋ��");
				JOptionPane.showMessageDialog(cv.p2, "������� ��й�ȣ Ȯ���� Ʋ�Ƚ��ϴ�.", "��й�ȣ Ȯ�� ����", JOptionPane.WARNING_MESSAGE);
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
