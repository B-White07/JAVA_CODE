package sut;

public class Student {
	private String name;
	private int age;
	private char sex;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student(String name, int age, char sex, String id) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
