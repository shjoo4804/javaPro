package test.go;

public class Test02scoreMain {
	public static void main(String[] args) {
		System.out.println("object score..");
		
		Test02Score ts = new Test02Score();
		System.out.println(ts);
		System.out.println(ts.name);
		System.out.println(ts.kor);
		System.out.println(ts.eng);
		System.out.println(ts.math);
		System.out.println(ts.total);
		System.out.println(ts.avg);
		System.out.println(ts.grade);
		System.out.println("===================");
		
		ts.name = "lee"; // 객체 생성 이후에 바꿈
		ts.kor = 88;
		ts.eng = 88;
		ts.math = 88;
		ts.total = ts.kor + ts.eng + ts.math;
		ts.avg = ts.total/3.0;
		if(ts.avg>=90) {
			ts.grade = "A";
		} else if(ts.avg>=80) {
			ts.grade = "B";
		} else if(ts.avg>=80) {
			ts.grade = "C";
		} else {
			ts.grade = "과락";			
		}
		
		System.out.println(ts);
		System.out.println(ts.name);
		System.out.println(ts.kor);
		System.out.println(ts.eng);
		System.out.println(ts.math);
		System.out.println(ts.total);
		System.out.println(ts.avg);
		System.out.println(ts.grade);
		
		
		

	} // end main()
}
