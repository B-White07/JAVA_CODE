package cn.it_01;

/*
 * ��������֮ð������
 * 		����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("����ǰ��");
		printArray(arr);

		/*
		// ��һ�αȽ�
		// Ϊ�˷�ֹ����Խ�磬ÿ�ζ�Ҫ-1
		for (int i = 0; i < arr.length - 1 - 0; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println("��һ�αȽϺ�");
		printArray(arr);

		// �ڶ��αȽ�
		// Ϊ�˷�ֹ����Խ�磬ÿ�ζ�Ҫ-1
		for (int i = 0; i < arr.length - 1 - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println("�ڶ��αȽϺ�");
		printArray(arr);

		// �����αȽ�
		// Ϊ�˷�ֹ����Խ�磬ÿ�ζ�Ҫ-1
		for (int i = 0; i < arr.length - 1 - 2; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println("�����αȽϺ�");
		printArray(arr);

		// ���ĴαȽ�
		// Ϊ�˷�ֹ����Խ�磬ÿ�ζ�Ҫ-1
		for (int i = 0; i < arr.length - 1 - 3; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println("���ĴαȽϺ�");
		printArray(arr);
		*/
		
		/*
		// ���������ظ��Ⱥܸߣ���ѭ���Ľ�
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println(" �����");
		printArray(arr);
		*/
		
		//��װ�ɷ���
		bubbleSort(arr);
		System.out.println(" �����");
		printArray(arr);
		
	}

	public static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	// ��������
	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
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
