package test.com;

public class Test02BBB implements Test02AAA {
	int kor;
	double avg;
	
	
	@Override
	public int test(String x) {
		System.out.println("test.."+x);
		aaaa();
		return 0;
	}
	public void aaaa() {
		System.out.println("aaaa()..");
		
	}
	@Override
	public void sysout() {
		// TODO Auto-generated method stub
		
	}
}
