package entity;

public class User {
	private int id;
	private String username;
	private String pwd; 
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String pwd, String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.email = email;
	}


	public User(int id, String username, String pwd, String email) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", username=" + username + ", pwd=" + pwd + ", email=" + email + "]";
	}
	

}