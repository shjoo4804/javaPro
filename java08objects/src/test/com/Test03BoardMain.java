package test.com;

import java.util.Date; // Ctrl Shift O : import 자동으로 넣어주기

import test.go.Test03Board;

public class Test03BoardMain {

	public static void main(String[] args) {
		System.out.println("Board Main");
		
		Test03Board tb = new Test03Board(); // 클래스명 tb = new 생성자;
		System.out.println(tb);
//		System.out.println(tb.title);
//		System.out.println(tb.content);
//		System.out.println(tb.writer);
//		System.out.println(tb.wDate);
//		
//		tb.title = "AAA";
//		tb.content = "BBB";
//		tb.writer = "kim";
//		tb.wDate = new Date();
//		System.out.println(tb.title);
//		System.out.println(tb.content);
//		System.out.println(tb.writer);
//		System.out.println(tb.wDate);
		
		
		// 동일한 이름의 생성자(메소드)를 여러 개 정의할 때
		// 매개변수의 타입, 개수, 순서를 다르게 해주어야한다.
		// 이를 메소드와 생성자의 오버로딩이라고 한다.
		Test03Board tb2 = new Test03Board("AAA");
		Test03Board tb3 = new Test03Board(333);
		Test03Board tb4 = new Test03Board(333,44);
		Test03Board tb5 = new Test03Board(333,"AA");
		
		
		
	} // end main()

} // end class
