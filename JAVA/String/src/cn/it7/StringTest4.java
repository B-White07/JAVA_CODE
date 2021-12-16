package cn.it7;

/*
 * 统计大串中，小串出现的次数
 * 举例：
 * 		"woaijavawozhendeaijavawozhendehenaijava"
 * 结果：
 * 		java出现了3次
 * 
 * 分析：
 * 		A:先定义统计变量，初始值为0
 * 		B:获取指定字符串在大串中首次出现的位置
 * 			索引是-1：说明不存在，返回统计变量
 * 			索引不是-1，说明存在，统计变量++
 * 		C:将返回的索引+小串的长度作为起始位置截取大串，得到一个新字符串，并将新字符串赋值给大串
 * 		D:回到B
 */
public class StringTest4 {
	public static void main(String[] args) {

		String bigString = "woaijavawozhendeaijavawozhendehenaijava";
		String smallString = "java";

		// 功能实现
		System.out.println(smallString + " 出现了" + getCount(bigString,smallString) + "次");
	}

	/*
	 * 两个明确： 1.返回值类型：int 2.参数列表：String str1,String str2
	 */
	public static int getCount(String bigString, String smallString) {
		int count = 0;

		// 找到首次出现的位置
		int index = bigString.indexOf(smallString);

		//索引不是-1，说明存在，进入循环，
		while (index != -1) {
			
			count++;
			//获取截取位置，并截取新的字符串
			int startIndex = index + smallString.length();
			bigString = bigString.substring(startIndex);
			//继续查找
			index = bigString.indexOf(smallString);
			
		}
		
		return count;
	}
}
