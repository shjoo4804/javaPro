package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home02member {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Member-회원가입-");
		
		String[] names = new String[] {"홍길동1", "홍길동2", "홍길동3"};
		String datas = "";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+" 아이디를 입력하세요");
//			String id = "shin";
			String id = br.readLine();
//			System.out.println(id);
			System.out.println(names[i]+" 패스워드를 입력하세요");
//			String pw = "1234";
			String pw = br.readLine();
//			System.out.println(pw);
			System.out.println(names[i]+" 전화번호를 입력하세요");
//			String phone = "010-1234-1234";
			String phone = br.readLine();
//			System.out.println(phone);
			System.out.println(names[i]+" 이메일을 입력하세요");
//			String email = "abc@naver.com";
			String email = br.readLine();;
			System.out.println();
			
			datas += names[i]+" id:"+id+"/pw:"+pw+"/phone:"+phone+"/email:"+email+"\n";
		}
		System.out.println("==================");
		System.out.println(datas);
		

		
		
		// 회원가입
		// 아이디를 입력하세요
		// shin
		// 패스워드를 입력하세요
		// 1234
		// 전화번호를 입력하세요
		// 010-1234-1234
		// 이메일을 입력하세요
		// abc@naver.com

	}

}
