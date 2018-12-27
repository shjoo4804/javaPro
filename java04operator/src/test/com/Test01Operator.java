package test.com;

public class Test01Operator {

	public static void main(String[] args) {
		System.out.println("operator:������");
		
		// (����켱����), (ĳ����), .���Կ�����
		// ������� : + - * /(�������� �� ��) %(������)
		System.out.println(10/7); // ��
		System.out.println(10.0/7.0); // ��
		System.out.println(10%7); // ������
		System.out.println(10.0%7.0); // ������
		System.out.println("==============");
		
		
		
		// ��Ʈ���� : &(and) |(or) ^(exclusive or)
		//  0000 1000  : 8 
		//  0000 0010  : 2
		//& 0000 0000  : 0   : & ������ ��� 
		//| 0000 1010  : 10
		//^ 0000 1010  : 10
		System.out.println(8&2); // 8�� 2�� bit�� 
		System.out.println(8|2);
		System.out.println(8^2);
		
		//  0000 1111  : 15
		//  0000 0010  : 2
		//^ 0000 1101  : 13
		System.out.println(15|2);
		System.out.println(15^2);
		System.out.println("==============");		
		
		
		
		// ������ : ture, flase�� ��Ʈ�����ϱ� : & | ^ , && || �� ��밡��
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true|false);
		System.out.println(false^false);
		System.out.println("==============");
		System.out.println(true&&true);
		// �� ���� ������ ��. false&&~�� ��� �ڿ��� Ȯ������ �ʰ� ������ false�� ����
		System.out.println(true||false);
		System.out.println("==============");
		
		
		
		// �񱳿��� : ����� �ݵ�� boolean Ÿ��
		// ==, !=, <, >, <=, >=
		System.out.println(5==5); // 5�� 5�� ����
		System.out.println(5!=5); // 5�� 5�� �ٸ���
		System.out.println(5<5);
		System.out.println(5>5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println(5>=5||false); // ture||false
		System.out.println(5>=5||5<=5); // ture||true
		System.out.println("==============");
		
		
		
		// ���Կ���(�Ҵ翬��) : =, +=, -=, *=, /=, %=, &=, |=, ^=
		int x = 10;
		System.out.println(x);
		x += 3; // x = x + 3
		System.out.println(x);
		
		int y = 7;
		y = y + 3 & 3; // ��������� ��Ʈ���꺸�� �� �켱����
		//1010
		//0011
		//0010
		System.out.println(y);
		
		int z = 7;
		z = z + (3 & 3); 
		//0011
		//0011
		//0011
		System.out.println(z);
		System.out.println("==============");
		
		
		
		// ����Ʈ ����(��Ʈ�̵�����) : >>, <<, >>>
		// 8>>2 : 1000�� ���������� 2��Ʈĭ�Ƶ� : 0010
		System.out.println(8 >> 2);
		// 5>>2 : 0101 >> 2 : 0001
		System.out.println(5 >> 2);
		// 1<<3 : 0001 << 3 : 1000
		System.out.println(1 << 3);
		// -8>>>2 
		System.out.println(-8 >>> 2); // ������ ����� �� (������ ��Ʈ�� 1�� �����ϴµ�, �̵��ϰ� �Ǹ� ���� 0���� ä������ ������ ����� �ٲ�..?
		// ��� ���� ������ ������ �ȵ� ��, ����Ʈ ���� ��� (��ü���� ���� �߿����� ���� ��. ����θ� ������ �� �� ���)
		System.out.println("==============");
		
		
		
		// �������� : ++, --
		int a = 10;
		int b = a++; // �����ϱ� ���� ���� ��  int (b = a)�ǰ� ���� a++�� ��
		/*++a; // �켱������ ����(�ٸ�)���꺸�� ������
		a++; // �ٸ������� �켱
		--a;
		a--;*/
		System.out.println(a);
		System.out.println(b);
		System.out.println("==============");
		
		
		
		// ���׿���(�б�ó����):  ���ǽ� ? ���϶� : �����϶�
		// ���ǽ��� ��, ������ ������ �񱳳� ������ ��
		System.out.println(5==5? 100 : 0);
		System.out.println(5==50? 100 : 0);
		// ���ǽ��� ���̸� 100, �����̸� 0 ���

		System.out.println(true&false? "kim" : "lee");
		System.out.println(true&5==50? "kim" : "lee");
		int kor = 78;
		char grade = kor>=90 && kor<100? 'A':kor>=80?'B':'C';
		System.out.println(grade);
		System.out.println("==============");
		
		
		
		// ��Ÿ������:
		// ,(������ ������)    new    ...    :(goto)
		
		
		
		
	} // end main()

} // end class
