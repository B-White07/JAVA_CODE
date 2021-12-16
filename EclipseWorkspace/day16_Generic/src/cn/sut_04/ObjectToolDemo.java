package cn.sut_04;

public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();
		
		ot.setObj(new String("lzw"));
		String s = (String)ot.getObj();
		System.out.println(s);
		
		ot.setObj(new Integer(20));
		Integer i = (Integer)ot.getObj();
		System.out.println(i);
		
//		//ClassCastException
//		ot.setObj(new Integer(20));
//		String ss = (String)ot.getObj();
//		System.out.println(ss);
		
		System.out.println("----------");
		ObjectTool<String> ot2 = new ObjectTool<String>();
		//ot2.setObj(new Integer(20));//这个现在编译期间就无法通过
		ot2.setObj(new String("lzw"));
		String s3 = ot2.getObj();
		System.out.println(s3);
		
		ObjectTool<Integer> ot3 = new ObjectTool<Integer>();
		ot3.setObj(new Integer(20));
		Integer i2 = ot3.getObj();
		System.out.println(i2);
		

	}

}
