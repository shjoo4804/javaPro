package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test03MemberMain {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in; // static이 붙어있으면 new 안해도 사용가능
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("member");
		System.out.println("<회원가입>");
		System.out.println("================");
		
		Test03MemberVO[] vos = new Test03MemberVO[3];
		
		for (int i = 0; i < vos.length; i++) {
			System.out.println((i+1)+"번째 회원가입");
			System.out.println("아이디를 입력하세요");
			String id = br.readLine();
//			String id = "idid";
//			System.out.println(id);
			System.out.println("--------------");
			
			System.out.println("패스워드를 입력하세요");
			String pw = br.readLine();
//			String pw = "pwpw";
//			System.out.println(pw);
			System.out.println("--------------");
			
			System.out.println("전화번호를 입력하세요");
			String tel = br.readLine();
//			String tel = "teltel";
//			System.out.println(tel);
			System.out.println("--------------");
			
			System.out.println("이메일를 입력하세요");
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
