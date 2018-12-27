package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Test02FileReaderMain {

	public static void main(String[] args) throws IOException {
		
		File f = new File("fileReader.txt");
		System.out.println(f.exists());
		System.out.println(f.canRead());
		
		if(f.exists() && f.canRead()) {
			FileReader fr = null;
			BufferedReader br = null;
			
			
			try {
				fr = new FileReader(f);
				br = new BufferedReader(fr);

				Test02FileReaderDAO dao = new Test02FileReaderDAOimpl();
				
				String str = null; // "1:xxx1:33:44:55"
				String[] temp = null; //:를 구분자로, 쪼개서 넣을 임시 배열(행을 넣을 배열)
				
				while((str = br.readLine()) != null) {
					temp = str.split(":"); // String[] temp = str.split(":"); 해줘도 됨
					
					Test02FileReaderVO vo = new Test02FileReaderVO();
					
					vo.setNum(Integer.parseInt(temp[0]));
					vo.setName(temp[1]);
					vo.setKor(Integer.parseInt(temp[2]));
					vo.setEng(Integer.parseInt(temp[3]));
					vo.setMath(Integer.parseInt(temp[4]));
					int result = dao.insert(vo);
//					System.out.println("result:"+result);

				}
				
				List<Test02FileReaderVO> vos = dao.selectAll();
				
				for (Test02FileReaderVO x : vos) {
					System.out.print(x.getNum()+ " ");
					System.out.print(x.getName()+ " ");
					System.out.print(x.getKor()+ " ");
					System.out.print(x.getEng()+ " ");
					System.out.println(x.getMath());
				}
			} catch (Exception e) {
				// TODO: handle exception
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
			
		} // end if

	}

}
