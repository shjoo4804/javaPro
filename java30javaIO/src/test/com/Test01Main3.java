package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01Main3 {

	public static void main(String[] args) {
		System.out.println("java IO");
		
		File f = new File("data.txt");
		System.out.println(f.exists()); // ���翩�� : ����true / ����false
		System.out.println(f.canWrite()); //
		

		// 3. File output
		if(f.exists() && f.canWrite()) {
			FileOutputStream fos = null;
			
			try {
//				fos = new FileOutputStream(f); // �ƹ��͵� ���� �ɷ� �����
				fos = new FileOutputStream(f, true); // �̾��
				String str = "1:xxx:33:44:55\n";
				fos.write(str.getBytes());
				fos.write(str.getBytes());
				fos.write(str.getBytes());
				fos.flush(); // ����ִ� ����
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(fos != null) {
					try {
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			

		} // end if
		
		
		System.out.println("end main");
		
	}// end main()

}
