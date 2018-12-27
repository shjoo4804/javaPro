package test.com;

public class Test01array2 {

	public static void main(String[] args) {
		
		System.out.println("array");

//		double[] ds = new double[10];
		double[] ds = new double[] {1.1, 2.2, 3.3, 4.4, 6.6}; // 동적할당
		System.out.println("ds.length:"+ds.length);
		
//		for (int i = 0; i < ds.length; i++) {
//			ds[i] = i*3.14;
//		}		
		
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		System.out.println("=======================");
		
		
		
		boolean[] bs = new boolean[4];
		System.out.println("bs.length:"+bs.length);
		
		for (int i = 0; i < bs.length; i++) {
			if(i%2==0) { // 짝수번 째 index에서만 수정
				bs[i] = true;
			}
		}
		
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}
		System.out.println("=======================");
		
		
		
		String[] strs = new String[3]; // 배열의 기본값은 null 
		// 스트링 배열 타입 - 기본값null
		System.out.println("strs.length:"+strs.length);
		
		for (int i = 0; i < strs.length; i++) {
			if(i==0) {
				strs[i] = "android";
			} else {
				
				strs[i] = "java";
			}
		}
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		
	} // end main()

} // end class
