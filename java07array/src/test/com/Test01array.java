package test.com;

public class Test01array {

	public static void main(String[] args) {
		
		System.out.println("array");

		// ����
		int kor = 10;
		String name = "kim";
		
				
		// ����Ÿ���� ������ '����'�� �߿��� ��. ���� �� �ʿ��� ��. - �迭���
		int a1=0, a2=1, a3=2;
		
		// �迭 : �޸𸮿� �ּҰ� �Ҵ��� �ǰ�,
		//      �Ҵ�� ���̸�ŭ�� �� index(position)�� �����͸� ����
		//int[] sus = {1,2,3}; //���� �迭�� �Ҵ�
		int[] sus = new int[]{11,22,33,44,55,66}; // ���� ���� ����. ����. �����Ҵ�
		System.out.println(sus);
		System.out.println(sus[0]);
		System.out.println(sus[1]);
		System.out.println(sus[2]);
		System.out.println(sus[3]);
		System.out.println("sus length:"+sus.length);
		
		for (int i = 0; i < sus.length; i++) { // sus.length �迭�� ����(ũ��)
			System.out.println(sus[i]);
		}
		
		int[] sus2 = new int[10]; //{0,0,0}�迭�� �����Ǿ����� //���� �迭�� ������� ��(�ּҷ� �Ҵ�)
		System.out.println(sus2);
		
		//{0,0,0} << {1,2,3}
		System.out.println("sus2 length:"+sus2.length);
		for (int i = 0; i < sus2.length; i++) {
			sus2[i] = (i+1)*10;
		}
//		
//		sus2[0] = 1;
//		sus2[1] = 2;
//		sus2[2] = 3;
		
		for (int i = 0; i < sus2.length; i++) {
			System.out.println(sus2[i]);
		}
		
		
		
	} // end main()

} // end class
