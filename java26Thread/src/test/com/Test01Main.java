package test.com;

import java.util.Date;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Thread...Runnable");
		
		// 1.Thread
		// �� ���α׷��� ���� �� �ٸ� ���α׷��� ���ÿ� ���� �� �ֵ���...
		// �ش� CPU �����ؼ� ����� �� �ֵ���..
		
		
		//����ó�� ���� �޼ҵ� >> run()
		Thread t = new Thread() { //��ӹ޾Ƽ� �������̵�....
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(new Date());
					try {
						Thread.sleep(1000); // �����ִ� ������ ~ms�ʸ��� ��� ���� �ϴ� ��
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		};
		
//		t.run(); // ���������� ���ư��°�
		t.start();// Thread�� ���� // ����ó����� : Main���� �ٸ� �������� ���ư�..
		
		
		
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
