package test.com.model;

public interface ScoreDAO {

	// �߻�޼ҵ� �� ���
	public int insert(ScoreVO vo);

	public int update(ScoreVO vo);

	public int delete(ScoreVO vo);

	public ScoreVO selectOne(ScoreVO vo);

	public ScoreVO[] selectAll();

}
