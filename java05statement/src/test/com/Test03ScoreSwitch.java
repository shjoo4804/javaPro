package test.com;

public class Test03ScoreSwitch {
	public static void main(String[] args) {
		System.out.println("성적처리프로그램");
		System.out.println("이름을 입력하세요");
		String name = "kim";
		System.out.println(name);
		System.out.println("국어점수를 입력하세요");
		int kor = 100;
		System.out.println(kor);
		System.out.println("영어점수를 입력하세요");
		int eng = 80;
		System.out.println(eng);
		System.out.println("수학점수를 입력하세요");
		int math = 70;
		System.out.println(math);
		
//		System.out.println("총점:"+(kor+eng+math)); // 문자열+숫자는 문자열이 되어서, 괄호로 묶어줘야함
		int total = kor+eng+math;
		System.out.println("총점:"+total);
		
		//평균용 변수선언할 것. avg
		double avg = total/3.0;
		System.out.println("평균:"+avg); // 평균값을 실수로 얻기 위해서 3.0(실수)으로 나눔
		
		// 평균점수를 기준으로
		// 90점이상 A, 80점이상 B,
		// 70점이상 C, 70점 미만 F or "과락" 처리하는 프로그램을 추가하세요
		// 등급용 변수 선언할 것. grade(char or String)
		String grade = null;
		
		//switch case break
		
		
		// case 100개 반복
/*		int key = (int)avg;
		switch (key) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			grade = "A";
			break;
			// 90개 반복하는 방법

		default:
			break;
		}
*/
		
		// 10의 자리를 이용하기
		int key = (int)avg/10;
		switch (key) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;

		default:
			break;
		}
		
		
		System.out.println("등급:["+grade+"]");
		
		
		// 이름을 입력하세요
		// 홍길동
		// 국어점수를 입력하세요
		// 99
		// 영어점수를 입력하세요
		// 98
		// 수학점수를 입력하세요
		// 97
		// 총점:99+98+97=294
		// 평균:98(총점/3)
		// 등급:A
	}

}
