package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Score");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 3명의 학생 배열을 만들고 (학생 이름을 배열로, 이름은 입력받지 않음)
		// 각 학생의 성적을 처리하는 프로그램을 완성하시오
		// for문을 사용할 것

		// 최종 출력 예시---
		// 홍길동1 90 90 90 270(총점) 90(평균) A(등급)
		// 홍길동2 90 90 90 270 90 A
		// 홍길동3 90 90 90 270 90 A
		
		String[] names = new String[] {"홍길동1","홍길동2","홍길동3"};
		
		String datas = ""; // ***출력할 부분 미리 만들어두기

		for (int i = 0; i < names.length; i++) {
			// 홍길동 국어 성적을 입력하세요
			// 99
			System.out.println(names[i]+" 국어 성적을 입력하세요");
			String kor = br.readLine();
			System.out.println(kor);

			// 홍길동 영어 성적을 입력하세요
			// 97
			System.out.println(names[i]+" 영어 성적을 입력하세요");
			String eng = br.readLine();
			System.out.println(eng);

			// 홍길동 수학 성적을 입력하세요
			// 98
			System.out.println(names[i]+" 수학 성적을 입력하세요");
			String math = br.readLine();
			System.out.println(math);

			// 홍길동 총점 : 294
			int total = Integer.parseInt(kor) + Integer.parseInt(math) + Integer.parseInt(eng);
			System.out.println(names[i]+" 총점 : " + total);

			// 홍길동 평균 : 90
			double avg = total / 3.0;
			System.out.println(names[i]+" 평균 : " + avg);

			// 홍길동 등급 : A
			String grade = "";
			if (avg >= 90) {
				grade = "A";
			} else if (avg >= 80) {
				grade = "B";
			} else if (avg >= 70) {
				grade = "C";
			} else {
				grade = "과락";
			}
			System.out.println(names[i]+" 등급 : " + grade);
			
			datas += names[i]+" " + kor + " " + eng + " " + math 
					+ " " + total + " " + avg + " " + grade+"\n"; // ***문장 더해서 출력하기
			
			System.out.println("=================");
		} // end for
		
		System.out.println(datas); // ***

	} // end main()

} // end class
