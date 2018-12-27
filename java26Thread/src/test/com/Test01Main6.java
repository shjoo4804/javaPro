package test.com;

import java.util.Date;
import java.util.Random;

public class Test01Main6 {

	public static void main(String[] args) {
		System.out.println("Thread...Runnable");
		
		// 1.���ĺ��� 0.5�ʴ� �ѹ��� 10�� ����ϴ�
		// 2.��¥�� 0.5�ʴ� �ѹ��� 10�� ����ϴ�
		// 3.������ ������ 0.5�ʴ� �ѹ��� 10�� ����ϴ�
		// �����带 �����Ͻÿ�
		// ����: �����带 ��� ����� ���� �ٸ� ������� 3���� �̻�
		
		Random r = new Random();
		
		// 1. Thread
		Thread t = new Thread() {
			@Override
			public void run() {
				char c; // �빮�� 'A'
				
				/*for (int i = 0; i < 10; i++) {
					c = (char) (65+r.nextInt(25));
					System.out.println(c);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}*/
				
				for(char i = 'A'; i < 'K'; i++) {
						System.out.println(i);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		};
		t.start();
		
		
		
		// 2. extends Thread
		Thread t2 = new ThreadEx();
		t2.start();
		
		
		
		// 3. member inner class extends Thread
		InnerThread outter = new InnerThread();
		outter.test();
		
		
		
		// 4.implements Runnable anonymous inner type
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(new Date().getTime());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}).start();
		
		
		System.out.println("end main..");
		
	} // end main()

}
