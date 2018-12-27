package test.com.ex02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test01main {

	Test01Car c;

	public void test(Test01Car c) { // Car를 상속받은 Bus,Taxi도 Car타입이므로 매개변수에 넣어도 됨
		System.out.println("test()");
		c.run();
		c.start();
		c.stop();
		
	}

	public Test01main() {

	}

	public Test01main(Test01Car c) {
		this.c = c;
	}
	

	public static void main(String[] args) {
		System.out.println("hello");

		Test01main tm = new Test01main();

		tm.test(new Test01Car() {
			@Override
			public void stop() { // 콜백 메소드 (이벤트 처리 시 많이 사용됨-누르면 동작)
				System.out.println("***stop()");
			}
		});

		tm.test(new Test01Bus());
		tm.test(new Test01Taxi());
		
		new Test01main(new Test01Car() {
			@Override
			public void stop() {
				
			}
		});
		
		new Test01main(new Test01Bus());
		new Test01main(new Test01Taxi());

	} // end main()

}
