package test.com;

public class Test03Switch {

	public static void main(String[] args) {
		System.out.println("switch");
		
		// key : ����, ������, String(Java7����)
		char key = 'B';
		
		switch (key) {
		case 'A':
			System.out.println((int)key);
			break;
		case 'B':
			System.out.println((int)key);
			break;
		case 'C':
			System.out.println((int)key);
			break;

		default:
			break;
		}

	} // end main()

} // end class
