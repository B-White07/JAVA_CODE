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
 * ���ͷ������ѷ��Ͷ����ڷ�����
 */
public class ObjectTool {
	public <T> void show(T t) {
		System.out.println(t);
	}
}