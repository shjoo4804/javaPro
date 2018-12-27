package test.com.model;

public interface ScoreDAO {

	// 추상메소드 및 상수
	public int insert(ScoreVO vo);

	public int update(ScoreVO vo);

	public int delete(ScoreVO vo);

	public ScoreVO selectOne(ScoreVO vo);

	public ScoreVO[] selectAll();

}
