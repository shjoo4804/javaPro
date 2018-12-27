package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02Set {

	public static void main(String[] args) {
		System.out.println("Set");
		
		// Set : List�� ����... BUT ������ : index(����)�� ����, �������ߺ� ������
		// ���� - �����Ͱ� ����ũ��. �����͸� �˸� ã�ư��Ⱑ ����.
		
		Set<String> s = new HashSet<String>();
		s.add("kim1");
		s.add("kim"); // �������ߺ� ������
		s.add("kim3");
		s.add("kim2");
		s.add("kim");
		s.remove("kim"); // �����Ͱ����� ����
//		s.clear(); // ������
		
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // index�� ��� �̷��� ����
		}
		System.out.println();
		
		for (String x : s) {
			System.out.println(x);
		}
		

	} // end main()

}
