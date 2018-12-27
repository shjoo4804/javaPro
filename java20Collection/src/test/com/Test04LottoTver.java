package test.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test04LottoTver {

	public static void main(String[] args) {
		System.out.println("Lotto");

		// Set �̿� 1~45
		Random r = new Random();
		Set<Integer> s = new HashSet<Integer>();
		
//		for (int i = 0; i < 6; i++) { // �ߺ����� ���� �� ����
//			System.out.println(r.nextInt(45)+1); 
//		}
		
		
		// Set�� 6���� �� ������ ������ (�ߺ������� ������ �ȵ�)
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
