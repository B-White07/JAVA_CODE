package cn.it_02;

/*
 * Integer�Ĺ��췽��
 * public Integer(int value)
 * public Integer(String s)
 * 			ע�⣬����ַ��������������ַ����
 */
public class IngeterDemo {
	public static void main(String[] args) {
		// public Integer(int value)
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii:" + ii);

		// public Integer(String s)
		String s = "100";
		// String s = "a";//NumberFormatException
		Integer iii = new Integer(s);
		System.out.println("iii:" + iii);
	}
}
