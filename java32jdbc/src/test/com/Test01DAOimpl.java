package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test01DAOimpl implements Test01DAO {
	
	private Connection conn; // java.sql
	private PreparedStatement pstmt; // 조작용
	private ResultSet rs; // 결과용
	
	private final String DRVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String USER = "java";
	private final String PASSWORD = "hi123456";
	
	private final String SQL_INSERT = "insert into test(num, name, age) values(SEQ_TEST_NUM.nextval, ?, ?)";
	private final String SQL_UPDATE = "update test set name=?,age=? where num=?";
	private final String SQL_DELETE = "delete from test where num=?";
	private final String SQL_SELECT_ONE = "select * from test where num=?";
	private final String SQL_SELECT_ALL = "select * from test order by num desc";

	public Test01DAOimpl() { // 생성자 만들기

//		1.드라이버 연결
//		 : 해당 데이터베이스가 제공하는 드라이버(api/라이브러리)를 설정해준 후 - .jar 파일로 제공
//		 	사용할 클래스를 찾아준다.
		// 사용 오브젝트 : Class
		try {
			Class.forName(DRVER_NAME);
			System.out.println("driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("driver failed");
			e.printStackTrace();
		}

	}

	@Override
	public int insert(Test01VO vo) {
		System.out.println("insert()");
//		System.out.println(vo.getName());
//		System.out.println(vo.getAge());

		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");

			pstmt = conn.prepareStatement(SQL_INSERT); // 쿼리문 넣기
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());

			result = pstmt.executeUpdate(); // insert, update, delete용 질의문에 사용 // 반환값 정수
			// .executeUpdate() : DB에 전송해주고 커밋해주는 메소드
			System.out.println("result : " + result); // 1 : 성공
			
		} catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} finally {
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
		return result; //**
	} // end insert()
	
	
	

	@Override
	public int update(Test01VO vo) {
		System.out.println("update()");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getName());
//		System.out.println(vo.getAge());

		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");

			pstmt = conn.prepareStatement(SQL_UPDATE); // 쿼리문 넣기
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setInt(3, vo.getNum());

			result = pstmt.executeUpdate(); // insert, update, delete용 질의문에 사용 // 반환값 정수
			System.out.println("result : " + result); // insert의 1 : 성공, update의 4 : update된 갯수


		} catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} finally {
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
		return 0;
	} // end update()
	
	

	@Override
	public int delete(Test01VO vo) {
		System.out.println("delete()");
//		System.out.println(vo.getNum());
//		System.out.println(vo.getName());
//		System.out.println(vo.getAge());

		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");

			pstmt = conn.prepareStatement(SQL_DELETE); // 쿼리문 넣기
			pstmt.setInt(1, vo.getNum());

			result = pstmt.executeUpdate(); // insert, update, delete용 질의문에 사용 // 반환값 정수
			System.out.println("result : " + result); // insert의 1 : 성공, update의 4 : update된 갯수
			
		} catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} finally {
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
	} // end delete()

	
	
	@Override
	public Test01VO selectOne(Test01VO vo) {
		System.out.println("selectOne");
		System.out.println(vo.getNum());

		Test01VO vo2 = new Test01VO();

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");

			pstmt = conn.prepareStatement(SQL_SELECT_ONE); // 쿼리문 넣기
			pstmt.setInt(1, vo.getNum());

			rs = pstmt.executeQuery(); // select 질의문에 사용(검색,조회)
			System.out.println("rs : " + rs);

			while (rs.next()) { 
				vo2.setNum(rs.getInt("num"));
				vo2.setName(rs.getString("name"));
				vo2.setAge(rs.getInt("age"));
			} 

		} catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

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
		return vo2;
	}

	@Override
	public List<Test01VO> selectAll() {
		System.out.println("selectAll()");
		
		List<Test01VO> vos = new ArrayList<>();

		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conn successed");


			pstmt = conn.prepareStatement(SQL_SELECT_ALL); // 쿼리문 넣기

			rs = pstmt.executeQuery(); // select 질의문에 사용(검색,조회)
			System.out.println("rs : " + rs);

			while (rs.next()) { // rs.next() : rs에서 읽어올 것이 있을때 true, 없으면 false
				Test01VO vo = new Test01VO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vos.add(vo); //*
			} // 하나만 출력하려면 if

		} catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

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
		
		
		return vos;
	}

}
