package test.com;

public class Test04for {

	public static void main(String[] args) {
		System.out.println("for...");

		// ���̸� �ݺ������� �����ϱ�
		// �ൿ, ��Ȳ, ������ ������ ���� (�ݺ���) - for���ٴ� �ٸ� �ݺ��� ���-> while
		// for �ݺ��� : ī����(Ƚ��), ����, �뷮 : ������ ������ ��쿡 �ַ� ���

		for (int a = 0 ; /*����*/a < 10 ; a++) { 
			// a=0�����ϰ�, ���̸� a++��. ������ ��������� true
			System.out.println("for..." + a);
		}
		
		for (int i = 0; i < 100; i++) { //i++, ++i���� �� (�ܵ����� �������Ƿ�)
			System.out.println("i..." + i);			
		}
		
		for (char i = 'A'; i <= 'z'; i++) {
			System.out.println(i+">>"+(int)i);
		}
		

	} // end main()

} // end class
