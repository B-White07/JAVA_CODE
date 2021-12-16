package cn.it_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 		获取功能:
 * 		获取下面字符串中，由三个字母组成的单词
 * 		da jia ting wo shuo,jin tian xia yu,wan zi xi bu shang le
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian xia yu,wan zi xi bu shang le";

		// 规则
		String regex = "\\b\\w{3}\\b"; // \\b表示字符边界，即非字母字符

		// 把规则编译成模式对象
		Pattern p = Pattern.compile(regex);
		// 通过模式对象得到匹配器对象
		Matcher m = p.matcher(s);
		//调用匹配器对象的功能
		//通过public boolean find()方法查找有没有符合条件的子字符串
//		boolean flag = m.find();
//		System.out.println(flag);
//		
//		//public String group()
//		String result = m.group();
//		System.out.println(result);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		//IllegalStateException
		//所以一定要先find(),然后才能group()
		//System.out.println(m.group());

	}
}
