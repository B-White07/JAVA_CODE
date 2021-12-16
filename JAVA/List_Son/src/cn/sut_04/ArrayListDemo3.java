package cn.sut_04;

/*
 * ����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 * 
 * ���ǰ��պ��ַ���һ���Ĳ��������ֳ������ˡ�
 * Ϊʲô��?
 * 		���Ǳ���˼������������?
 * 		ͨ���򵥵ķ���������֪��������������ж��ϡ�
 * 		������жϹ����Ǽ����Լ��ṩ�ģ��������������������֪����������жϵģ���Ӧ��ȥ��Դ�롣
 * contains()�����ĵײ���������equals()������
 * �����ǵ�ѧ������û��equals()���������ʱ��Ĭ��ʹ�õ���������Object��equals()����
 * Object()��equals()Ĭ�ϱȽϵ��ǵ�ֵַ�����ԣ����ǽ�ȥ�ˡ���Ϊnew�Ķ�������ֵַ����ͬ��
 * ���������Լ������󣬱Ƚϳ�Ա������ֵ����дequals()���ɡ�
 * �Զ����ɼ��ɡ�
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();

		Student s1 = new Student("lzw", 20);
		Student s2 = new Student("lzw2", 21);
		Student s3 = new Student("lzw3", 22);
		Student s4 = new Student("lzw4", 23);
		Student s5 = new Student("lzw", 22);
		Student s6 = new Student("lzw", 20);
		Student s7 = new Student("lzw5", 20);

		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		ArrayList newArray = new ArrayList();
		for (int i = 0; i < array.size(); i++) {
			if (!newArray.contains(array.get(i))) {
				newArray.add(array.get(i));
			}
		}
		
		Iterator it = newArray.iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s.getName()+ "---" + s.getAge());
		}
	}
}
