package cn.it_04;

/*
 * ע�⣺���������������������
 * ��Ϊ���鱾��������ģ���������²���ʹ�ö��ֲ���
 * ��Ȼ�Ƚ��������򣬵���������Ѿ��ı�������ԭʼ��Ԫ������
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };

		// ����������
		bubbleSort(arr);
		
		System.out.println("s:" + arrayToString(arr));

		// ����Ԫ��
		int index = getIndex(arr, 80);
		System.out.println("index:" + index);
	}

	// ��������
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

	// ���ֲ���
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

	// ð������
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
