package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test07while2 {

	public static void main(String[] args) throws IOException {

		System.out.println("while");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String x = "";
		while (!x.equals("x")) { // ����x�� ���� "x"�� �ƴϸ� ��� ������
			// ������ true�̸� ������ �ݺ�
			System.out.println("while...");
			System.out.println("�׸�? input x...");
			x = br.readLine(); // x�� "x"�� �Է��ϰ� �Ǹ�  �����
		}
		System.out.println("end while");
		

	} // end main()

} // end class