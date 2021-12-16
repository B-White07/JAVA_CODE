package cn.sut_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * 要求：不能创建新的集合，就在以前的集合上做。
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

		// 类比选择排序的思想，做这个题目
		// 拿0索引和后面的一次比较，有重复就删掉
		// 拿1索引。。。。
		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i).equals(array.get(j))) {
					array.remove(j);
					//如果仅仅上述操作，那么遇到连续的重复元素，无法删除，所以将每次将索引返回原位置判断一下
					j--;
				}
			}
		}

		// 遍历
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}

	}
}
