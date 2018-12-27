package test.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String USER = "kosta";
	private final String PASSWORD = "hi123456";
	
	private final String SQL_INSERT = "insert into member(num, id, pw, name, tel) values(seq_member_num.nextval, ?, ?, ?, ?)";
	private final String SQL_UPDATE = "update member set id=?,pw=?,name=?,tel=? where num=?";
	private final String SQL_DELETE = "delete from member where num=?";
	private final String SQL_SELECT_ONE = "select * from member where num=?";
	private final String SQL_SELECT_ALL = "select * from member order by num asc";
	//select * from member order by num asc
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private int result;
	
	public MemberDAOimpl() {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("class.forName ¿À·ù");
			e.printStackTrace();
		}
	} // end constructor

	@Override
	public int insert(MemberVO vo) {
		System.out.println("inseret()");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getId());
//		System.out.println(vo.getPw());
//		System.out.println(vo.getName());
//		System.out.println(vo.getTel());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
			pstmt = conn.prepareStatement(SQL_INSERT);
			// id, pw, name, tel
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getTel());
			
			result = pstmt.executeUpdate();
			System.out.println("insert result:"+result);
			
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
	public int update(MemberVO vo) {
		System.out.println("update()");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getId());
//		System.out.println(vo.getPw());
//		System.out.println(vo.getName());
//		System.out.println(vo.getTel());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_UPDATE);
			//update member set id=?,pw=?,name=?,tel=? where num=?
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			pstmt.setInt(5, vo.getNum());
			
			result = pstmt.executeUpdate();
			System.out.println("update count:"+result);
			
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
	public int delete(MemberVO vo) {
		System.out.println("delete()");
		System.out.println(vo.getNum());
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_DELETE);
			// delete from member where num=?
			pstmt.setInt(1, vo.getNum());
			
			result = pstmt.executeUpdate();
			System.out.println("delete result:"+result);
			
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
	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne()");
//		System.out.println(vo.getNum());
		
		MemberVO vo2 = new MemberVO();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			pstmt = conn.prepareStatement(SQL_SELECT_ONE);
			//select * from member where num=?
			pstmt.setInt(1, vo.getNum());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo2.setNum(rs.getInt("num")); // **
				vo2.setId(rs.getString("id")); // **
				vo2.setPw(rs.getString("pw")); // **
				vo2.setName(rs.getString("name")); // **
				vo2.setTel(rs.getString("tel")); // **
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo2;
	} // end selectOne()

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll()");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			// select * from member order by num asc
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("num"));
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw")); 
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vos.add(vo);
			}
			
//			System.out.println("rs result:"+rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return vos;
	}
	
} // end class
