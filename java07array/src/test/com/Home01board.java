package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home01board {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String[] titles = new String[] {"�ڹ� �ð�", "C���", "IoT"};
		
		String datas="";
		
		for (int i = 0; i < titles.length; i++) {
			System.out.println("������:"+titles[i]);
			
			System.out.println("�۳����� �Է��ϼ���");
//			String content = "��� �ڹٸ� �볪�� �������ֽó׿�";
			String content = br.readLine();
//			System.out.println(content);
			
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
//			String writer = "ȫ�浿";
			String writer = br.readLine();
//			System.out.println(writer);
			
			System.out.println("�ۼ����ڸ� �Է��ϼ���");
//			String wDate = "2018-08-13";
			String wDate = br.readLine();
//			System.out.println(wDate);
			System.out.println();
			
			datas += titles[i]+"/"+content+"/"+writer+"/"+wDate+"\n";
		}
		
		System.out.println(datas);
		
		
		
		// - �������� ũ��3�� �迭�� �ؼ� ����ϱ�
		// �������� �Է��ϼ���
		// �ڹ� �ð��Դϴ�.
		// �۳����� �Է��ϼ���
		// ����� �ڹٸ� �볪�� �������ֽó׿�
		// �ۼ��ڸ� �Է��ϼ���
		// ȫ�浿
		// �ۼ����ڸ� �Է��ϼ���
		// 2018.08.08

	}

}
