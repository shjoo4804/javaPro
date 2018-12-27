package test.com;

public class Test02DAO {
	
	public int insert(String name) {
		System.out.println(name);
		
		// 성공하면 1, 실패하면 0 반환
		String result = "실패";
		if(result.equals("성공")) {
			return 1;
		} else {
			return 0; 
		}
	} // end insert()
	
	
	// main에서 업데이트 콜할 때 여러 텍스트를 던짐
	// DAO에서 main에서 넘어온 배열이 잘왔는지 확인..? 배열을 받아서 수정할것 
	// ***
	public boolean update(String[] args) {
		System.out.println("update()");
		System.out.println(args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		if(args.length == 3) { //update할 개수 확인
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
		return datas; // return null; 이라도 줄것
	} // end selectAll()
	
	
	public String selectOne(int num) {
		System.out.println("selectOne()");
		String str = "선택"+num;
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
