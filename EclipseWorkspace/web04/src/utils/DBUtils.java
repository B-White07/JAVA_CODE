package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

import com.sun.org.apache.regexp.internal.recompile;


public class DBUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	private static BasicDataSource dataSource;
	
	static{
		Properties prop = new Properties();
		
		InputStream ips = DBUtils.class.getClassLoader().getResourceAsStream("utils/jdbc.properties");
		try {
			prop.load(ips);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			//创建数据源对象
			dataSource = new BasicDataSource();
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ips.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**通过连接池获取连接
	 * @throws SQLException */
	public static Connection getConn() throws SQLException{
		return dataSource.getConnection();
	}
	
	/**关闭连接的方法*/
	public static void close(Connection conn){
		//当Connection不为null,关闭连接
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		Connection conn = DBUtils.getConn();
		System.out.println(conn);
	}
}
