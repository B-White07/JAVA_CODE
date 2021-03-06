package cn.sut_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator():迭代器，集合的专用遍历方式
 * 		Object next():获取元素,并移动到下一个位置。
 * 			NoSuchElementException：没有这样的元素，因为你已经找到最后了。
 * 		boolean hasNext():如果仍有元素可以迭代，则返回 true。（
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

		Iterator it = c.iterator();// 实际返回子类对象，这里是多态

//		Object obj  = it.next();
//		System.out.println(obj);

//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//NoSuchElementException

		while (it.hasNext()) {
			// System.out.println(it.next());
			String s = (String)it.next();
			System.out.println(s);
		}
	}
}
