package cn.it_05;

import java.util.Arrays;

/*
 * Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ�
 * 1:public static String toString(int[] a) ������ת���ַ���
 * 2:public static void sort(int[] a) �������������
 * 3:public static int binarySearch(int[] a,int key) ���ֲ���
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//��������
		int[] arr =  { 24, 69, 80, 57, 13 };
		
		//public static String toString(int[] a) ������ת���ַ���
		System.out.println("����ǰ��" + Arrays.toString(arr));
		
		//public static void sort(int[] a) �������������
		Arrays.sort(arr);
		System.out.println("�����" + Arrays.toString(arr));
		
		//public static int binarySearch(int[] a,int key) ���ֲ���
		System.out.println("�����" + Arrays.binarySearch(arr,80));
		System.out.println("�����" + Arrays.binarySearch(arr,800));
		
	}
}
