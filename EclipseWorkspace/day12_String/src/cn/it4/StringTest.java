package cn.it4;

/*
 * 需求：遍历获取字符串中的每一个字符
 * 
 * 分析：
 * 	如何拿到每一个字符：
 * 		char charAt(int index);
 * 	则么知道有多少个字符
 * 		int length();
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "hello world";
		
		// for循环
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}
}
