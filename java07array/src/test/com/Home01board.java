package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home01board {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String[] titles = new String[] {"자바 시간", "C언어", "IoT"};
		
		String datas="";
		
		for (int i = 0; i < titles.length; i++) {
			System.out.println("글제목:"+titles[i]);
			
			System.out.println("글내용을 입력하세요");
//			String content = "양샘 자바를 잼나게 가르쳐주시네용";
			String content = br.readLine();
//			System.out.println(content);
			
			System.out.println("작성자를 입력하세요");
//			String writer = "홍길동";
			String writer = br.readLine();
//			System.out.println(writer);
			
			System.out.println("작성일자를 입력하세요");
//			String wDate = "2018-08-13";
			String wDate = br.readLine();
//			System.out.println(wDate);
			System.out.println();
			
			datas += titles[i]+"/"+content+"/"+writer+"/"+wDate+"\n";
		}
		
		System.out.println(datas);
		
		
		
		// - 글제목을 크기3의 배열로 해서 출력하기
		// 글제목을 입력하세요
		// 자바 시간입니다.
		// 글내용을 입력하세요
		// 양샘이 자바를 잼나게 가르쳐주시네용
		// 작성자를 입력하세요
		// 홍길동
		// 작성일자를 입력하세요
		// 2018.08.08

	}

}
