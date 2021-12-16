package cn.it_03;

public class RegesDemo2 {
	public static void main(String[] args) {
		//定义字符串
		String s1 ="aa,bb,cc";
		
		//直接分割
		String[] str1Array = s1.split(",");
		for (int i = 0;i<str1Array.length;i++) {
			System.out.println(str1Array[i]);
		}
		System.out.println("-----------------");
		
		String s2 = "aa.bb.cc";
		String[] str2Array = s2.split("\\.");
		for (int i = 0;i<str2Array.length;i++) {
			System.out.println(str2Array[i]);
		}
		System.out.println("-----------------");
		
		String s3 = "aa   bb            cc";
		String[] str3Array = s3.split(" +");
		for (int i = 0;i<str3Array.length;i++) {
			System.out.println(str3Array[i]);
		}
		System.out.println("-----------------");
		
		//硬盘上的路径应该用\\替代\
		String s4 = "D:\\RainyDay\\java\\java 资料\\java 教程\\Java14\\code\\day14_Regex\\src\\cn\\itcast_03";
		String[] str4Array = s4.split("\\\\");
		for (int i = 0;i<str4Array.length;i++) {
			System.out.println(str4Array[i]);
		}
		System.out.println("-----------------");
	}
}
