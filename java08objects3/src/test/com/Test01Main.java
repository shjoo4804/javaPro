package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main {
	public static void main(String[] args) throws IOException {	
		System.out.println("main...");
		
		InputStream is = System.in; // static�� �پ������� new ���ص� ��밡��
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		Test01ScoreVO[] vos = new Test01ScoreVO[3]; 
		
		
		for (int i = 0; i < vos.length; i++) {

			System.out.println("�̸��� �Է��ϼ���");
//			String name = "ȫ�浿1";
			String name = br.readLine();
			System.out.println(name+"�� ���������� �Է��ϼ���");
//			int kor = 99;
			int kor = Integer.parseInt(br.readLine());
			System.out.println(name+"�� ���������� �Է��ϼ���");
//			int eng = 88;
			int eng = Integer.parseInt(br.readLine());
			System.out.println(name+"�� ���������� �Է��ϼ���");
//			int math = 77;
			int math = Integer.parseInt(br.readLine());
			System.out.println();

			Test01ScoreVO vo = new Test01ScoreVO(name, kor, eng, math);
			vos[i] = vo;
			
		}
		
		for (int i = 0; i < vos.length; i++) {
			System.out.print(vos[i].name+" "
							+vos[i].kor+" "
							+vos[i].eng+" "
							+vos[i].math+" "
							+vos[i].total+" "
							+vos[i].avg+" "
							+vos[i].grade+"\n");
		}
		
		
		// ==VO�� VO[]�� ����Ͽ� �Ʒ����α׷��� ����ÿ�.
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
		
		//===�������===
		// ȫ�浿1 99 88 77 264 88.0 B
		// ȫ�浿2 99 88 77 264 88.0 B
		// ȫ�浿3 99 88 77 264 88.0 B
		
		
		
	} // end main()
} // end class
