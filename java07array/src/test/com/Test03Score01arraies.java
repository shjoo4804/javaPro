package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03Score01arraies {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Score");
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));

		// 3���� �л� �迭�� ����� (�л� �̸��� �迭��, �̸��� �Է¹��� ����)
		// �� �л��� ������ ó���ϴ� ���α׷��� �ϼ��Ͻÿ�
		// for���� ����� ��
		
		// ���� ��� ����---
		// ȫ�浿1  90 90 90 270(����) 90(���) A(���)
		// ȫ�浿2  90 90 90 270 90 A
		// ȫ�浿3  90 90 90 270 90 A

		String[] sName = new String[3];
		sName[0] = "ȫ�浿1";
		sName[1] = "ȫ�浿2";
		sName[2] = "ȫ�浿3";
	
		
		int[] kor = new int[3];
		int[] math = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] grade =new String[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("�л� �̸�:"+sName[i]);
			System.out.println("���� ������ �Է��ϼ���");
			kor[i] = Integer.parseInt(br.readLine());
//			System.out.println(kor);
			System.out.println("���� ������ �Է��ϼ���");
			math[i] = Integer.parseInt(br.readLine());
//			System.out.println(math);
			System.out.println("���� ������ �Է��ϼ���");
			eng[i] = Integer.parseInt(br.readLine());
//			System.out.println(eng);
			
			total[i] = kor[i]+math[i]+eng[i];
			avg[i] = (kor[i]+math[i]+eng[i])/3.0;
			
			
			if(avg[i] >= 90) { 
				grade[i] = "A"; 
			} else if(avg[i] >= 80) {
				grade[i] = "B";
			} else if(avg[i] >= 70) {
				grade[i] = "C";
			} else {
				grade[i] = "F";
			}
		
//			System.out.println("����: "+total);
//			System.out.println("���: "+avg);
//			System.out.println("���: "+grade);

			System.out.println();
		}
		
		for (int i = 0; i < avg.length; i++) {
			System.out.println(sName[i]+"  "+kor[i]+" "+math[i]+" "+eng[i]
					+" "+total[i]+" "+avg[i]+" "+grade[i]);
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
