package test.com.model;

import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAOimpl();
		
		System.out.println(dao.insert(new BoardVO()));
		System.out.println(dao.update(new BoardVO()));
		System.out.println(dao.delete(new BoardVO()));
		
		BoardVO vo = dao.selectOne(new BoardVO());
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getwDate());
		System.out.println();
		
		List<BoardVO> vos = dao.selectAll();
		System.out.println("vos.size():"+vos.size());
		for (int i = 0; i < vos.size(); i++) {
			BoardVO vo2 = new BoardVO();
			System.out.print(vos.get(i).getNum()+" ");
			System.out.print(vos.get(i).getTitle()+" ");
			System.out.print(vos.get(i).getContent()+" ");
			System.out.print(vos.get(i).getWriter()+" ");
			System.out.println(vos.get(i).getwDate());
		}

	}
}
