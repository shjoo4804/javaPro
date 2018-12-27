package test.com;

public class Test01Type {
	//field 영역

	public static void main(String[] args) {
		// local 영역 : 변수의 초기화가 필수적
		System.out.println("type & variable");
		
		// 타입:유형,그릇(데이터를 담는 곳)
		// 기본타입(정수,실수) , 참조타입

		// 정수타입
		byte su; // 1byte>>8bit>>-128~127까지 표현가능   0000 0000
//		System.out.println(su);
		su = (byte)128; // 128을 byte(범위에서)로 바꾼 값이 들어감
		System.out.println(su);
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		// System이라는 클래스에서 out이라는 속성, println()기능 수행
		
		
		short su2 = 10; // 2byte>>16bit
		su2 = (short)-33000; // 형변환해주기(다운캐스팅)
		System.out.println(su2);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		
		
		char su3 = 10; // 2byte>>0포함 양의정수, 한 글자(문자형) (ex. 'a', '김')
		
		char su33 = 'A'; // char타입은 무조건 한 글자를 넣어줘야함 (''대신 ' ')
		System.out.println(su33);
		System.out.println((int)su33);
		System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
		
		
		int su4 = 10; // default 타입 // 4byte>>약-21억~21억
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		String str = "1000";
		int strsu = Integer.parseInt(str); // parseInt 분석(parsing)해서 int로 바꿔주겠다
		System.out.println(str+2000);
		
		
		long su5 = 10L; // 8byte>>-900경~900경
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		
		// 실수 타입
		double d1 = 3.14; // default 타입 - 기본 실수타입은 double //8byte
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println(Double.parseDouble("333.333")+22);
		
		
		float d2 = 3.14f; // double타입과 구분하기 위해서 뒤에 f를 붙임 //4byte
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		
		
		boolean b = false; // 참(ture,1) 혹은 거짓(false,0) 값만 담을 수 있음
		System.out.println(b);
		System.out.println(Boolean.TRUE+","+Boolean.FALSE);
		System.out.println(Boolean.parseBoolean("ture"));
		
		// 글자(문자열)를 담는 타입>> String
		String name = "abc";
		//CharSequence cs = "cba";
		
	}

}
