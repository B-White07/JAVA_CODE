package cn.sut_01;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5�������ԣ��Զ���װ��,����,��ǿfor,��̬����,�ɱ����,ö��
 * 
 * ��ǿfor:��forѭ����һ�֡�
 * 
 * ��ʽ��
 * 		for(Ԫ���������� ���� : �������Collection����) {
 *			ʹ�ñ������ɣ��ñ�������Ԫ��
 *   	}
 *   
 * �ô�����������ͼ��ϵı�����
 * 
 * �׶ˣ� ��ǿfor��Ŀ�겻��Ϊnull��
 * ��ν����?����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ����ʹ�á�
 */
public class ForDemo {
	public static void main(String[] args) {
		// ����һ��int����
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------");
		// ��ǿfor
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("-----------");

		// ����һ���ַ�������
		String[] str = { "lzw", "lzw2", "lzw3" };
		// ��ǿfor
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println("-----------");

		// ����һ������
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		for (String s : array) {
			System.out.println(s);
		}
		System.out.println("-----------");

		List<String> list = null;
		//NullPointerException
		//���s���Ǵ�list�л�ȡ�ģ��ڻ�ȡǰ��һ����Ҫ��һ���ж�
		//��ʵ����ǵ������Ĺ���
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			}
		}
		
		//��ǿ�������������������
		//ConcurrentModificationException:�����޸��쳣���������ü����޸ļ��ϣ�����������������޸ļ���
		for (String s : array) {
			if("world".equals(s)) {
				array.add("javaee");
			}
			System.out.println("array:" + array);
		}
	}
}
