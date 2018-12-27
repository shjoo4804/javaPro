package test.com;

public class Test01Main {
	
	public void aaa() {
		
	}
	
	public static void ccc() {
		
	}

	public static void main(String[] args) {
		System.out.println("static");
		
		Test01static st = new Test01static();
		st.num = 100;
		System.out.println(st.num);
		
		Test01static.name = "AAA";
		System.out.println(Test01static.name);
		st.test();
		
		Test01static.test2();

		ccc();
//		aaa(); // new«ÿ¡‡æﬂ«‘
		new Test01Main().aaa();
	}

}
