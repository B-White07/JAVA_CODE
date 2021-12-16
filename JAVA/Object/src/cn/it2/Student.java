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
			//Ϊ�����Ч�ʣ�ͬһ��������Ҫ�Ƚ�
			if (this == obj) {
				return true;
			}
			
			//Ϊ����߳���Ľ�׳��
			//�ж�obj�ǲ���ѧ����Ķ�������ǣ���������ת�ͣ�������ǣ�ֱ�ӷ���false
			
			if(!(obj instanceof Student)) {
				return false;
			}
			
			//return true;
			Student s = (Student)obj;  //��̬�����޷������������г�Ա�����������Ҫ����ת��
/*			if(this.name.equals(s.name) && this.age == s.age) {
				return true;
			}else {
			return false;
		}
*/			System.out.println("ͬһ�����󣬻���Ҫ����ת�Ͳ��ұȽ���");
			return this.name.equals(s.name) && this.age == s.age;
		}
		
		
		
		
		
}

