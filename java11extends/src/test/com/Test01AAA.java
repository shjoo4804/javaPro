package test.com;

public class Test01AAA extends Test01BBB{
	String name;
	String name2;
	String name3;
	String name4;
	String name5;
	
	public Test01AAA() {
		super(); // ��ӹ��� Ŭ������ ���ھ��� �����ڸ� �ҷ����� �޼ҵ� (�����Ǿ�����)
		System.out.println("Test01AAA()");
	}
	
	public void aaa() {
		// extends�� ���� �ʾ��� ��, 
		// Test01BBBŬ������ �Լ��� ���� ���ؼ���, �ش� Ŭ������ ��ü�� �����ؼ� call�ؾ���
		Test01BBB tb = new Test01BBB();
		tb.sum();
		
		//extends�� �޾��� ��
		sum();
		ccc();
	}
	
	
	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		super.ccc();
	}
	
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return super.sum();
	}

}
