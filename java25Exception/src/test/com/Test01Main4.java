package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main4 {

	public static void main(String[] args) 
			/*throws NullPointerException*/ { // throws 하면 예외전가
		System.out.println("Exception..");
		
		TestDAO2 dao = null;
		
		try {
			dao = new TestDAO2();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			dao.testNull();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		try {
			dao.testNumber();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		try {
			dao.testArray();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		

		System.out.println("end main..");

	} // end main()

}
