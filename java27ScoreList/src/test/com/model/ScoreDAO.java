package test.com.model;

import java.util.List;

public interface ScoreDAO {

	// �߻�޼ҵ� �� ���
	public int insert(ScoreVO vo);

	public int update(ScoreVO vo);

	public int delete(ScoreVO vo);

	public ScoreVO selectOne(ScoreVO vo);

	public List<ScoreVO> selectAll();

}