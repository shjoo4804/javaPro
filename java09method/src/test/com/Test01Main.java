package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("method");
		
		Test01Method m = new Test01Method();
		System.out.println(m);
		
		m.aaa();
		
		int x = m.aaa2();
		System.out.println(x);
		
		m.aaa3(9999);
		m.aaa3(9999,1);
		
		String[] data = m.aaa4("kim");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		

	} // end main()

} // end class
