package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test03MemberMain {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in; // static�� �پ������� new ���ص� ��밡��
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("member");
		System.out.println("<ȸ������>");
		System.out.println("================");
		
		Test03MemberVO[] vos = new Test03MemberVO[3];
		
		for (int i = 0; i < vos.length; i++) {
			System.out.println((i+1)+"��° ȸ������");
			System.out.println("���̵� �Է��ϼ���");
			String id = br.readLine();
//			String id = "idid";
//			System.out.println(id);
			System.out.println("--------------");
			
			System.out.println("�н����带 �Է��ϼ���");
			String pw = br.readLine();
//			String pw = "pwpw";
//			System.out.println(pw);
			System.out.println("--------------");
			
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			String tel = br.readLine();
//			String tel = "teltel";
//			System.out.println(tel);
			System.out.println("--------------");
			
			System.out.println("�̸��ϸ� �Է��ϼ���");
			String email = br.readLine();
//			String email = "abc@n.com";
//			System.out.println(email);
			System.out.println("--------------");
			
			
			Test03MemberVO vo = new Test03MemberVO(id, pw, tel, email);
			vos[i] = vo;
			
			System.out.println();
			
		}//end for 
		
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i].id + " "
							+ vos[i].pw + " "
							+ vos[i].tel + " "
							+ vos[i].email);
		}

		
	} // end main()

} // end class
