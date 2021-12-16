package cn.it7;

/*
 * 需求，把数组中的数据按照指定格式拼接成一个字符串
 * 
 * 例如：
 * 		int arr[] = {1,2,3};
 * 输出：
 * 		[1, 2, 3]
 * 分析：
 * 		A:定义一个空字符串对象
 * 		B:先把字符串拼接一个"["
 * 		C:遍历int数组，得到每一个元素
 * 		D:判断该元素是否为最后一个
 * 			是：拼接元素和"]"
 * 			不是：拼接元素以及逗号和空格
 * 		E:输出拼接后的字符串
 */
public class StringTest {
	public static void main(String[] args) {
		// 定义数组
		int arr[] = { 1, 2, 3 };
		// 定义空字符串并拼接左括号
		String s = "";
		s += "[";

		// 遍历数组获得元素
		for (int i = 0; i < arr.length; i++) {
			//先判断是否为最后一个
			if (i == (arr.length - 1)) {
				s += arr[i];
				s += "]";
				//return;
			} else {
				s += arr[i];
				s += ", ";
			}
			// return ;
		}

		System.out.println("结果是：" + s);
	}
}
