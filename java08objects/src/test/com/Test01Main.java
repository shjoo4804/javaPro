package test.com;

public class Test01Main {
	
	// class�� �����ϴ� 4�� ��� 
	// 1.��� : �޼ҵ� method, �Լ� function >> ����� ǥ��
	// 2.�Ӽ� : �ʵ� field, ��������
	// 3.������ : ����Ʈ���� constructor, ��ü�������Ǻ�
	// 4.Ŭ���� : ����Ŭ����, ��øŬ����
	//         {}, static, @������̼� ���� �� �� ����
	
	// Ŭ���� ��� ���� : �ٸ� Ÿ���� ��� �ϳ��� ����(��ü)�� ������� �� �� ���
	
	/*�Ӽ� �κ�*/
	int su; // ���������� ���� �ص� �⺻���� �־���	
	int[] sus;
	int[][] suss;
	double d;
	String name;
	
	/*������ == Ŭ������ �̸��� ����*/
	public Test01Main() {
		System.out.println("Test01Main()...");
	}
	
	public static void main(String[] args) {
		System.out.println("object");
		
		Test01Main tm = new Test01Main(); // new �����ڸ� ����ؼ� ��ü �����
		System.out.println(tm); // ��ü�� �ּ�
		System.out.println(tm.su);
		System.out.println(tm.sus);
		System.out.println(tm.suss);
		System.out.println(tm.d);
		System.out.println(tm.name);
		

	} // end main()

} // end class
