package cn.it4;

import java.util.Scanner;

/* ctrl shift f:标准化代码		ctrl shift o:导包
 * 需求：统计一个字符串中，大小写字母以及数字出现的次数，不考虑其他字符；
 * 
 * 例如：
 * 		"Hello123World"
 * 		大写字符  2个
 * 		小写字符  8个
 * 		数字字符  3个
 * 
 * 分析：
 * 		定义三个统计变量：
 * 				bigCount=0
 * 				smallCount=0
 * 				numberCount=0
 * 		遍历字符串，获取每一个字符：
 * 				char charAt()   int length()
 * 		判断字符的类型：
 * 				bigCount++
 * 				smallCount++
 * 				numberCount++
 * 		如何判断：
 * 			1.	ACSLL码表:				2.	char ch = s.charAt(i);
 * 						0	48				if(ch >= '0' && ch <= '9')
 * 						A	65				if(ch >= 'A' && ch <= 'Z')
 * 						a	97				if(ch >= 'a' && ch <= 'z')
 */
public class StringTest2 {
	public static void main(String[] args) {
		
		//自定义字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您想统计的字符串：");
		String s = sc.nextLine();

		//初始化变量
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		//统计个数
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				numberCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			}
		}
		
		//输出
		System.out.println("大写字符有" + bigCount + "个");
		System.out.println("小写字符有" + smallCount + "个");
		System.out.println("数字字符有" + numberCount + "个");

	}
}
