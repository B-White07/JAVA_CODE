package cn.it3;
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
		public static void main(String[] args) throws CloneNotSupportedException {
			//创建学生对象
			Student s = new Student();
			s.setName("黑白");
			s.setAge(20);
			
			//克隆学生对象
			Object obj = s.clone();
			Student s2 = (Student)obj;
			System.out.println("------");
			
			System.out.println(s.getName()+"---"+s.getAge());
			System.out.println(s2.getName()+"---"+s2.getAge());
			
			//以前的做法
			Student s3 = s;
			System.out.println(s3.getName()+"---"+s3.getAge());
			System.out.println("------");
			
			//区别
			s3.setAge(22);
			s3.setName("李增伟");
			System.out.println(s.getName()+"---"+s.getAge());
			System.out.println(s2.getName()+"---"+s2.getAge());
			System.out.println(s3.getName()+"---"+s3.getAge());
			
			
		}
}
