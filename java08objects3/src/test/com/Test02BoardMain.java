package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test02BoardMain {

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
//			String title = "�ڹٽð�";
//			System.out.println(title);

			System.out.println("---------------");
			System.out.println("�۳����� �Է��ϼ���");
			String content = br.readLine();
//			String content = "kim���ڹ�";
//			System.out.println(content);

			System.out.println("---------------");
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
			String writer = br.readLine();
//			String writer = "ȫ�浿";
//			System.out.println(writer);
			
			Test02BoardVO vo = new Test02BoardVO(i+1, title, content, writer);
			vos[i] = vo;
			
			System.out.println();
		} // end for
		
		for (int i = 0; i < vos.length; i++) {
			System.out.print(vos[i].num+" ");
			System.out.print(vos[i].title+" ");
			System.out.print(vos[i].content+" ");
			System.out.print(vos[i].writer+" ");
			System.out.println(vos[i].wDate);
		}
		

		// VO�� VO[]�� ����Ͽ� �Ʒ����α׷��� �Է��ϼ���
		// �������� �Է��ϼ���
		// �ڹ� �ð��Դϴ�.
		// �۳����� �Է��ϼ���
		// ����� �ڹٸ� �볪�� �������ֽó׿�
		// �ۼ��ڸ� �Է��ϼ���

		// ȫ�浿

		// �۹�ȣ�� �ۼ����ڴ� �Է¹��� ����.

		// ==��°��
		// num title content writer wDate(DateŸ������)
		// 1 AAA BBB kim 2018~~~

	} // end main()

} // end class
