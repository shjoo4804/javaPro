package test.com;

public class Test01Operator {

	public static void main(String[] args) {
		System.out.println("operator:연산자");
		
		// (산술우선연산), (캐스팅), .포함연산자
		// 산술연산 : + - * /(정수연산 시 몫) %(나머지)
		System.out.println(10/7); // 몫
		System.out.println(10.0/7.0); // 몫
		System.out.println(10%7); // 나머지
		System.out.println(10.0%7.0); // 나머지
		System.out.println("==============");
		
		
		
		// 비트연산 : &(and) |(or) ^(exclusive or)
		//  0000 1000  : 8 
		//  0000 0010  : 2
		//& 0000 0000  : 0   : & 연산의 결과 
		//| 0000 1010  : 10
		//^ 0000 1010  : 10
		System.out.println(8&2); // 8과 2를 bit로 
		System.out.println(8|2);
		System.out.println(8^2);
		
		//  0000 1111  : 15
		//  0000 0010  : 2
		//^ 0000 1101  : 13
		System.out.println(15|2);
		System.out.println(15^2);
		System.out.println("==============");		
		
		
		
		// 논리연산 : ture, flase를 비트연산하기 : & | ^ , && || 도 사용가능
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true|false);
		System.out.println(false^false);
		System.out.println("==============");
		System.out.println(true&&true);
		// 더 빠른 연산을 함. false&&~인 경우 뒤에를 확인하지 않고 무조건 false로 도출
		System.out.println(true||false);
		System.out.println("==============");
		
		
		
		// 비교연산 : 결과가 반드시 boolean 타입
		// ==, !=, <, >, <=, >=
		System.out.println(5==5); // 5와 5는 같니
		System.out.println(5!=5); // 5와 5는 다르니
		System.out.println(5<5);
		System.out.println(5>5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println(5>=5||false); // ture||false
		System.out.println(5>=5||5<=5); // ture||true
		System.out.println("==============");
		
		
		
		// 대입연산(할당연산) : =, +=, -=, *=, /=, %=, &=, |=, ^=
		int x = 10;
		System.out.println(x);
		x += 3; // x = x + 3
		System.out.println(x);
		
		int y = 7;
		y = y + 3 & 3; // 산술연산이 비트연산보다 더 우선순위
		//1010
		//0011
		//0010
		System.out.println(y);
		
		int z = 7;
		z = z + (3 & 3); 
		//0011
		//0011
		//0011
		System.out.println(z);
		System.out.println("==============");
		
		
		
		// 쉬프트 연산(비트이동연산) : >>, <<, >>>
		// 8>>2 : 1000을 오른쪽으로 2비트칸아동 : 0010
		System.out.println(8 >> 2);
		// 5>>2 : 0101 >> 2 : 0001
		System.out.println(5 >> 2);
		// 1<<3 : 0001 << 3 : 1000
		System.out.println(1 << 3);
		// -8>>>2 
		System.out.println(-8 >>> 2); // 무조건 양수가 됨 (음수의 비트가 1로 시작하는데, 이동하게 되면 앞이 0으로 채워지기 때문에 양수로 바뀜..?
		// 결과 값이 음수로 나오면 안될 때, 쉬프트 연산 사용 (구체적인 값이 중요하지 않을 때. 양수로만 나오면 될 때 사용)
		System.out.println("==============");
		
		
		
		// 증감연산 : ++, --
		int a = 10;
		int b = a++; // 증가하기 전에 먼저 들어감  int (b = a)되고 나서 a++이 됨
		/*++a; // 우선순위가 대입(다른)연산보다 높아짐
		a++; // 다른연산이 우선
		--a;
		a--;*/
		System.out.println(a);
		System.out.println(b);
		System.out.println("==============");
		
		
		
		// 삼항연산(분기처리용):  조건식 ? 참일때 : 거짓일때
		// 조건식은 참, 거짓이 나오는 비교나 논리식이 옴
		System.out.println(5==5? 100 : 0);
		System.out.println(5==50? 100 : 0);
		// 조건식이 참이면 100, 거짓이면 0 출력

		System.out.println(true&false? "kim" : "lee");
		System.out.println(true&5==50? "kim" : "lee");
		int kor = 78;
		char grade = kor>=90 && kor<100? 'A':kor>=80?'B':'C';
		System.out.println(grade);
		System.out.println("==============");
		
		
		
		// 기타연산자:
		// ,(열거형 연산자)    new    ...    :(goto)
		
		
		
		
	} // end main()

} // end class
