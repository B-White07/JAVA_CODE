package cn.sut_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
* 
* 分析：
* 		A:创建键盘录入数据对象
* 		B:键盘录入多个数据,我们不知道多少个，所以用集合存储
* 		C:以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
* 		D:把集合转成数组
* 		E:对数组排序
* 		F:获取该数组中的最大索引的值
*/
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			System.out.println("请输入数据：");
			int num = sc.nextInt();
			if (num != 0) {
				list.add(num);
			} else {
				break;
			}
		}

		// 把集合转化成数组
		// public <T> T[] toArray(T[] a)
		Integer[] i = new Integer[list.size()];
		// Integer[] ii = list.toArray(i);运行发行ii与i的地址值相同，说明是同一个对象
		list.toArray(i);
		// System.out.println(i);
		// System.out.println(ii);

		// 对数组排序
		// public static void sort(Object[] a)
		Arrays.sort(i);

		// 获取最大值
		System.out.println("数组" + listToString(i) + " 的最大值是：\n" + i[i.length - 1]);
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
