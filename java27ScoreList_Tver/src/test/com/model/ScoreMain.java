package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreMain {

	public static void main(String[] args) {
		System.out.println("main...");
		// MVC model Design
		// VO,DAO,DAOimpl >>> Model
		// main() >>> View
		// control >>> Controller

		// �ݺ��Ǵ� �޴�
		// menu=================
		// 1.insert 2.update 3.delete 4.selectAll 5.selectOne
		// =======================
		// input menu num : 1

		// 1.insert=============
		// ��ȣ�� �Է��ϼ��� : 22
		// �̸��� �Է��ϼ��� : kim22
		// .....
		// 4.selectAll
		// 1 kim33 33 33 33 99 33.0 F
		// 2 kim33 33 33 33 99 33.0 F
		// ....
		// 22 kim22 22 22 22 66 22.0 F
		
		// ����Ͻ÷��� �ƹ�Ű�Է�,����� x

		// 2.update=============
		// ��ȣ�� �Է��ϼ��� : 1
		// �̸��� �Է��ϼ��� : kim22
		// .....
		// 4.selectAll
		// 1 kim22 33 33 33 99 33.0 F
		// 2 kim33 33 33 33 99 33.0 F
		// ....
		// 22 kim22 22 22 22 66 22.0 F
		// ����Ͻ÷��� �ƹ�Ű�Է�,����� x

		// 3.delete=============
		// ��ȣ�� �Է��ϼ��� : 2

		// 4.selectAll
		// 1 kim22 33 33 33 99 33.0 F
		// ....
		// 22 kim22 22 22 22 66 22.0 F
		// ����Ͻ÷��� �ƹ�Ű�Է�,����� x
		
		// 5.selectOne
		// ��ȣ�� �Է��ϼ��� : 1
		// 1 kim22 33 33 33 99 33.0 F
		// ����Ͻ÷��� �ƹ�Ű�Է�,����� x
		
		
		
		ScoreDAO dao = new ScoreDAOimpl();
		
		String x = "";
		
		InputStream is = null; // ***
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try { // �ݺ����� ������ �����
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			// �ݺ����� �ȿ� �־��ֱ�
			
			do {
				System.out.println("menu=================");
				System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
				System.out.println("=====================");
				
				try { // *����ó���ϱ�

					System.out.println("menu:");
					String menu=br.readLine();
					if(menu.equals("1")) {
						ScoreVO vo2 = new ScoreVO();
						System.out.println("��ȣ:");
						vo2.setNum(Integer.parseInt(br.readLine()));
						System.out.println("�̸�:");
						vo2.setName(br.readLine());
						System.out.println("����:");
						vo2.setKor(Integer.parseInt(br.readLine()));
						System.out.println("����:");
						vo2.setEng(Integer.parseInt(br.readLine()));
						System.out.println("����:");
						vo2.setMath(Integer.parseInt(br.readLine()));
						vo2.setTotal(vo2.getKor() + vo2.getEng() + vo2.getMath());
						vo2.setAvg(vo2.getTotal() / 3.0);
						String grade = "";
						if (vo2.getAvg() >= 90) {
							grade = "A";
						} else if (vo2.getAvg() >= 80) {
							grade = "B";
						} else if (vo2.getAvg() >= 70) {
							grade = "C";
						} else {
							grade = "F";
						}
						vo2.setGrade(grade);
						System.out.println(dao.insert(vo2));
						
						
						
					} else if(menu.equals("2")) {
						ScoreVO vo2 = new ScoreVO();
						System.out.println("��ȣ:");
						vo2.setNum(Integer.parseInt(br.readLine()));
						System.out.println("�̸�:");
						vo2.setName(br.readLine());
						System.out.println("����:");
						vo2.setKor(Integer.parseInt(br.readLine()));
						System.out.println("����:");
						vo2.setEng(Integer.parseInt(br.readLine()));
						System.out.println("����:");
						vo2.setMath(Integer.parseInt(br.readLine()));
						vo2.setTotal(vo2.getKor() + vo2.getEng() + vo2.getMath());
						vo2.setAvg(vo2.getTotal() / 3.0);
						String grade = "";
						if (vo2.getAvg() >= 90) {
							grade = "A";
						} else if (vo2.getAvg() >= 80) {
							grade = "B";
						} else if (vo2.getAvg() >= 70) {
							grade = "C";
						} else {
							grade = "F";
						}
						vo2.setGrade(grade);
						
						System.out.println(dao.update(vo2));
						
						
						
					} else if(menu.equals("3")) {
						ScoreVO vo2 = new ScoreVO();
						System.out.println("������ ��ȣ:");
						vo2.setNum(Integer.parseInt(br.readLine()));
						System.out.println(dao.delete(vo2));
						
						
					} else if(menu.equals("4")) {
						List<ScoreVO> vos = dao.selectAll();
//						System.out.println(vos);
//						System.out.println("vos.size():" + vos.size());

						for (int i = 0; i < vos.size(); i++) {
							System.out.print(vos.get(i).getNum() + " ");
							System.out.print(vos.get(i).getName() + " ");
							System.out.print(vos.get(i).getKor() + " ");
							System.out.print(vos.get(i).getEng() + " ");
							System.out.print(vos.get(i).getMath() + " ");
							System.out.print(vos.get(i).getTotal() + " ");
							System.out.print(vos.get(i).getAvg() + " ");
							System.out.println(vos.get(i).getGrade());
						}
						
					} else if(menu.equals("5")) {
						ScoreVO vo2 = new ScoreVO();
						System.out.println("�˻��� ��ȣ:");
						vo2.setNum(Integer.parseInt(br.readLine()));
						ScoreVO vo = dao.selectOne(vo2);
						System.out.print(vo.getNum() + " ");
						System.out.print(vo.getName() + " ");
						System.out.print(vo.getKor() + " ");
						System.out.print(vo.getEng() + " ");
						System.out.print(vo.getMath() + " ");
						System.out.print(vo.getTotal() + " ");
						System.out.print(vo.getAvg() + " ");
						System.out.println(vo.getGrade());
						
						
					} else {
						
					}
					
					List<ScoreVO> vos = dao.selectAll();
//					System.out.println(vos);
//					System.out.println("vos.size():" + vos.size());

					for (int i = 0; i < vos.size(); i++) {
						System.out.print(vos.get(i).getNum() + " ");
						System.out.print(vos.get(i).getName() + " ");
						System.out.print(vos.get(i).getKor() + " ");
						System.out.print(vos.get(i).getEng() + " ");
						System.out.print(vos.get(i).getMath() + " ");
						System.out.print(vos.get(i).getTotal() + " ");
						System.out.print(vos.get(i).getAvg() + " ");
						System.out.println(vos.get(i).getGrade());
					}
					
					System.out.println("����Ϸ��� �ƹ�Ű�Է�, ����� x");
					x = br.readLine();
					
				} catch (NumberFormatException e) {
					System.out.println("������ ���ڸ� �Է¹ٶ��ϴ�.");
					x="";
				} catch (Exception e) {
					System.out.println("����-���α׷��� �����մϴ�. �ٽ� �����ϼ���.");
					break;
					
				} 
				
			} while (!x.equals("x"));
			
			
			
		} finally { // ***
			if(br!=null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(isr!=null) {
				try {
					isr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(is!=null) {
				try {
					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		System.out.println("end main");
	}

}
