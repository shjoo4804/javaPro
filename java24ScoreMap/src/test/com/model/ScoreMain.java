package test.com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		
		
		Map<String, ScoreVO> m = dao.selectMap();
		System.out.println(m);
		Set<String> ks = m.keySet();
		for (String x : ks) { // for (String x : m.keySet()) {}
			System.out.print(x+">>");
			System.out.print(m.get(x).getName() + " ");
			System.out.print(m.get(x).getKor() + " ");
			System.out.print(m.get(x).getEng() + " ");
			System.out.print(m.get(x).getMath() + " ");
			System.out.print(m.get(x).getTotal() + " ");
			System.out.print(m.get(x).getAvg() + " ");
			System.out.println(m.get(x).getGrade() + " ");
		}
		System.out.println();
		
		
		
		Map<String, List<ScoreVO>> mapList = dao.selectMapList();
		System.out.println(mapList);
		
		
		
		
		Set<String> ks2 = mapList.keySet();
		for (String x : ks2) { // 키만 출력하기
			
			List<ScoreVO> vos2 = mapList.get(x);
			for (ScoreVO key : vos2) {
				System.out.print(key.getName()+" ");
				System.out.print(key.getKor()+" ");
				System.out.print(key.getEng()+" ");
				System.out.print(key.getMath()+" ");
				System.out.print(key.getTotal()+" ");
				System.out.print(key.getAvg()+" ");
				System.out.println(key.getGrade());
			} // 로도 출력가능

			
			/*
			System.out.println(x+">>");
			
			List<ScoreVO> vos2 = new ArrayList<>();
			vos2 = mapList.get(x);
			
			for (int i = 0; i < vos2.size(); i++) {
				System.out.print(vos2.get(i).getName() + " ");
				System.out.print(vos2.get(i).getKor() + " ");
				System.out.print(vos2.get(i).getEng() + " ");
				System.out.print(vos2.get(i).getMath() + " ");
				System.out.print(vos2.get(i).getTotal() + " ");
				System.out.print(vos2.get(i).getAvg() + " ");
				System.out.print(vos2.get(i).getGrade() + " ");
				System.out.println();
			}
			*/
			System.out.println();
		}

	} // end main()

}
