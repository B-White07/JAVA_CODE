package cn.it7;

import java.util.Scanner;

/*
 * 字符串反转
 * 
 * 举例：  键盘录入"abc"
 * 		输出结果"cba"
 * 
 * 分析：
 * 		A:键盘录入字符串
 * 		B:定义新字符串
 * 		C:倒序遍历字符串，得到每一个字符
 * 			1.length() 和 charAt()结合
 * 			2.将字符串转换成字符数组
 * 		D:用新字符串将每一个字符拼接起来
 * 		E:输出新串
 */
public class StringTest3 {
	public static void main(String[] args0) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要转换的字符串：");
		String line = sc.nextLine();

		/*
		// 定义空串
		String result = "";

		// 把字符串转换成字符数组
		char[] arr = line.toCharArray();

		// 倒序遍历
		for (int i = (arr.length - 1); i >= 0; i--) {
			result += arr[i];
		}

		// 输出
		System.out.println("倒叙后的结果是：" + result);
		*/
		
		//调用方法
		System.out.println("调用方法的结果： " + daoXu(line));
	}

	/*
	 * 封装成方法 两个明确：1.返回值类型: String 2.参数列表:String s
	 */
	public static String daoXu(String s) {
		// 定义空串
		String result = "";

		// 把字符串转换成字符数组
		char[] arr = s.toCharArray();

		// 倒序遍历
		for (int i = (arr.length - 1); i >= 0; i--) {
			result += arr[i];
		}

		// 输出
		return result;
	}
}
