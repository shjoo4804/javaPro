package test.com;

import java.util.Date;

public class Test03Runnableimpl extends Date implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getTime());
			try {
				Thread.sleep(1000); // �����ִ� ������ ~ms�ʸ��� ��� ���� �ϴ� ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
