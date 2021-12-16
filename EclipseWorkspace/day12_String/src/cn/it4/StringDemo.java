package cn.it4;
/*
 * String ��Ļ�ȡ����
 * int length(): ��ȡ�ַ�������
 * char charAt(int index): ��ȡָ������λ�õ��ַ�
 * int indexOf(int ch): ����ָ���ַ��ڴ��ַ����е�һ�γ��ֵ�����
 * 		Ϊʲô��int���ͣ�������char����
 * 		ԭ���ǣ�'a'��97���ܴ���'a' ����������
 * int indexOf(String str): ����ָ���ַ����ڴ��ַ����е�һ�γ��ֵ�����
 * int indexOf(int ch,int fromIndex): ����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ�����
 * int indexOf(String str,int fromIndex): ����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ�����
 * String substring(int start): ��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ������start
 * String substring(int start,int end): ��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ��������󲻰���
 */
public class StringDemo {
	public static void main(String[] args) {
		String s ="helloworld";
		
		//int length(): ��ȡ�ַ�������
		System.out.println("length():" + s.length());
		System.out.println("-----------------------");
		
		//char charAt(int index): ��ȡָ������λ�õ��ַ�
		System.out.println("charAt():" + s.charAt(2));
		System.out.println("-----------------------");
		
		//int indexOf(int ch): ����ָ���ַ��ڴ��ַ����е�һ�γ��ֵ�����
		System.out.println("indexOf():" + s.indexOf('w'));
		System.out.println("-----------------------");
		
		//int indexOf(String str): ����ָ���ַ����ڴ��ַ����е�һ�γ��ֵ�����
		System.out.println("indexOf():" + s.indexOf("ell"));
		System.out.println("-----------------------");
		
		//int indexOf(int ch,int fromIndex): ����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ�����
		System.out.println("indexof():" + s.indexOf('l',3));
		System.out.println("indexof():" + s.indexOf('l',4));
		System.out.println("indexof():" + s.indexOf('h',3)); //-1
		System.out.println("indexof():" + s.indexOf('l',30)); //-1
		System.out.println("-----------------------");
		
		//int indexOf(String str,int fromIndex): ����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ֵ�����
		System.out.println("indexof():" + s.indexOf("lo",3));
		System.out.println("indexof():" + s.indexOf("llo",3)); //-1
		System.out.println("indexof():" + s.indexOf("lo",30)); //-1
		System.out.println("-----------------------");
		
		//String substring(int start): ��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ������start
		System.out.println("substring():" + s.substring(5));
		System.out.println("-----------------------");
		
		//String substring(int start,int end): ��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ��������󲻰���
		System.out.println("substring():" + s.substring(5,9)); //worl
		System.out.println("substring():" + s.substring(5,10)); //world
		System.out.println("substring():" + s.substring(5,s.length()));
		
	}
}
