package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(Test02AAA.NAME);
		
		Test02AAA ta = new Test02BBB() { };
		// �����ʿ� �ִ� Ŭ������ ���� Ŭ������ ��ӹ���
		ta.test("aaa");
		//ta.aaa(); // ������ �ȵ�
		
		
		
	}

}
