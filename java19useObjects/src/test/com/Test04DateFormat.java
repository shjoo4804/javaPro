package test.com;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04DateFormat {

	public static void main(String[] args) {
		System.out.println("DateFormats");
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts.toString());
		
		//2018/08/20 ~ 형태로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년(MM+3)월dd일 HH:mm:ss.SSS");
		System.out.println(sdf.format(new Date()));
		
		//1,222,222 >>> NumberFormat 타입에 있음
		

	} // end main()

}
