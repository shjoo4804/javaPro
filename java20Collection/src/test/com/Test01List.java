package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01List {

	public static void main(String[] args) {
		System.out.println("List");
		
		// array >> 정해진 길이를 요구함
		// 가변적인 길이를 가질 수 있도록 하는 배열 >> List
		// List를 상속받은 애들 : 순서(인덱스)가 있고, 데이터의 중복을 허용함
		
		// 값 넣기 .add()
		// 크기 .size()
		// 값얻어오기 .get()
		// 인덱스 변경 .set(index, value)
		// 해당 인덱스 삭제 .remove(index)
		// 지우기 .clear()
		
		List<Integer> list = new ArrayList</*Integer*/>(); // <>안에 타입 정의 : genetic
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(6000);
		list.add(5000);
		list.set(4, 4444); // 4번 index값을 4444로 바꿈
//		list.remove(3);
//		list.clear(); //모두 지우기
		
		System.out.println(list);
		System.out.println("list.size() : "+list.size()); // length안씀
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		
		for (Integer x : list) { // foreach // 인덱스로는 값을 뽑을 수 없음(java)
			System.out.println(x); 
		}
		System.out.println();
		
		
		int[] sus = new int[10];
		for (int x : sus) { 
			System.out.println(x);
		}
		

	} // end main()

}
