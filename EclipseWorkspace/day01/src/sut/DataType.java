package sut;

/**FileName:	com.etc 	DataType.java
 * TODO:		
 * Copyright:	Copyright (c) 2015-2016 All Rights Reserved. Company: 01skill-soft.com Inc.
 * @author: 	老张
 * @Date:		2020年5月26日:下午2:37:58
 * @version: 	1.0
 * 
 *           Modification History: Date			Author 		Version 	Description
 *           ----------------------------------------------------------------------
 *           					   2020年5月26日 	老张	 		1.0 		1.0 Version
 * 
 */
public class DataType {
	/**
	 * @TODO	 :
	 * @Date	 :2020年5月26日 下午2:47:44
	 * @Author	 :老张
	 * @param args   :
	 * byte类型   short类型   int 类型    long类型
	 * 注意：java 整数常量默认是int型。要表达long类型数据必须用 L |  l结尾
	 */
	public static void main(String[] args) {
		byte a=100;
		System.out.println("a="+a);
		short b=500;
		System.out.println("b="+b);	
		int c=1000;
		System.out.println("c="+c);	
		long d=1500L;
		System.out.println("d="+d);	
	}
}