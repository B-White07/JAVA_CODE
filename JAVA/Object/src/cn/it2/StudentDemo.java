package cn.it2;
/*
 *  ==   
 *  	基本类型：比较值
 *  	引用类型：比较地址值
 *  
 *  equals（）
 *  	引用类型：默认比较地址值。不过可以根据需要重写该方法，可以自动生成，一般比较对象的成员变量的值是否相同
 * 
 */
public class StudentDemo {
		public static void main(String[] args) {
				Student s1 = new Student("lzw",20);
				Student s2 = new Student("lzw",20);
				System.out.println(s1 == s2);
				Student s3 = s1;
				System.out.println(s1 == s3);
				System.out.println("------------");
				
				System.out.println(s1.equals(s2));
				System.out.println(s1.equals(s1));
				System.out.println(s1.equals(s3));
				
				Student s4 = new Student("lll",21);
				System.out.println(s1.equals(s4));
				
				Demo d = new Demo();
				System.out.println(s1.equals(d));
		}
}
