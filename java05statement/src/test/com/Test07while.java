package test.com;

public class Test07while {

	public static void main(String[] args) {
		
		System.out.println("while");
		// �ݺ��� while : ����, ��ȣ, ��Ȳ�� �� ������ ���ѹݺ��� ������..
		
		String x = "x";
		while (true) {
			// ������ true�̸� ������ �ݺ�
			System.out.println("x�� �ƴ� ���� ������ ���..");
			x = "x";
			if(x.equals("x")) {
				break;
			}
			
		}
		System.out.println("end while");
		
		
		
	} // end main()

} // end class