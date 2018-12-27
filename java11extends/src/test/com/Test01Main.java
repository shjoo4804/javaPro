package test.com;
import java.lang.Object; // import 안해도 자동으로 되어있음

public class Test01Main extends Object{ // extends Object 생략되어 있음

	public static void main(String[] args) {
		
		System.out.println("extends 상속");
		
		Test01AAA ta = new Test01AAA();
		ta.su = 100;
		System.out.println(ta.name);
		System.out.println(ta.su);
		System.out.println(ta.avg);
		
		Test01BBB tb = new Test01BBB();
		tb.su = 200;
		System.out.println(tb.su);  
		System.out.println(tb.avg2);
		
		Test01CCC tc = new Test01CCC();
		System.out.println(tc.avg);
		
		
		

	} // end main()

} // end class
