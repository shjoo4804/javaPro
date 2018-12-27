package test.com;

import java.util.Date;

public class Test01Main3 {

	public static void main(String[] args) {
		System.out.println("Thread...Runnable");
		
		
		// 3. member inner class extends Thread
		//(1)
		Test02InnerThreadEx outter = new Test02InnerThreadEx();
		outter.test();
		
		
		//(2)
//		Test02InnerThreadEx.Inner in = new Test02InnerThreadEx().new Inner();
		Thread in = new Test02InnerThreadEx().new Inner(); // 위와같음
		in.start();
		
		
		System.out.println("end main..");
		
	} // end main()

}
