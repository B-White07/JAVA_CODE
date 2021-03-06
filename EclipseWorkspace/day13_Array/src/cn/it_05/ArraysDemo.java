package cn.it_05;

import java.util.Arrays;

/*
 * Arrays:针对数组进行操作的工具类。比如说排序和查找。
 * 1:public static String toString(int[] a) 把数组转成字符串
 * 2:public static void sort(int[] a) 对数组进行排序
 * 3:public static int binarySearch(int[] a,int key) 二分查找
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//定义数组
		int[] arr =  { 24, 69, 80, 57, 13 };
		
		//public static String toString(int[] a) 把数组转成字符串
		System.out.println("排序前：" + Arrays.toString(arr));
		
		//public static void sort(int[] a) 对数组进行排序
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));
		
		//public static int binarySearch(int[] a,int key) 二分查找
		System.out.println("排序后：" + Arrays.binarySearch(arr,80));
		System.out.println("排序后：" + Arrays.binarySearch(arr,800));
		
	}
}
