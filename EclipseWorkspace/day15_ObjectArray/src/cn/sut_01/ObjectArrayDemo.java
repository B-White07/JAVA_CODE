package cn.sut_01;

/*
 * 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 *		 学生：Student
 *		 成员变量：name,age
 *		 构造方法：无参,带参
 *		 成员方法：getXxx()/setXxx()
 *		 存储学生的数组?自己想想应该是什么样子的?
 * 分析：
 * 		A:创建学生类。
 * 		B:创建学生数组(对象数组)。
 * 		C:创建5个学生对象，并赋值。
 * 		D:把C步骤的元素，放到数组中。
 * 		E:遍历学生数组。
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		Student s1 = new Student("lzw",20);
		Student s2 = new Student("wlf",21);
		Student s3 = new Student("lxt",22);
		Student s4 = new Student("hhh",23);
		Student s5 = new Student("xxx",24);
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
//		//用循环改进
//		for (int i = 0;i<students.length;i++) {
//			students[i] = s(i+1);
//		}
		//上面的做法是有问题的
		
		for(int i =0;i<students.length;i++) {
			//System.out.println(students[i]);
			
			//下边的做法更灵活，可以获取自己需要的值而不是全部输出
			Student s = students[i];
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
	}
}
