package test.com;

import java.util.List;

public interface NotebookDAO {

	public int insert(NotebookVO vo);

	public int update(NotebookVO vo);

	public int delete(NotebookVO vo);

	public NotebookVO selectOne(NotebookVO vo);

	public List<NotebookVO> selectAll();

}
