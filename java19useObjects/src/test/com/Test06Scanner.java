package test.com;

import java.util.Scanner;

public class Test06Scanner {

	public static void main(String[] args) {
		System.out.println("Scanner");
		
		
		
		Scanner s = new Scanner(System.in); 
		System.out.println(s.nextLine()); // 한줄 다받음
		System.out.println(s.next()); // 띄어쓰기 전까지 받음
		
		
		// 문자 받는 Scanner따로, 정수 받는 Scanner따로 정의
		Scanner s2 = new Scanner(System.in); 
		System.out.println(s2.nextInt()+10); // 정수로 받아야됨
		//.nextInt() : Integer.parseInt() 안해도 됨
		
		
		s.close(); 
		s2.close();

	}

}
