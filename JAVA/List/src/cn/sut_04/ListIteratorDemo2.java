package cn.sut_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 问题?
 * 		我有一个集合，如下，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
 * 
 * ConcurrentModificationException:当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 
 * 产生的原因：
 * 		迭代器是依赖于集合而存在的，在判断成功后，集合的中新添加了元素，而迭代器却不知道，所以就报错了，这个错叫并发修改异常。
 * 		其实这个问题描述的是：迭代器遍历元素的时候，通过集合是不能修改元素的。
 * 如何解决呢?
 * 		A:迭代器迭代元素，迭代器修改元素
 * 			元素是跟在刚才迭代的元素后面的。
 * 		B:集合遍历元素，集合修改元素(普通for)
 * 			元素在最后添加的。
 */

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		List list = new ArrayList();
		
		//添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//通过集合对象创建迭代器对象，并遍历集合
//		ListIterator lit = list.listIterator();
//		while(lit.hasNext()) {
//			String s = (String)lit.next();
//			if("world".equals(s)) {
//				list.add("javaee");
//			}
//			System.out.println(s);
//		}
		
		//方式一：迭代器迭代元素，迭代器修改元素
		//而Iterator没有add方法，所以使用其子接口ListIterator
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			String s = (String)lit.next();
			if("world".equals(s)) {
				lit.add("javaee");
			}
		}
		
		//方式二：集合遍历元素，集合修改元素(普通for)
//		for(int i = 0;i<list.size();i++) {
//			String s = (String)list.get(i);
//			if("world".equals(s)) {
//				list.add("javaee");
//			}
//		}
		
		System.out.println("list:" + list);
	}
}
