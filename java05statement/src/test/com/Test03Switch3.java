package test.com;

public class Test03Switch3 {

	public static void main(String[] args) {
		System.out.println("switch");
		
		// key : 정수, 문자형, String(Java7부터)
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
		
		// if문과의 차이?

	} // end main()

} // end class
