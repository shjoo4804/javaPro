package test.com;

public class Test01zzz implements Test01xxx {
	// abstract class : 추상메소드도 포함할 수 있게 바꾸면 test(), test2() 오버라이드를 하지 않아도 됨.
	// 인터페이스를 implements하면 오버라이딩이 필수

	@Override
	public void test() {
		System.out.println("test()..");
		
	}

	@Override
	public void test2() {
		System.out.println("test2()..");
		
	}
	
}
