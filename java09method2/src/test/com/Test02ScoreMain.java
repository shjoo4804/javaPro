package test.com;

public class Test02ScoreMain {

	public static void main(String[] args) {
		System.out.println("score main..");
		System.out.println();
		
		
		Test02ScoreDAO dao = new Test02ScoreDAO();
		
		Test02ScoreVO vo1 = new Test02ScoreVO();
		vo1.setName("name11");
		vo1.setKor(100);
		vo1.setEng(100);
		vo1.setMath(100);
		dao.insert(vo1);
		System.out.println("===================");
		
		Test02ScoreVO vo2 = new Test02ScoreVO();
		vo2.setName("name22");
		vo2.setKor(90);
		vo2.setEng(90);
		vo2.setMath(90);
		dao.update(vo2);
		System.out.println("===================");
		
		Test02ScoreVO vo3 = new Test02ScoreVO();
		vo3.setName("name33");
		vo3.setKor(80);
		vo3.setEng(80);
		vo3.setMath(80);
		dao.delete(vo3);
		System.out.println("===================");
		
		Test02ScoreVO[] vos = dao.selectAll();
		for (int i = 0; i < vos.length; i++) {
			System.out.print(vos[i].getName()+" ");
			System.out.print(vos[i].getKor()+" ");
			System.out.print(vos[i].getEng()+" ");
			System.out.print(vos[i].getMath()+" ");
			System.out.print(vos[i].getTotal()+" ");
			System.out.print(vos[i].getAvg()+" ");
			System.out.println(vos[i].getGrade());
		}
		System.out.println("===================");
		
		Test02ScoreVO vo4 = dao.selectOne(vo1);
		System.out.print(vo4.getName()+" ");
		System.out.print(vo4.getKor()+" ");
		System.out.print(vo4.getEng()+" ");
		System.out.print(vo4.getMath()+" ");
		System.out.print(vo4.getTotal()+" ");
		System.out.print(vo4.getAvg()+" ");
		System.out.println(vo4.getGrade());
		
		
	} // end main()

} // end class
