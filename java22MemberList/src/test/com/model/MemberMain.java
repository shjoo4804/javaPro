package test.com.model;

import java.util.List;

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
		System.out.println();
		
		List<MemberVO> vos = dao.selectAll();
		System.out.println("vos.size():"+vos.size());
		for (int i = 0; i < vos.size(); i++) {
			System.out.print(vos.get(i).getId()+" ");
			System.out.print(vos.get(i).getPw()+" ");
			System.out.print(vos.get(i).getName()+" ");
			System.out.println(vos.get(i).getTel());
		}
	}

}
