package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01readLine {

	public static void main(String[] args) throws IOException {
		System.out.println("readLine..");
		
//		BufferedReader br = 
//				new BufferedReader (
//						new InputStreamReader(System.in));
		InputStream is = System.in; // static이 붙어있으면 new 안해도 사용가능
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("정수 입력 후 엔터.");
		
		String x = br.readLine(); // readLine()의 반환값은 스트링
		int su = Integer.parseInt(x);// String을 정수로 바꾸기
		System.out.println(su+100);
//		System.out.println(Integer.parseInt(br.readLine())+100);
		System.out.println("end main...");
		
	} // end main()

} // end class
