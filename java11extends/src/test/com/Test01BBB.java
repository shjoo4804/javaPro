package test.com;

public class Test01BBB extends Test01CCC {
	
	int su;
	int su2;
	int su3;
	int su4;
	int su5;
	
	public Test01BBB() {
		super();
		System.out.println("Test01BBB()");
	}
	
	public int sum() {
		System.out.println(avg); // Test01CCC의 속성, 기능 사용 가능
		/*this.*/ccc(); // 오버라이딩된 BBB의 ccc()호출
		super.ccc(); // CCC의 ccc()호출
		return su+100;
	}
	
//	@Override // 어노테이션으로 오버라이드 된 메소드임을 알려줌
//	public void ccc() { // 메소드의 재정의 (오버라이드)
//		System.out.println(1000+2000);
//	}
	
	
	@Override // 자동완성(Cntl+Space)
	public void ccc() {
		System.out.println("BBB ccc");
//		super.ccc();
	}
	
}
