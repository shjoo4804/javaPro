package test.com.model;

public interface BoardDAO {
	
	public int insert(BoardVO vo);
	public int update(BoardVO vo);
	public int delete(BoardVO vo);
	public BoardVO selectOne(BoardVO vo);
	public BoardVO[] selectAll();

}
