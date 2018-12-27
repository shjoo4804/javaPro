package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("jdbc");
		
//		1.드라이버 연결
//		 : 해당 데이터베이스가 제공하는 드라이버(api/라이브러리)를 설정해준 후 - .jar 파일로 제공
//		 	사용할 클래스를 찾아준다.
		 // 사용 오브젝트 : Class 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("driver failed");
			e.printStackTrace();
		}
		

//		2. 설치된 데이터베이스에 생성한 
//		 :  도메인(url, uri), 아이디, 비번 명시를 통해 커넥팅
		 // java.sql.*; Connection
		
		
		// java에서 db사용할 때 필요한 클래스 3종 세트
		Connection conn = null; //java.sql
		PreparedStatement pstmt = null; // 조작용
		ResultSet rs = null; // 결과용
		
		int result = 0;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "java", "hi123456");
			System.out.println("conn successed");
			
//			conn.setAutoCommit(false); // auto commit 해제. defalut는 true
			
			
//			3. sql실행문 구현 및 반환
			//  구현 : ***Statement // 정적쿼리
			//  반환 : int or ResultSet
			//  table=test, name=kim, age=30
			
			//String sql = "insert into test(name, age) values('kim', 55)"; // 정적쿼리
			
			
//			String sql = "INSERT INTO \"JAVA\".\"TEST\" (NAME, AGE) VALUES ('kim', '30')"; // 쿼리문 : insert, update, delete, select 
//			String sql = "insert into test(num, name, age) values(SEQ_TEST_NUM.nextval, ?, ?)"; // insert // 위와 같음
//			String sql = "update test set name=?,age=? where num=?"; // update
//			String sql = "delete from test where num=?"; // delete
			
//			String sql = "select name,age from test"; // select
			String sql = "select * from test where num=?"; 
			
			
			pstmt = conn.prepareStatement(sql); // 쿼리문 넣기
			// 시퀀스로 값을 줄 때는 set메소드 쓰지않고, 위에서 SEQ_TEST_NUM.nextval
//			pstmt.setString(1, "bb2");
//			pstmt.setInt(2, 99);
			pstmt.setInt(1, 4);
			
//			result = pstmt.executeUpdate(); // insert, update, delete용 질의문에 사용 // 반환값 정수
//			System.out.println("result : " + result); // insert의 1 : 성공, update의 4 : update된 갯수
			
			rs = pstmt.executeQuery(); // select 질의문에 사용(검색,조회)
			System.out.println("rs : " + rs);
			
			while(rs.next()) { // rs.next() : rs에서 읽어올 것이 있을때 true, 없으면 false
				System.out.print(rs.getString("name") + " "); // 인덱스대신 칼럼(열)의 이름을 넣어도 됨
				System.out.println(rs.getInt("age"));
			} // 하나만 출력하려면 if
			
			
		} catch (SQLException e) {
			System.out.println("pstmt failed");
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
		
		
	} // end main()

} // end class
