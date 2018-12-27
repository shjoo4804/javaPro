package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01List {

	public static void main(String[] args) {
		System.out.println("List");
		
		// array >> ������ ���̸� �䱸��
		// �������� ���̸� ���� �� �ֵ��� �ϴ� �迭 >> List
		// List�� ��ӹ��� �ֵ� : ����(�ε���)�� �ְ�, �������� �ߺ��� �����
		
		// �� �ֱ� .add()
		// ũ�� .size()
		// �������� .get()
		// �ε��� ���� .set(index, value)
		// �ش� �ε��� ���� .remove(index)
		// ����� .clear()
		
		List<Integer> list = new ArrayList</*Integer*/>(); // <>�ȿ� Ÿ�� ���� : genetic
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(6000);
		list.add(5000);
		list.set(4, 4444); // 4�� index���� 4444�� �ٲ�
//		list.remove(3);
//		list.clear(); //��� �����
		
		System.out.println(list);
		System.out.println("list.size() : "+list.size()); // length�Ⱦ�
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		
		for (Integer x : list) { // foreach // �ε����δ� ���� ���� �� ����(java)
			System.out.println(x); 
		}
		System.out.println();
		
		
		int[] sus = new int[10];
		for (int x : sus) { 
			System.out.println(x);
		}
		

	} // end main()

}
