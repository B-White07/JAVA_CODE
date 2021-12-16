package cn.it_04;

/*
 * 注意：下面这种做法是有问题的
 * 因为数组本身是无序的，这种情况下不能使用二分查找
 * 虽然先进行了排序，但是排序后已经改变了数组原始的元素索引
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };

		// 将数组排序
		bubbleSort(arr);
		
		System.out.println("s:" + arrayToString(arr));

		// 查找元素
		int index = getIndex(arr, 80);
		System.out.println("index:" + index);
	}

	// 遍历数组
	public static String arrayToString(int[] arr) {
		String s = "";
		s += "[";
		for (int i = 0; i < arr.length; i++) {
			
			if (i == arr.length - 1) {
				s += arr[i];
				s += "]";
			} else {
				s += arr[i];
				s += ", ";
			}
		}
		return s;
	}

	// 二分查找
	public static int getIndex(int[] arr, int value) {
		// TODO Auto-generated method stub
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;

		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}

			if (min > max) {
				return -1;
			}
			
			mid = (max + min) / 2;
		}
		return mid;
	}

	// 冒泡排序
	public static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
