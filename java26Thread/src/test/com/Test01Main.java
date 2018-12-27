package test.com;

import java.util.Date;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Thread...Runnable");
		
		// 1.Thread
		// 한 프로그램을 돌릴 때 다른 프로그램과 동시에 돌릴 수 있도록...
		// 해당 CPU 분할해서 사용할 수 있도록..
		
		
		//병렬처리 구현 메소드 >> run()
		Thread t = new Thread() { //상속받아서 오버라이딩....
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(new Date());
					try {
						Thread.sleep(1000); // 돌고있는 로직을 ~ms초마다 잠깐 쉬게 하는 것
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		};
		
//		t.run(); // 순차적으로 돌아가는것
		t.start();// Thread를 돌려 // 병렬처리명령 : Main과는 다른 공간에서 돌아감..
		
		
		
		/*Thread t2 = */
		new Thread() { 
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(new Date().getTime());
					try {
						Thread.sleep(1000); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		}.start();
		
		/*t2.start();*/ 
		
		
		
		System.out.println("end main..");
		
	} // end main()

}
