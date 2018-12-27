package test.com;

public class Test04for {

	public static void main(String[] args) {
		System.out.println("for...");

		// 참이면 반복적으로 실행하기
		// 행동, 상황, 동작을 무한히 제어 (반복적) - for보다는 다른 반복문 사용-> while
		// for 반복문 : 카운팅(횟수), 길이, 용량 : 정해진 갯수일 경우에 주로 사용

		for (int a = 0 ; /*조건*/a < 10 ; a++) { 
			// a=0세팅하고, 참이면 a++함. 조건이 비어있으면 true
			System.out.println("for..." + a);
		}
		
		for (int i = 0; i < 100; i++) { //i++, ++i같은 것 (단독으로 쓰였으므로)
			System.out.println("i..." + i);			
		}
		
		for (char i = 'A'; i <= 'z'; i++) {
			System.out.println(i+">>"+(int)i);
		}
		

	} // end main()

} // end class
