package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main2 {

	public static void main(String[] args) 
			/*throws NullPointerException*/ { // throws 하면 예외전가
		System.out.println("Exception..");
		
		String name = null;
		
		try {
			name = "aaa";
			System.out.println(name.length()); //1
			System.out.println("aaa"); //2
//			args[2] = "kim"; // ArrayIndexOutOfBoundsException
			Integer.parseInt(name); // NumberFormatException
			
		} catch (NullPointerException e) { // NullPointerException오류만 catch
			e.printStackTrace();
			name = "bbb";
			System.out.println(name); //3
			
		} catch (ArrayIndexOutOfBoundsException e) { 
			e.printStackTrace();
			name = "ccc";
			System.out.println(name); //4
			
		} catch (NumberFormatException e) { 
			e.printStackTrace();
			name = "ddd";
			System.out.println(name); //5
			
		} catch (Exception e) { 
			// catch를 중복할 수 있으나, Exception Object는 같으면 안됨
			e.printStackTrace();
			name = "eee";
			System.out.println(name); //6
			
		}

		System.out.println("end main..");

	} // end main()

}
