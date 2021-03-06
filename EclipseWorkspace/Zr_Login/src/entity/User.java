package entity;

/*
 * 用户和实体类
 * 属性要与数据库表中的字段相同
 * 私有化
 * 提供get和set方法
 */
public class User {
	private String userName;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
