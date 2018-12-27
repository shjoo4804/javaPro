package test.go;

import java.util.Date;

public class Test03Board {

	String title; // 제목
	String content; // 내용
	String writer; // 글쓴이
	Date wDate; // 작성일자
	// protected 상속된 관계끼리는 폴더가 달라도 됨
	// private 내 클래스 안에서만 사용
	// default
	// public 다른 패키지에서도 접근 가능

	// 생성자의 주 목적 : 속성(필드) 초기화
	public Test03Board() { // public이 없으면 같은 폴더(패키지)에 있어야만 사용가능함
		title = "제목";
		content = "내용";
		writer = "홍길동";
		wDate = new Date();
	}
	// 오버로딩 : 같은 이름의 생성자(메소드)를 여러 개 만들 때, 매개변수의 개수/타입/순서가 다름
	public Test03Board(String x) {
		title = x;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	
	public Test03Board(int x) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	
	public Test03Board(int x, int y) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	
	public Test03Board(String y, int x) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	public Test03Board(int x, String y) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	

	

} // end class
