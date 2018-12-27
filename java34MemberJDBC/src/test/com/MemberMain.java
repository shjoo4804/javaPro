package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		MemberDAO dao = new MemberDAOimpl();
		
		String btn="";
		
		try {
			is = System.in;
			isr = new InputStreamReader(is);
			br = br = new BufferedReader(isr);
			
			
			do {
				
				try {
					System.out.println("======menu======");
					System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
					System.out.println("================");


					System.out.println("menu : ");
					String menu = br.readLine();
					
					if (menu.equals("1")) {
						System.out.println("====1.insert====");
						MemberVO vo = new MemberVO();
						System.out.println("아이디 입력:");
						vo.setId(br.readLine());
						System.out.println("패스워드 입력:");
						vo.setPw(br.readLine());
						System.out.println("이름 입력:");
						vo.setName(br.readLine());
						System.out.println("전화번호 입력:");
						vo.setTel(br.readLine());
						dao.insert(vo);
						
						
					} else if (menu.equals("2")) {
						System.out.println("====2.update====");
						MemberVO vo = new MemberVO();
						System.out.println("수정할 번호 입력:");
						vo.setNum(Integer.parseInt(br.readLine()));
						
						System.out.println("아이디 입력:");
						vo.setId(br.readLine());
						System.out.println("패스워드 입력:");
						vo.setPw(br.readLine());
						System.out.println("이름 입력:");
						vo.setName(br.readLine());
						System.out.println("전화번호 입력:");
						vo.setTel(br.readLine());
						dao.update(vo);
						
					} else if (menu.equals("3")) {
						System.out.println("====3.delete====");
						MemberVO vo = new MemberVO();
						System.out.println("삭제할 번호 입력:");
						vo.setNum(Integer.parseInt(br.readLine()));
						dao.delete(vo);
						
					} else if (menu.equals("4")) {
						System.out.println("====4.selectOne====");
						MemberVO vo = new MemberVO();
						System.out.println("검색할 번호 입력:");
						vo.setNum(Integer.parseInt(br.readLine()));
						MemberVO vo2 = dao.selectOne(vo);
						System.out.print(vo2.getNum()+ " ");
						System.out.print(vo2.getId()+ " ");
						System.out.print(vo2.getPw()+ " ");
						System.out.print(vo2.getName()+ " ");
						System.out.println(vo2.getTel());
						
					} else if (menu.equals("5")) {
						System.out.println("====5.selectAll====");
						List<MemberVO> vos = dao.selectAll();
						
						for (MemberVO vo : vos) {
							System.out.print(vo.getNum()+ " ");
							System.out.print(vo.getId()+ " ");
							System.out.print(vo.getPw()+ " ");
							System.out.print(vo.getName()+ " ");
							System.out.println(vo.getTel());
						}
					}
					
					if(!menu.equals("5") && !menu.equals("4")) {
						System.out.println("====5.selectAll====");
						List<MemberVO> vos = dao.selectAll();

						for (MemberVO vo : vos) {
							System.out.print(vo.getNum() + " ");
							System.out.print(vo.getId() + " ");
							System.out.print(vo.getPw() + " ");
							System.out.print(vo.getName() + " ");
							System.out.println(vo.getTel());
						}
					}

					
					System.out.println("계속하려면 아무키/종료 x키");
					btn=br.readLine();
				} catch (NullPointerException e) {
					System.out.println("잘못된 입력입니다.");
					btn="";
					// TODO: handle exception
				} catch (IOException e) {
					System.out.println("오류 재시작하세요");
					break;
					// TODO: handle exception
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			} while (!btn.equals("x"));
			
			
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			if(isr != null) {
				try {
					isr.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			if(br != null) {
				try {
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
		
		

		
		System.out.println("end main()");
	} // end main()

} // end class
