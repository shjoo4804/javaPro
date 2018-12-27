package test.com;

public class Test03BoardMain {

	public static void main(String[] args) {
		System.out.println("Board...");
		
		Test03BoardDAO dao = new Test03BoardDAO();
		
		Test03BoardVO vo = new Test03BoardVO();
		vo.setTitle("title11");
		vo.setContent("content111");
		vo.setWriter("writer111");
		int x1 = dao.insert(vo);
		System.out.println(x1);
		System.out.println("=========");
		
		Test03BoardVO vo2 = new Test03BoardVO();
		vo2.setTitle("title22");
		vo2.setContent("content222");
		vo2.setWriter("writer222");
		int x2 = dao.update(vo2);
		System.out.println(x2);
		System.out.println("=========");
		
		Test03BoardVO vo3 = new Test03BoardVO();
		vo3.setTitle("title33");
		vo3.setContent("content33");
		vo3.setWriter("writer33");
		int x3 = dao.update(vo3);
		System.out.println(x3);
		System.out.println("=========");
		
		Test03BoardVO[] vos = dao.selectAll();
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i].getTitle());
			System.out.println(vos[i].getContent());
			System.out.println(vos[i].getWriter());
			System.out.println(vos[i].getWDate());
		}
		System.out.println("=========");
		
		Test03BoardVO vo4 = dao.selectOne(vo);
		System.out.println(vo4.getTitle());
		System.out.println(vo4.getContent());
		System.out.println(vo4.getWriter());
		System.out.println(vo4.getWDate());
		
		
		

	} // end main()

} // end class
