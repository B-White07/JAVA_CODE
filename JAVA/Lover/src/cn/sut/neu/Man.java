package cn.sut.neu;

public class Man {
	//ÊôĞÔ
	private String name;
	private int age;
	private float heigth;
	private float weigth;
	private String hair;
	
	//·½·¨
	public Man(){
		super();
	}
	
	public Man(String name,int age,float heigh,float weigth,String hair) {
		super();
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.weigth = weigth;
		this.hair = hair;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}
	
	public float getHeigth() {
		return heigth;
	}
	
	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}
	
	public float getWeigth() {
		return weigth;
	}
	
	public void setHair(String hair) {
		this.hair = hair;
	}
	
	public String getHair() {
		return hair;
	}
	
}
