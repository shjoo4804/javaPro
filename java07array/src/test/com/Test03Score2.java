package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score2 {

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

		String[] names = new String[] { "홍길동1", "홍길동2", "홍길동3" };

		String[][] scores = new String[names.length][7];
		
//		String[] score = new String[7]; 
		// for밖으로 나가면 new를 한번만 한 것.. 주소가 하나밖에 없음
		// 가장 마지막에 있는 데이터만 집어넣어짐

		for (int x = 0; x < scores.length; x++) {
			// 홍길동 국어 성적을 입력하세요
			// 99
			System.out.println(names[x] + " 국어 성적을 입력하세요");
//			String kor = br.readLine();
			String kor = "90";
			System.out.println(kor);

			// 홍길동 영어 성적을 입력하세요
			// 97
			System.out.println(names[x] + " 영어 성적을 입력하세요");
//			String eng = br.readLine();
			String eng = "98";
			System.out.println(eng);

			// 홍길동 수학 성적을 입력하세요
			// 98
			System.out.println(names[x] + " 수학 성적을 입력하세요");
//			String math = br.readLine();
			String math = "97";
			System.out.println(math);

			// 홍길동 총점 : 294
			int total = Integer.parseInt(kor) + Integer.parseInt(math) + Integer.parseInt(eng);
			System.out.println(names[x] + " 총점 : " + total);

			// 홍길동 평균 : 90
			double avg = total / 3.0;
			System.out.println(names[x] + " 평균 : " + avg);

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
			
			System.out.println(names[x] + " 등급 : " + grade);
//			String[] score = new String[] {names[x], kor, eng, math, total+"", avg+"", grade};
			String[] score = new String[7]; // 안에 new 선언하면 주소가 다르게 할당됨
			score[0] = names[x];
			score[1] = kor;
			score[2] = eng;
			score[3] = math;
			score[4] = total+"";
			score[5] = avg+"";
			score[6] = grade;
			scores[x] = score;
		}
		
		for (int x = 0; x < scores.length; x++) {
			for (int i = 0; i < scores[x].length; i++) {
				System.out.print(scores[x][i]+" ");
			}
			System.out.println();
		}
		
	} // end main()

} // end class
