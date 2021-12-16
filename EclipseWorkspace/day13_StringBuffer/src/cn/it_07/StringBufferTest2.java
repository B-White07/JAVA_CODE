package cn.it_07;

/*
 * 把数组拼接成字符串
 */
public class StringBufferTest2 {
	public static void main(String[] ages) {
		int[] arr = { 5, 2, 7, 6, 5, 3 };

		// 定义功能
		// 方式一：用String做拼接
		String s = arrToString(arr);
		System.out.println("s:" + s);

		// 方式二：用StringBuffer做拼接
		String s2 = arrToString2(arr);
		System.out.println("s2:" + s2);
	}

	public static String arrToString(int[] arr) {
		String s = "";

		s += "[ ";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i];
				s += " ]";
			} else {
				s += arr[i];
				s += ", ";
			}
		}

		return s;

	}

	public static String arrToString2(int[] arr) {
		StringBuffer sb = new StringBuffer("");

		sb.append("[ ");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]).append(" ]");
			} else {
				sb.append(arr[i]).append(", ");
			}
		}

		return sb.toString();

	}

}
