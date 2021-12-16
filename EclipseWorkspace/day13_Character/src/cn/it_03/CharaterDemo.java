package cn.it_03;

import java.util.Scanner;

/*
 * 统计一个字符串中，大写字符、小写字符、数字字符出现的次数
 * 
 * 分析：
 * 		A:定义统计变量
 * 			int bigCount;
 * 			int smallCount;
 * 			int numberCount;
 * 		B:键盘录入字符串
 * 		C:将字符串转换成字符数组
 * 		D:遍历该字符数组获取每一个字符
 * 		E:如果该字符是
 * 			大写字符	bigCount++
 * 			小写字符	smallCount++
 * 			数字字符	numberCount++
 * 		G:输出统计变量
 */
public class CharaterDemo {
	public static void main(String[] args) {
		//定义统计变量
		int bigCount = 0;
		int samllCount = 0;
		int numberCount = 0;
		
		//键盘录入字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String s = sc.nextLine();
		
		//将字符串转换成字符数组
		char[] chs = s.toCharArray();
		
		//遍历该字符数组获取每一个字符
		for(int i = 0;i<chs.length;i++) {
			char ch = chs[i];
			
			//判断该字符
			if(Character.isUpperCase(ch)) {
				bigCount++;
			}else if(Character.isLowerCase(ch)) {
				samllCount++;
			}else if(Character.isDigit(ch)){
				numberCount++;
			}
		}
		
		//输出统计变量
		System.out.println("大写字符有" + bigCount + "个");
		System.out.println("小写字符有" + samllCount + "个");
		System.out.println("数字字符有" + numberCount + "个");
		
	}
}
