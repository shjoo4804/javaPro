package test.com;

public class Test02Static {
	
	public void test() {
		Inner.tel2 = "080";// static �����̹Ƿ� �ٷ� �� ����
		Inner.testInner();
		System.out.println("test()" + Inner.TEL +" "+ Inner.tel2);
	}
	
	public static class Inner {
		int email;
		static final String TEL = "010"; // �ַ� ���
		static String tel2 = "010"; 
		// �̳�Ŭ�������� static ������ ������ Ŭ������ static�� �پ����
		
		public static void testInner() {
			System.out.println("static testInner()");
		}
	} // end class Inner

}
