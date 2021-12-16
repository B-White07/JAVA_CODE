package sut;

/**
 * @author Administrator
 * 变量的运用
 */
public class DynamicValue {
	/**
	 * @param args
	 * 入口方法
	 */
	public static void main(String[] args) {
		/*
		 * int:整数
		 * double:小数
		 * 定义变量  int：数据类型    a：变量名  10:初始值
		 */
		int a=20;
		System.out.println(a);
		/*
		 * 因为如下代码不是定义变量。
		 * 作用：对变量重新赋值
		 */
		a=50;
		System.out.println("a的值是");
		System.out.println(a);
	}
}