package test.com;

import java.util.Date;
import java.util.Random;

public class Test02InnerThreadEx {
	
	Random r = new Random();
	
	public void test() {
		Inner in = new Inner();
		in.start();
		
	}
	
	public class Inner extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(r.nextInt(100));
				try {
					Thread.sleep(1000); // �����ִ� ������ ~ms�ʸ��� ��� ���� �ϴ� ��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		}
	} // end inner class
	
}
