package cn.sut_05;

public class ObjectToolDemo {
public static void main(String[] args) {
//	ObjectTool ot = new ObjectTool();
//	ot.show("hello");
//	ot.show(20);
//	ot.show(true);
	
//	ObjectTool<String> ot = new ObjectTool<String>();
//	ot.show("hello");
//	ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
//	ot2.show(20); //自动装箱
//	ObjectTool<Boolean> ot3 = new ObjectTool<Boolean>();
//	ot3.show(true);
	
	//实际上，我所需要的方法不一定与类的类型一致，这时需要用到泛型方法
	//定义泛型方法后
	ObjectTool ot = new ObjectTool();
	ot.show("hello");
	ot.show(100);
	ot.show(true);
}
}
