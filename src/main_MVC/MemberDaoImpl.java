package main_MVC;

import java.sql.*;



public class MemberDaoImpl implements MemberDao {
	
	
	public MemberDaoImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int register(MemberDto memberDto) {
		return 0;
	}

	@Override
	public MemberDto login(String id, String pass) {
		MemberDto memberDto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soojin", "soojin");
			String sql = "";
			sql += "select CUSTOMER_ID,PASSWORD\n";
			sql += "from CUSTOMER \n";
			sql += "where CUSTOMER_ID = ? and PASSWORD = ?";
			pstmt = conn.prepareStatement(sql);
			System.out.println(id + "                  " + pass);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				memberDto = new MemberDto();
				memberDto.setId(rs.getString("CUSTOMER_ID"));
				memberDto.setName(rs.getString("PASSWORD"));
	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//close
		}
		
		return memberDto;
	}

}
