package test.com.ex02;

public class Test01Bus extends Test01Car {
	
	boolean transfer; // ȯ�°��ɿ���
	String cardReader; // ī�帮����𵨸�
	
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
