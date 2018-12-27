package test.com;

public class Test03Local {
	String name;
	
	public void test() {
		System.out.println("test()");
		
		/*final */String str = "aaa";
		class Inner { // 접근제한자 public,private,protected 사용 불가능
			public int su;
			public void testInner() {
//				str = "bbb"; // 불가능
				System.out.println("testInner()"+name);
			}
		} // end class Inner
		
		Inner in = new Inner();
		in.testInner(); // 그냥 testInner()로 호출 불가.. new해서 사용가능
		
		
	} 

}
