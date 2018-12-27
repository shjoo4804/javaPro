package test.com.model;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAOimpl();
		
		System.out.println(dao.insert(new MemberVO()));
		System.out.println(dao.update(new MemberVO()));
		System.out.println(dao.delete(new MemberVO()));

		MemberVO vo1 = dao.selectOne(new MemberVO());
		System.out.println(vo1);
		System.out.println(vo1.getId());
		System.out.println(vo1.getPw());
		System.out.println(vo1.getName());
		System.out.println(vo1.getTel());
		
		MemberVO[] vos = dao.selectAll();
		for (int i = 0; i < vos.length; i++) {
			MemberVO vo2 = new MemberVO();
			vo2 = vos[i];
			System.out.println(vo2.getId());
			System.out.println(vo2.getPw());
			System.out.println(vo2.getName());
			System.out.println(vo2.getTel());
		}
	}

}
