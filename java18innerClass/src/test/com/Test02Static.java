package test.com;

public class Test02Static {
	
	public void test() {
		Inner.tel2 = "080";// static 변수이므로 바로 콜 가능
		Inner.testInner();
		System.out.println("test()" + Inner.TEL +" "+ Inner.tel2);
	}
	
	public static class Inner {
		int email;
		static final String TEL = "010"; // 주로 사용
		static String tel2 = "010"; 
		// 이너클래스에서 static 변수를 쓰려면 클래스에 static이 붙어야함
		
		public static void testInner() {
			System.out.println("static testInner()");
		}
	} // end class Inner

}
