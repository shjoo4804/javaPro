package test.com;

public class Test01AAA extends Test01BBB{
	String name;
	String name2;
	String name3;
	String name4;
	String name5;
	
	public Test01AAA() {
		super(); // 상속받은 클래스의 인자없는 생성자를 불러오는 메소드 (생략되어있음)
		System.out.println("Test01AAA()");
	}
	
	public void aaa() {
		// extends를 받지 않았을 때, 
		// Test01BBB클래스의 함수를 쓰기 위해서는, 해당 클래스의 객체를 생성해서 call해야함
		Test01BBB tb = new Test01BBB();
		tb.sum();
		
		//extends를 받았을 때
		sum();
		ccc();
	}
	
	
	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		super.ccc();
	}
	
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return super.sum();
	}

}
