package test.com.ex02;

public class Test01Bus extends Test01Car {
	
	boolean transfer; // 환승가능여부
	String cardReader; // 카드리더기모델명
	
	public void broadcast() {
		System.out.println("broadcast()");
	}
	
	public void bell() {
		System.out.println("bell");
	}

	@Override
	public void stop() {
		System.out.println("stop() Bus");
	}
	
}
