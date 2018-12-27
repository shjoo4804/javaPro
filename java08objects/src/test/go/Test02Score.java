package test.go;

public class Test02Score {
	//1.속성: 전역변수, field
	String name = "kim"; // 객체 생성 전부터 정해져있음
	int kor = 100;
	int eng = 100;
	int math = 100;
	int total = kor+eng+math;
	double avg = total/3.0;
	String grade = "A";
	
	
	// 2.생성자 : 사용목적 : field(전역변수)의 초기화
	public Test02Score() { 
		System.out.println("Test02Score()");
		name = "yang"; // 객체가 new 생성되는 시점에 바뀜
		kor = 99;
		eng = 99;
		math = 99;
		total = kor + eng + math;
		avg = total/3.0;
		if(avg>=90) {
			grade = "A";
		} else if(avg>=80) {
			grade = "B";
		} else if(avg>=70) {
			grade = "C";
		} else {
			grade = "과락";			
		}
	}
	



} // end class
