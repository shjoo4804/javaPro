package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home02member {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Member-ȸ������-");
		
		String[] names = new String[] {"ȫ�浿1", "ȫ�浿2", "ȫ�浿3"};
		String datas = "";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+" ���̵� �Է��ϼ���");
//			String id = "shin";
			String id = br.readLine();
//			System.out.println(id);
			System.out.println(names[i]+" �н����带 �Է��ϼ���");
//			String pw = "1234";
			String pw = br.readLine();
//			System.out.println(pw);
			System.out.println(names[i]+" ��ȭ��ȣ�� �Է��ϼ���");
//			String phone = "010-1234-1234";
			String phone = br.readLine();
//			System.out.println(phone);
			System.out.println(names[i]+" �̸����� �Է��ϼ���");
//			String email = "abc@naver.com";
			String email = br.readLine();;
			System.out.println();
			
			datas += names[i]+" id:"+id+"/pw:"+pw+"/phone:"+phone+"/email:"+email+"\n";
		}
		System.out.println("==================");
		System.out.println(datas);
		

		
		
		// ȸ������
		// ���̵� �Է��ϼ���
		// shin
		// �н����带 �Է��ϼ���
		// 1234
		// ��ȭ��ȣ�� �Է��ϼ���
		// 010-1234-1234
		// �̸����� �Է��ϼ���
		// abc@naver.com

	}

}
