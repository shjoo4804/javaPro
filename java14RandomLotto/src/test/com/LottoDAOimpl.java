package test.com;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoDAOimpl implements LottoDAO {
	
	Random r = new Random();

	@Override
	public Set<Integer> getRandom(LottoVO vo) {
		Set<Integer> lotto = new HashSet<>();
		
		// 번호 중복안되게, 6번(vo.getCount)만큼실행
		while (lotto.size() != vo.getCount()) { // **
			int su = r.nextInt(vo.getNums().length);
			int num = vo.getNums()[su];
			
			lotto.add(num);
		}
		
		
		return lotto;
	}

}
