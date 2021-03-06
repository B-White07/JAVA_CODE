package cn.it_03;

/*
 * int类型和String类型相互转换
 * 
 * int -- String
 * 		String.valueOf(number)
 * 
 * String -- int
 * 		Integer.parseInt(s)
 */
public class IntegerDemo {
	public static void main(String[] args) {
		// int -- String
		int number = 100;

		// 方式一
		String s1 = "" + number;
		System.out.println("s1:" + s1);

		// 方式二
		String s2 = String.valueOf(number);
		System.out.println("s2:" + s2);

		// 方式三
		// int -- Integer --String
		Integer i = new Integer(number);
		String s3 = i.toString();
		System.out.println("s3:" + s3);

		// 方式四
		// public static String toString(int i)
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);
		System.out.println("--------------");

		// String -- int
		String s = "100";
		// 方式一
		// String -- Integer --int
		Integer ii = new Integer(s);
		// public int intValue()
		int x = ii.intValue();
		System.out.println("x:" + x);

		// 方式二
		// public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println("y:" + y);
	}
}
