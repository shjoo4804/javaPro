package test.com.model;

public class MemberDAOimpl implements MemberDAO {

	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert()");
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update()");
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete()");
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne()");
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		
		MemberVO vo2 = new MemberVO();
		vo2.setId("id11");
		vo2.setPw("pw11");
		vo2.setName("name11");
		vo2.setTel("tel11");
		return vo2;
	}

	@Override
	public MemberVO[] selectAll() {
		System.out.println("selectAll()");
		
		MemberVO[] vos = new MemberVO[3];
		for (int i = 0; i < vos.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("id"+i+i);
			vo.setPw("pw"+i+i);
			vo.setName("name"+i+i);
			vo.setTel("tel"+i+i);
			vos[i] = vo;
		}
		
		return vos;
	}
	
	

}
