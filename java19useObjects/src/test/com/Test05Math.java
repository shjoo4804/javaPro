package test.com;

import java.math.BigInteger;

public class Test05Math {

	public static void main(String[] args) {
		System.out.println("Math Object");
		
		System.out.println(Math.min(10, 20));
		System.out.println(Math.max(10, 20));
		
		System.out.println(Math.abs(-333)); // 절대값
		System.out.println(Math.random()); // 0~1사이의 실수
		System.out.println(Math.random()*10);
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(99.99)); // 내림
		System.out.println(Math.round(99.99)); // 반올림
		System.out.println(Math.pow(10.0, 2.0)); // 10.0의 2.0wprhq
		
		
		System.out.println(BigInteger.valueOf(10000000000L));
		// + baekjoon 알고리즘, 오일러 알고리즘
		
		

	} // end main()

}
