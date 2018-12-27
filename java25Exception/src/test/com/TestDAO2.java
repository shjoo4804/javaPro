package test.com;

public class TestDAO2 {
	
	// throws로 예외전가하고, main에서 try catch로 예외처리하기
	public TestDAO2() throws ClassNotFoundException {
		System.out.println("TestDAO2()");
		Class.forName("test.com.Test01Main"); // 클래스 찾기 기능

	} // end TestDAO()
	
	
	public void testNull() throws NullPointerException{
		System.out.println("testNull()");
		Test01Main tm = null;
		System.out.println(tm.equals("aa"));
	}


	public void testNumber() throws NumberFormatException {
		System.out.println("testNumber()");
		double d = Double.parseDouble("3.14ff");
	}
	
	
	public void testArray() throws ArrayIndexOutOfBoundsException{
		System.out.println("testArray()");
		int[] arr = new int[2];
		arr[2] = 1000;
		System.out.println(arr[2]);
	}
	

/* 처음 방법: DAO에서 try ~ catch처리하기
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
	*/
}
