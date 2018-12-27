package test.com;

public class Test01Member {
	
	private int num;
	
	public void test() {
//		Inner in = new Inner();
		System.out.println("test()"/*+in.email*/);
		// 밖에서는 내부메소드의 속성을 쓰려면 객체생성이 필요함
	}
	
	
	public class Inner{ // private : 클래스 내부에서만 사용가능
		int email;
		
		public Inner() {
			System.out.println("Inner()");
			test();
		}
		
		public void testInner() {
			System.out.println("testInner()"+num);
		}
		
	} // end class Inner
	

} // end class Test01Memeber
