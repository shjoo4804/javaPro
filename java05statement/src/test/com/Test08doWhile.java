package test.com;

public class Test08doWhile {

	public static void main(String[] args) {
		System.out.println("do while...start");
		// �ϴ� �޼����� �ְ� ���� �ݺ��� �� �� �� �� ������..

		String x = "x";
		do {
			System.out.println("do{}");
			System.out.println("do{}");
			System.out.println("do{}");
			System.out.println("do{}");
			x = "y";
		} while(!x.equals("x"));
		
		
		System.out.println("do while...end");
	} // end main()

} // end class
