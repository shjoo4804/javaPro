package test.com;

public class Test04MemberDAO {

	public int insert(Test04MemberVO vo) {
		System.out.println("insert()...");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}
	
	public int update(Test04MemberVO vo) {
		System.out.println("update()...");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}
	
	public int delete(Test04MemberVO vo) {
		System.out.println("delete()...");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}
	
	public Test04MemberVO[] selectAll() {
		System.out.println("selectAll()...");
		Test04MemberVO[] vos = new Test04MemberVO[3];
		for (int i = 0; i < vos.length; i++) {
			Test04MemberVO vo = new Test04MemberVO();
			vos[i] = vo;
			vos[i].setNum(i);
			vos[i].setId("id"+i);
			vos[i].setPw("pw"+i);
			vos[i].setName("name"+i);
			vos[i].setTel("0"+i+i);
		}
		return vos;
	}
	
	public Test04MemberVO selectOne (Test04MemberVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		
		Test04MemberVO vo2 = new Test04MemberVO();
		vo.setNum(99);
		vo2.setId("zzz");
		vo2.setPw("zzzzz");
		vo2.setName("new name");
		vo2.setTel("090");
		return vo2;
	}
	
	
}
