package test.com;

public interface Test01xxx {
	
	// �Ӽ� : ������ static final
	/*static final*/ int NUM = 0; // final����(���)�� �ʱ�ȭ�ʼ�! �빮��!
	
	
	// �޼ҵ� : �߻�޼ҵ�
	public abstract void test(); 
	public /*abstract*/ void test2(); // abstract �� ��������
	
	
	public default void test3() {
		// ���� ����� �߻�޼ҵ尡 �ƴϰ� ��. (default �޼ҵ� ���)
		System.out.println("test3()");
	}
	
	public static void test4() {
		// Ȥ�� static �޼ҵ�
		System.out.println("test4()");
	}
	
	
}
