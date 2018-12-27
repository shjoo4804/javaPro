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
//		System.out.println(new java.util.Date(2018,12,25,12,12,12)); // �߾Ⱦ�
		System.out.println();
		
		
		// 2.java.sql.Date
		System.out.println(new java.sql.Date(System.currentTimeMillis()));
		System.out.println();
		
		
		// 3.Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime()); // Date()�� ���� ����
		System.out.println(cal.getTimeInMillis()); // ����ð�
		System.out.println(cal.get(Calendar.YEAR)+"��");
		System.out.println((cal.get(Calendar.MONTH)+1)+"��"); // 0������ ���۵�
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(cal.get(Calendar.AM_PM)); // �������� 0,1
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24�ð� �ð����� ��µ�
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.out.println(cal.get(Calendar.SECOND)+"��");
		System.out.println(cal.get(Calendar.MILLISECOND)+"ms");
		System.out.println(cal.getTime());
		System.out.println();
		
		String str = cal.get(Calendar.HOUR_OF_DAY)+"��"
				+ cal.get(Calendar.MINUTE)+"��~"
				+ (cal.get(Calendar.HOUR_OF_DAY)+3)+"��"
				+ cal.get(Calendar.MINUTE)+"�б���";
		System.out.println(str);
		
		System.out.println();
		
		// 4. GregorianCalendar
		GregorianCalendar gCal = new GregorianCalendar(2018, 12-1, 12, 12, 12, 12);
		System.out.println(gCal.getTime());
		System.out.println(gCal.getTimeInMillis());
		System.out.println(gCal.get(Calendar.YEAR)+"��");
		System.out.println((gCal.get(Calendar.MONTH)+1)+"��"); // 0������ ���۵�
		System.out.println(gCal.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(gCal.get(Calendar.AM_PM)); // �������� 0,1
		System.out.println(gCal.get(Calendar.HOUR_OF_DAY)+"��");
		System.out.println(gCal.get(Calendar.MINUTE)+"��");
		System.out.println(gCal.get(Calendar.SECOND)+"��");
		System.out.println(gCal.get(Calendar.MILLISECOND)+"ms");
		System.out.println();
		
		
		// 5.Timestamp
		Timestamp timeStamp = new Timestamp(gCal.getTimeInMillis());
		System.out.println(timeStamp.toString());
		
	} // end main()

}
