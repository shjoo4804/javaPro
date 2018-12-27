package test.com;

public class Test01static {

	int num; // 인스턴스 필드

	static String name; // new(객체생성)하지 않아도 접근이 가능함. 메모리에 먼저 들어가 있음.
	static final double AVG = 0.0; // 전역변수에 final이 오면 기본값을 쓸 수 없음
	
	public static class Note {
		static String name2;
	}
	
	{ // 초기화 블럭
		num = 99;
	}
	
	static { // static 초기화 블럭
		name = "kim";
	}
	
	
	public void test() {
		System.out.println("test()..");
		test2();
		aaa();
		System.out.println(Integer.MIN_VALUE); // static final
		System.out.println(AVG);
	}
	
	public static void aaa() {
		
	}
	
	public static void test2() {
		System.out.println("test2()");
		aaa(); // static 메소드만 호출 가능
//		test(); // static이 아니므로, new해서만 호출가능
	}

}
