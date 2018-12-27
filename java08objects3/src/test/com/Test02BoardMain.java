package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test02BoardMain {

	public static void main(String[] args) throws IOException {
		System.out.println("board...");
		InputStream is = System.in; // static이 붙어있으면 new 안해도 사용가능
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("===============");
		System.out.println("게시판 프로그램");
		System.out.println("===============");
		
		Test02BoardVO[] vos = new Test02BoardVO[3];

		for (int i = 0; i < vos.length; i++) {
			System.out.println((i+1)+"번째 글입니다.");
			System.out.println("글제목을 입력하세요");
			String title = br.readLine();
//			String title = "자바시간";
//			System.out.println(title);

			System.out.println("---------------");
			System.out.println("글내용을 입력하세요");
			String content = br.readLine();
//			String content = "kim쌤자바";
//			System.out.println(content);

			System.out.println("---------------");
			System.out.println("작성자를 입력하세요");
			String writer = br.readLine();
//			String writer = "홍길동";
//			System.out.println(writer);
			
			Test02BoardVO vo = new Test02BoardVO(i+1, title, content, writer);
			vos[i] = vo;
			
			System.out.println();
		} // end for
		
		for (int i = 0; i < vos.length; i++) {
			System.out.print(vos[i].num+" ");
			System.out.print(vos[i].title+" ");
			System.out.print(vos[i].content+" ");
			System.out.print(vos[i].writer+" ");
			System.out.println(vos[i].wDate);
		}
		

		// VO와 VO[]을 사용하여 아래프로그램을 입력하세요
		// 글제목을 입력하세요
		// 자바 시간입니다.
		// 글내용을 입력하세요
		// 양샘이 자바를 잼나게 가르쳐주시네용
		// 작성자를 입력하세요

		// 홍길동

		// 글번호와 작성일자는 입력받지 않음.

		// ==출력결과
		// num title content writer wDate(Date타입으로)
		// 1 AAA BBB kim 2018~~~

	} // end main()

} // end class
