package cn.sut_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 * Ҫ�󣺲��ܴ����µļ��ϣ�������ǰ�ļ���������
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("java");
		array.add("java");
		array.add("world");
		array.add("java");

		// ���ѡ�������˼�룬�������Ŀ
		// ��0�����ͺ����һ�αȽϣ����ظ���ɾ��
		// ��1������������
		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i).equals(array.get(j))) {
					array.remove(j);
					//�������������������ô�����������ظ�Ԫ�أ��޷�ɾ�������Խ�ÿ�ν���������ԭλ���ж�һ��
					j--;
				}
			}
		}

		// ����
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}
}
