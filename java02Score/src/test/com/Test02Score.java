package test.com;

public class Test02Score {
	public static void main(String[] args) {
		System.out.println("����ó�����α׷�");
		System.out.println("�̸��� �Է��ϼ���");
		String name = "kim";
		System.out.println(name);
		System.out.println("���������� �Է��ϼ���");
		int kor = 100;
		System.out.println(kor);
		System.out.println("���������� �Է��ϼ���");
		int eng = 100;
		System.out.println(eng);
		System.out.println("���������� �Է��ϼ���");
		int math = 100;
		System.out.println(math);
		
		int total = kor+eng+math;
		System.out.println("����:"+total);
		//��տ� ���������Ұ�.avg(double)
		double avg = total/3.0;
		System.out.println("���:"+avg);
		//��������� ��������
		//90���̻� A,
		//80���̻� B,
		//70���̻� C,
		//70���̸� "����"
		//ó���ϴ� ���α׷��� �߰��ϼ���
		//��޿� ���������Ұ�.grade(String)
		String grade = null;//null(�ּҰ��̾���)
		grade = avg>=90?"A":
				avg>=80?"B":
				avg>=70?"C":"����";
		System.out.println("���:["+grade+"]");
		//�̸��� �Է��ϼ���
		//ȫ�浿
		//���������� �Է��ϼ���
		//99
		//���������� �Է��ϼ���
		//98
		//���������� �Է��ϼ���
		//97
		//����:99+98+97=294
		//���:����/3=98
		//���:A
		
	}
}
