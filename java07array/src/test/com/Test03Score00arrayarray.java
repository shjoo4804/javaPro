package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score00arrayarray {

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
		// 0 1 2 3 4 5 6
		
		String[][] strss = new String[3][7];
		strss[0][0] = "ȫ�浿1";
		strss[1][0] = "ȫ�浿2";
		strss[2][0] = "ȫ�浿3";

		for (int x = 0; x < strss.length; x++) {
			System.out.println("�л� �̸�:" + strss[x][0]);
			System.out.println("���� ������ �Է��ϼ���");
			String kor = br.readLine();
//			System.out.println(kor);

			System.out.println("���� ������ �Է��ϼ���");
			String math = br.readLine();
//			System.out.println(math);

			System.out.println("���� ������ �Է��ϼ���");
			String eng = br.readLine();
//			System.out.println(eng);
			
			int total = Integer.parseInt(kor)
					+ Integer.parseInt(math) 
					+ Integer.parseInt(eng);

			double avg = total / 3.0;

			String grade = "";
			if (avg >= 90) {
				grade = "A";
			} else if (avg >= 80) {
				grade = "B";
			} else if (avg >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}

//			System.out.println("����: " + total);
//			System.out.println("���: " + avg);
//			System.out.println("���: " + grade);	

			strss[x][1] = kor;
			strss[x][2] = math;
			strss[x][3] = eng;
			strss[x][4] = ""+total; // Integer.toString(total)
			strss[x][5] = ""+avg;
			strss[x][6] = grade;
			// strss[x] = new String[] {names[x], kor, math, eng, total+"", avg+"", grade};
	
			System.out.println();

		}

		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i] + " ");
			}
			System.out.println();
		}

		// ���� ������ �Է��ϼ���
		// 90
		// ���� ������ �Է��ϼ���
		// 90
		// ���� ������ �Է��ϼ���
		// 90
		// ���� : 270
		// ��� : 90
		// ��� : A

	} // end main()

} // end class
