package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Score");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 3���� �л� �迭�� ����� (�л� �̸��� �迭��, �̸��� �Է¹��� ����)
		// �� �л��� ������ ó���ϴ� ���α׷��� �ϼ��Ͻÿ�
		// for���� ����� ��

		// ���� ��� ����---
		// ȫ�浿1 90 90 90 270(����) 90(���) A(���)
		// ȫ�浿2 90 90 90 270 90 A
		// ȫ�浿3 90 90 90 270 90 A
		
		String[] names = new String[] {"ȫ�浿1","ȫ�浿2","ȫ�浿3"};
		
		String datas = ""; // ***����� �κ� �̸� �����α�

		for (int i = 0; i < names.length; i++) {
			// ȫ�浿 ���� ������ �Է��ϼ���
			// 99
			System.out.println(names[i]+" ���� ������ �Է��ϼ���");
			String kor = br.readLine();
			System.out.println(kor);

			// ȫ�浿 ���� ������ �Է��ϼ���
			// 97
			System.out.println(names[i]+" ���� ������ �Է��ϼ���");
			String eng = br.readLine();
			System.out.println(eng);

			// ȫ�浿 ���� ������ �Է��ϼ���
			// 98
			System.out.println(names[i]+" ���� ������ �Է��ϼ���");
			String math = br.readLine();
			System.out.println(math);

			// ȫ�浿 ���� : 294
			int total = Integer.parseInt(kor) + Integer.parseInt(math) + Integer.parseInt(eng);
			System.out.println(names[i]+" ���� : " + total);

			// ȫ�浿 ��� : 90
			double avg = total / 3.0;
			System.out.println(names[i]+" ��� : " + avg);

			// ȫ�浿 ��� : A
			String grade = "";
			if (avg >= 90) {
				grade = "A";
			} else if (avg >= 80) {
				grade = "B";
			} else if (avg >= 70) {
				grade = "C";
			} else {
				grade = "����";
			}
			System.out.println(names[i]+" ��� : " + grade);
			
			datas += names[i]+" " + kor + " " + eng + " " + math 
					+ " " + total + " " + avg + " " + grade+"\n"; // ***���� ���ؼ� ����ϱ�
			
			System.out.println("=================");
		} // end for
		
		System.out.println(datas); // ***

	} // end main()

} // end class
