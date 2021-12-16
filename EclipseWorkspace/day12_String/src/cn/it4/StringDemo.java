package cn.it4;
/*
 * String 类的获取功能
 * int length(): 获取字符串长度
 * char charAt(int index): 获取指定索引位置的字符
 * int indexOf(int ch): 返回指定字符在此字符串中第一次出现的索引
 * 		为什么是int类型，而不是char类型
 * 		原因是：'a'和97都能代表'a' ，这样方便
 * int indexOf(String str): 返回指定字符串在此字符串中第一次出现的索引
 * int indexOf(int ch,int fromIndex): 返回指定字符在此字符串中从指定位置后第一次出现的索引
 * int indexOf(String str,int fromIndex): 返回指定字符串在此字符串中从指定位置后第一次出现的索引
 * String substring(int start): 从指定位置开始截取字符串，默认到末尾，包括start
 * String substring(int start,int end): 从指定位置开始到指定位置结束截取字符串，包左不包右
 */
public class StringDemo {
	public static void main(String[] args) {
		String s ="helloworld";
		
		//int length(): 获取字符串长度
		System.out.println("length():" + s.length());
		System.out.println("-----------------------");
		
		//char charAt(int index): 获取指定索引位置的字符
		System.out.println("charAt():" + s.charAt(2));
		System.out.println("-----------------------");
		
		//int indexOf(int ch): 返回指定字符在此字符串中第一次出现的索引
		System.out.println("indexOf():" + s.indexOf('w'));
		System.out.println("-----------------------");
		
		//int indexOf(String str): 返回指定字符串在此字符串中第一次出现的索引
		System.out.println("indexOf():" + s.indexOf("ell"));
		System.out.println("-----------------------");
		
		//int indexOf(int ch,int fromIndex): 返回指定字符在此字符串中从指定位置后第一次出现的索引
		System.out.println("indexof():" + s.indexOf('l',3));
		System.out.println("indexof():" + s.indexOf('l',4));
		System.out.println("indexof():" + s.indexOf('h',3)); //-1
		System.out.println("indexof():" + s.indexOf('l',30)); //-1
		System.out.println("-----------------------");
		
		//int indexOf(String str,int fromIndex): 返回指定字符串在此字符串中从指定位置后第一次出现的索引
		System.out.println("indexof():" + s.indexOf("lo",3));
		System.out.println("indexof():" + s.indexOf("llo",3)); //-1
		System.out.println("indexof():" + s.indexOf("lo",30)); //-1
		System.out.println("-----------------------");
		
		//String substring(int start): 从指定位置开始截取字符串，默认到末尾，包括start
		System.out.println("substring():" + s.substring(5));
		System.out.println("-----------------------");
		
		//String substring(int start,int end): 从指定位置开始到指定位置结束截取字符串，包左不包右
		System.out.println("substring():" + s.substring(5,9)); //worl
		System.out.println("substring():" + s.substring(5,10)); //world
		System.out.println("substring():" + s.substring(5,s.length()));
		
	}
}
