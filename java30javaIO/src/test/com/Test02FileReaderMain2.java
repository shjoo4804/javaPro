package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class Test02FileReaderMain2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("fileReader.txt");
		System.out.println(f.exists());
		System.out.println(f.canRead());
		Test02FileReaderDAO dao = new Test02FileReaderDAOimpl();
		
		if(f.exists() && f.canRead()) { //f.exists()가 true일때만

			// 2. File input
			FileReader fr = null; 
			BufferedReader br = null;
			
			
			try {
				fr = new FileReader(f); // 인자에 File객체를 넣어줘도 됨
				br = new BufferedReader(fr);
				
				
				String str = null; // 행 정보를 갖고 있는 애
				StringBuilder sb = new StringBuilder();// str 값 저장할 변수도 선언
				
				while((str = br.readLine()) != null) {
					String[] temp = str.split(":");
					
					Test02FileReaderVO vo = new Test02FileReaderVO();
					
					vo.setNum(Integer.parseInt(temp[0]));
					vo.setName(temp[1]);
					vo.setKor(Integer.parseInt(temp[2]));
					vo.setEng(Integer.parseInt(temp[3]));
					vo.setMath(Integer.parseInt(temp[4]));
					int result = dao.insert(vo);
					
					
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
		
		
		
	}

}
