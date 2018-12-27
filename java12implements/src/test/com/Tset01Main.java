package test.com;

public class Tset01Main {

	public static void main(String[] args) {
		System.out.println("interface & implements");
		
		System.out.println(Test01xxx.NUM);
		Test01xxx.test4();
		
		
		// 상속이 전제로 된 다형성 : 상속을 이용한 캐스팅. 사용할 수 있는 타입은 좌측 타입, 안에서 정의된 것들만 사용가능하다
		Test01xxx tx = new Test01zzz(); // 추상메소드가 재정의된 클래스로 생성
		tx.test(); // 실제 실행은 Test01zzz
		tx.test2();
		tx.test3();
		System.out.println(Test01zzz.NUM);
		
		
		Test01xxx tx2 = new Test01xxx() { // 무명클래스, 익명클래스, 로컬클래스
			// 해당 블록이 Test01xxx를 상속받은 것이지, 같은 클래스가 아님
			@Override // 상속 관계여서 overriding됨
			public void test() {
				System.out.println("Aaa");
				
			}

			@Override
			public void test2() {
				// TODO Auto-generated method stub
				
			}
			
		};
			
		tx2.test();	
		
		
		
	}

}
