package test.com.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {
	
	List<ScoreVO> vos = new ArrayList<>();

	@Override
	public int insert(ScoreVO vo) {
		System.out.println("insert()");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getName());
//		System.out.println(vo.getKor());
//		System.out.println(vo.getEng());
//		System.out.println(vo.getMath());
//		System.out.println(vo.getTotal());
//		System.out.println(vo.getAvg());
//		System.out.println(vo.getGrade());

		vos.add(vo);
		return 1;
	}

	@Override
	public int update(ScoreVO vo)  {
		System.out.println("update()");

		for (int i = 0; i <vos.size() ; i++) {
			if (vos.get(i).getNum() == vo.getNum()) {
				vos.set(i,vo); 
			}
		}
		
		return 1;
	}

	@Override
	public int delete(ScoreVO vo) {
		System.out.println("delete()");
		
		for (int i = 0; i <vos.size() ; i++) {
			if (vos.get(i).getNum() == vo.getNum()) {
				vos.remove(i); 
			}
		}
		return 0;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne()");
		
		ScoreVO vo2 = null;

		for (int i = 0; i <vos.size() ; i++) {
			if (vos.get(i).getNum() == vo.getNum()) {
				vo2 = vos.get(i);
			}
		}
		return vo2;
	}

	@Override
	public List<ScoreVO> selectAll() {
		System.out.println("selectAll()");
		
		return vos;
	}

}
