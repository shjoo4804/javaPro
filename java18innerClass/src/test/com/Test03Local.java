package test.com;

public class Test03Local {
	String name;
	
	public void test() {
		System.out.println("test()");
		
		/*final */String str = "aaa";
		class Inner { // ���������� public,private,protected ��� �Ұ���
			public int su;
			public void testInner() {
//				str = "bbb"; // �Ұ���
				System.out.println("testInner()"+name);
			}
		} // end class Inner
		
		Inner in = new Inner();
		in.testInner(); // �׳� testInner()�� ȣ�� �Ұ�.. new�ؼ� ��밡��
		
		
	} 

}
