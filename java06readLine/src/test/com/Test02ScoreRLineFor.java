package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02ScoreRLineFor {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		
		System.out.println("<<성적처리프로그램>>");
		System.out.println("학생 수를 입력하세요.");
		String sCount = br.readLine();
		System.out.println("학생 수 : "+sCount);
		System.out.println();
		
		for (int i = 0; i < Integer.parseInt(sCount); i++) {
			System.out.println((i+1)+"번 학생의 이름을 입력하세요");
			String name = br.readLine(); // 변수에 데이터를 입력받기
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
	/*		grade = avg>=90? "A":avg>=80?"B":avg>=70?"C":"과락";
			System.out.println("등급:"+grade);*/
			
			grade = avg>=90? "A":
					avg>=80? "B":
					avg>=70? "C":"과락";
			System.out.println("등급:["+grade+"]");
			System.out.println();
		}
		
		
		// 1번(2,3...) 학생의 이름을 입력하세요
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
	}

}
