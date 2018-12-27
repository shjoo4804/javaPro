package test.com;

import java.util.List;

public class NoteBookMain {
	public static void main(String[] args) {
		System.out.println("notebook...");

		NoteBookDAO dao = new NoteBookDAOimpl();
		
		String menu = "5";

		if (menu.equals("1")) {
			NoteBookVO vo = new NoteBookVO();
			vo.setProductNO("N002");
			vo.setProductName("≥Î∆Æ∫œ");
			vo.setModelName("LG");
			vo.setPrice(998000);

			int result = dao.insert(vo);
			System.out.println("insert result : " + result);

		} else if (menu.equals("2")) {
			NoteBookVO vo = new NoteBookVO();

			vo.setNum(3);
			vo.setProductNO("N444"); 
			vo.setProductName("gtgt");
			vo.setModelName("HP");
			vo.setPrice(770000);

			int result = dao.update(vo);
			System.out.println("update result : " + result);

		} else if (menu.equals("3")) {
			NoteBookVO vo = new NoteBookVO();

			vo.setNum(1);

			int result = dao.delete(vo);
			System.out.println("delete result : " + result);

		} else if (menu.equals("4")) {
			NoteBookVO vo = new NoteBookVO();

			vo.setNum(3);

			NoteBookVO voResult = dao.selectOne(vo);
			System.out.print(voResult.getNum() + " ");
			System.out.print(voResult.getProductNO() + " ");
			System.out.print(voResult.getProductName() + " ");
			System.out.print(voResult.getModelName() + " ");
			System.out.println(voResult.getPrice());
			
		} else if (menu.equals("5")) {
			List<NoteBookVO> vos = dao.selectAll();
			System.out.println("vos.size:"+vos.size());
			for (NoteBookVO vo : vos) {
				System.out.print(vo.getNum() + " ");
				System.out.print(vo.getProductNO() + " ");
				System.out.print(vo.getProductName() + " ");
				System.out.print(vo.getModelName() + " ");
				System.out.println(vo.getPrice());
			}
		}

	} // end main()

} // end class
