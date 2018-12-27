package test.com.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import test.com.model.RoomDirDAO;
import test.com.model.RoomDirDAOimpl;
import test.com.model.RoomUserDAO;
import test.com.model.RoomUserDAOimpl;
import test.com.model.RoomVO;


public class Test_RoomMain {
	

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String exit = "";
		do {
			
			System.out.println("xŰ�� ������ ����");
		} while (!exit.equals("x"));
		
		System.out.println("������ 1��, �����ڴ� 9�� �Է�");
		String menu = br.readLine();
		System.out.println("����޴�:" + menu);

		if (menu.equals("1")) { // ���� ȭ��
			System.out.println("����� ȭ���Դϴ�.");
			// + �Խ�/���
			RoomUserDAO dao = new RoomUserDAOimpl();
			RoomVO vo = new RoomVO();
			
			System.out.println("��������� �Ͻ� ���� �������ּ���.");
			// +�߰� : selectAll()�� ����ؼ� ���� �� ��Ȳ �����ֱ�
			
			System.out.println("<���ȣ/�̿�ð�/�̿뿩��>");
			new RoomDirDAOimpl().selectAllList(); 
			System.out.println();
			
			System.out.println("�̿��Ͻ� �� ��ȣ�� �Է����ּ���");
			vo.setNum(Integer.parseInt(br.readLine()));
			System.out.println("�̿� �ð��� �Է����ּ���");
			vo.setTime(Integer.parseInt(br.readLine()));

			if (vo.getTime() >= 1) { // �̿�ð��� 1�ð� �̻��̸�
				vo.setRemain(1); // �̿���:1���� ����
			} else if (vo.getTime() == 0) { // �̿�ð��� 0�ð��϶�
				vo.setRemain(0); // �̿����:0���� ����
			}

			int result = dao.update(vo);

			if (result >= 1) { // update�� �������� ��
				if (vo.getRemain() == 1) {
					System.out.println("���������� �� ������ �Ϸ�Ǿ����ϴ�");
					System.out.println("==============");
					System.out.println("�̿��Ͻ� �� ��ȣ : " + vo.getNum() + "�� ��");
					System.out.println("�̿� �ð� : " + vo.getTime() + "�ð�");
					System.out.println("�̿뿩�� : �̿���");
					System.out.println("==============");
					System.out.println("�̿����ּż� �����մϴ� ^-^");
				}

				else if (vo.getRemain() == 0) {
					System.out.println("�̿뿩�� : �̿����");
				}
			}
			
			System.out.println("����� ȭ�� ��");
			System.out.println();
			
		} // ����ȭ�� ��
		
		
		
		if (menu.equals("9")) { // ������ ȭ��
			System.out.println("������ ȭ���Դϴ�.");
			RoomDirDAO dao = new RoomDirDAOimpl();
			RoomVO vo = new RoomVO();
			
			System.out.println("====menu:");
			System.out.println("1.���߰� 2.����� 3.������ȸ 4.�ϳ�����ȸ");
			
			String menu_dir = br.readLine();
			
			if (menu_dir.equals("1")) { // ���߰�
				System.out.println("�� �߰� ȭ��");
				
				System.out.println("���� �߰��Ͻ� �� ��ȣ�� �Է����ּ���");
				vo.setNum(4);
				
				int result = dao.insert(vo);
				
				if (result == 1) { // insert�� �������� ��
						System.out.println("�� �߰��� �����߽��ϴ�");
				}
				else if (result == 0) {
					System.out.println("�� �߰��� �����߽��ϴ�");
				}
						
			} // ���߰� ��
			
			else if (menu_dir.equals("2")) { // �����
				System.out.println("�� ���� ȭ��");
				
				System.out.println("�����Ͻ� �� ��ȣ�� �Է����ּ���");
				vo.setNum(4);
				
				int result = dao.delete(vo);
				
				if (result >= 1) { // delete�� �������� ��
						System.out.println("�� ������ �����߽��ϴ�.");
				}
				else if (result == 0) {
					System.out.println("�� ������ �����߽��ϴ�. ���� ���� �� �ֽ��ϴ�.");
				}
						
			} // ����� ��
			
			else if (menu_dir.equals("3")) { // ��� �� ��ȸ
				System.out.println("��� �� ��ȸ ȭ��");
				
				new RoomDirDAOimpl().selectAllList(); 

						
			} // ��� �� ��ȸ ��
			
			else if (menu_dir.equals("4")) { // �ϳ��� �� ��ȸ
				System.out.println("�ϳ��� �� ��ȸ ȭ��");
				
				System.out.println("��ȸ�� �� ��ȣ �Է�");
				vo.setNum(1);
				
				RoomVO vo2 = dao.selectOne(vo);
				System.out.println("���ȣ/�̿�ð�/�̿뿩��");
				System.out.print(vo2.getNum()+ " / ");
				System.out.print(vo2.getTime()+ " / ");
				if (vo2.getRemain() == 1) {
					System.out.println("�̿���");
				}
				else if (vo2.getRemain() == 0) {
					System.out.println("�̿����");
				}
				
			} // �ϳ��� �� ��ȸ ��
			
			
			
		} // ������ ȭ�� ��


	} // end main()

}
