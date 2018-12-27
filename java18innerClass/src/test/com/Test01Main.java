package test.com;

import test.com.Test01Member.Inner;

public class Test01Main {
	
	//1.속성
	//2.생성자
	//3.메소드
	//4.초기화블럭
	
	
	//5.내부클래스(중첩클래스) : 외부클래스의 자원을 객체 생성없이 쓰고자할 때 사용
	// - 멤버 내부클래스, static내부클래스, local내부클래스, 익명Anonymous내부클래스

	public static void main(String[] args) {
		System.out.println("inner class");
		
		
		// (1) 멤버 내부클래스
		
		Test01Member member = new Test01Member();
		member.test();
		Inner in = member.new Inner(); //import해줘야함
		// Inner는 member 안에 있는 자원이므로, member. 해줘야함
//		Inner in = new Test01Member().new Inner(); // 다른 위치에 만들어줄 때
		in.testInner();
		
		System.out.println("=============");
		
		
		// (2) static 내부클래스
		Test02Static st = new Test02Static();
		st.test();
		System.out.println(Test02Static.Inner.tel2); 
		// static이라 객체 생성하지 않아도 접근이 가능함
		
		test.com.Test02Static.Inner sin = new Test02Static.Inner();
		System.out.println(sin.email);
		
		System.out.println("=============");
		
		
		// (3) local 내부클래스
		Test03Local local = new Test03Local();
		local.test();
		
		System.out.println("=============");
		
		
		// (4) 익명 내부클래스
		final String str = "hello";
		
		Test04Anonymous anony = new Test04Anonymous() { // Test04Anonymous를 상속받은 클래스
			public void testInner() {
				System.out.println("testInner() .."+name);
			}
			
			@Override // 강제적인 Overriding은 아님
			public void test() {
				testInner();
				System.out.println(str); // 이너클래스에서 로컬변수를 참조하려면 final변수(상수)여만 사용가능
			}
		};
		anony.test();
//		anony.testInner(); //는 불가  >>> test()을 오버라이딩해서 testInner() 호출 가능
		
		

	} // end main()
	
	
	

} // end class
