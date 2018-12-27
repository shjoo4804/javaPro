package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Test01Main1 {

	public static void main(String[] args) {
		System.out.println("java IO");
		
		
		
		
		// 1. System input
//		InputStream is = null; // ***
//		InputStreamReader isr = null;
//		BufferedReader br = null;
//
//		is = System.in;
//		isr = new InputStreamReader(is);
//		br = new BufferedReader(isr);
//		
//		br.close();
//		isr.close();
//		is.close();
		
		
		File f = new File("data.txt");
		System.out.println(f.exists()); // 존재여부 : 존재true / 없음false
		if(f.exists()) { //f.exists()가 true일때만

			// 2. File input
			FileInputStream fis = null; 
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			
			try {
				fis = new FileInputStream(f); // 인자에 File객체를 넣어줘도 됨
				isr = new InputStreamReader(fis);
				br = new BufferedReader(isr);
				
				String str = null;
				StringBuilder sb = new StringBuilder();// str 값 저장할 변수도 선언
				
				while((str = br.readLine()) != null) {
					
					System.out.println(str);
					sb.append(str+"\n");
					
				}
				System.out.println();
				System.out.println(sb.toString());
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				if(br!=null) {
					try {
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				if(isr!=null) {
					try {
						isr.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				if(fis!=null) {
					try {
						fis.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} // end finally
			
//			System.out.println(fis); // file의 주소
		}
		
		
		
		// 3. File output
		
		
		
		System.out.println("end main");
		
	}// end main()

}
