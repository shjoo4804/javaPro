package test.com;

public class Test02Ifelse {

	public static void main(String[] args) {
		System.out.println("ifelse");

		// ���ǿ� ���� �б�ó�� : ifelse ���� ������ ��

		int x = 5;
		if (x != 5) {
			System.out.println("if"); // ���϶�
		} else {
			System.out.println("else"); // �����϶�
		}

		int su = 8;
		if (su == 10) { // if~else if : ù ��°�� ���� �ɸ� ������ ����
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
		if (c == 'a') { // if~else if : ù ��°�� ���� �ɸ� ������ ����
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
