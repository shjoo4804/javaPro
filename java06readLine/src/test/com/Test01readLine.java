package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01readLine {

	public static void main(String[] args) throws IOException {
		System.out.println("readLine..");
		
//		BufferedReader br = 
//				new BufferedReader (
//						new InputStreamReader(System.in));
		InputStream is = System.in; // static�� �پ������� new ���ص� ��밡��
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("���� �Է� �� ����.");
		
		String x = br.readLine(); // readLine()�� ��ȯ���� ��Ʈ��
		int su = Integer.parseInt(x);// String�� ������ �ٲٱ�
		System.out.println(su+100);
//		System.out.println(Integer.parseInt(br.readLine())+100);
		System.out.println("end main...");
		
	} // end main()

} // end class
