package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(Test02AAA.NAME);
		
		Test02AAA ta = new Test02BBB() { };
		// 오른쪽에 있는 클래스가 왼쪽 클래스를 상속받음
		ta.test("aaa");
		//ta.aaa(); // 실행이 안됨
		
		
		
	}

}
