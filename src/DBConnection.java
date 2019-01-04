package customerMVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{
	// DB����

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "soojin";
			String pw = "soojin";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database�� ����Ǿ����ϴ�.\n");


		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����" + e.toString());
		} catch (SQLException ee) {
			System.out.println("DB���� ����" + ee.toString());
		} catch (Exception eee) {
			System.out.println("Unknown error");
			eee.getStackTrace();
		}
		return conn;

	}
}
