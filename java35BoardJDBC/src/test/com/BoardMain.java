package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class BoardMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("BOARD");
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String exit = "";
		
		try {
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			
			do {
				
				try {
					BoardDAO dao = new BoardDAOimpl();
					
					System.out.println("======menu======");
					System.out.println("1.insert 2.update 3.delete 4.selectOne 5.selectAll");
					System.out.println("================");
					
					System.out.println("menu입력");
					int menu = Integer.parseInt(br.readLine());
					
					if(menu==1) {
						System.out.println("===1.insert===");
						BoardVO vo = new BoardVO();
						System.out.println("제목:");
						vo.setTitle(br.readLine());
						System.out.println("내용:");
						vo.setContent(br.readLine());
						System.out.println("글쓴이:");
						vo.setWriter(br.readLine());
						dao.insert(vo);
						
					} else if(menu==2) {
						System.out.println("===2.update===");
						BoardVO vo = new BoardVO();
						System.out.println("수정할 글번호:");
						vo.setNum(Integer.parseInt(br.readLine()));
						System.out.println("제목:");
						vo.setTitle(br.readLine());
						System.out.println("내용:");
						vo.setContent(br.readLine());
						System.out.println("글쓴이:");
						vo.setWriter(br.readLine());
						dao.update(vo);
						
					} else if(menu==3) {
						System.out.println("===3.delete===");
						BoardVO vo = new BoardVO();
						System.out.println("삭제할 글번호:");
						vo.setNum(Integer.parseInt(br.readLine()));
						dao.delete(vo);
						
					} else if(menu==4) {
						System.out.println("===4.selectOne===");
						BoardVO vo = new BoardVO();
						System.out.println("검색할 글번호:");
						vo.setNum(Integer.parseInt(br.readLine()));
						BoardVO vo2 = dao.selectOne(vo);
						System.out.print(vo2.getNum() + " ");
						System.out.print(vo2.getTitle() + " ");
						System.out.print(vo2.getContent() + " ");
						System.out.print(vo2.getWriter() + " ");
						System.out.println(vo2.getwDate());
						
					} else if(menu==5) {
						System.out.println("===5.selectAll===");
						List<BoardVO> vos = dao.selectAll();
						
						for (BoardVO vo2 : vos) {
							System.out.print(vo2.getNum() + " ");
							System.out.print(vo2.getTitle() + " ");
							System.out.print(vo2.getContent() + " ");
							System.out.print(vo2.getWriter() + " ");
							System.out.println(vo2.getwDate());
						}
					}
					
					
					System.out.println("계속하려면 아무키 / 종료 x키");
					exit=br.readLine();
				} catch (NumberFormatException e) {
					System.out.println("메뉴에 숫자를 입력하세요");
					exit="";
					// TODO: handle exception
				} catch (IOException e) {
					System.out.println("비정상적 오류 : 종료합니다");
					break;
					// TODO: handle exception
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			} while (!exit.equals("x"));
			
			
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			if(isr!=null) {
				try {
					isr.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			if(is!=null) {
				try {
					is.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		} // end finally
		

		System.out.println("end main()");
	} // end main()

}
