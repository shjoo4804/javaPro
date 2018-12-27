package test.com;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoDAOimpl implements LottoDAO {
	
	Random r = new Random();

	@Override
	public Set<Integer> getRandom(LottoVO vo) {
		Set<Integer> lotto = new HashSet<>();
		
		// ��ȣ �ߺ��ȵǰ�, 6��(vo.getCount)��ŭ����
		while (lotto.size() != vo.getCount()) { // **
			int su = r.nextInt(vo.getNums().length);
			int num = vo.getNums()[su];
			
			lotto.add(num);
		}
		
		
		return lotto;
	}

}
