package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03BoardRL {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		

		
		for (int i = 0; i < 3; i++) {
			System.out.println("===============");
			System.out.println("\\t�Խ�\t�� \"��\"�α׷�");
			System.out.println("===============");
			
			String board = null;
			
			System.out.println("�������� �Է��ϼ���");
			String title = br.readLine();
			board = title;
			System.out.println(title);
			
			System.out.println("---------------");
			System.out.println("�۳����� �Է��ϼ���");
			String content = br.readLine();
			board += content; // board = board + content;
			System.out.println(content);
			
			System.out.println("---------------");
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
			String writer = br.readLine();
			board += writer;
			System.out.println(writer);
			
			System.out.println("---------------");
			System.out.println("�ۼ����ڸ� �Է��ϼ���");
			String wDate = br.readLine();
			board += wDate;
			System.out.println(wDate);
			System.out.println("---------------");
			
			System.out.println(board);
		}
		
		
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
