package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score01arraies {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Score");
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));

		// 3명의 학생 배열을 만들고 (학생 이름을 배열로, 이름은 입력받지 않음)
		// 각 학생의 성적을 처리하는 프로그램을 완성하시오
		// for문을 사용할 것
		
		// 최종 출력 예시---
		// 홍길동1  90 90 90 270(총점) 90(평균) A(등급)
		// 홍길동2  90 90 90 270 90 A
		// 홍길동3  90 90 90 270 90 A

		String[] sName = new String[3];
		sName[0] = "홍길동1";
		sName[1] = "홍길동2";
		sName[2] = "홍길동3";
	
		
		int[] kor = new int[3];
		int[] math = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] grade =new String[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("학생 이름:"+sName[i]);
			System.out.println("국어 성적을 입력하세요");
			kor[i] = Integer.parseInt(br.readLine());
//			System.out.println(kor);
			System.out.println("수학 성적을 입력하세요");
			math[i] = Integer.parseInt(br.readLine());
//			System.out.println(math);
			System.out.println("영어 성적을 입력하세요");
			eng[i] = Integer.parseInt(br.readLine());
//			System.out.println(eng);
			
			total[i] = kor[i]+math[i]+eng[i];
			avg[i] = (kor[i]+math[i]+eng[i])/3.0;
			
			
			if(avg[i] >= 90) { 
				grade[i] = "A"; 
			} else if(avg[i] >= 80) {
				grade[i] = "B";
			} else if(avg[i] >= 70) {
				grade[i] = "C";
			} else {
				grade[i] = "F";
			}
		
//			System.out.println("총점: "+total);
//			System.out.println("평균: "+avg);
//			System.out.println("등급: "+grade);

			System.out.println();
		}
		
		for (int i = 0; i < avg.length; i++) {
			System.out.println(sName[i]+"  "+kor[i]+" "+math[i]+" "+eng[i]
					+" "+total[i]+" "+avg[i]+" "+grade[i]);
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
