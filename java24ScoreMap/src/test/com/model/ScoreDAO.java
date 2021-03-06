package test.com.model;

import java.util.List;
import java.util.Map;

public interface ScoreDAO {

	// 추상메소드 및 상수
	public int insert(ScoreVO vo);

	public int update(ScoreVO vo);

	public int delete(ScoreVO vo);

	public ScoreVO selectOne(ScoreVO vo);

	public List<ScoreVO> selectAll();
	
	public Map<String, ScoreVO> selectMap();
	
	public Map<String, List<ScoreVO>> selectMapList();

}
