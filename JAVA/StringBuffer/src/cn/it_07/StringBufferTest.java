package cn.it_07;

/*
 * 类之间的转换：
 * A -- B
 * 将A转换成B，是想用B中的方法
 * B -- A
 * 将B转回A,是因为想要的结果是A类型
 * 
 * StringBuffer和String的相互转换
 */
public class StringBufferTest {
	public static void main(String[] aegs) {
		// String -- StringBuffer
		String s = "hello";
		//不能直接把字符串赋值给StringBuffer
//		StringBuffer sb = "hello";
//		StringBuffer sb = s;
		
		//方法一：通过构造方法
		StringBuffer sb = new StringBuffer("hello");
		//方法二：通过append()方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello");
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("----------");
		
		//StringBuffer -- String
		StringBuffer buffer = new StringBuffer("java");
		//String(StringBuffer buffer)
		//方式一:通过构造方法
		String str = new String(buffer);
		//方式二：通过toString()方法
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
		System.out.println("----------");
		
	}
}
