package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class NotebookMain {

	public static void main(String[] args) throws IOException {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String exitBtn = "";

			
			do {
				
				try {
					System.out.println("=====menu=====");
					System.out.println("1.insert 2.update 3.delete 4.selectOne 5.selectAll");
					System.out.println("==============");
					
					NotebookDAO dao = new NotebookDAOimpl();
					
					System.out.println("menu:");
					String menu = br.readLine();
					int result = 0;
					
					if(menu.equals("1")) {
						System.out.println("===1.insert===");
						NotebookVO vo = new NotebookVO();
						System.out.println("제품명:");
						vo.setProductName(br.readLine());
						System.out.println("제조사:");
						vo.setMade(br.readLine());
						System.out.println("가격:");
						vo.setPrice(Integer.parseInt(br.readLine()));
						result = dao.insert(vo);
						System.out.println("insert result:"+result);
						
					} else if(menu.equals("2")) {
						System.out.println("===1.update===");
						NotebookVO vo = new NotebookVO();
						System.out.println("업데이트할 번호 : ");
						vo.setNum(Integer.parseInt(br.readLine()));
						
						System.out.println("제품명:");
						vo.setProductName(br.readLine());
						System.out.println("제조사:");
						vo.setMade(br.readLine());
						System.out.println("가격:");
						vo.setPrice(Integer.parseInt(br.readLine()));
						result = dao.update(vo);
						System.out.println("update result:"+result);
						
					} else if(menu.equals("3")) {
						System.out.println("===3.delete===");
						NotebookVO vo = new NotebookVO();
						System.out.println("삭제할 번호 : ");
						vo.setNum(Integer.parseInt(br.readLine()));
						result = dao.delete(vo);
						System.out.println("delete result:"+result);
						
					} else if(menu.equals("4")) {
						System.out.println("===4.selectOne===");
						NotebookVO vo = new NotebookVO();
						System.out.println("검색할 번호 : ");
						vo.setNum(Integer.parseInt(br.readLine()));
						NotebookVO vo2 = dao.selectOne(vo);
						System.out.print(vo2.getNum() + " ");
						System.out.print(vo2.getProductName() + " ");
						System.out.print(vo2.getMade() + " ");
						System.out.println(vo2.getPrice());
						
					} else if(menu.equals("5")) {
						System.out.println("===5.selectAll===");
						List<NotebookVO> list = dao.selectAll();
						for (NotebookVO vo : list) {
							System.out.print(vo.getNum() + " ");
							System.out.print(vo.getProductName() + " ");
							System.out.print(vo.getMade() + " ");
							System.out.println(vo.getPrice());
						}
					}
					
					
					System.out.println("계속하시려면 아무키 / 종료하려면  x키");
					exitBtn = br.readLine();
				} catch (IOException e) {
					// TODO: handle exception
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			} while (!exitBtn.equals("x"));
			
			
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

} // end class
