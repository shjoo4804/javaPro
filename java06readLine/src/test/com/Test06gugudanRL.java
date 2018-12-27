package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06gugudanRL {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("for for");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 2*1=2  2*2=4 ... 2*9=18
		// 3*1=2  3*2=6 ... 3*9=27
		// ..
		// 9*1=2  9*2=18 ... 9*9=81
		
		// 시작 단을 입력하세요.
		// 2
		// 끝 단을 입력하세요.
		// 8
		
		System.out.println("시작 단을 입력하세요.");
		int start = Integer.parseInt(br.readLine());
//		System.out.println(start);
		System.out.println("끝 단을 입력하세요.");
		int end = Integer.parseInt(br.readLine());
//		System.out.println(end);
		
		
		
		for (int j = start; j <=end ; j++) {
			//System.out.print(j+" ");
			
			for (int i = 1; i <= 9; i++) {
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	} // end main()

} // end class
