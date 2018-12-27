package test.com;

public class Test01Main {
	
	// class를 구성하는 4대 멤버 
	// 1.기능 : 메소드 method, 함수 function >> 동사로 표현
	// 2.속성 : 필드 field, 전역변수
	// 3.생성자 : 컨스트럭터 constructor, 객체생성정의부
	// 4.클래스 : 내부클래스, 중첩클래스
	//         {}, static, @어노테이션 등이 올 수 있음
	
	// 클래스 사용 이유 : 다른 타입을 묶어서 하나의 변수(객체)로 만들고자 할 때 사용
	
	/*속성 부분*/
	int su; // 전역변수는 선언만 해도 기본값이 주어짐	
	int[] sus;
	int[][] suss;
	double d;
	String name;
	
	/*생성자 == 클래스의 이름과 같음*/
	public Test01Main() {
		System.out.println("Test01Main()...");
	}
	
	public static void main(String[] args) {
		System.out.println("object");
		
		Test01Main tm = new Test01Main(); // new 연산자를 사용해서 객체 만들기
		System.out.println(tm); // 객체의 주소
		System.out.println(tm.su);
		System.out.println(tm.sus);
		System.out.println(tm.suss);
		System.out.println(tm.d);
		System.out.println(tm.name);
		

	} // end main()

} // end class
