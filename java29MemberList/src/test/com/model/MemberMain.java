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
					System.out.println("id �Է�:");
					vo.setId(br.readLine());
					System.out.println("pw �Է�:");
					vo.setPw(br.readLine());
					System.out.println("�̸� �Է�:");
					vo.setName(br.readLine());
					System.out.println("��ȭ��ȣ �Է�:");
					vo.setTel(br.readLine());
					dao.insert(vo);
					
				} else if(menu.equals("2")) {
					MemberVO vo = new MemberVO();
					System.out.println("������ id �Է�:");
					vo.setId(br.readLine());
					System.out.println("pw �Է�:");
					vo.setPw(br.readLine());
					System.out.println("�̸� �Է�:");
					vo.setName(br.readLine());
					System.out.println("��ȭ��ȣ �Է�:");
					vo.setTel(br.readLine());
					dao.update(vo);
					
				} else if(menu.equals("3")) {
					MemberVO vo = new MemberVO();
					System.out.println("������ id �Է�:");
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
					System.out.println("�˻��� id �Է�:");
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
				
				
				System.out.println("��� �Ͻ÷��� �ƹ�Ű�� ��������(����:xŰ)");
				x=br.readLine();
				
				
			} catch (IOException e) {
				System.out.println("�߸��� �Է°��Դϴ�.");
				x="";
//				e.printStackTrace();
				
			} catch (Exception e) {
				System.out.println("����:�����մϴ�. �ٽ� �����ϼ���.");
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
