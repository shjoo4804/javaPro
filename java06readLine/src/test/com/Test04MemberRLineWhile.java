package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04MemberRLineWhile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		
		// x�� �Է��ϸ� ����Ǵ� ���α׷�
		
		String x = "";
		
		while (!x.equals("x")) {
			System.out.println("member");
			System.out.println("<ȸ������>");
			System.out.println("================");
			
			System.out.println("���̵� �Է��ϼ���");
			String id = br.readLine();
			System.out.println(id);
			System.out.println("--------------");
			
			System.out.println("�н����带 �Է��ϼ���");
			String pw = br.readLine();
			System.out.println(pw);
			System.out.println("--------------");
			
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			String phone = br.readLine();
			System.out.println(phone);
			System.out.println("--------------");
			
			System.out.println("�̸��ϸ� �Է��ϼ���");
			String email = br.readLine();
			System.out.println(email);
			System.out.println("--------------");
			
			System.out.println("�����Ϸ��� x�� �Է��ϼ���");
			x = br.readLine();
		}
		System.out.println("����");

		
		// ȸ������
		// ���̵� �Է��ϼ���
		// shin
		// �н����带 �Է��ϼ���
		// 1234
		// ��ȭ��ȣ�� �Է��ϼ���
		// 010-1234-1234
		// �̸����� �Է��ϼ���
		// abc@naver.com
		
	}//end main()

}//end class
