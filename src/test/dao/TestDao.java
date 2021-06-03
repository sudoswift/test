package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDao {
	private static TestDao dao = new TestDao();
	private TestDao() {}
	public static TestDao getInstance() {
		return dao;
	}
	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?characterEncoding=UTF-8&serverTimezone=UTC", "root","0000");
		}catch(Exception e) {
			System.out.println("오류발생!"+e);
		}
		return conn;
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if(pstmt != null) {
			try {
				pstmt.close();
			}catch(Exception e) {
				System.out.println(" pstmt close error");
			}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch(Exception e) {
				System.out.println("conn close error");
			}
		}
	}
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}
}
