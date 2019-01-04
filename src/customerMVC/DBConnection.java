package customerMVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{
	// DB연결

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "soojin";
			String pw = "soojin";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");


		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패" + e.toString());
		} catch (SQLException ee) {
			System.out.println("DB접속 실패" + ee.toString());
		} catch (Exception eee) {
			System.out.println("Unknown error");
			eee.getStackTrace();
		}
		return conn;

	}
}
