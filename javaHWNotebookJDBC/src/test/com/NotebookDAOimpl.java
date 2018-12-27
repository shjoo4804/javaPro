package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NotebookDAOimpl implements	NotebookDAO {
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String USER = "kosta";
	private final String PASSWORD = "hi123456";
	
	private final String SQL_INSERT = "insert into notebook(num, product_name, made, price) values(SEQ_NOTEBOOK_NUM.nextval, ?, ?, ?)";
	private final String SQL_UPDATE = "update notebook set product_name=?, made=?, price=? where num=?";
	private final String SQL_DELETE = "delete from notebook where num=?";
	private final String SQL_SELECT_ONE = "select * from notebook where num=?";
	private final String SQL_SELECT_ALL = "select * from notebook order by num desc";
	// update notebook set product_name=?, made=?, price=? where num=?
	// delete from notebook where num=?
	// select * from notebook where num=?
	// select * from notebook order by num desc
	
	private Connection conn; // url, user, password연결
	private PreparedStatement pstmt; // sql문 구현
	private ResultSet rs; // sql문 반환
	private int result; // sql문 반환
	
	public NotebookDAOimpl() {
		// 드라이버 연결
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end constructor

	@Override
	public int insert(NotebookVO vo) {
		System.out.println("insert()");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getProductName());
//		System.out.println(vo.getMade());
//		System.out.println(vo.getPrice());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			System.out.println("conn successed");
			
			pstmt = conn.prepareStatement(SQL_INSERT);
			// product_name, made, price
			pstmt.setString(1, vo.getProductName());
			pstmt.setString(2, vo.getMade());
			pstmt.setInt(3, vo.getPrice());
			
			result = pstmt.executeUpdate();
			
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
	} // end insert()

	@Override
	public int update(NotebookVO vo) {
		System.out.println("update()");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getProductName());
//		System.out.println(vo.getMade());
//		System.out.println(vo.getPrice());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_UPDATE);
			//product_name=?, made=?, price=? where num=?
			pstmt.setString(1, vo.getProductName());
			pstmt.setString(2, vo.getMade());
			pstmt.setInt(3, vo.getPrice());
			pstmt.setInt(4, vo.getNum());
			
			result = pstmt.executeUpdate();
			
			
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
	} // end update()
	
	

	@Override
	public int delete(NotebookVO vo) {
		System.out.println("delete()");
//		System.out.println(vo.getNum());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_DELETE);
			// num=?
			pstmt.setInt(1, vo.getNum());
			
			result = pstmt.executeUpdate();
			
			
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
	public NotebookVO selectOne(NotebookVO vo) {
		System.out.println("selectOne()");
		NotebookVO vo2 = new NotebookVO();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_SELECT_ONE);
			pstmt.setInt(1, vo.getNum());
			
			rs = pstmt.executeQuery(); // select문
			
			while(rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setProductName(rs.getString("product_name"));
				vo2.setMade(rs.getString("made"));
				vo2.setPrice(rs.getInt("price"));
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
	public List<NotebookVO> selectAll() {
		System.out.println("selectAll()");
		List<NotebookVO> list = new ArrayList<NotebookVO>();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				NotebookVO vo = new NotebookVO();
				vo.setNum(rs.getInt("num"));
				vo.setProductName(rs.getString("product_name"));
				vo.setMade(rs.getString("made"));
				vo.setPrice(rs.getInt("price"));
				list.add(vo);
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
		
		
		
		return list;
	} // end selectAll()

}
