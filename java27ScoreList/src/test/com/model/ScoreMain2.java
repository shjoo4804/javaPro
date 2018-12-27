package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreMain2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String exitBtn = "";

		ScoreDAO dao = new ScoreDAOimpl();
		ScoreVO vo = null;
		List<ScoreVO> vos = dao.selectAll();
		
		while (!exitBtn.equals("x")) {
			System.out.println("menu==============");
			System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
			System.out.println("==================");
			System.out.println("input menu num : ");
			int key = Integer.parseInt(br.readLine());
			int num=0;
			String name="";
			int kor=0;
			int eng=0;
			int math=0;
			String grade="";

			vo = new ScoreVO();
			if (key==1) {
				System.out.println("1.insert==========");
				
				System.out.print("번호를 입력하세요 :");
//				int num = 1;
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);

				System.out.print("이름을 입력하세요 :");
//				String name = "aa";
				name = br.readLine();
				vo.setName(name);

				System.out.print("국어 점수를 입력하세요 :");
//				int kor = 90;
				kor = Integer.parseInt(br.readLine());
				vo.setKor(kor);

				System.out.print("영어 점수를 입력하세요 :");
//				int eng = 90;
				eng = Integer.parseInt(br.readLine());
				vo.setEng(eng);

				System.out.print("수학 점수를 입력하세요 :");
//				int math = 90;
				math = Integer.parseInt(br.readLine());
				vo.setMath(math);

				vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());

				vo.setAvg(vo.getTotal() / 3.0);

//				String grade = "";
				if (vo.getAvg() >= 90) {
					grade = "A";
				} else if (vo.getAvg() >= 80) {
					grade = "B";
				} else if (vo.getAvg() >= 70) {
					grade = "C";
				} else {
					grade = "F";
				}
				vo.setGrade(grade);

				
				dao.insert(vo);
			} else if(key==2) {
				System.out.println("2.update==========");
				System.out.println("변경할 번호를 입력하세요 :");
//				int num = 1;
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				System.out.println("변경할 이름을 입력하세요 : ");
//				String name = "bb";
				name = br.readLine();
				vo.setName(name);

				System.out.println("변경할 국어 점수를 입력하세요 :");
				kor = Integer.parseInt(br.readLine());
				vo.setKor(kor);

				System.out.println("변경할 영어 점수를 입력하세요 :");
				eng = Integer.parseInt(br.readLine());
				vo.setEng(eng);

				System.out.println("변경할 수학 점수를 입력하세요 :");
				math = Integer.parseInt(br.readLine());
				vo.setMath(math);
				
				vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
				vo.setAvg(vo.getTotal() / 3.0);

				grade = "";
				if (vo.getAvg() >= 90) {
					grade = "A";
				} else if (vo.getAvg() >= 80) {
					grade = "B";
				} else if (vo.getAvg() >= 70) {
					grade = "C";
				} else {
					grade = "F";
				}
				vo.setGrade(grade);
				
				dao.update(vo);
				
			} else if(key==3) {
				System.out.println("3.delete==========");
				System.out.println("삭제할 번호를 입력하세요 :");
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				dao.delete(vo);
				
			} else if(key==4) {
				System.out.println("4.selectAll========");
				vos = dao.selectAll();
				for (int i = 0; i < vos.size(); i++) {
					System.out.print(vos.get(i).getNum() + " ");
					System.out.print(vos.get(i).getName() + " ");
					System.out.print(vos.get(i).getKor() + " ");
					System.out.print(vos.get(i).getEng() + " ");
					System.out.print(vos.get(i).getMath() + " ");
					System.out.print(vos.get(i).getTotal() + " ");
					System.out.print(vos.get(i).getAvg() + " ");
					System.out.print(vos.get(i).getGrade() + " ");
					System.out.println();
				}
			} else if(key==5) {
				System.out.println("5.selectOne==========");
				
				System.out.println("검색할 번호를 입력하세요 :");
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				ScoreVO vo2 = dao.selectOne(vo);
				System.out.print(vo2.getNum() + " ");
				System.out.print(vo2.getName() + " ");
				System.out.print(vo2.getKor() + " ");
				System.out.print(vo2.getEng() + " ");
				System.out.print(vo2.getMath() + " ");
				System.out.print(vo2.getTotal() + " ");
				System.out.print(vo2.getAvg() + " ");
				System.out.println(vo2.getGrade());
			} else {
				System.out.println("없는 번호입니다");
			}
			
			
			
			System.out.println();
			if (key>0 && key<4) {
				System.out.println("4.selectAll========");
				for (int i = 0; i < vos.size(); i++) {
					System.out.print(vos.get(i).getNum() + " ");
					System.out.print(vos.get(i).getName() + " ");
					System.out.print(vos.get(i).getKor() + " ");
					System.out.print(vos.get(i).getEng() + " ");
					System.out.print(vos.get(i).getMath() + " ");
					System.out.print(vos.get(i).getTotal() + " ");
					System.out.print(vos.get(i).getAvg() + " ");
					System.out.print(vos.get(i).getGrade() + " ");
					System.out.println();
				}
				System.out.println("==================");
			}
			
			
			System.out.println("계속하시려면 아무키입력, 종료시 x");
			exitBtn = br.readLine(); // x에 "x"를 입력하게 되면 종료됨
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
