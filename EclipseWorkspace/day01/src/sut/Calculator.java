package sut;

/**FileName:	com.etc 	Calculator.java
 * TODO:		
 * Copyright:	Copyright (c) 2015-2016 All Rights Reserved. Company: 01skill-soft.com Inc.
 * @author: 	老张
 * @Date:		2020年5月26日:下午4:01:35
 * @version: 	1.0
 * 
 *           Modification History: Date			Author 		Version 	Description
 *           ----------------------------------------------------------------------
 *           					   2020年5月26日 	老张	 		1.0 		1.0 Version
 * 
 */
public class Calculator {
	/**
	 * @TODO	 :算数运算符
	 * @Date	 :2020年5月26日 下午4:01:57
	 * @Author	 :老张
	 * @param args   :
	 */
	public static void main(String[] args) {
		int a=10;
		a=20+1;
		System.out.println(a);
		
		int b=20;
		b=30-15;
		System.out.println(b);
		
		int c=40;
		c=40*0;
		System.out.println(c);
		
		int d=50;
		d=9/2;//java中/运算 返回两个数相除之后的整数部分
		System.out.println(d);
		
		int e=60;
		e=9%2;//java中模运算  返回两个数相除之后的余数部分
		System.out.println(e);
	}
}