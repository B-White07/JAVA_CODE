package cn.it_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 		��ȡ����:
 * 		��ȡ�����ַ����У���������ĸ��ɵĵ���
 * 		da jia ting wo shuo,jin tian xia yu,wan zi xi bu shang le
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian xia yu,wan zi xi bu shang le";

		// ����
		String regex = "\\b\\w{3}\\b"; // \\b��ʾ�ַ��߽磬������ĸ�ַ�

		// �ѹ�������ģʽ����
		Pattern p = Pattern.compile(regex);
		// ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher(s);
		//����ƥ��������Ĺ���
		//ͨ��public boolean find()����������û�з������������ַ���
//		boolean flag = m.find();
//		System.out.println(flag);
//		
//		//public String group()
//		String result = m.group();
//		System.out.println(result);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		//IllegalStateException
		//����һ��Ҫ��find(),Ȼ�����group()
		//System.out.println(m.group());

	}
}
