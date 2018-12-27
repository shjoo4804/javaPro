package test.com;

public class Test08doWhile {

	public static void main(String[] args) {
		System.out.println("do while...start");
		// 일단 메세지를 주고 나서 반복을 할 지 말 지 제안함..

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
