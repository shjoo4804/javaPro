package test.com;

public class Test01Member {
	
	private int num;
	
	public void test() {
//		Inner in = new Inner();
		System.out.println("test()"/*+in.email*/);
		// �ۿ����� ���θ޼ҵ��� �Ӽ��� ������ ��ü������ �ʿ���
	}
	
	
	public class Inner{ // private : Ŭ���� ���ο����� ��밡��
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
