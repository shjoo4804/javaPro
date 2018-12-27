package test.com;

import java.util.Scanner;

public class Test06Scanner2 {

	public static void main(String[] args) {
		
		//정규표현식 Regular Expression
		//010-1234-4567
		//d{3}-d{4}-d{4} // 형식에 맞춰서 입력하게 (3자리-4자리-4자리)
		
		
		System.out.println("Scanner");
		
		Scanner s = new Scanner("1:aaa:bbb:ccc"); 
		s.useDelimiter(":"); //패턴 - 구분자
		System.out.println(s.next()); // ":"를 기본으로 나눠줌
		System.out.println(s.next()); 
		System.out.println(s.next()); 
		System.out.println(s.next()); 
		
		s.close(); 

	}

}
