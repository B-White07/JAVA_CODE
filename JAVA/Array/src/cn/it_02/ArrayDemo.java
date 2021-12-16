package cn.it_02;

/*
 * 数组排序之选择排序：
 * 		从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		printArray(arr);

		/*
		 * // 第一次排序 int i = 0; for (int j = i + 1; j < arr.length; j++) { if (arr[i] >
		 * arr[j]) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("第一次排序后："); printArray(arr);
		 * 
		 * // 第二次 i = 1; for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j])
		 * { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("第二次排序后："); printArray(arr);
		 * 
		 * // 第三次 i = 2; for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j])
		 * { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("第三次排序后："); printArray(arr);
		 * 
		 * // 第四次 i = 3; for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j])
		 * { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("第四次排序后："); printArray(arr);
		 */

		/*
		// 用循环改进
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		*/
		selectSort(arr);
		System.out.println("排序后：");
		printArray(arr);

		// 包装成方法

	}

	// 选择排序
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	// 数组的便遍历
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
