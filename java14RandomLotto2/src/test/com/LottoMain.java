package test.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("LOTTO");
		System.out.println();
		
		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		LottoVO vo = new LottoVO();
		vo.setNums(nums);
		vo.setCount(6);
		
		LottoDAO dao = new LottoDAOimpl();
		Set<Integer> lotto = dao.getRandom(vo);
		
		for (int x : lotto) {
			System.out.println(x);
		}
		System.out.println(); // *Set���� ��µ� ���� List�� ��Ƽ� ����
		
		System.out.println("===Lotto Nums===");
		List<Integer> numList = new ArrayList<Integer>(lotto);
		Collections.sort(numList);
		
		System.out.println(numList);
		// ���� ���ں��� �����ϴ� ����� �𸣰���
		

	} // end main()

}
