package test.com;

public class Test03ScoreSwitch {
	public static void main(String[] args) {
		System.out.println("����ó�����α׷�");
		System.out.println("�̸��� �Է��ϼ���");
		String name = "kim";
		System.out.println(name);
		System.out.println("���������� �Է��ϼ���");
		int kor = 100;
		System.out.println(kor);
		System.out.println("���������� �Է��ϼ���");
		int eng = 80;
		System.out.println(eng);
		System.out.println("���������� �Է��ϼ���");
		int math = 70;
		System.out.println(math);
		
//		System.out.println("����:"+(kor+eng+math)); // ���ڿ�+���ڴ� ���ڿ��� �Ǿ, ��ȣ�� ���������
		int total = kor+eng+math;
		System.out.println("����:"+total);
		
		//��տ� ���������� ��. avg
		double avg = total/3.0;
		System.out.println("���:"+avg); // ��հ��� �Ǽ��� ��� ���ؼ� 3.0(�Ǽ�)���� ����
		
		// ��������� ��������
		// 90���̻� A, 80���̻� B,
		// 70���̻� C, 70�� �̸� F or "����" ó���ϴ� ���α׷��� �߰��ϼ���
		// ��޿� ���� ������ ��. grade(char or String)
		String grade = null;
		
		//switch case break
		
		
		// case 100�� �ݺ�
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
			// 90�� �ݺ��ϴ� ���

		default:
			break;
		}
*/
		
		// 10�� �ڸ��� �̿��ϱ�
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
		
		
		System.out.println("���:["+grade+"]");
		
		
		// �̸��� �Է��ϼ���
		// ȫ�浿
		// ���������� �Է��ϼ���
		// 99
		// ���������� �Է��ϼ���
		// 98
		// ���������� �Է��ϼ���
		// 97
		// ����:99+98+97=294
		// ���:98(����/3)
		// ���:A
	}

}
