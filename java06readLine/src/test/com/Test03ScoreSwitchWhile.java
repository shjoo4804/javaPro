package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03ScoreSwitchWhile {
	public static void main(String[] args) throws IOException {
		System.out.println("성적처리프로그램");
		
		//while문을 사용하여 반복하는 프로그램을 완성
		//각 변수의 데이터는 input을 통해 받으시오.
		//종료시 x를 입력받아서 처리하도록 하시오
		
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		
		
		System.out.println("1.성적처리 2.게시판");
		String menu = br.readLine();
		if (menu.equals("1")) {
			// 성적처리 코드
		} else {
			// 게시판 코드
		}
		
		
		
		String x = "";
		while(!x.equals("x")) {
			System.out.println("이름을 입력하세요");
			String name = br.readLine();
			System.out.println(name);
			System.out.println("국어점수를 입력하세요");
			int kor = Integer.parseInt(br.readLine());
			System.out.println(kor);
			System.out.println("영어점수를 입력하세요");
			int eng = Integer.parseInt(br.readLine());
			System.out.println(eng);
			System.out.println("수학점수를 입력하세요");
			int math = Integer.parseInt(br.readLine());
			System.out.println(math);
			
//			System.out.println("총점:"+(kor+eng+math)); // 문자열+숫자는 문자열이 되어서, 괄호로 묶어줘야함
			int total = kor+eng+math;
			System.out.println("총점:"+total);
			
			//평균용 변수선언할 것. avg
			double avg = total/3.0;
			System.out.println("평균:"+avg); // 평균값을 실수로 얻기 위해서 3.0(실수)으로 나눔
			
			// 평균점수를 기준으로
			// 90점이상 A, 80점이상 B,
			// 70점이상 C, 70점 미만 F or "과락" 처리하는 프로그램을 추가하세요
			// 등급용 변수 선언할 것. grade(char or String)
			String grade = null;
			
			//switch case break
			
			// 10의 자리를 이용하기
			int key = (int)avg/10;
			switch (key) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;

			default:
				grade = "과락";
				break;
			}
			
			System.out.println("등급:["+grade+"]");
			
			System.out.println("종료하려면 x를 입력하시오");
			x = br.readLine();
		}
	
		System.out.println("종료");
		
		
		// 이름을 입력하세요
		// 홍길동
		// 국어점수를 입력하세요
		// 99
		// 영어점수를 입력하세요
		// 98
		// 수학점수를 입력하세요
		// 97
		// 총점:99+98+97=294
		// 평균:98(총점/3)
		// 등급:A
		
	} // end main()

} // end class
