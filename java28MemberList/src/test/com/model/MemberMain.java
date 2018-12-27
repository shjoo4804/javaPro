package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class MemberMain {

	public static void main(String[] args)  {
		

		MemberDAO dao = new MemberDAOimpl();
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		String x ="";
		do {
			
			try {
				
				is = System.in;
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				

				System.out.println("menu=================");
				System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
				System.out.println("=====================");
				
				System.out.println("menu:");
				String menu = br.readLine();
				
				if(menu.equals("1")) {
					MemberVO vo = new MemberVO();
					System.out.println("id 입력:");
					vo.setId(br.readLine());
					System.out.println("pw 입력:");
					vo.setPw(br.readLine());
					System.out.println("이름 입력:");
					vo.setName(br.readLine());
					System.out.println("전화번호 입력:");
					vo.setTel(br.readLine());
					dao.insert(vo);
					
				} else if(menu.equals("2")) {
					MemberVO vo = new MemberVO();
					System.out.println("변경할 id 입력:");
					vo.setId(br.readLine());
					System.out.println("pw 입력:");
					vo.setPw(br.readLine());
					System.out.println("이름 입력:");
					vo.setName(br.readLine());
					System.out.println("전화번호 입력:");
					vo.setTel(br.readLine());
					dao.update(vo);
					
				} else if(menu.equals("3")) {
					MemberVO vo = new MemberVO();
					System.out.println("삭제할 id 입력:");
					vo.setId(br.readLine());
					dao.delete(vo);
					
				} else if(menu.equals("4")) {
					List<MemberVO> vos = dao.selectAll();
					System.out.println("vos.size():"+vos.size());
					for (int i = 0; i < vos.size(); i++) {
						System.out.print(vos.get(i).getId()+" ");
						System.out.print(vos.get(i).getPw()+" ");
						System.out.print(vos.get(i).getName()+" ");
						System.out.println(vos.get(i).getTel());
					}
					
				} else if(menu.equals("5")) {
					MemberVO vo = new MemberVO();
					System.out.println("검색할 id 입력:");
					vo.setId(br.readLine());
					MemberVO vo1 = dao.selectOne(vo);
					System.out.print(vo1.getId() + " ");
					System.out.print(vo1.getPw() + " ");
					System.out.print(vo1.getName() + " ");
					System.out.println(vo1.getTel() + " ");
					System.out.println();
					
				} else {
					
				}
				
				List<MemberVO> vos = dao.selectAll();
				System.out.println("vos.size():"+vos.size());
				for (int i = 0; i < vos.size(); i++) {
					System.out.print(vos.get(i).getId()+" ");
					System.out.print(vos.get(i).getPw()+" ");
					System.out.print(vos.get(i).getName()+" ");
					System.out.println(vos.get(i).getTel());
				}
				
				
				System.out.println("계속 하시려면 아무키나 누르세요(종료:x키)");
				x=br.readLine();
				
				
			} catch (IOException e) {
				System.out.println("잘못된 입력값입니다.");
				x="";
//				e.printStackTrace();
				
			} catch (Exception e) {
				System.out.println("오류:종료합니다. 다시 시작하세요.");
//				e.printStackTrace();
				break;
				
			} finally {
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
			
			
		} while(!x.equals("x"));
		
		System.out.println("program end");
	
	}

}
