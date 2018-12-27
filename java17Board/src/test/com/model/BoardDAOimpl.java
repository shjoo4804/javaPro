package test.com.model;

import java.util.Date;

public class BoardDAOimpl implements BoardDAO {

	@Override
	public int insert(BoardVO vo) {
		System.out.println("insert()");
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getwDate());
		return 0;
	}

	@Override
	public int update(BoardVO vo) {
		System.out.println("update()");
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getwDate());
		return 0;
	}

	@Override
	public int delete(BoardVO vo) {
		System.out.println("delete()");
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getwDate());
		return 0;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		System.out.println("selectOne()");
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getwDate());
		
		BoardVO vo2 = new BoardVO();
		vo2.setNum(11);
		vo2.setTitle("t111");
		vo2.setContent("c111");
		vo2.setWriter("w111");
		vo2.setwDate(new Date());
		return vo2;
	}

	@Override
	public BoardVO[] selectAll() {
		System.out.println("selectAll()");
		BoardVO[] vos = new BoardVO[2];
		for (int i = 0; i < vos.length; i++) {
			BoardVO vo = new BoardVO();
			vos[i] = vo;
			vos[i].setNum(i);
			vos[i].setTitle("t"+i);
			vos[i].setContent("t"+i);
			vos[i].setWriter("t"+i);
			vos[i].setwDate(new Date());
		}
		return vos;
	}

	
	
}
