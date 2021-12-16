package cn.sut_06;
/*
 * 实现类在实现接口的时候
 * 第一种情况：已经知道是什么类型
 * 第二种情况：不知道是什么类型
 */
//public class InterImpl implements Inter<String> {
//
//	@Override
//	public void show(String t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}
//
//}

public class InterImpl<T> implements Inter<T>{

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}