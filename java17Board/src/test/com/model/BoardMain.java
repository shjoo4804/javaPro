package test.com.model;

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
		
		BoardVO[] vos = dao.selectAll();
		for (int i = 0; i < vos.length; i++) {
			BoardVO vo2 = new BoardVO();
			System.out.println(vos[i].getNum());
			System.out.println(vos[i].getTitle());
			System.out.println(vos[i].getContent());
			System.out.println(vos[i].getWriter());
			System.out.println(vos[i].getwDate());
			
			vos[i] = vo2;
		}

	}
}
