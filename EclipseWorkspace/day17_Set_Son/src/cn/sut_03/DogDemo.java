package cn.sut_03;

import java.util.HashSet;

/*
 * HashSet集合存储自定义对象并遍历。如果对象的成员变量值相同即为同一个对象
 * 
 * 注意了：
 * 		你使用的是HashSet集合，这个集合的底层是哈希表结构。
 * 		而哈希表结构底层依赖:hashCode()和equals()方法。
 * 		如果你认为对象的成员变量值相同即为同一个对象的话，你就应该重写这两个方法。
 * 		如何重写呢?不同担心，自动生成即可。
 */
public class DogDemo {
	public static void main(String[] args) {
		// 创建集合对象
		HashSet<Dog> hs = new HashSet<Dog>();

		// 创建并添加元素
		hs.add(new Dog("lzw", 20, "黑色", '男'));
		hs.add(new Dog("lzw", 20, "黑色", '女'));
		hs.add(new Dog("lzw", 20, "黑色", '男'));
		hs.add(new Dog("lzw1", 22, "白色", '男'));
		hs.add(new Dog("lzw2", 20, "白色", '女'));
		hs.add(new Dog("lzw3", 20, "黑色", '男'));
		hs.add(new Dog("lzw3", 20, "黑色", '男'));
		hs.add(new Dog("lzw4", 27, "青色", '男'));

		// 遍历集合
		for (Dog d : hs) {
			System.out.println(d.getName() + "---" + d.getAge() + "---" + d.getColor() + "---" + d.getSex());
		}
	}
}
