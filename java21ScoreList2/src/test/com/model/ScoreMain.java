package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream is = System.in; 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String exitBtn = "";
		while (!exitBtn.equals("x")) { 
			
			System.out.println("menu==============");
			System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
			System.out.println("==================");
			System.out.print("input menu num : ");
//			int menuNum = 1;
			int menuNum = Integer.parseInt(br.readLine());
//			System.out.println(menuNum);
			
			ScoreDAO dao = new ScoreDAOimpl();
			ScoreVO vo = new ScoreVO();
			
			if(menuNum==1) { // 1. insert
				System.out.println("1.insert==========");
				
				
				System.out.println("��ȣ�� �Է��ϼ��� :");
				int num = 1;
//				int num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				System.out.println("�̸��� �Է��ϼ��� :");
				String name = "aa";
				vo.setName(name);
				
				System.out.println("���� ������ �Է��ϼ��� :");
				int kor = 90;
				vo.setKor(kor);
				
				System.out.println("���� ������ �Է��ϼ��� :");
				int eng = 90;
				vo.setEng(eng);
				
				System.out.println("���� ������ �Է��ϼ��� :");
				int math = 90;
				vo.setMath(math);
				
				int x1 = dao.insert(vo);
				if(x1==1) {
					System.out.println("insert ����");
				} else {
					System.out.println("insert ����");
				}
				
				
				
				System.out.println("4.selectAll========");
				List<ScoreVO> vos = dao.selectAll();
				
				
				
				
				
			} else if (menuNum==2) { // 2. update
				
				System.out.println("2.update==========");
				System.out.println("�����ҹ�ȣ�� �Է��ϼ��� :");
				int num = 1;
//				int num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				System.out.println("�̸��� �Է��ϼ��� :");
				String name = "aa";
				vo.setName(name);
				
				System.out.println("���� ������ �Է��ϼ��� :");
				int kor = 90;
				vo.setKor(kor);
				
				System.out.println("���� ������ �Է��ϼ��� :");
				int eng = 90;
				vo.setEng(eng);
				
				System.out.println("���� ������ �Է��ϼ��� :");
				int math = 90;
				vo.setMath(math);
				System.out.println(dao.insert(vo));
				
			} else if (menuNum==3) { // 3.delete
				System.out.println("3.delete==========");
				
			} else if (menuNum==4) { // 4.selectAll
				System.out.println("4.selectAll==========");
			
			} else if (menuNum==5) { // 5.selectOne
				System.out.println("5.selectOne==========");
				
			} else {
				System.out.println("���� �޴��Դϴ�.");
			}
				
			

			
			System.out.println("����Ͻ÷��� �ƹ�Ű�Է�, ����� x");
			exitBtn = br.readLine(); // x�� "x"�� �Է��ϰ� �Ǹ�  �����
		} // end while
		
		
		
		
		
		
		
				
		// ���α׷� �����ϸ�
		// menu==============
		// 1.insert 2.update 3.delete 4.selectAll 5.selectOne ���·� �޴��� ����
		// ==================
		// input menu num : 1 // num�� ����ũ�� Ű
		// 1.insert==========
		// ��ȣ�� �Է��ϼ��� :
		// �̸��� �Է��ϼ��� : 
		// ......
		
		// 4.selectAll========
		// 1 abc 90 90 90 270 90.0 A // ** ��������� ���ϱ� // DAO�� ���ױ�
		// 2 abc 90 90 90 270 90.0 A 
		
		// ����Ͻ÷��� �ƹ�Ű�Է�, ����� x
		// (�ƹ�Ű�Է½�)
		// menu==============
		// 1.insert 2.update 3.delete 4.selectAll 5.selectOne ���·� �޴��� ����
		// ==================
		// input menu num : 1
		
		
		// 2.update==========
		// ��ȣ�� �Է��ϼ��� : 1
		// �̸��� �Է��ϼ��� : kim22
		// ......
		
		// 4.selectAll========
		// 1 kim22 90 90 90 270 90.0 A 
		// 2 abc 90 90 90 270 90.0 A 
		
		// ����Ͻ÷��� �ƹ�Ű�Է�, ����� x
		
		// 3.delete==========
		// ��ȣ�� �Է��ϼ��� : 2
		
		// 4.selectAll========
		// 1 kim22 90 90 90 270 90.0 A 
		
		// ����Ͻ÷��� �ƹ�Ű�Է�, ����� x
		
		// 5.selectOne========
		// ��ȣ�� �Է��ϼ��� : 1
		// 1 kim22 90 90 90 270 90.0 A 

	} // end main()

}
