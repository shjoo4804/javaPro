package test.com;

public class Test03Switch3 {

	public static void main(String[] args) {
		System.out.println("switch");
		
		// key : ����, ������, String(Java7����)
		String key = "KIM";
		
		switch (key) { 
		case "kim":
			System.out.println("hello "+key);
			break;
		case "KIM":
			System.out.println("HELLO "+key);
			break;
		case "Kim":
			System.out.println("Hello "+key);
			break;

		default:
			break;
		}
		
		// if������ ����?

	} // end main()

} // end class
