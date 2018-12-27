package test.com.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import test.com.model.GameDirDAO;
import test.com.model.GameDirDAOimpl;
import test.com.model.GameVO;

public class GameMain {

	public static void main(String[] args) {
		
		GameDirDAO dao = new GameDirDAOimpl();

		String x = "";
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			do {
				System.out.println("menu=================");
				System.out.println("1.���� �߰�");
				System.out.println("2.���� ����");
				System.out.println("3.���� ����");
				System.out.println("4.���� ��ȸ");
				System.out.println("5.���� �˻�");
				System.out.println("=======================");

				try {

					System.out.println("menu:");
					String menu = br.readLine();
					if (menu.equals("1")) {
						GameVO vo = new GameVO();
						System.out.println("�̸�:");
						vo.setName(br.readLine());
						System.out.println("���ӷ���:");
						vo.setGameLevel(Integer.parseInt(br.readLine()));
						System.out.println("�����ο� : ");
						vo.setPeopleCount(Integer.parseInt(br.readLine()));
						int result = dao.insert(vo);
					} else if (menu.equals("2")) {
						GameVO vo = new GameVO();
						System.out.println("��ȣ:");
						vo.setNum(Integer.parseInt(br.readLine()));
						System.out.println("�ٲ� �̸�:");
						vo.setName(br.readLine());
						System.out.println("�ٲ� ���ӷ���:");
						vo.setGameLevel(Integer.parseInt(br.readLine()));
						System.out.println("�ٲ� �����ο� : ");
						vo.setPeopleCount(Integer.parseInt(br.readLine()));
						int result = dao.update(vo);
					} else if (menu.equals("3")) {
						GameVO vo = new GameVO();
						System.out.println("���� ��ȣ:");
						vo.setNum(Integer.parseInt(br.readLine()));
						int result = dao.delete(vo);
						System.out.println("delete sucessed");
					} else if (menu.equals("4")) {
						List<GameVO> vos = dao.selectAll();

						for (GameVO vo : vos) {
							System.out.print(vo.getNum() + "  ");
							System.out.print(vo.getName() + "  ");
							System.out.print(vo.getGameLevel() + "  ");
							System.out.println(vo.getPeopleCount() + "  ");
						}
					} else if (menu.equals("5")) {
						GameVO vo = new GameVO();
						System.out.println("��ȣ:");
						vo.setNum(Integer.parseInt(br.readLine()));
						GameVO vo2 = dao.selectOne(vo);
						System.out.print(vo2.getNum() + " ");
						System.out.print(vo2.getName() + " ");
						System.out.print(vo2.getGameLevel() + "  ");
						System.out.println(vo2.getPeopleCount() + "  ");
					}

					System.out.println("����Ͻ÷��� �ƹ�Ű�Է�,����� x");
					x = br.readLine();
				} catch (NumberFormatException e) {
					System.out.println("������ ���ڸ� �Է¹ٶ��ϴ�.");
					x = "";
				} catch (Exception e) {
					System.out.println("���α׷������� �����մϴ�.");
					break;
				}

			} while (!x.equals("x"));
		} catch (Exception e) {
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	


	}

}
