package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score2 {

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

		String[] names = new String[] { "ȫ�浿1", "ȫ�浿2", "ȫ�浿3" };

		String[][] scores = new String[names.length][7];
		
//		String[] score = new String[7]; 
		// for������ ������ new�� �ѹ��� �� ��.. �ּҰ� �ϳ��ۿ� ����
		// ���� �������� �ִ� �����͸� ����־���

		for (int x = 0; x < scores.length; x++) {
			// ȫ�浿 ���� ������ �Է��ϼ���
			// 99
			System.out.println(names[x] + " ���� ������ �Է��ϼ���");
//			String kor = br.readLine();
			String kor = "90";
			System.out.println(kor);

			// ȫ�浿 ���� ������ �Է��ϼ���
			// 97
			System.out.println(names[x] + " ���� ������ �Է��ϼ���");
//			String eng = br.readLine();
			String eng = "98";
			System.out.println(eng);

			// ȫ�浿 ���� ������ �Է��ϼ���
			// 98
			System.out.println(names[x] + " ���� ������ �Է��ϼ���");
//			String math = br.readLine();
			String math = "97";
			System.out.println(math);

			// ȫ�浿 ���� : 294
			int total = Integer.parseInt(kor) + Integer.parseInt(math) + Integer.parseInt(eng);
			System.out.println(names[x] + " ���� : " + total);

			// ȫ�浿 ��� : 90
			double avg = total / 3.0;
			System.out.println(names[x] + " ��� : " + avg);

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
			
			System.out.println(names[x] + " ��� : " + grade);
//			String[] score = new String[] {names[x], kor, eng, math, total+"", avg+"", grade};
			String[] score = new String[7]; // �ȿ� new �����ϸ� �ּҰ� �ٸ��� �Ҵ��
			score[0] = names[x];
			score[1] = kor;
			score[2] = eng;
			score[3] = math;
			score[4] = total+"";
			score[5] = avg+"";
			score[6] = grade;
			scores[x] = score;
		}
		
		for (int x = 0; x < scores.length; x++) {
			for (int i = 0; i < scores[x].length; i++) {
				System.out.print(scores[x][i]+" ");
			}
			System.out.println();
		}
		
	} // end main()

} // end class
