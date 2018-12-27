package test.com;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Test03Map {

	public static void main(String[] args) {
		System.out.println("Map");
		
		// 반드시 키, 값으로 매칭 >> <key, value>
		// key는 유일키(중복X). value는 중복허용
		
		Map<String, Double> m = new Hashtable<>(); // Hashtable, Hashmap 많이 씀
		m.put("key1", 3.14);
		m.put("key1", 3.15); // 전에 세팅된 것은 무시하고 마지막에 있는 걸로 세팅됨
		m.put("b_avg", 99.8);
		m.put("d_avg", 200.0);
		
//		m.remove("key1"); // key1의 데이터 지우기
//		m.clear(); // 모든 데이터 지우기
		
		System.out.println(m.get("key1")); // 키값으로 데이터를 찾으면 됨
		System.out.println(m.get("b_avg")); // 키값으로 데이터를 찾으면 됨
		System.out.println(m.get("d_avg")); // 키값으로 데이터를 찾으면 됨
		System.out.println();
		
		
		Set<String> ks = m.keySet();
		for (String x : ks) { // 키만 출력하기
			System.out.println(x+":"+m.get(x));
		}
		
		
	} // end main()

}
