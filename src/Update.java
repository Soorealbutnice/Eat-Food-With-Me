package customerMVC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import customer.CustomerView;

public class Update {

	customer.CustomerView cv;

	public Update(customer.CustomerView cv) {
		this.cv = cv;
	}

	public void SelectTable_UpdateMyInfo() {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String quary = null;

		String first_name = cv.name_mod.getText();
		String TEL = cv.phone_mod.getText();
		String email = cv.email_mod.getText();
//		String address = cv.address_mod.getText();

		char[] passC = cv.password.getPassword();
		char[] passconfirmC = cv.password_confirm.getPassword();

		String pass = String.valueOf(passC);
		String passconfirm = String.valueOf(passconfirmC);
		System.out.println(pass);
		System.out.println(passconfirm);
		if (first_name.isEmpty() || TEL.isEmpty() || email.isEmpty() ||pass.isEmpty()
				|| passconfirm.isEmpty()) {
			cv.chef_test.setText("�Է´���");
			JOptionPane.showMessageDialog(cv.Register, "�Է��� �����Ǿ����ϴ�.", "����", JOptionPane.QUESTION_MESSAGE);
			return;
		} else if (pass.equals(passconfirm)) {
			try {
//				quary = "Update CUSTOMER SET first_name = '" + first_name + "', TEL = '" + TEL + "', email='" + email
//						+ "' , password='" + pass + "' WHERE customer_id='"+cv.cid+"'";

				conn = DBConnection.getConnection();
				ps = conn.prepareStatement(quary);
				rs = ps.executeQuery();
				System.out.println("����");
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
		} else {
			JOptionPane.showMessageDialog(cv.Register, "��й�ȣ�� �߸��Ǿ����ϴ�.", "��й�ȣ����", JOptionPane.WARNING_MESSAGE);
			System.out.println("�ƴ�");
		}

	}

}
