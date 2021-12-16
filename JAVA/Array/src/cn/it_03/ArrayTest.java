package cn.it_03;

/*
 * 把字符串中的字符进行排序。
 * 		举例："dacgebf"
 * 		结果："abcdefg"
 * 
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串转换为字符数组
 * 		C:把字符数组进行排序
 * 		D:把排序后的字符数组转成字符串
 * 		E:输出最后的字符串
 */
public class ArrayTest {
	public static void main(String[] args) {
		String s = "dacgebf";
		char[] chs = s.toCharArray();
		bubbleSort(chs);
		String result = String.valueOf(chs);
		System.out.println("结果是：" + result);
	}

	public static void bubbleSort(char[] chs) {
		for (int x = 0; x < chs.length - 1; x++) {
			for (int i = 0; i < chs.length - 1 - x; i++) {
				if (chs[i] > chs[i + 1]) {
					char temp = chs[i + 1];
					chs[i + 1] = chs[i];
					chs[i] = temp;
				}
			}
		}
	}
}
