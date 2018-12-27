package test.com.model;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {
	
	List<MemberVO> vos = new ArrayList<>(); // ÀúÀå¼Ò

	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert()");
		
		vos.add(vo);
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update()");
		
		for (int i = 0; i < vos.size() ; i++) {
			if (vos.get(i).getId().equals(vo.getId())) {
				vos.set(i, vo);
			}
		}
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete()");

		for (int i = 0; i < vos.size() ; i++) {
			if (vos.get(i).getId().equals(vo.getId())) {
				vos.remove(i);
			}
		}
		return 0;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne()");
		
		MemberVO vo2 = null; // *
		
		for (int i = 0; i < vos.size() ; i++) {
			if (vos.get(i).getId().equals(vo.getId())) {
				vo2 = vos.get(i);
			}
		}
		return vo2;
	}

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll()");
		
		return vos;
	}
	
	

}
