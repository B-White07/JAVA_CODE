package cn.it_02;

/*
 * ��������֮ѡ������
 * 		��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("����ǰ��");
		printArray(arr);

		/*
		 * // ��һ������ int i = 0; for (int j = i + 1; j < arr.length; j++) { if (arr[i] >
		 * arr[j]) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("��һ�������"); printArray(arr);
		 * 
		 * // �ڶ��� i = 1; for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j])
		 * { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("�ڶ��������"); printArray(arr);
		 * 
		 * // ������ i = 2; for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j])
		 * { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("�����������"); printArray(arr);
		 * 
		 * // ���Ĵ� i = 3; for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j])
		 * { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; } }
		 * System.out.println("���Ĵ������"); printArray(arr);
		 */

		/*
		// ��ѭ���Ľ�
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
		System.out.println("�����");
		printArray(arr);

		// ��װ�ɷ���

	}

	// ѡ������
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

	// ����ı����
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
