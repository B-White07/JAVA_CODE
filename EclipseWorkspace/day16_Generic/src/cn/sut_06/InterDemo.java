package cn.sut_06;

public class InterDemo {
public static void main(String[] args) {
	//��һ�����
	Inter<String> i = new InterImpl();
	i.show("hello");
	
	//�ڶ������
	Inter<String> s = new InterImpl<String>();
	s.show("hello");
	Inter<Integer> ii = new InterImpl<Integer>();
	ii.show(100);
}
}
