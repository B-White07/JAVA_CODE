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
	
	//录入信息并判断是否配对
	public boolean match(String str1,String str2) {
				
		System.out.println("请输入男生姓名：");
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		System.out.println("请输入女生姓名：");
		str2 = sc.nextLine();
			
		if(str1.equals("李增伟") && str2.equals("王漋菲")) {
			System.out.println(str2 + "是" + str1 + "的lover！");
			return true;
		}else {
			System.out.println(str2 + "不是" + str1 + "的lover!");
			return false;
		}				
			
		
	}
	
	
	//计算在一起的时间
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
		
		System.out.println("你们已经相恋了" + day + "天！");
		}catch (Exception e) {
		    System.out.println("----> Exception="+e.toString());
		}
		return "";
	}
	
}
