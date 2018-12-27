package test.com;

import test.com.member.AAA;
import test.com.member.Test01MemberVO;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("-----main-----");
		
		Test01MemberVO tm = new Test01MemberVO();
		System.out.println(tm);
		System.out.println(tm.num);
		System.out.println(tm.id);
		System.out.println(tm.pw);
		System.out.println(tm.name);
		System.out.println(tm.tel);
		
		AAA a = new AAA(tm);
		
		tm = new Test01MemberVO(11, "aaa", "bbb", "cc", "011");
		System.out.println(tm); // 주소가 달라짐 (new했으므로)
		System.out.println();
		
		Test01MemberVO tm2 = new Test01MemberVO(11, "aaa", "xxx", "lee", "011");
		System.out.println(tm2); // 주소가 달라짐 (new했으므로)
		System.out.println(tm2.num);
		System.out.println(tm2.id);
		System.out.println(tm2.pw);
		System.out.println(tm2.name);
		System.out.println(tm2.tel);

	} // end main()

} // end class
