package test.com;

public class Test02Ifelse {

	public static void main(String[] args) {
		System.out.println("ifelse");

		// 조건에 대한 분기처리 : ifelse 참과 거짓일 때

		int x = 5;
		if (x != 5) {
			System.out.println("if"); // 참일때
		} else {
			System.out.println("else"); // 거짓일때
		}

		int su = 8;
		if (su == 10) { // if~else if : 첫 번째로 참이 걸린 곳에서 끝남
			System.out.println("a");
		} else if (su == 9) {
			System.out.println("b");
		} else if (su == 8) {
			System.out.println("c");
		} else if (su == 7) {
			System.out.println("d");
		} else if (su == 6) {
			System.out.println("e");
		} else {
			System.out.println("else");
		}
		
		
		char c = 'b';
		String grade = null;
		if (c == 'a') { // if~else if : 첫 번째로 참이 걸린 곳에서 끝남
			grade = "A";
		} else if (c == 'b') {
			grade = "B";
		} else if (c == 'c') {
			grade = "C";
		} else if (c == 'd') {
			grade = "D";
		} else if (c == 'e') {
			grade = "E";
		} else {
			System.out.println("else");
		}
		System.out.println(grade);

	} // end main()

} // end class
