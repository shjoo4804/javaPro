package test.com;

public class Test01Method {
	
	// 블럭을 갖는 메소드, 블럭을 갖지 않는 메소드
	// {},	 ;사용. 블록없을떄
	// 메소드 형태 : 인자값/반환값 유무에 따라 4가지 
	
	
	// 1. 인자값X / 반환값X 메소드
	public void aaa() {
		System.out.println("aaa()");
		return ; // 반환값이 없다. 생략가능
	}
	
	
	// 2. 인자값X / 반환값O 메소드 - getter
	public int aaa2() { // 반환타입이 정수타입(byte, short, char, int, long)
		System.out.println("aaa2()");
		return 100; 
	}
	
	
	// 3. 인자값O / 반환값X 메소드 - setter
	public void aaa3(int x) {
		System.out.println("aaa3("+x+")");
//		return ; 
	}
	public void aaa3(int x, int y) { // aaa3() 메소드 오버로딩
		System.out.println("aaa3("+(x+y)+")");
//		return ; 
	}
	
	
	// 4. 인자값O / 반환값O 메소드
	public String[] aaa4(String name) {
		System.out.println("aaa4("+name+")");
		return new String[]{"hello","hi"}; // String[] 반환
	}
	
}
