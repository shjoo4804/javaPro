package test.go;

public class Test02Score {
	//1.�Ӽ�: ��������, field
	String name = "kim"; // ��ü ���� ������ ����������
	int kor = 100;
	int eng = 100;
	int math = 100;
	int total = kor+eng+math;
	double avg = total/3.0;
	String grade = "A";
	
	
	// 2.������ : ������ : field(��������)�� �ʱ�ȭ
	public Test02Score() { 
		System.out.println("Test02Score()");
		name = "yang"; // ��ü�� new �����Ǵ� ������ �ٲ�
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
			grade = "����";			
		}
	}
	



} // end class
