package cn.sut_06;

public class InterDemo {
public static void main(String[] args) {
	//第一种情况
	Inter<String> i = new InterImpl();
	i.show("hello");
	
	//第二种情况
	Inter<String> s = new InterImpl<String>();
	s.show("hello");
	Inter<Integer> ii = new InterImpl<Integer>();
	ii.show(100);
}
}
