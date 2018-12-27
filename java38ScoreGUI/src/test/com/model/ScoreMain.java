package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreMain {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ScoreDAO dao = new ScoreDAOimpl();

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String btn = "";

		try {

			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			do {
				try {
					System.out.println("======menu======");
					System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
					System.out.println("================");

					System.out.println("menu:");
					int menu = Integer.parseInt(br.readLine());

					if (menu == 1) {
						System.out.println("=====1.insert=====");
						ScoreVO vo = new ScoreVO();
						System.out.println("�̸� �Է�:");
						vo.setName(br.readLine());
						System.out.println("���� ���� �Է�:");
						vo.setKor(Integer.parseInt(br.readLine()));
						System.out.println("���� ���� �Է�:");
						vo.setEng(Integer.parseInt(br.readLine()));
						System.out.println("���� ���� �Է�:");
						vo.setMath(Integer.parseInt(br.readLine()));
						vo.getTotal();
						vo.getAvg();
						vo.getGrade();
						dao.insert(vo);

					} else if (menu == 2) {
						System.out.println("=====2.update=====");
						ScoreVO vo = new ScoreVO();
						System.out.println("������ ��ȣ:" + vo.getNum());
						vo.setNum(Integer.parseInt(br.readLine()));
						System.out.println("�̸� �Է�:");
						vo.setName(br.readLine());
						System.out.println("���� ���� �Է�:");
						vo.setKor(Integer.parseInt(br.readLine()));
						System.out.println("���� ���� �Է�:");
						vo.setEng(Integer.parseInt(br.readLine()));
						System.out.println("���� ���� �Է�:");
						vo.setMath(Integer.parseInt(br.readLine()));
						vo.getTotal();
						vo.getAvg();
						vo.getGrade();
						dao.update(vo);

					} else if (menu == 3) {
						System.out.println("=====3.delete=====");
						ScoreVO vo = new ScoreVO();
						System.out.println("������ ��ȣ:" + vo.getNum());
						vo.setNum(Integer.parseInt(br.readLine()));
						dao.delete(vo);

					} else if (menu == 4) {
						System.out.println("===4.selectAll=====");
						List<ScoreVO> vos = dao.selectAll();
						for (ScoreVO vo : vos) {
							System.out.print(vo.getNum() + " ");
							System.out.print(vo.getName() + " ");
							System.out.print(vo.getKor() + " ");
							System.out.print(vo.getEng() + " ");
							System.out.print(vo.getMath() + " ");
							System.out.print(vo.getTotal() + " ");
							System.out.print(vo.getAvg() + " ");
							System.out.print(vo.getGrade());
							System.out.println();
						}

					} else if (menu == 5) {
						System.out.println("===5.selectOne=====");
						ScoreVO vo = new ScoreVO();
						System.out.println("�˻��� ��ȣ:");
						vo.setNum(Integer.parseInt(br.readLine()));

						ScoreVO vo2 = dao.selectOne(vo);
						System.out.print(vo.getNum() + " ");
						System.out.print(vo.getName() + " ");
						System.out.print(vo.getKor() + " ");
						System.out.print(vo.getEng() + " ");
						System.out.print(vo.getMath() + " ");
						System.out.print(vo.getTotal() + " ");
						System.out.print(vo.getAvg() + " ");
						System.out.print(vo.getGrade());
						System.out.println();

					} // end if

					if (menu != 4 && menu != 5) {
						System.out.println("===4.selectAll=====");
						List<ScoreVO> vos = dao.selectAll();
						for (ScoreVO vo : vos) {
							System.out.print(vo.getNum() + " ");
							System.out.print(vo.getName() + " ");
							System.out.print(vo.getKor() + " ");
							System.out.print(vo.getEng() + " ");
							System.out.print(vo.getMath() + " ");
							System.out.print(vo.getTotal() + " ");
							System.out.print(vo.getAvg() + " ");
							System.out.print(vo.getGrade());
							System.out.println();
						}
					}

					System.out.println("����Ͻ÷��� �ƹ�Ű, ���� xŰ");
					btn = br.readLine();

				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��ϼ���");
					btn = "";
					// TODO: handle exception
				} catch (IOException e) {
					// TODO: handle exception
				}
				
			} while (!btn.equals("x"));

			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

			if (isr != null) {
				try {
					isr.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

			if (is != null) {
				try {
					is.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

		System.out.println("end main");

	} // end main()

} // end class
