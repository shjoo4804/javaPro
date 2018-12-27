package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreMain2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String exitBtn = "";

		ScoreDAO dao = new ScoreDAOimpl();
		ScoreVO vo = null;
		List<ScoreVO> vos = dao.selectAll();
		
		while (!exitBtn.equals("x")) {
			System.out.println("menu==============");
			System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
			System.out.println("==================");
			System.out.println("input menu num : ");
			int key = Integer.parseInt(br.readLine());
			int num=0;
			String name="";
			int kor=0;
			int eng=0;
			int math=0;
			String grade="";

			vo = new ScoreVO();
			if (key==1) {
				System.out.println("1.insert==========");
				
				System.out.print("��ȣ�� �Է��ϼ��� :");
//				int num = 1;
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);

				System.out.print("�̸��� �Է��ϼ��� :");
//				String name = "aa";
				name = br.readLine();
				vo.setName(name);

				System.out.print("���� ������ �Է��ϼ��� :");
//				int kor = 90;
				kor = Integer.parseInt(br.readLine());
				vo.setKor(kor);

				System.out.print("���� ������ �Է��ϼ��� :");
//				int eng = 90;
				eng = Integer.parseInt(br.readLine());
				vo.setEng(eng);

				System.out.print("���� ������ �Է��ϼ��� :");
//				int math = 90;
				math = Integer.parseInt(br.readLine());
				vo.setMath(math);

				vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());

				vo.setAvg(vo.getTotal() / 3.0);

//				String grade = "";
				if (vo.getAvg() >= 90) {
					grade = "A";
				} else if (vo.getAvg() >= 80) {
					grade = "B";
				} else if (vo.getAvg() >= 70) {
					grade = "C";
				} else {
					grade = "F";
				}
				vo.setGrade(grade);

				
				dao.insert(vo);
			} else if(key==2) {
				System.out.println("2.update==========");
				System.out.println("������ ��ȣ�� �Է��ϼ��� :");
//				int num = 1;
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				System.out.println("������ �̸��� �Է��ϼ��� : ");
//				String name = "bb";
				name = br.readLine();
				vo.setName(name);

				System.out.println("������ ���� ������ �Է��ϼ��� :");
				kor = Integer.parseInt(br.readLine());
				vo.setKor(kor);

				System.out.println("������ ���� ������ �Է��ϼ��� :");
				eng = Integer.parseInt(br.readLine());
				vo.setEng(eng);

				System.out.println("������ ���� ������ �Է��ϼ��� :");
				math = Integer.parseInt(br.readLine());
				vo.setMath(math);
				
				vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
				vo.setAvg(vo.getTotal() / 3.0);

				grade = "";
				if (vo.getAvg() >= 90) {
					grade = "A";
				} else if (vo.getAvg() >= 80) {
					grade = "B";
				} else if (vo.getAvg() >= 70) {
					grade = "C";
				} else {
					grade = "F";
				}
				vo.setGrade(grade);
				
				dao.update(vo);
				
			} else if(key==3) {
				System.out.println("3.delete==========");
				System.out.println("������ ��ȣ�� �Է��ϼ��� :");
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				dao.delete(vo);
				
			} else if(key==4) {
				System.out.println("4.selectAll========");
				vos = dao.selectAll();
				for (int i = 0; i < vos.size(); i++) {
					System.out.print(vos.get(i).getNum() + " ");
					System.out.print(vos.get(i).getName() + " ");
					System.out.print(vos.get(i).getKor() + " ");
					System.out.print(vos.get(i).getEng() + " ");
					System.out.print(vos.get(i).getMath() + " ");
					System.out.print(vos.get(i).getTotal() + " ");
					System.out.print(vos.get(i).getAvg() + " ");
					System.out.print(vos.get(i).getGrade() + " ");
					System.out.println();
				}
			} else if(key==5) {
				System.out.println("5.selectOne==========");
				
				System.out.println("�˻��� ��ȣ�� �Է��ϼ��� :");
				num = Integer.parseInt(br.readLine());
				vo.setNum(num);
				
				ScoreVO vo2 = dao.selectOne(vo);
				System.out.print(vo2.getNum() + " ");
				System.out.print(vo2.getName() + " ");
				System.out.print(vo2.getKor() + " ");
				System.out.print(vo2.getEng() + " ");
				System.out.print(vo2.getMath() + " ");
				System.out.print(vo2.getTotal() + " ");
				System.out.print(vo2.getAvg() + " ");
				System.out.println(vo2.getGrade());
			} else {
				System.out.println("���� ��ȣ�Դϴ�");
			}
			
			
			
			System.out.println();
			if (key>0 && key<4) {
				System.out.println("4.selectAll========");
				for (int i = 0; i < vos.size(); i++) {
					System.out.print(vos.get(i).getNum() + " ");
					System.out.print(vos.get(i).getName() + " ");
					System.out.print(vos.get(i).getKor() + " ");
					System.out.print(vos.get(i).getEng() + " ");
					System.out.print(vos.get(i).getMath() + " ");
					System.out.print(vos.get(i).getTotal() + " ");
					System.out.print(vos.get(i).getAvg() + " ");
					System.out.print(vos.get(i).getGrade() + " ");
					System.out.println();
				}
				System.out.println("==================");
			}
			
			
			System.out.println("����Ͻ÷��� �ƹ�Ű�Է�, ����� x");
			exitBtn = br.readLine(); // x�� "x"�� �Է��ϰ� �Ǹ� �����
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
