package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03ScoreSwitchWhile {
	public static void main(String[] args) throws IOException {
		System.out.println("����ó�����α׷�");
		
		//while���� ����Ͽ� �ݺ��ϴ� ���α׷��� �ϼ�
		//�� ������ �����ʹ� input�� ���� �����ÿ�.
		//����� x�� �Է¹޾Ƽ� ó���ϵ��� �Ͻÿ�
		
		
		BufferedReader br = 
				new BufferedReader (
						new InputStreamReader(System.in));
		
		
		System.out.println("1.����ó�� 2.�Խ���");
		String menu = br.readLine();
		if (menu.equals("1")) {
			// ����ó�� �ڵ�
		} else {
			// �Խ��� �ڵ�
		}
		
		
		
		String x = "";
		while(!x.equals("x")) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = br.readLine();
			System.out.println(name);
			System.out.println("���������� �Է��ϼ���");
			int kor = Integer.parseInt(br.readLine());
			System.out.println(kor);
			System.out.println("���������� �Է��ϼ���");
			int eng = Integer.parseInt(br.readLine());
			System.out.println(eng);
			System.out.println("���������� �Է��ϼ���");
			int math = Integer.parseInt(br.readLine());
			System.out.println(math);
			
//			System.out.println("����:"+(kor+eng+math)); // ���ڿ�+���ڴ� ���ڿ��� �Ǿ, ��ȣ�� ���������
			int total = kor+eng+math;
			System.out.println("����:"+total);
			
			//��տ� ���������� ��. avg
			double avg = total/3.0;
			System.out.println("���:"+avg); // ��հ��� �Ǽ��� ��� ���ؼ� 3.0(�Ǽ�)���� ����
			
			// ��������� ��������
			// 90���̻� A, 80���̻� B,
			// 70���̻� C, 70�� �̸� F or "����" ó���ϴ� ���α׷��� �߰��ϼ���
			// ��޿� ���� ������ ��. grade(char or String)
			String grade = null;
			
			//switch case break
			
			// 10�� �ڸ��� �̿��ϱ�
			int key = (int)avg/10;
			switch (key) {
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;

			default:
				grade = "����";
				break;
			}
			
			System.out.println("���:["+grade+"]");
			
			System.out.println("�����Ϸ��� x�� �Է��Ͻÿ�");
			x = br.readLine();
		}
	
		System.out.println("����");
		
		
		// �̸��� �Է��ϼ���
		// ȫ�浿
		// ���������� �Է��ϼ���
		// 99
		// ���������� �Է��ϼ���
		// 98
		// ���������� �Է��ϼ���
		// 97
		// ����:99+98+97=294
		// ���:98(����/3)
		// ���:A
		
	} // end main()

} // end class
