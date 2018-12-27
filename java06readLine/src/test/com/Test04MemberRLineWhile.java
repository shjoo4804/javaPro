package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04MemberRLineWhile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		
		// x를 입력하면 종료되는 프로그램
		
		String x = "";
		
		while (!x.equals("x")) {
			System.out.println("member");
			System.out.println("<회원가입>");
			System.out.println("================");
			
			System.out.println("아이디를 입력하세요");
			String id = br.readLine();
			System.out.println(id);
			System.out.println("--------------");
			
			System.out.println("패스워드를 입력하세요");
			String pw = br.readLine();
			System.out.println(pw);
			System.out.println("--------------");
			
			System.out.println("전화번호를 입력하세요");
			String phone = br.readLine();
			System.out.println(phone);
			System.out.println("--------------");
			
			System.out.println("이메일를 입력하세요");
			String email = br.readLine();
			System.out.println(email);
			System.out.println("--------------");
			
			System.out.println("종료하려면 x를 입력하세요");
			x = br.readLine();
		}
		System.out.println("종료");

		
		// 회원가입
		// 아이디를 입력하세요
		// shin
		// 패스워드를 입력하세요
		// 1234
		// 전화번호를 입력하세요
		// 010-1234-1234
		// 이메일을 입력하세요
		// abc@naver.com
		
	}//end main()

}//end class
