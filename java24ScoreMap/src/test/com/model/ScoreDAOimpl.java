package test.com.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ScoreDAOimpl implements ScoreDAO {

	@Override
	public int insert(ScoreVO vo) {
		System.out.println("insert()");
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 1;
	}

	@Override
	public int update(ScoreVO vo) {
		System.out.println("update()");
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 1;
	}

	@Override
	public int delete(ScoreVO vo) {
		System.out.println("delete()");
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 0;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne()");
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		
		ScoreVO vo2 = new ScoreVO();
		vo2.setName("abc");
		vo2.setKor(90);
		vo2.setEng(70);
		vo2.setMath(80);
		vo2.setTotal(vo2.getKor()+vo2.getEng()+vo2.getMath());
		vo2.setAvg(vo2.getTotal() / 3.0);
		
		String grade = "";
		if(vo2.getAvg()>=90) {
			grade = "A";
		} else if(vo2.getAvg()>=80) {
			grade = "B";
		}else if(vo2.getAvg()>=70) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		vo2.setGrade(grade);
		return vo2;
	}

	@Override
	public List<ScoreVO> selectAll() {
		System.out.println("selectAll()");
		List<ScoreVO> vos = new ArrayList<>();
		
		
		for (int i = 0; i < 3; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setName("abc");
			vo.setKor(90+i);
			vo.setEng(90+i);
			vo.setMath(90+i);
			vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
			vo.setAvg(vo.getTotal() / 3.0);

			String grade = "";
			if (vo.getAvg() >= 90) {
				grade = "A";
			} else if (vo.getAvg() >= 80) {
				grade = "B";
			} else if (vo.getAvg() >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}

			vo.setGrade(grade);

			vos.add(vo);
		}
		
		return vos;
	}

	
	
	@Override
	public Map<String, ScoreVO> selectMap() {
		System.out.println("selectMap()");
		
		Map<String, ScoreVO> m = new Hashtable<>();
		
//		m.put("vo1", new ScoreVO());
//		m.put("vo2", new ScoreVO());
		
		
		for (int i = 0; i < 3; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setName("abc");
			vo.setKor(90);
			vo.setEng(90);
			vo.setMath(90);
			vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
			vo.setAvg(vo.getTotal() / 3.0);

			String grade = "";
			if (vo.getAvg() >= 90) {
				grade = "A";
			} else if (vo.getAvg() >= 80) {
				grade = "B";
			} else if (vo.getAvg() >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}
			vo.setGrade(grade);
			
			
			m.put("key"+i, vo);
		} // for문 안돌리고 하나씩 .put해도 됨
		
		return m;
	}
	
	

	@Override
	public Map<String, List<ScoreVO>> selectMapList() {
		System.out.println("selectMapList()");
		
		Map<String, List<ScoreVO>> mapList = new Hashtable<>();
		
		//// 
		List<ScoreVO> vos = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setName("abc");
			vo.setKor(90+i);
			vo.setEng(90+i);
			vo.setMath(90+i);
			vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
			vo.setAvg(vo.getTotal() / 3.0);

			String grade = "";
			if (vo.getAvg() >= 90) {
				grade = "A";
			} else if (vo.getAvg() >= 80) {
				grade = "B";
			} else if (vo.getAvg() >= 70) {
				grade = "C";
			} else {
				grade = "F";
			}

			vo.setGrade(grade);

			vos.add(vo);
		}
		mapList.put("vos", vos);
		
		
		/*
		for (int x = 0; x < 3; x++) {
			List<ScoreVO> vos = new ArrayList<>();
			
			for (int i = 0; i < 2; i++) {
				ScoreVO vo = new ScoreVO();
				vo.setName("abc");
				vo.setKor(77);
				vo.setEng(88);
				vo.setMath(99);
				vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
				vo.setAvg(vo.getTotal() / 3.0);

				String grade = "";
				if (vo.getAvg() >= 90) {
					grade = "A";
				} else if (vo.getAvg() >= 80) {
					grade = "B";
				} else if (vo.getAvg() >= 70) {
					grade = "C";
				} else {
					grade = "F";
				}
				vo.setGrade(grade);

				vos.add(vo);
			}

			mapList.put("kye_List"+x, vos);
		}
		*/

		return mapList;
	}

}
