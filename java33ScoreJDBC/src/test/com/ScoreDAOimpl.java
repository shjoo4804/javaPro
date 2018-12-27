package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO{
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	int result;
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String USER = "kosta";
	private final String PASSWORD = "hi123456";
	
	private final String SQL_INSERT = "insert into score(num, name, kor, eng, math) values(SEQ_SCORE_NUM.nextval, ?, ?, ?, ?)";
	private final String SQL_UPDATE = "update score set name=?,kor=?,eng=?,math=? where num=?";
	private final String SQL_DELETE = "delete from score where num=?";
	private final String SQL_SELECT_ONE = "select * from score where num=?";
	private final String SQL_SELECT_ALL = "select * from score order by num desc";
	
	public ScoreDAOimpl() {
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버와 연결이 안되었습니다.");
			e.printStackTrace();
		}
	} // end ScoreDAOimpl()
	
	@Override
	public int insert(ScoreVO vo) {
		System.out.println("insert()");
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
				
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_INSERT);
			
			// pstmt set해주기 name, kor, eng, math
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
			
			// int result에 pstmt.executeUpate();로 업데이트 성공했는지 알려주기
			
			result = pstmt.executeUpdate();
			System.out.println("insert result: "+result);
			
		} catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} // finally로 닫아주기
		finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // end finally
		
		return result;
	} // end insert()

	
	
	@Override
	public int update(ScoreVO vo) {
//		System.out.println("update");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getName());
//		System.out.println(vo.getKor());
//		System.out.println(vo.getEng());
//		System.out.println(vo.getMath());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_UPDATE);
			// name=?,kor=?,eng=?,math=? where num=?
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
			pstmt.setInt(5, vo.getNum());
			
			result = pstmt.executeUpdate();
			System.out.println("update result: "+result);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("failed");
			e.printStackTrace();
			
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // end finally
		
		
		return result;
	} // end update()
	
	

	@Override
	public int delete(ScoreVO vo) {
//		System.out.println("delete");
//		System.out.println(vo.getNum());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_DELETE);
			// where num=?
			pstmt.setInt(1, vo.getNum());
			
			int result = pstmt.executeUpdate();
			System.out.print("delete result:");
			if(result==1) {
				System.out.println("성공");
			} else if (result==0) {
				System.out.println("삭제할 것이 없음");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return result;
	} // end delete()
	

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
//		System.out.println("selectOne");
//		System.out.println(vo.getNum());
		
		ScoreVO vo2 = new ScoreVO();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_SELECT_ONE);
			//where num=?
			pstmt.setInt(1, vo.getNum());
			
			rs = pstmt.executeQuery();
//			System.out.println("rs result:"+rs);
			
			while(rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setName(rs.getString("name"));
				vo2.setKor(rs.getInt("kor"));
				vo2.setEng(rs.getInt("eng"));
				vo2.setMath(rs.getInt("math"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return vo2;
	} // end selectOne()
	
	

	@Override
	public List<ScoreVO> selectAll() {
//		System.out.println("selectAll()");
		
		List<ScoreVO> vos = new ArrayList<>();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			
			rs = pstmt.executeQuery(); // select문을 받으므로 rs에 담아줘야함
//			System.out.println("selectAll() rs : "+ rs);
			
			// rs 출력
			while(rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				vos.add(vo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} // end finally
		
		
		return vos;
	}// end selectAll()

}
