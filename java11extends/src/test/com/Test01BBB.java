package test.com;

public class Test01BBB extends Test01CCC {
	
	int su;
	int su2;
	int su3;
	int su4;
	int su5;
	
	public Test01BBB() {
		super();
		System.out.println("Test01BBB()");
	}
	
	public int sum() {
		System.out.println(avg); // Test01CCC�� �Ӽ�, ��� ��� ����
		/*this.*/ccc(); // �������̵��� BBB�� ccc()ȣ��
		super.ccc(); // CCC�� ccc()ȣ��
		return su+100;
	}
	
//	@Override // ������̼����� �������̵� �� �޼ҵ����� �˷���
//	public void ccc() { // �޼ҵ��� ������ (�������̵�)
//		System.out.println(1000+2000);
//	}
	
	
	@Override // �ڵ��ϼ�(Cntl+Space)
	public void ccc() {
		System.out.println("BBB ccc");
//		super.ccc();
	}
	
}
