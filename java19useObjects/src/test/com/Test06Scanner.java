package test.com;

import java.util.Scanner;

public class Test06Scanner {

	public static void main(String[] args) {
		System.out.println("Scanner");
		
		
		
		Scanner s = new Scanner(System.in); 
		System.out.println(s.nextLine()); // ���� �ٹ���
		System.out.println(s.next()); // ���� ������ ����
		
		
		// ���� �޴� Scanner����, ���� �޴� Scanner���� ����
		Scanner s2 = new Scanner(System.in); 
		System.out.println(s2.nextInt()+10); // ������ �޾ƾߵ�
		//.nextInt() : Integer.parseInt() ���ص� ��
		
		
		s.close(); 
		s2.close();

	}

}
