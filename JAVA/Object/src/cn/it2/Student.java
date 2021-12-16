package cn.it2;

public class Student {
		private String name;
		private int age;
		
		public Student() {
			super();
		}
		
		public Student(String name,int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
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

		public boolean equals(Object obj) {
			//为了提高效率，同一个对象不需要比较
			if (this == obj) {
				return true;
			}
			
			//为了提高程序的健壮性
			//判断obj是不是学生类的对象，如果是，继续向下转型；如果不是，直接返回false
			
			if(!(obj instanceof Student)) {
				return false;
			}
			
			//return true;
			Student s = (Student)obj;  //多态父类无法访问子类特有成员，如需访问需要向下转型
/*			if(this.name.equals(s.name) && this.age == s.age) {
				return true;
			}else {
			return false;
		}
*/			System.out.println("同一个对象，还需要向下转型并且比较吗");
			return this.name.equals(s.name) && this.age == s.age;
		}
		
		
		
		
		
}

