package test.com;

public class Test02DAO {
	
	public int insert(String name) {
		System.out.println(name);
		
		// �����ϸ� 1, �����ϸ� 0 ��ȯ
		String result = "����";
		if(result.equals("����")) {
			return 1;
		} else {
			return 0; 
		}
	} // end insert()
	
	
	// main���� ������Ʈ ���� �� ���� �ؽ�Ʈ�� ����
	// DAO���� main���� �Ѿ�� �迭�� �߿Դ��� Ȯ��..? �迭�� �޾Ƽ� �����Ұ� 
	// ***
	public boolean update(String[] args) {
		System.out.println("update()");
		System.out.println(args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		if(args.length == 3) { //update�� ���� Ȯ��
			return true;
		} else { 
			return false; //or true
		}
	} // end update()
	
	
	public int delete(int num) {
		System.out.println("delete()");
		System.out.println(num);
		return 0; // or 1
	} // end delete()
	
	
	public String[] selectAll() {
		System.out.println("selectAll()");
		String[] datas = new String[3];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = "aaa"+(i+1);
		}
		return datas; // return null; �̶� �ٰ�
	} // end selectAll()
	
	
	public String selectOne(int num) {
		System.out.println("selectOne()");
		String str = "����"+num;
		return str;
	} // end selectOne
	
	
	public int check(boolean x) {
		System.out.println("check()");
		if (x==true) {
			return 1;
		} else {
			return 0;
		}
	}

} // end class
