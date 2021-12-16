package cn.it_04;

/*
 * ���ң�
 * 		��������:����Ԫ������(��ͷ�ҵ�β)
 * 		���ֲ���(�۰����):����Ԫ������
 * 
 * ������
 * 		A:���������������С����
 * 		B:������м�����
 * 		C:���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
 * 			��ȣ��ͷ��ص�ǰ���м�����
 * 			����ȣ�
 * 				��	�����
 * 				С	�ұ���
 * 		D:���¼�����м�����
 * 			��	�����
 * 				max = mid - 1;
 * 			С	�ұ���
 * 				min = mid + 1;
 * 		E:�ص�B
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77 };

		int index = getIndex(arr, 33);
		System.out.println("index:" + index);
		
		index = getIndex(arr, 333);
		System.out.println("index:" + index);

	}

	/*
	 * ����ֵ���ͣ�int �����б�int[] arr,int value
	 */
	public static int getIndex(int[] arr, int value) {
		// TODO Auto-generated method stub
		// ���������С����
		int min = 0;
		int max = arr.length - 1;

		// �����м�����
		int mid = (min + max) / 2;

		// ���м�������Ԫ�غ�Ҫ���ҵ�ֵ���бȽ�
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}
			
			//�����жϣ��Ҳ�������-1
			if(min>max) {
				return -1;
			}
			
			mid = (min + max) / 2;
			

		}

		return mid;
	}

}
