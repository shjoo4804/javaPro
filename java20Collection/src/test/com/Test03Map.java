package test.com;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Test03Map {

	public static void main(String[] args) {
		System.out.println("Map");
		
		// �ݵ�� Ű, ������ ��Ī >> <key, value>
		// key�� ����Ű(�ߺ�X). value�� �ߺ����
		
		Map<String, Double> m = new Hashtable<>(); // Hashtable, Hashmap ���� ��
		m.put("key1", 3.14);
		m.put("key1", 3.15); // ���� ���õ� ���� �����ϰ� �������� �ִ� �ɷ� ���õ�
		m.put("b_avg", 99.8);
		m.put("d_avg", 200.0);
		
//		m.remove("key1"); // key1�� ������ �����
//		m.clear(); // ��� ������ �����
		
		System.out.println(m.get("key1")); // Ű������ �����͸� ã���� ��
		System.out.println(m.get("b_avg")); // Ű������ �����͸� ã���� ��
		System.out.println(m.get("d_avg")); // Ű������ �����͸� ã���� ��
		System.out.println();
		
		
		Set<String> ks = m.keySet();
		for (String x : ks) { // Ű�� ����ϱ�
			System.out.println(x+":"+m.get(x));
		}
		
		
	} // end main()

}
