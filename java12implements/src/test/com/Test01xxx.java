package test.com;

public interface Test01xxx {
	
	// 속성 : 무조건 static final
	/*static final*/ int NUM = 0; // final변수(상수)라서 초기화필수! 대문자!
	
	
	// 메소드 : 추상메소드
	public abstract void test(); 
	public /*abstract*/ void test2(); // abstract 는 생략가능
	
	
	public default void test3() {
		// 블럭이 생기면 추상메소드가 아니게 됨. (default 메소드 명시)
		System.out.println("test3()");
	}
	
	public static void test4() {
		// 혹은 static 메소드
		System.out.println("test4()");
	}
	
	
}
