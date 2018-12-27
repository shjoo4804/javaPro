package test.com;


public class Test06gugudan {

	public static void main(String[] args)  {
		System.out.println("for for");
		
		
		// 2*1=2  2*2=4 ... 2*9=18
		// 3*1=2  3*2=6 ... 3*9=27
		// ..
		// 9*1=2  9*2=18 ... 9*9=81
		
		
		for (int j = 2; j <=9 ; j++) {
			//System.out.print(j+" ");
			
			for (int i = 1; i <= 9; i++) {
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	} // end main()

} // end class
