package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02ScoreIf {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		
		System.out.println("����ó�����α׷�");
		System.out.println("�̸��� �Է��ϼ���");
		String name = br.readLine();
		System.out.println(name);
		System.out.println("���������� �Է��ϼ���");
		int kor = Integer.parseInt(br.readLine());
		System.out.println(kor);
		System.out.println("���������� �Է��ϼ���");
		int eng = Integer.parseInt(br.readLine());
		System.out.println(eng);
		System.out.println("���������� �Է��ϼ���");
		int math = Integer.parseInt(br.readLine());
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
		// if else if
		if (avg>=90) {
			grade = "A";
		} else if (avg>=80) {
			grade = "B";
		} else if (avg>=70) {
			grade = "C";
		} else {
			grade = "����";
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
