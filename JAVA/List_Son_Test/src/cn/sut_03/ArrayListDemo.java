package cn.sut_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
* 
* ������
* 		A:��������¼�����ݶ���
* 		B:����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
* 		C:��0����,����򵥣�ֻҪ����¼���������0���ҾͲ�����¼��������
* 		D:�Ѽ���ת������
* 		E:����������
* 		F:��ȡ�������е����������ֵ
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			System.out.println("���������ݣ�");
			int num = sc.nextInt();
			if (num != 0) {
				list.add(num);
			} else {
				break;
			}
		}

		// �Ѽ���ת��������
		// public <T> T[] toArray(T[] a)
		Integer[] i = new Integer[list.size()];
		// Integer[] ii = list.toArray(i);���з���ii��i�ĵ�ֵַ��ͬ��˵����ͬһ������
		list.toArray(i);
		// System.out.println(i);
		// System.out.println(ii);

		// ����������
		// public static void sort(Object[] a)
		Arrays.sort(i);

		// ��ȡ���ֵ
		System.out.println("����" + listToString(i) + " �����ֵ�ǣ�\n" + i[i.length - 1]);
	}

	public static String listToString(Integer[] i) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int j = 0; j < i.length; j++) {
			if (j == i.length - 1) {
				sb.append(i[j]).append("]");
			} else {
				sb.append(i[j]).append(", ");
			}
		}
		return sb.toString();
	}
}
