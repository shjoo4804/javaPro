package test.com;

public class Test01ScoreDAO {
	Test01ScoreVO vo;
	Test01ScoreVO[] vos;
	
	
	public Test01ScoreDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public Test01ScoreDAO(Test01ScoreVO[] vos) {
		System.out.println("vos.length:"+vos.length);
		this.vos = vos;
		
		for (int i = 0; i < vos.length; i++) {
//			System.out.println(vos[i]); // аж╪р
			System.out.print(vos[i].name+" ");
			System.out.print(vos[i].kor+" ");
			System.out.print(vos[i].eng+" ");
			System.out.print(vos[i].math+" ");
			System.out.print(vos[i].total+" ");
			System.out.print(vos[i].avg+" ");
			System.out.println(vos[i].grade);
			System.out.println();
		}
		
	}
	
	
	public Test01ScoreDAO(Test01ScoreVO vo) {
		System.out.println(vo.name);
		System.out.println(vo.kor);
		System.out.println(vo.eng);
		System.out.println(vo.math);
		System.out.println(vo.total);
		System.out.println(vo.avg);
		System.out.println(vo.grade);
		this.vo = vo;
	}
	
	

}
