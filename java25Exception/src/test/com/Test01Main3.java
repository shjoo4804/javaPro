package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main3 {

	public static void main(String[] args) 
			/*throws NullPointerException*/ { // throws 하면 예외전가
		System.out.println("Exception..");
		
		TestDAO dao = new TestDAO();
		
		dao.testNull();
		
		dao.testNumber();
		
		dao.testArray();
		

		System.out.println("end main..");

	} // end main()

}
