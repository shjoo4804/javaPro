package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Test01Main2 {

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
		System.out.println(f.canRead()); //
		
		if(f.exists() && f.canRead()) { //f.exists()가 true일때만

			// 2. File input
			FileReader fr = null; 
			BufferedReader br = null;
			
			
			try {
				fr = new FileReader(f); // 인자에 File객체를 넣어줘도 됨
				br = new BufferedReader(fr);
				
				
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
				
				
				if(fr!=null) {
					try {
						fr.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} // end finally
			
//			System.out.println(fis); // file의 주소
		} // end if
		
		
		
		// 3. File output
		
		
		
		System.out.println("end main");
		
	}// end main()

}
