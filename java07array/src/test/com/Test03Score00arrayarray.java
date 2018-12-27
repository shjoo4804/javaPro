package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score00arrayarray {

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
		// 0 1 2 3 4 5 6
		
		String[][] strss = new String[3][7];
		strss[0][0] = "홍길동1";
		strss[1][0] = "홍길동2";
		strss[2][0] = "홍길동3";

		for (int x = 0; x < strss.length; x++) {
			System.out.println("학생 이름:" + strss[x][0]);
			System.out.println("국어 성적을 입력하세요");
			String kor = br.readLine();
//			System.out.println(kor);

			System.out.println("수학 성적을 입력하세요");
			String math = br.readLine();
//			System.out.println(math);

			System.out.println("영어 성적을 입력하세요");
			String eng = br.readLine();
//			System.out.println(eng);
			
			int total = Integer.parseInt(kor)
					+ Integer.parseInt(math) 
					+ Integer.parseInt(eng);

			double avg = total / 3.0;

			String grade = "";
			if (avg >= 90) {
				grade = "A";
			} else if (avg >= 80) {
				grade = "B";
			} else if (avg >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}

//			System.out.println("총점: " + total);
//			System.out.println("평균: " + avg);
//			System.out.println("등급: " + grade);	

			strss[x][1] = kor;
			strss[x][2] = math;
			strss[x][3] = eng;
			strss[x][4] = ""+total; // Integer.toString(total)
			strss[x][5] = ""+avg;
			strss[x][6] = grade;
			// strss[x] = new String[] {names[x], kor, math, eng, total+"", avg+"", grade};
	
			System.out.println();

		}

		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i] + " ");
			}
			System.out.println();
		}

		// 국어 성적을 입력하세요
		// 90
		// 수학 성적을 입력하세요
		// 90
		// 영어 성적을 입력하세요
		// 90
		// 총점 : 270
		// 평균 : 90
		// 등급 : A

	} // end main()

} // end class
