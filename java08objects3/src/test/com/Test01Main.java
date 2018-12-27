package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main {
	public static void main(String[] args) throws IOException {	
		System.out.println("main...");
		
		InputStream is = System.in; // static이 붙어있으면 new 안해도 사용가능
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		Test01ScoreVO[] vos = new Test01ScoreVO[3]; 
		
		
		for (int i = 0; i < vos.length; i++) {

			System.out.println("이름을 입력하세요");
//			String name = "홍길동1";
			String name = br.readLine();
			System.out.println(name+"의 국어점수를 입력하세요");
//			int kor = 99;
			int kor = Integer.parseInt(br.readLine());
			System.out.println(name+"의 영어점수를 입력하세요");
//			int eng = 88;
			int eng = Integer.parseInt(br.readLine());
			System.out.println(name+"의 수학점수를 입력하세요");
//			int math = 77;
			int math = Integer.parseInt(br.readLine());
			System.out.println();

			Test01ScoreVO vo = new Test01ScoreVO(name, kor, eng, math);
			vos[i] = vo;
			
		}
		
		for (int i = 0; i < vos.length; i++) {
			System.out.print(vos[i].name+" "
							+vos[i].kor+" "
							+vos[i].eng+" "
							+vos[i].math+" "
							+vos[i].total+" "
							+vos[i].avg+" "
							+vos[i].grade+"\n");
		}
		
		
		// ==VO와 VO[]을 사용하여 아래프로그램을 만드시오.
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
		
		//===최종결과===
		// 홍길동1 99 88 77 264 88.0 B
		// 홍길동2 99 88 77 264 88.0 B
		// 홍길동3 99 88 77 264 88.0 B
		
		
		
	} // end main()
} // end class
