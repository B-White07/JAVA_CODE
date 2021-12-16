package entity;

public class Emp {
	private int id;
	private String userName;
	private String pwd;
	private int age;
	private double salary;
	private String gendar;
	//定义无参数构造器
	public Emp() {
		
	}
	//定义get set方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	//定义equals与hasCode方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		return true;
	}
	//重新定义toString 方法
	@Override
	public String toString() {
		return "Emp [age=" + age + ", gendar=" + gendar + ", id=" + id
				+ ", pwd=" + pwd + ", salary=" + salary + ", userName="
				+ userName + "]";
	}
}
