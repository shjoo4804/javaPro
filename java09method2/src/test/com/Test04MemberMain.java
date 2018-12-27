package test.com;

public class Test04MemberMain {

	public static void main(String[] args) {
		
		Test04MemberDAO dao = new Test04MemberDAO();
		
		
		Test04MemberVO vo = new Test04MemberVO();
		vo.setNum(11);
		vo.setId("id11");
		vo.setPw("pw11");
		vo.setName("name11");
		vo.setTel("011");
		int a1 = dao.insert(vo);
		System.out.println(a1);
		System.out.println("============");
		
		Test04MemberVO vo1 = new Test04MemberVO();
		vo1.setNum(22);
		vo1.setId("id22");
		vo1.setPw("pw22");
		vo1.setName("name22");
		vo1.setTel("022");
		int a2 = dao.update(vo1);
		System.out.println(a2);
		System.out.println("============");
		
		Test04MemberVO vo3 = new Test04MemberVO();
		vo3.setNum(11);
		vo3.setId("id11");
		vo3.setPw("pw11");
		vo3.setName("name11");
		vo3.setTel("011");
		int a3 = dao.delete(vo3);
		System.out.println(a3);
		System.out.println("============");
		
		Test04MemberVO[] vos = dao.selectAll();
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i].getNum());
			System.out.println(vos[i].getId());
			System.out.println(vos[i].getPw());
			System.out.println(vos[i].getName());
			System.out.println(vos[i].getTel());
		}
		System.out.println("============");

	}

}
