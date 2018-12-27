package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream is = System.in; 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String exitBtn = "";
		while (!exitBtn.equals("x")) { 
			
			System.out.println("menu==============");
			System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
			System.out.println("==================");
			System.out.print("input menu num : ");
//			int menuNum = 1;
			int menuNum = Integer.parseInt(br.readLine());
//			System.out.println(menuNum);
			
			ScoreDAO dao = new ScoreDAOimpl();
			ScoreVO vo = new ScoreVO();
			
			if(menuNum==1) { // 1. insert
				System.out.println("1.insert==========");
				
				
				System.out.println("번호를 입력하세요 :");
				int num = 1;
//				int num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				System.out.println("이름을 입력하세요 :");
				String name = "aa";
				vo.setName(name);
				
				System.out.println("국어 점수를 입력하세요 :");
				int kor = 90;
				vo.setKor(kor);
				
				System.out.println("영어 점수를 입력하세요 :");
				int eng = 90;
				vo.setEng(eng);
				
				System.out.println("수학 점수를 입력하세요 :");
				int math = 90;
				vo.setMath(math);
				
				int x1 = dao.insert(vo);
				if(x1==1) {
					System.out.println("insert 성공");
				} else {
					System.out.println("insert 실패");
				}
				
				
				
				System.out.println("4.selectAll========");
				List<ScoreVO> vos = dao.selectAll();
				
				
				
				
				
			} else if (menuNum==2) { // 2. update
				
				System.out.println("2.update==========");
				System.out.println("변경할번호를 입력하세요 :");
				int num = 1;
//				int num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				System.out.println("이름을 입력하세요 :");
				String name = "aa";
				vo.setName(name);
				
				System.out.println("국어 점수를 입력하세요 :");
				int kor = 90;
				vo.setKor(kor);
				
				System.out.println("영어 점수를 입력하세요 :");
				int eng = 90;
				vo.setEng(eng);
				
				System.out.println("수학 점수를 입력하세요 :");
				int math = 90;
				vo.setMath(math);
				System.out.println(dao.insert(vo));
				
			} else if (menuNum==3) { // 3.delete
				System.out.println("3.delete==========");
				
			} else if (menuNum==4) { // 4.selectAll
				System.out.println("4.selectAll==========");
			
			} else if (menuNum==5) { // 5.selectOne
				System.out.println("5.selectOne==========");
				
			} else {
				System.out.println("없는 메뉴입니다.");
			}
				
			

			
			System.out.println("계속하시려면 아무키입력, 종료시 x");
			exitBtn = br.readLine(); // x에 "x"를 입력하게 되면  종료됨
		} // end while
		
		
		
		
		
		
		
				
		// 프로그램 실행하면
		// menu==============
		// 1.insert 2.update 3.delete 4.selectAll 5.selectOne 형태로 메뉴가 나옴
		// ==================
		// input menu num : 1 // num은 유니크한 키
		// 1.insert==========
		// 번호를 입력하세요 :
		// 이름을 입력하세요 : 
		// ......
		
		// 4.selectAll========
		// 1 abc 90 90 90 270 90.0 A // ** 저장공간을 정하기 // DAO에 값쌓기
		// 2 abc 90 90 90 270 90.0 A 
		
		// 계속하시려면 아무키입력, 종료시 x
		// (아무키입력시)
		// menu==============
		// 1.insert 2.update 3.delete 4.selectAll 5.selectOne 형태로 메뉴가 나옴
		// ==================
		// input menu num : 1
		
		
		// 2.update==========
		// 번호를 입력하세요 : 1
		// 이름을 입력하세요 : kim22
		// ......
		
		// 4.selectAll========
		// 1 kim22 90 90 90 270 90.0 A 
		// 2 abc 90 90 90 270 90.0 A 
		
		// 계속하시려면 아무키입력, 종료시 x
		
		// 3.delete==========
		// 번호를 입력하세요 : 2
		
		// 4.selectAll========
		// 1 kim22 90 90 90 270 90.0 A 
		
		// 계속하시려면 아무키입력, 종료시 x
		
		// 5.selectOne========
		// 번호를 입력하세요 : 1
		// 1 kim22 90 90 90 270 90.0 A 

	} // end main()

}
