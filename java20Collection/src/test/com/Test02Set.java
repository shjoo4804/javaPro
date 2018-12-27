package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02Set {

	public static void main(String[] args) {
		System.out.println("Set");
		
		// Set : List와 유사... BUT 차이점 : index(순서)가 없음, 데이터중복 허용안함
		// 장점 - 데이터가 유니크함. 데이터를 알면 찾아가기가 가능.
		
		Set<String> s = new HashSet<String>();
		s.add("kim1");
		s.add("kim"); // 데이터중복 허용안함
		s.add("kim3");
		s.add("kim2");
		s.add("kim");
		s.remove("kim"); // 데이터값으로 지움
//		s.clear(); // 다지움
		
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // index가 없어서 이렇게 나옴
		}
		System.out.println();
		
		for (String x : s) {
			System.out.println(x);
		}
		

	} // end main()

}
