package test.com;

import java.util.Date;

public class Test01Main5 {

	public static void main(String[] args) {
		System.out.println("Thread...Runnable");
		
		
		// 5. implements Runnable 
		Runnable r = new Test03Runnableimpl();
		new Thread(r).start();
		
		
		
		System.out.println("end main..");
		
	} // end main()

}
