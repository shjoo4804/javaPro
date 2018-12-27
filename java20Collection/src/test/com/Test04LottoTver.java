package test.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test04LottoTver {

	public static void main(String[] args) {
		System.out.println("Lotto");

		// Set 이용 1~45
		Random r = new Random();
		Set<Integer> s = new HashSet<Integer>();
		
//		for (int i = 0; i < 6; i++) { // 중복값이 나올 수 있음
//			System.out.println(r.nextInt(45)+1); 
//		}
		
		
		// Set이 6개가 될 때까지 돌려라 (중복데이터 저장이 안됨)
		while(s.size()<6) {
			s.add(r.nextInt(45)+1);
		}
		
		int[] sus = new int[s.size()];
		int count = 0;
		
		for (Integer x : s) {
			sus[count] = x;
			count++;
//			System.out.println(x);
		}
		
		Arrays.sort(sus);
		for (int x : sus) {
			System.out.print(x+" ");
		}
		
		
	} // end main()

} // end class
