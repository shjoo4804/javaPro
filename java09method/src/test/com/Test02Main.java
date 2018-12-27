package test.com;

public class Test02Main {

	// 4. 인자값O / 반환값 O 메소드
	public static void main(String[] args) {
		System.out.println("dao main...");

		Test02DAO dao = new Test02DAO();
		System.out.println(dao);

		// 홍길동이라는 문자열을 name 변수에 할당하고
		// dao객체의 insert 메소드에 인자로 전달 후
		// 반환값을 출력하시오.

		String name = "홍길동";
		int result = dao.insert(name); // 한번만 insert를 call하고 싶을 때 변수에 넣어줌
		System.out.println(result);

		if (result == 1) {
			System.out.println("입력 성공");
		} else {
			System.out.println("입력 실패");
		}
		System.out.println();

		////

		boolean result2 = dao.update(new String[] { "a", "b", "c" });

		if (result2 == true) {
			System.out.println("업데이트 성공");
		} else {
			System.out.println("업데이트 실패");
		}
		System.out.println();

		////
		
		int result3 = dao.delete(111);
		System.out.println(result3);
		System.out.println();
		
		///
		
		String[] result4 = dao.selectAll();
		for (int i = 0; i < result4.length; i++) {
			System.out.println(result4[i]);
		}
		System.out.println();
		
		///
		
		String result5 = dao.selectOne(100);
		System.out.println(result5);
		System.out.println();
		
		///
		
		
		int result6 = dao.check(false);
		
		if (result6==1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		

	} // end main()

} // end class
