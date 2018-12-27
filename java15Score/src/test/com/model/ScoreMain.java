package test.com.model;

public class ScoreMain {

	public static void main(String[] args) {
		System.out.println("main...");

		ScoreDAO dao = new ScoreDAOimpl();
		// 객체 생성해서 값 세팅하기

		System.out.println(dao.insert(new ScoreVO()));
		System.out.println(dao.update(new ScoreVO()));
		System.out.println(dao.delete(new ScoreVO()));

		ScoreVO vo = dao.selectOne(new ScoreVO());
		System.out.println(vo);
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());

		ScoreVO[] vos = dao.selectAll();
		System.out.println(vos);
		for (int i = 0; i < vos.length; i++) {
			ScoreVO vo2 = vos[i];
			System.out.print(vo2.getName() + " ");
			System.out.print(vo2.getKor() + " ");
			System.out.print(vo2.getEng() + " ");
			System.out.print(vo2.getMath() + " ");
			System.out.print(vo2.getTotal() + " ");
			System.out.print(vo2.getAvg() + " ");
			System.out.println(vo2.getGrade());
		}
		System.out.println();

	} // end main()

}
