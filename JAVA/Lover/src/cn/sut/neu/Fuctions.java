package cn.sut.neu;
import java.util.Scanner;
import java.util.Date;
//import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Fuctions {
	
	public Fuctions() {
		super();
	}
	
	//¼����Ϣ���ж��Ƿ����
	public boolean match(String str1,String str2) {
				
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		System.out.println("������Ů��������");
		str2 = sc.nextLine();
			
		if(str1.equals("����ΰ") && str2.equals("���V��")) {
			System.out.println(str2 + "��" + str1 + "��lover��");
			return true;
		}else {
			System.out.println(str2 + "����" + str1 + "��lover!");
			return false;
		}				
			
		
	}
	
	
	//������һ���ʱ��
	public String time() {
		
		String start = "2019-09-17 00:00:00";
		String time2 = "1970-01-01 00:00:00";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
		try {
		Date date1 = simpleDateFormat.parse(start);
		Date date2 = simpleDateFormat.parse(time2);
		long difference = date1.getTime() - date2.getTime();

		Date now = new Date();
		//System.out.println(a1.getTime());
		//System.out.println(a1.toString()); 
		//Calendar c1 = new Calendar();
		//long getTimeInMillis() 
		long d = 1000*60*60*24;
		//long h = 1000*60*60;
		//long m = 1000*60;
		//long dif = now - start;
		long dif = now.getTime() - difference;
		long day = dif / d;
		
		System.out.println("�����Ѿ�������" + day + "�죡");
		}catch (Exception e) {
		    System.out.println("----> Exception="+e.toString());
		}
		return "";
	}
	
}
