package test.com;

public class Test02Main {

	// 4. ���ڰ�O / ��ȯ�� O �޼ҵ�
	public static void main(String[] args) {
		System.out.println("dao main...");

		Test02DAO dao = new Test02DAO();
		System.out.println(dao);

		// ȫ�浿�̶�� ���ڿ��� name ������ �Ҵ��ϰ�
		// dao��ü�� insert �޼ҵ忡 ���ڷ� ���� ��
		// ��ȯ���� ����Ͻÿ�.

		String name = "ȫ�浿";
		int result = dao.insert(name); // �ѹ��� insert�� call�ϰ� ���� �� ������ �־���
		System.out.println(result);

		if (result == 1) {
			System.out.println("�Է� ����");
		} else {
			System.out.println("�Է� ����");
		}
		System.out.println();

		////

		boolean result2 = dao.update(new String[] { "a", "b", "c" });

		if (result2 == true) {
			System.out.println("������Ʈ ����");
		} else {
			System.out.println("������Ʈ ����");
		}
		System.out.println();

		////
		
		int result3 = dao.delete(111);
		System.out.println(result3);
		System.out.println();
		
		///
		
		String[] result4 = dao.selectAll();
		for (int i = 0; i < result4.length; i++) {
			System.out.println(result4[i]);
		}
		System.out.println();
		
		///
		
		String result5 = dao.selectOne(100);
		System.out.println(result5);
		System.out.println();
		
		///
		
		
		int result6 = dao.check(false);
		
		if (result6==1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		

	} // end main()

} // end class
