package test.com;

public class Test03Switch2 {

	public static void main(String[] args) {
		System.out.println("switch");
		
		// key : 정수, 문자형, String(Java7부터)
		int key = 3;
		switch (key) {
		case 10: //key가 10일때
			System.out.println(100*key);
//			break; //break가 if문 안에 들어있을 때에는 if문 블록{}은 있는 취급을하지않음
			if (100*key>500) {
				break;
			}
			System.out.println("Aaaa"); // if문 아래에서는 더 쓸수 있음
		case 9:
			System.out.println(90*key);
			break;
		case 8:
			System.out.println(80*key);
			break;

		default:
			System.out.println(0*key);
			break;
		}

	} // end main()

} // end class
