package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardMain {

	public static void main(String[] args) throws IOException {
		
		
		
		BoardDAO dao = new BoardDAOimpl();
		
		String x = "";
		do {
			InputStream is = null;
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			System.out.println("menu=================");
			System.out.println("1.insert 2.update 3.delete 4.selectAll 5.selectOne");
			System.out.println("=====================");
			
			try {
				is = System.in;
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);

				System.out.println("menu:");
				String menuNum = br.readLine();
				
				if(menuNum.equals("1")) {
					System.out.println("===1.insert========");
					BoardVO vo = new BoardVO();
					System.out.println("게시글 번호:");
					vo.setNum(Integer.parseInt(br.readLine()));
					System.out.println("제목:");
					vo.setTitle(br.readLine());
					System.out.println("내용:");
					vo.setContent(br.readLine());
					System.out.println("작가:");
					vo.setWriter(br.readLine());
					System.out.println("날짜:");
					vo.setwDate(new Date());
					
					dao.insert(vo);
					
				} else if(menuNum.equals("2")) {
					System.out.println("===2.update========");
					
					BoardVO vo = new BoardVO();
					System.out.println("수정할 게시글 번호:");
					vo.setNum(Integer.parseInt(br.readLine()));
					System.out.println("제목:");
					vo.setTitle(br.readLine());
					System.out.println("내용:");
					vo.setContent(br.readLine());
					System.out.println("작가:");
					vo.setWriter(br.readLine());
					System.out.println("날짜:");
					vo.setwDate(new Date());
					
					dao.update(vo);
					
				} else if(menuNum.equals("3")) {
					System.out.println("===3.delete========");
					
					BoardVO vo = new BoardVO();
					System.out.println("삭제할 게시글 번호:");
					vo.setNum(Integer.parseInt(br.readLine()));
					dao.delete(vo);
					
				} else if(menuNum.equals("4")) {
					System.out.println("===4.selectAll========");
					
					List<BoardVO> vos = dao.selectAll();
					for (int i = 0; i < vos.size(); i++) {
						System.out.print(vos.get(i).getNum() + " ");
						System.out.print(vos.get(i).getTitle() + " ");
						System.out.print(vos.get(i).getContent() + " ");
						System.out.print(vos.get(i).getWriter() + " ");
						System.out.println(vos.get(i).getwDate());
					}
					
					
				} else if(menuNum.equals("5")) {
					System.out.println("===5.selectOne========");
					
					BoardVO vo = new BoardVO();
					System.out.println("검색할 게시글 번호:");
					vo.setNum(Integer.parseInt(br.readLine()));
					
					BoardVO vo2 = dao.selectOne(vo);
					System.out.print(vo2.getNum() + " ");
					System.out.print(vo2.getTitle() + " ");
					System.out.print(vo2.getContent() + " ");
					System.out.print(vo2.getWriter() + " ");
					System.out.println(vo2.getwDate());
					
				}
				
				if(!menuNum.equals("4")) {
					List<BoardVO> vos = dao.selectAll();
					for (int i = 0; i < vos.size(); i++) {
						System.out.print(vos.get(i).getNum() + " ");
						System.out.print(vos.get(i).getTitle() + " ");
						System.out.print(vos.get(i).getContent() + " ");
						System.out.print(vos.get(i).getWriter() + " ");
						System.out.println(vos.get(i).getwDate());
					}
				}
				
				System.out.println("계속하려면 아무키 입력/종료는 x키");
				x=br.readLine();
			} catch (IOException e) {
				System.out.println("잘못된 입력입니다.");
				x="";
			} catch (Exception e) {
				System.out.println("오류:종료합니다. 재시작하세요.");
				break;
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
			
			
			
		} while(!x.equals("x"));

	}

}
