package test.com;

public class Test07while {

	public static void main(String[] args) {
		
		System.out.println("while");
		// 반복문 while : 동작, 신호, 상황이 올 때까지 무한반복을 전제로..
		
		String x = "x";
		while (true) {
			// 조건이 true이면 무한히 반복
			System.out.println("x가 아닌 값을 넣으면 계속..");
			x = "x";
			if(x.equals("x")) {
				break;
			}
			
		}
		System.out.println("end while");
		
		
		
	} // end main()

} // end class