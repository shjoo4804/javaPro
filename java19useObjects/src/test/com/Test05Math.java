package test.com;

import java.math.BigInteger;

public class Test05Math {

	public static void main(String[] args) {
		System.out.println("Math Object");
		
		System.out.println(Math.min(10, 20));
		System.out.println(Math.max(10, 20));
		
		System.out.println(Math.abs(-333)); // ���밪
		System.out.println(Math.random()); // 0~1������ �Ǽ�
		System.out.println(Math.random()*10);
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(99.99)); // ����
		System.out.println(Math.round(99.99)); // �ݿø�
		System.out.println(Math.pow(10.0, 2.0)); // 10.0�� 2.0wprhq
		
		
		System.out.println(BigInteger.valueOf(10000000000L));
		// + baekjoon �˰���, ���Ϸ� �˰���
		
		

	} // end main()

}
