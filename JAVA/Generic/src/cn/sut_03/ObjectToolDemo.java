package cn.sut_03;

/*
 * ���ڵ�ʱ������ʹ��Object��������������͡�
 * ����ת����û���κ�����ģ�����������ת�͵�ʱ����ʵ����������ת�������⡣
 * Ҳ����˵�����ĳ�����ʵ�����ǰ�ȫ�ġ�����Java��JDK5�������˷��ͣ���߳���İ�ȫ�ԡ�
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool ot = new ObjectTool();

		//��������ȷ����
		ot.setObj(new Integer(20));
		Integer i = (Integer) ot.getObj();
		System.out.println("���䣺" + i);
		
		ot.setObj(new String("lzw"));
		String s = (String)ot.getObj();
		System.out.println("������" + s);
		
		System.out.println("--------");
		
		//��������
//		ot.setObj(new Integer(22));
//		//ClassCastException
//		String ss = (String)ot.getObj();
//		System.out.println("�����ǣ� "+ ss);
	}
}
