package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test02BoardMain2 {

	public static void main(String[] args) throws IOException {
		System.out.println("board...");
		InputStream is = System.in; // static�� �پ������� new ���ص� ��밡��
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("===============");
		System.out.println("�Խ��� ���α׷�");
		System.out.println("===============");
		
		Test02BoardVO[] vos = new Test02BoardVO[3];
		
		for (int i = 0; i < vos.length; i++) {
			System.out.println((i+1)+"��° ���Դϴ�.");
			System.out.println("�������� �Է��ϼ���");
			String title = br.readLine();
//			System.out.println(title);
			
			System.out.println("---------------");
			System.out.println("�۳����� �Է��ϼ���");
			String content = br.readLine();
//			System.out.println(content);
			
			System.out.println("---------------");
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
			String writer = br.readLine();
//			System.out.println(writer);
			
			Test02BoardVO vo = new Test02BoardVO(title, content, writer);
			
			vos[i] = vo;
			vo.num = i+1;
			vos[i].num = vo.num;
			
			System.out.println();

		}
		
		for (int i = 0; i < vos.length; i++) {
			System.out.println(
					vos[i].num+"  "
					+ vos[i].title+"  "
					+ vos[i].content+"  "
					+ vos[i].writer+"  "
					+ vos[i].wDate);
		}

		// VO�� VO[]�� ����Ͽ� �Ʒ����α׷��� �Է��ϼ���
		// �������� �Է��ϼ���
		// �ڹ� �ð��Դϴ�.
		// �۳����� �Է��ϼ���
		// ����� �ڹٸ� �볪�� �������ֽó׿�
		// �ۼ��ڸ� �Է��ϼ���
		
		// ȫ�浿
		
		// �۹�ȣ�� �ۼ����ڴ� �Է¹��� ����.

		//==��°��
		//num title content writer wDate(DateŸ������)
		//1    AAA   BBB    kim    2018~~~
		

	} // end main()

} // end class
