package test.com.model;

import java.util.List;

public class ScoreMain {

	public static void main(String[] args) {
		System.out.println("main...");

		ScoreDAO dao = new ScoreDAOimpl();
		// 객체 생성해서 값 세팅하기

		System.out.println(dao.insert(new ScoreVO()));
		System.out.println(dao.update(new ScoreVO()));
		System.out.println(dao.delete(new ScoreVO()));

		ScoreVO vo2 = dao.selectOne(new ScoreVO());
		System.out.println(vo2);
		System.out.println(vo2.getName());
		System.out.println(vo2.getKor());
		System.out.println(vo2.getEng());
		System.out.println(vo2.getMath());
		System.out.println(vo2.getTotal());
		System.out.println(vo2.getAvg());
		System.out.println(vo2.getGrade());
		System.out.println();

		
		
		List<ScoreVO> vos = dao.selectAll();
		System.out.println(vos);
		System.out.println("list.size() : "+vos.size());

		
		for (int i = 0; i < vos.size(); i++) {
			System.out.print(vos.get(i).getName() + " ");
			System.out.print(vos.get(i).getKor() + " ");
			System.out.print(vos.get(i).getEng() + " ");
			System.out.print(vos.get(i).getMath() + " ");
			System.out.print(vos.get(i).getTotal() + " ");
			System.out.print(vos.get(i).getAvg() + " ");
			System.out.print(vos.get(i).getGrade() + " ");
			System.out.println();
			
		}
		System.out.println();
		

	} // end main()

}
