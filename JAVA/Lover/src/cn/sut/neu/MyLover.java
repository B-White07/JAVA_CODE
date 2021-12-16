package cn.sut.neu;
//import java.util.Scanner;


public class MyLover {
	public static void main(String[] args) {
		/*
		//创建my lover
		Woman Wang = new Woman();
		Wang.setName("王漋菲");
		Wang.setAge(20);
		Wang.setHeigth(166.0F);
		Wang.setWeigth(50.0F);
		Wang.setHair("长头发");
		
		//创建我
		Man Li = new Man("李增伟",22,180.0F,55.0F,"短发");
		*/
		
		//配对测试，如果是情侣关系，说明时间
		Fuctions f = new Fuctions();
		//f.match("", "");
		
		if (f.match("","")) {
			f.time();
		}else {
			System.out.println("两位还不是情侣关系");
		}
	}
	
}
