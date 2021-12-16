package cn.sut_05;

//public class ObjectTool<T> {
//
////	public void show(String str) {
////		System.out.println(str);
////	}
////
////	public void show(Integer i) {
////		System.out.println(i);
////	}
////
////	public void show(boolean b) {
////		System.out.println(b);
////	}
//
//	public void show(T t) {
//		System.out.println(t);
//	}
//}

/*
 * 泛型方法：把泛型定义在方法上
 */
public class ObjectTool {
	public <T> void show(T t) {
		System.out.println(t);
	}
}