package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02ScoreRLineFor {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		
		System.out.println("<<����ó�����α׷�>>");
		System.out.println("�л� ���� �Է��ϼ���.");
		String sCount = br.readLine();
		System.out.println("�л� �� : "+sCount);
		System.out.println();
		
		for (int i = 0; i < Integer.parseInt(sCount); i++) {
			System.out.println((i+1)+"�� �л��� �̸��� �Է��ϼ���");
			String name = br.readLine(); // ������ �����͸� �Է¹ޱ�
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
			
//			System.out.println("����:"+(kor+eng+math)); // ���ڿ�+���ڴ� ���ڿ��� �Ǿ, ��ȣ�� ���������
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
	/*		grade = avg>=90? "A":avg>=80?"B":avg>=70?"C":"����";
			System.out.println("���:"+grade);*/
			
			grade = avg>=90? "A":
					avg>=80? "B":
					avg>=70? "C":"����";
			System.out.println("���:["+grade+"]");
			System.out.println();
		}
		
		
		// 1��(2,3...) �л��� �̸��� �Է��ϼ���
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
