package cn.it_04;

/*
 * �滻����
 * 		String���public String replaceAll(String redex,String replacement)
 * 		ʹ�ø������ַ���replacement���滻���ַ�������ƥ�������������ʽ�����ַ���
 */
public class RegexDemo {
	public static void main(String[] args) {
		String s = "hello49898451world32655165java";
		
		String regex = "\\d+";
		//String regex = "\\d";
		String replacement = "*";
		//String replacement = "";
		
		String result = s.replaceAll(regex, replacement);
		System.out.println("result:" + result);
	}
}
