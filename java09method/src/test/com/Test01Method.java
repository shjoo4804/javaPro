package test.com;

public class Test01Method {
	
	// ���� ���� �޼ҵ�, ���� ���� �ʴ� �޼ҵ�
	// {},	 ;���. ��Ͼ�����
	// �޼ҵ� ���� : ���ڰ�/��ȯ�� ������ ���� 4���� 
	
	
	// 1. ���ڰ�X / ��ȯ��X �޼ҵ�
	public void aaa() {
		System.out.println("aaa()");
		return ; // ��ȯ���� ����. ��������
	}
	
	
	// 2. ���ڰ�X / ��ȯ��O �޼ҵ� - getter
	public int aaa2() { // ��ȯŸ���� ����Ÿ��(byte, short, char, int, long)
		System.out.println("aaa2()");
		return 100; 
	}
	
	
	// 3. ���ڰ�O / ��ȯ��X �޼ҵ� - setter
	public void aaa3(int x) {
		System.out.println("aaa3("+x+")");
//		return ; 
	}
	public void aaa3(int x, int y) { // aaa3() �޼ҵ� �����ε�
		System.out.println("aaa3("+(x+y)+")");
//		return ; 
	}
	
	
	// 4. ���ڰ�O / ��ȯ��O �޼ҵ�
	public String[] aaa4(String name) {
		System.out.println("aaa4("+name+")");
		return new String[]{"hello","hi"}; // String[] ��ȯ
	}
	
}
