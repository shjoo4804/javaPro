package test.com;

public class Test01If {

	public static void main(String[] args) {
		System.out.println("if");
		
		// 조건에 대한 분기처리 : if조건식이 참일 때만 동작함
		
		if (5==5) {
			System.out.println("kim");
			System.out.println("kim");
		}
		
		boolean b = (8&2) < 10;
		if (b) {
			System.out.println("lee");
		}

	} // end main()

} // end class
