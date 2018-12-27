package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01Main4 {

	public static void main(String[] args) {
		System.out.println("java IO");
		
		File f = new File("data.txt");
		System.out.println(f.exists()); // 존재여부 : 존재true / 없음false
		System.out.println(f.canWrite()); //
		

		// 3. File output
		if(f.exists() && f.canWrite()) {
			FileWriter fw = null;
			
			try {
				fw = new FileWriter(f, true); 
				String str = "1:xxx:33:44:55\n";
				fw.write(str);
				fw.write(str);
				fw.write(str);
				fw.write(str);
				fw.flush();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(fw != null) {
					try {
						fw.close();
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
