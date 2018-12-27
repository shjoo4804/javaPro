package test.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NoteBookDAOimpl implements NoteBookDAO {
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String USER = "kosta";
	private final String PASSWORD = "hi123456";
	
	private final String SQL_INSERT = "insert into notebook2(num,productNO,productName,modelName,price) values(seq_notebook_num.nextval,?,?,?,?)";
	private final String SQL_UPDATE = "update notebook2 set productNO=?,productName=?,modelName=?,price=? where num=?";
	private final String SQL_DELETE = "delete from notebook2 where num=?";
	private final String SQL_SELECT_ONE = "select * from notebook2 where num=?";
	private final String SQL_SELECT_ALL = "select * from notebook2 order by num desc";
	
	private Connection conn; // java.sql
	private PreparedStatement pstmt; // 조작용
	private ResultSet rs; // 결과용
	private int result;
	
	
	public NoteBookDAOimpl() {
		System.out.println("NoteBookDAOimpl...");
		try {
			Class.forName(DRIVER_NAME);
			System.out.println("driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("driver failed");
			e.printStackTrace();
		}
		
	}

	@Override
	public int insert(NoteBookVO vo) {
		System.out.println("insert()..");
//		System.out.println(vo.getProductNO());
//		System.out.println(vo.getProductName());
//		System.out.println(vo.getModelName());
//		System.out.println(vo.getPrice());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");
			
			pstmt = conn.prepareStatement(SQL_INSERT);
			//productNO,productName,modelName,price
			pstmt.setString(1, vo.getProductNO());
			pstmt.setString(2, vo.getProductName());
			pstmt.setString(3, vo.getModelName());
			pstmt.setInt(4, vo.getPrice());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // end finally
		
		return result;
	}

	@Override
	public int update(NoteBookVO vo) {
		System.out.println("update()..");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getProductNO());
//		System.out.println(vo.getProductName());
//		System.out.println(vo.getModelName());
//		System.out.println(vo.getPrice());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");
			
			pstmt = conn.prepareStatement(SQL_UPDATE);
			//productNO,productName,modelName,price
			pstmt.setString(1, vo.getProductNO());
			pstmt.setString(2, vo.getProductName());
			pstmt.setString(3, vo.getModelName());
			pstmt.setInt(4, vo.getPrice());
			pstmt.setInt(5, vo.getNum());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // end finally
		return result;
	}

	@Override
	public int delete(NoteBookVO vo) {
		System.out.println("delete()..");
//		System.out.println(vo.getNum());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");
			
			pstmt = conn.prepareStatement(SQL_DELETE);
			//productNO,productName,modelName,price
			pstmt.setInt(1, vo.getNum());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // end finally
		return result;
	}

	@Override
	public NoteBookVO selectOne(NoteBookVO vo) {
		System.out.println("selectOne()..");
//		System.out.println(vo.getNum());
		
		NoteBookVO vo2 = new NoteBookVO();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");
			
			pstmt = conn.prepareStatement(SQL_SELECT_ONE);
			pstmt.setInt(1, vo.getNum());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setProductNO(rs.getString("productNo")); 
				vo2.setProductName(rs.getString("productName"));
				vo2.setModelName(rs.getString("modelName"));
				vo2.setPrice(rs.getInt("price"));
			}
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // end finally
		
		return vo2;
	}

	@Override
	public List<NoteBookVO> selectAll() {
		System.out.println("selectAll()..");
		
		List<NoteBookVO> vos = new ArrayList<>();
		
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");
			
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				NoteBookVO vo = new NoteBookVO();
				vo.setNum(rs.getInt("num"));
				vo.setProductNO(rs.getString("productNo")); 
				vo.setProductName(rs.getString("productName"));
				vo.setModelName(rs.getString("modelName"));
				vo.setPrice(rs.getInt("price"));
				vos.add(vo);
			}
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // end finally
		
		
		return vos;
	}

}
