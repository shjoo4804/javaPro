package test.com;

public class Tset01Main {

	public static void main(String[] args) {
		System.out.println("interface & implements");
		
		System.out.println(Test01xxx.NUM);
		Test01xxx.test4();
		
		
		// ����� ������ �� ������ : ����� �̿��� ĳ����. ����� �� �ִ� Ÿ���� ���� Ÿ��, �ȿ��� ���ǵ� �͵鸸 ��밡���ϴ�
		Test01xxx tx = new Test01zzz(); // �߻�޼ҵ尡 �����ǵ� Ŭ������ ����
		tx.test(); // ���� ������ Test01zzz
		tx.test2();
		tx.test3();
		System.out.println(Test01zzz.NUM);
		
		
		Test01xxx tx2 = new Test01xxx() { // ����Ŭ����, �͸�Ŭ����, ����Ŭ����
			// �ش� ����� Test01xxx�� ��ӹ��� ������, ���� Ŭ������ �ƴ�
			@Override // ��� ���迩�� overriding��
			public void test() {
				System.out.println("Aaa");
				
			}

			@Override
			public void test2() {
				// TODO Auto-generated method stub
				
			}
			
		};
			
		tx2.test();	
		
		
		
	}

}
