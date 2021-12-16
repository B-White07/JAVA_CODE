package cn.it1;
import java.util.Scanner;

public class ScannerDemo {
		public static void main(String[] args) {
			//创建对象
			Scanner sc = new Scanner(System.in);
			//通过分析System.in，判断出来调用的是什么方法 
			int x = sc.nextInt();
			System.out.println("x is:" + x);
		}
}
