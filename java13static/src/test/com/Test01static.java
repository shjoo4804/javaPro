package test.com;

public class Test01static {

	int num; // �ν��Ͻ� �ʵ�

	static String name; // new(��ü����)���� �ʾƵ� ������ ������. �޸𸮿� ���� �� ����.
	static final double AVG = 0.0; // ���������� final�� ���� �⺻���� �� �� ����
	
	public static class Note {
		static String name2;
	}
	
	{ // �ʱ�ȭ ��
		num = 99;
	}
	
	static { // static �ʱ�ȭ ��
		name = "kim";
	}
	
	
	public void test() {
		System.out.println("test()..");
		test2();
		aaa();
		System.out.println(Integer.MIN_VALUE); // static final
		System.out.println(AVG);
	}
	
	public static void aaa() {
		
	}
	
	public static void test2() {
		System.out.println("test2()");
		aaa(); // static �޼ҵ常 ȣ�� ����
//		test(); // static�� �ƴϹǷ�, new�ؼ��� ȣ�Ⱑ��
	}

}
