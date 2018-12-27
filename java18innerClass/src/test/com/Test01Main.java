package test.com;

import test.com.Test01Member.Inner;

public class Test01Main {
	
	//1.�Ӽ�
	//2.������
	//3.�޼ҵ�
	//4.�ʱ�ȭ��
	
	
	//5.����Ŭ����(��øŬ����) : �ܺ�Ŭ������ �ڿ��� ��ü �������� �������� �� ���
	// - ��� ����Ŭ����, static����Ŭ����, local����Ŭ����, �͸�Anonymous����Ŭ����

	public static void main(String[] args) {
		System.out.println("inner class");
		
		
		// (1) ��� ����Ŭ����
		
		Test01Member member = new Test01Member();
		member.test();
		Inner in = member.new Inner(); //import�������
		// Inner�� member �ȿ� �ִ� �ڿ��̹Ƿ�, member. �������
//		Inner in = new Test01Member().new Inner(); // �ٸ� ��ġ�� ������� ��
		in.testInner();
		
		System.out.println("=============");
		
		
		// (2) static ����Ŭ����
		Test02Static st = new Test02Static();
		st.test();
		System.out.println(Test02Static.Inner.tel2); 
		// static�̶� ��ü �������� �ʾƵ� ������ ������
		
		test.com.Test02Static.Inner sin = new Test02Static.Inner();
		System.out.println(sin.email);
		
		System.out.println("=============");
		
		
		// (3) local ����Ŭ����
		Test03Local local = new Test03Local();
		local.test();
		
		System.out.println("=============");
		
		
		// (4) �͸� ����Ŭ����
		final String str = "hello";
		
		Test04Anonymous anony = new Test04Anonymous() { // Test04Anonymous�� ��ӹ��� Ŭ����
			public void testInner() {
				System.out.println("testInner() .."+name);
			}
			
			@Override // �������� Overriding�� �ƴ�
			public void test() {
				testInner();
				System.out.println(str); // �̳�Ŭ�������� ���ú����� �����Ϸ��� final����(���)���� ��밡��
			}
		};
		anony.test();
//		anony.testInner(); //�� �Ұ�  >>> test()�� �������̵��ؼ� testInner() ȣ�� ����
		
		

	} // end main()
	
	
	

} // end class
