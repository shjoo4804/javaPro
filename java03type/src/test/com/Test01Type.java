package test.com;

public class Test01Type {
	//field ����

	public static void main(String[] args) {
		// local ���� : ������ �ʱ�ȭ�� �ʼ���
		System.out.println("type & variable");
		
		// Ÿ��:����,�׸�(�����͸� ��� ��)
		// �⺻Ÿ��(����,�Ǽ�) , ����Ÿ��

		// ����Ÿ��
		byte su; // 1byte>>8bit>>-128~127���� ǥ������   0000 0000
//		System.out.println(su);
		su = (byte)128; // 128�� byte(��������)�� �ٲ� ���� ��
		System.out.println(su);
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		// System�̶�� Ŭ�������� out�̶�� �Ӽ�, println()��� ����
		
		
		short su2 = 10; // 2byte>>16bit
		su2 = (short)-33000; // ����ȯ���ֱ�(�ٿ�ĳ����)
		System.out.println(su2);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		
		
		char su3 = 10; // 2byte>>0���� ��������, �� ����(������) (ex. 'a', '��')
		
		char su33 = 'A'; // charŸ���� ������ �� ���ڸ� �־������ (''��� ' ')
		System.out.println(su33);
		System.out.println((int)su33);
		System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
		
		
		int su4 = 10; // default Ÿ�� // 4byte>>��-21��~21��
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		String str = "1000";
		int strsu = Integer.parseInt(str); // parseInt �м�(parsing)�ؼ� int�� �ٲ��ְڴ�
		System.out.println(str+2000);
		
		
		long su5 = 10L; // 8byte>>-900��~900��
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		
		// �Ǽ� Ÿ��
		double d1 = 3.14; // default Ÿ�� - �⺻ �Ǽ�Ÿ���� double //8byte
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println(Double.parseDouble("333.333")+22);
		
		
		float d2 = 3.14f; // doubleŸ�԰� �����ϱ� ���ؼ� �ڿ� f�� ���� //4byte
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		
		
		boolean b = false; // ��(ture,1) Ȥ�� ����(false,0) ���� ���� �� ����
		System.out.println(b);
		System.out.println(Boolean.TRUE+","+Boolean.FALSE);
		System.out.println(Boolean.parseBoolean("ture"));
		
		// ����(���ڿ�)�� ��� Ÿ��>> String
		String name = "abc";
		//CharSequence cs = "cba";
		
	}

}
