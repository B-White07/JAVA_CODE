package util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtil {
	private static String dbUrl = "jdbc:mysql://localhost:3306/lzw?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
	private static String dbUserName = "root";
	private static String dbPassword = "MS990725";
	private static String jdbcName = "com.mysql.cj.jdbc.Driver";

	public static Connection getConnection() {
		Connection con = null;
		// 加载驱动
		try {
			Class.forName(jdbcName);
			// 获取一个与数据库的链接对象
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Connection con = DBUtil.getConnection();
		System.out.println(con);
	}

}