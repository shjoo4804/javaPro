package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("jdbc");
		
//		1.����̹� ����
//		 : �ش� �����ͺ��̽��� �����ϴ� ����̹�(api/���̺귯��)�� �������� �� - .jar ���Ϸ� ����
//		 	����� Ŭ������ ã���ش�.
		 // ��� ������Ʈ : Class 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver successed");
		} catch (ClassNotFoundException e) {
			System.out.println("driver failed");
			e.printStackTrace();
		}
		

//		2. ��ġ�� �����ͺ��̽��� ������ 
//		 :  ������(url, uri), ���̵�, ��� ��ø� ���� Ŀ����
		 // java.sql.*; Connection
		
		
		// java���� db����� �� �ʿ��� Ŭ���� 3�� ��Ʈ
		Connection conn = null; //java.sql
		PreparedStatement pstmt = null; // ���ۿ�
		ResultSet rs = null; // �����
		
		int result = 0;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "java", "hi123456");
			System.out.println("conn successed");
			
//			conn.setAutoCommit(false); // auto commit ����. defalut�� true
			
			
//			3. sql���๮ ���� �� ��ȯ
			//  ���� : ***Statement // ��������
			//  ��ȯ : int or ResultSet
			//  table=test, name=kim, age=30
			
			//String sql = "insert into test(name, age) values('kim', 55)"; // ��������
			
			
//			String sql = "INSERT INTO \"JAVA\".\"TEST\" (NAME, AGE) VALUES ('kim', '30')"; // ������ : insert, update, delete, select 
//			String sql = "insert into test(num, name, age) values(SEQ_TEST_NUM.nextval, ?, ?)"; // insert // ���� ����
//			String sql = "update test set name=?,age=? where num=?"; // update
//			String sql = "delete from test where num=?"; // delete
			
//			String sql = "select name,age from test"; // select
			String sql = "select * from test where num=?"; 
			
			
			pstmt = conn.prepareStatement(sql); // ������ �ֱ�
			// �������� ���� �� ���� set�޼ҵ� �����ʰ�, ������ SEQ_TEST_NUM.nextval
//			pstmt.setString(1, "bb2");
//			pstmt.setInt(2, 99);
			pstmt.setInt(1, 4);
			
//			result = pstmt.executeUpdate(); // insert, update, delete�� ���ǹ��� ��� // ��ȯ�� ����
//			System.out.println("result : " + result); // insert�� 1 : ����, update�� 4 : update�� ����
			
			rs = pstmt.executeQuery(); // select ���ǹ��� ���(�˻�,��ȸ)
			System.out.println("rs : " + rs);
			
			while(rs.next()) { // rs.next() : rs���� �о�� ���� ������ true, ������ false
				System.out.print(rs.getString("name") + " "); // �ε������ Į��(��)�� �̸��� �־ ��
				System.out.println(rs.getInt("age"));
			} // �ϳ��� ����Ϸ��� if
			
			
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
