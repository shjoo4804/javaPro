package test.com;

public class Test02ScoreDAO {
	public int insert(Test02ScoreVO vo) {
		System.out.println("insert()...");
		System.out.print(vo.getName()+" ");
		System.out.print(vo.getKor()+" ");
		System.out.print(vo.getEng()+" ");
		System.out.print(vo.getMath()+" ");
		System.out.print(vo.getTotal()+" ");
		System.out.print(vo.getAvg()+" ");
		System.out.println(vo.getGrade());
		
		return 1;
	}
	
	public int update(Test02ScoreVO vo) {
		System.out.println("update()...");
		System.out.print(vo.getName()+" ");
		System.out.print(vo.getKor()+" ");
		System.out.print(vo.getEng()+" ");
		System.out.print(vo.getMath()+" ");
		System.out.print(vo.getTotal()+" ");
		System.out.print(vo.getAvg()+" ");
		System.out.println(vo.getGrade());
		return 1;
	}
	
	public int delete(Test02ScoreVO vo) {
		System.out.println("delete()...");
		System.out.print(vo.getName()+" ");
		System.out.print(vo.getKor()+" ");
		System.out.print(vo.getEng()+" ");
		System.out.print(vo.getMath()+" ");
		System.out.print(vo.getTotal()+" ");
		System.out.print(vo.getAvg()+" ");
		System.out.println(vo.getGrade());
		return 1;
	}
	
	public Test02ScoreVO[] selectAll() {
		System.out.println("selectAll()...");
		//T02 배열을 생성해서
		// T02 타입을 new해서 T02배열에 넣어준 후, 값을 setting해주고 
		// 그것을 리턴해주기
		Test02ScoreVO[] vos = new Test02ScoreVO[3];
		for (int i = 0; i < vos.length; i++) {
			Test02ScoreVO vo = new Test02ScoreVO();
			vos[i] = vo;
			vos[i].setName("name"+i);
			vos[i].setKor(90+i);
			vos[i].setEng(90+i);
			vos[i].setMath(90+i);
		}
		return vos;
	}
	
	public Test02ScoreVO selectOne (Test02ScoreVO vo) {
		System.out.println("selectOne()...");
		System.out.print(vo.getName()+" ");
		System.out.print(vo.getKor()+" ");
		System.out.print(vo.getEng()+" ");
		System.out.print(vo.getMath()+" ");
		System.out.print(vo.getTotal()+" ");
		System.out.print(vo.getAvg()+" ");
		System.out.println(vo.getGrade());
		
		Test02ScoreVO vo2 = new Test02ScoreVO();
		vo2.setName("new name");
		vo2.setKor(50);
		vo2.setEng(60);
		vo2.setMath(70);
		
		return vo2;
	}
}
