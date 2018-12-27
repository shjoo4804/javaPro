package test.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RoomUserDAOimpl implements RoomUserDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	
	private final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private final String USER = "boardgame";
	private final String PASSWORD = "hi123456";
	
	private final String SQL_UPDATE = "update room set time=?, remain=?, roomgame=? where num=?";
	
	private int result; // pstmt(������)�� ������� ���� ����
	
	public RoomUserDAOimpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int update(RoomVO vo) { 
		// ���� ����(�̿�ð��� ��뿩��)�� �����ϴ� �޼ҵ�
//		System.out.println("update");
		
//		System.out.println(vo.getNum());
//		System.out.println(vo.getTime()+"�ð� �̿�");
//		System.out.println(vo.getRemain()); 
		// remian �̿���:1, �̿����:0
		
		// set time=?, remain=? where num=?
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			System.out.println("conn successed");
			
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setInt(1, vo.getTime());
			pstmt.setInt(2, vo.getRemain());
			pstmt.setString(3, vo.getRoomGame());
			pstmt.setInt(4, vo.getNum());
			
			result = pstmt.executeUpdate();
			
		
		} catch (SQLException e) {
			System.out.println("pstmt error");
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
	}

}
