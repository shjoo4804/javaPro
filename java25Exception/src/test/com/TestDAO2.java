package test.com;

public class TestDAO2 {
	
	// throws�� ���������ϰ�, main���� try catch�� ����ó���ϱ�
	public TestDAO2() throws ClassNotFoundException {
		System.out.println("TestDAO2()");
		Class.forName("test.com.Test01Main"); // Ŭ���� ã�� ���

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
	

/* ó�� ���: DAO���� try ~ catchó���ϱ�
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
