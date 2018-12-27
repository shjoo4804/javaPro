package test.com;

public class TestDAO {
	

	public TestDAO() {
		System.out.println("TestDAO()");
		
		try {
			Class.forName("test.com.Test01Main"); // 클래스 찾기 기능
			System.out.println("find successed");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	} // end TestDAO()
	
	
	public void testNull() {
		System.out.println("testNull()");
		try {
			Test01Main tm = null;
			System.out.println(tm.equals("aa"));
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void testNumber() {
		System.out.println("testNumber()");
		try {
//			String name = "abc";
//			Integer.parseInt(name);
			
			double d = Double.parseDouble("3.14ff");
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	public void testArray() {
		System.out.println("testArray()");
		try {
			int[] arr = new int[2];
			arr[2] = 1000;
			System.out.println(arr[2]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
