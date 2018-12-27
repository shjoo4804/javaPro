package test.com;

import java.util.List;

public class Test01Main2 {

	public static void main(String[] args) {
		System.out.println("jdbc");
		
		Test01DAO dao = new Test01DAOimpl();
		
		int menu=3;
		
		if(menu==1) {
			//1.insert
			Test01VO vo = new Test01VO();
			vo.setName("shin");
			vo.setAge(11);
			int result = dao.insert(vo);
			System.out.println("insert result : "+result);
			
		} else if(menu==2) {
			//2.update
			Test01VO vo = new Test01VO();
			vo.setNum(2);
			vo.setName("shin4");
			vo.setAge(44);
			int result = dao.update(vo);
			System.out.println("update result : "+result);
			
		} else if(menu==3) {
			//3.delete
			Test01VO vo = new Test01VO();
			vo.setNum(4);
			int result = dao.delete(vo);
			System.out.println("delete result : "+result);
			
		} else if(menu==4) {
			//4.selectAll
			List<Test01VO> vos = dao.selectAll();
			System.out.println("selectAll vos.size() : "+vos.size());
			for (Test01VO vo : vos) {
				System.out.print(vo.getNum() + " ");
				System.out.print(vo.getName() + " ");
				System.out.println(vo.getAge());
				
			}
			
		} else if(menu==5) {
			//5.selectOne
			Test01VO vo = new Test01VO();
			vo.setNum(9);
			Test01VO vo2 = dao.selectOne(vo);
			System.out.println("selectOne result : "+vo2);
			System.out.print(vo2.getNum() + " ");
			System.out.print(vo2.getName() + " ");
			System.out.println(vo2.getAge());
		}
		
		
		//4.selectAll
		List<Test01VO> vos = dao.selectAll();
		System.out.println("selectAll vos.size() : "+vos.size());
		for (Test01VO vo : vos) {
			System.out.print(vo.getNum() + " ");
			System.out.print(vo.getName() + " ");
			System.out.println(vo.getAge());
		}
		
		
	} // end main()

} // end class
