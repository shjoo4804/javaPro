package test.com;

import java.util.Scanner;

public class Test06Scanner2 {

	public static void main(String[] args) {
		
		//����ǥ���� Regular Expression
		//010-1234-4567
		//d{3}-d{4}-d{4} // ���Ŀ� ���缭 �Է��ϰ� (3�ڸ�-4�ڸ�-4�ڸ�)
		
		
		System.out.println("Scanner");
		
		Scanner s = new Scanner("1:aaa:bbb:ccc"); 
		s.useDelimiter(":"); //���� - ������
		System.out.println(s.next()); // ":"�� �⺻���� ������
		System.out.println(s.next()); 
		System.out.println(s.next()); 
		System.out.println(s.next()); 
		
		s.close(); 

	}

}
