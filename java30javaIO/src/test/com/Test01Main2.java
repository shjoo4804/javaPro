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
		System.out.println(f.exists()); // ���翩�� : ����true / ����false
		System.out.println(f.canRead()); //
		
		if(f.exists() && f.canRead()) { //f.exists()�� true�϶���

			// 2. File input
			FileReader fr = null; 
			BufferedReader br = null;
			
			
			try {
				fr = new FileReader(f); // ���ڿ� File��ü�� �־��൵ ��
				br = new BufferedReader(fr);
				
				
				String str = null;
				StringBuilder sb = new StringBuilder();// str �� ������ ������ ����
				
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
			
//			System.out.println(fis); // file�� �ּ�
		} // end if
		
		
		
		// 3. File output
		
		
		
		System.out.println("end main");
		
	}// end main()

}
