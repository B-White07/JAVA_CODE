package cn.it_04;

/*
 * 替换功能
 * 		String类的public String replaceAll(String redex,String replacement)
 * 		使用给定的字符串replacement，替换此字符串所有匹配给定的正则表达式的子字符串
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
