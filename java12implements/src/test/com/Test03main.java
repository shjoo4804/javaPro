package test.com;

import test.com.ex.Test03friend;

public class Test03main {

	public static void main(String[] args) {
		System.out.println("hello");

		System.out.println("=====me=====");
		Test03Me me = new Test03Me();
		me.speed();
		me.study();
		me.slow();
		me.drink();
		System.out.println(me.car);
		System.out.println(me.num);
		System.out.println();

		System.out.println("=====fa=====");
		Test03father father = new Test03father();
		father.getMoney();
		father.slow();
		System.out.println(father.car);
		System.out.println(father.num);
		System.out.println();

		System.out.println("=====uc=====");
		Test03uncle uncle = new Test03uncle() {
			// �߻�޼ҵ带 ������ �����Ƿ� �������̵��ϱ�

			@Override
			public void speed() {
				System.out.println("speed()-uncle");
			}
		};
		uncle.speed();

		Test03uncle uncle2 = new Test03Me();
		uncle2.speed(); // Me�� speed()ȣ��
		System.out.println();

		System.out.println("=====friend=====");
		Test03friend friend = new Test03friend() {

			@Override
			public void drink() {
				System.out.println("drink()-friend");
			}
		};
		friend.drink();
		
		// �ڹ��� ������ - ����� ������  �ڽ�Ŭ������ �����ڷ� ��ü����
		Test03friend friend2 = new Test03Me();
		friend2.drink();
		System.out.println();

		System.out.println("==========");
		Test03father father2 = new Test03Me();
		father2.getMoney();
		father2.slow();
		System.out.println();
		
		System.out.println("==========");
		Test03father father3 = new Test03father() { 
			@Override
			public void slow() {
				System.out.println("slow()-father**");
			}
			
			@Override
			public int getMoney() {
				System.out.println("getMoney-father**");
				return 900;
			}
		};
		father3.slow();
		father3.getMoney();
		System.out.println();
		
		System.out.println("=====gf=====");
		Test03gf gf = new Test03gf();
		gf.slow();
		
		Test03gf gf2 = new Test03father();
		gf2.slow();
		
		Test03gf gf3 = new Test03Me();
		gf3.slow();
		
		Test03gf gf4 = new Test03gf() {
			@Override
			public void slow() {
				System.out.println("slow()***");
			}
		};
		gf4.slow();

	} // end main()

}
