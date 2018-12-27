package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in; // static�� �پ������� new ���ص� ��밡��
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		Test01ScoreVO[] vos = new Test01ScoreVO[3];
		
		
		for (int i = 0; i < vos.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = br.readLine();
			
			System.out.println("���������� �Է��ϼ���");
			String kor = br.readLine();
			
			System.out.println("���������� �Է��ϼ���");
			String eng = br.readLine();
			
			System.out.println("���������� �Է��ϼ���");
			String math = br.readLine();
			
			Test01ScoreVO vo = new Test01ScoreVO(
						name, 
						Integer.parseInt(kor), 
						Integer.parseInt(eng), 
						Integer.parseInt(math));
			
			vos[i] = vo;
		}
		System.out.println();
		
		for (int i = 0; i < vos.length; i++) {
//			System.out.println(vos[i]);
			System.out.print(vos[i].name+" ");
			System.out.print(vos[i].kor+" ");
			System.out.print(vos[i].eng+" ");
			System.out.print(vos[i].math+" ");
			System.out.print(vos[i].total+" ");
			System.out.print(vos[i].avg+" ");
			System.out.println(vos[i].grade);
		}
		

	} // end main()

} // end class
