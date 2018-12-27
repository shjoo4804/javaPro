package test.com;

public class Test01array {

	public static void main(String[] args) {
		
		System.out.println("array");

		// 변수
		int kor = 10;
		String name = "kim";
		
				
		// 동일타입의 변수의 '갯수'가 중요할 때. 여러 개 필요할 때. - 배열사용
		int a1=0, a2=1, a3=2;
		
		// 배열 : 메모리에 주소가 할당이 되고,
		//      할당된 길이만큼의 각 index(position)에 데이터를 담음
		//int[] sus = {1,2,3}; //먼저 배열에 할당
		int[] sus = new int[]{11,22,33,44,55,66}; // 위와 같은 형태. 권장. 동적할당
		System.out.println(sus);
		System.out.println(sus[0]);
		System.out.println(sus[1]);
		System.out.println(sus[2]);
		System.out.println(sus[3]);
		System.out.println("sus length:"+sus.length);
		
		for (int i = 0; i < sus.length; i++) { // sus.length 배열의 길이(크기)
			System.out.println(sus[i]);
		}
		
		int[] sus2 = new int[10]; //{0,0,0}배열로 생성되어있음 //만들어서 배열에 넣으라는 것(주소로 할당)
		System.out.println(sus2);
		
		//{0,0,0} << {1,2,3}
		System.out.println("sus2 length:"+sus2.length);
		for (int i = 0; i < sus2.length; i++) {
			sus2[i] = (i+1)*10;
		}
//		
//		sus2[0] = 1;
//		sus2[1] = 2;
//		sus2[2] = 3;
		
		for (int i = 0; i < sus2.length; i++) {
			System.out.println(sus2[i]);
		}
		
		
		
	} // end main()

} // end class
