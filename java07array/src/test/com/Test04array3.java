package test.com;

import java.util.Arrays;

public class Test04array3 {

	public static void main(String[] args) {
		System.out.println("array..비교");

		int[] sus = new int[3];
		int[] sus2 = new int[] {0,0,0};
		System.out.println(sus.length);
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}
		System.out.println(sus==sus2); // 배열의 주소 비교
		System.out.println(sus.equals(sus2)); // 배열의 주소 비교
		System.out.println(Arrays.equals(sus,  sus2)); // 데이터값 비교 : 같으면 true
		System.out.println(Arrays.compare(sus,  sus2)==0); // 데이터값 비교 : 같으면 0 반환
		// ==0 쓰면 true나 false로 반환
		System.out.println();
		
		Integer[] nums = new Integer[3];
		nums[0] = 0;
		nums[1] = 0;
		nums[2] = 0;
		Integer[] nums2 = new Integer[] {0,0,0};
		System.out.println(nums.length);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}		
		System.out.println();
		System.out.println(nums==nums2);
		System.out.println(nums.equals(nums2));
		System.out.println(Arrays.equals(nums,  nums2)); // 데이터값 비교 : 같으면 true
		System.out.println(Arrays.compare(nums,  nums2)==0); // 데이터값 비교 : 같으면 0 반환
		
		
	} // end main()

} // end class
