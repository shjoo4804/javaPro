package test.com;

public class Test03BoardDAO {
	
	public int insert (Test03BoardVO vo) {
		System.out.println("insert()..");
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getWDate());
		return 1;
	}
	
	public int update (Test03BoardVO vo) {
		System.out.println("update()..");
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getWDate());
		return 1;
	}
	
	public int delete (Test03BoardVO vo) {
		System.out.println("delete()..");
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getWDate());
		return 1;
	}
	
	public Test03BoardVO[] selectAll() {
		System.out.println("selectAll()..");
		
		Test03BoardVO[] vos = new Test03BoardVO[3];
		for (int i = 0; i < vos.length; i++) {
			Test03BoardVO vo = new Test03BoardVO();
			vos[i] = vo;
			vos[i].setTitle("title"+i);
			vos[i].setContent("content"+i);
			vos[i].setWriter("writer"+i);
		}
		
		return vos;
	}
	
	public Test03BoardVO selectOne(Test03BoardVO vo) {
		System.out.println("selectOne()..");
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getWriter());
		System.out.println(vo.getWDate());
		
		Test03BoardVO vo2 = new Test03BoardVO();
		vo2.setTitle("���ο� ����");
		vo2.setWriter("�浿222");
		vo2.setContent("���볻��");
		return vo2;
	}
	
}
