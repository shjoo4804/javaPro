package test.com;

public class Test02StringBuilder {

	public static void main(String[] args) {
		System.out.println("StringBuffer...");
		System.out.println("StringBuilder...");
		
		// 방대한 양의 문자열을 처리하기 좋게 만들어진 Object
		// 즉, 대용량 문자열 처리에 사용하는 Object
		
		long startTime = System.currentTimeMillis();
//		StringBuffer sb = new StringBuffer(); 
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 10000000; i++) {
			sb.append(String.valueOf(i)); // append() : 값을 계속 추가해줌
		}
//		System.out.println(sb.toString()); // 오브젝트에 담겨있는 문자를 string타입으로 변환해서 찍어라
		System.out.println(sb.length());
		
		System.out.println(System.currentTimeMillis() - startTime);

	}

}
