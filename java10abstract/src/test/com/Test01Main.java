package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("abstract...");
		
		Test01Abstract ta = new Test01Abstract() {
			
			@Override
			public int aaa3(int x) {
				// TODO Auto-generated method stub
				System.out.println("aaa3()...");
				return 0;
			}
			
			@Override
			public int aaa2() {
				// TODO Auto-generated method stub
				System.out.println("aaa2()...");
				return 0;
			}
			
			@Override
			public void aaa() {
				// TODO Auto-generated method stub
				System.out.println("aaa()...");
				
			}
		};
		
		ta.aaa();
		ta.aaa2();

	}

}
