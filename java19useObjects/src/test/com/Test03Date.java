package test.com;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test03Date {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("Date");
		
		// 1.java.utill.Date
		System.out.println(new java.util.Date());
//		System.out.println(new java.util.Date(2018,12,25,12,12,12)); // 잘안씀
		System.out.println();
		
		
		// 2.java.sql.Date
		System.out.println(new java.sql.Date(System.currentTimeMillis()));
		System.out.println();
		
		
		// 3.Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime()); // Date()와 같은 형태
		System.out.println(cal.getTimeInMillis()); // 현재시간
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println((cal.get(Calendar.MONTH)+1)+"월"); // 0월부터 시작됨
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(cal.get(Calendar.AM_PM)); // 오전오후 0,1
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24시간 시간으로 출력됨
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		System.out.println(cal.get(Calendar.MILLISECOND)+"ms");
		System.out.println(cal.getTime());
		System.out.println();
		
		String str = cal.get(Calendar.HOUR_OF_DAY)+"시"
				+ cal.get(Calendar.MINUTE)+"분~"
				+ (cal.get(Calendar.HOUR_OF_DAY)+3)+"시"
				+ cal.get(Calendar.MINUTE)+"분까지";
		System.out.println(str);
		
		System.out.println();
		
		// 4. GregorianCalendar
		GregorianCalendar gCal = new GregorianCalendar(2018, 12-1, 12, 12, 12, 12);
		System.out.println(gCal.getTime());
		System.out.println(gCal.getTimeInMillis());
		System.out.println(gCal.get(Calendar.YEAR)+"년");
		System.out.println((gCal.get(Calendar.MONTH)+1)+"월"); // 0월부터 시작됨
		System.out.println(gCal.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(gCal.get(Calendar.AM_PM)); // 오전오후 0,1
		System.out.println(gCal.get(Calendar.HOUR_OF_DAY)+"시");
		System.out.println(gCal.get(Calendar.MINUTE)+"분");
		System.out.println(gCal.get(Calendar.SECOND)+"초");
		System.out.println(gCal.get(Calendar.MILLISECOND)+"ms");
		System.out.println();
		
		
		// 5.Timestamp
		Timestamp timeStamp = new Timestamp(gCal.getTimeInMillis());
		System.out.println(timeStamp.toString());
		
	} // end main()

}
