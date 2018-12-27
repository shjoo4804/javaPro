package test.com.model;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {

	List<BoardVO> vos = new ArrayList<BoardVO>();

	@Override
	public int insert(BoardVO vo) {
		System.out.println("insert()");

		vos.add(vo);
		return 0;
	}

	@Override
	public int update(BoardVO vo) {
		System.out.println("update()");

		for (int i = 0; i < vos.size(); i++) {
			if (vos.get(i).getNum() == vo.getNum()) {
				vos.set(i, vo);
			}
		}
		return 0;
	}

	@Override
	public int delete(BoardVO vo) {
		System.out.println("delete()");

		for (int i = 0; i < vos.size(); i++) {
			if (vos.get(i).getNum() == vo.getNum()) {
				vos.remove(i);
			}
		}
		return 0;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		System.out.println("selectOne()");
		
		BoardVO vo2 = new BoardVO();
		for (int i = 0; i < vos.size(); i++) {
			if (vos.get(i).getNum() == vo.getNum()) {
				vo2 = vos.get(i);
			}
		}
		return vo2;
	}

	@Override
	public List<BoardVO> selectAll() {
		System.out.println("selectAll()");
		
		return vos;
	}

}
