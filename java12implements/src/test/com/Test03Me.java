package test.com;

import test.com.ex.Test03friend;

public class Test03Me extends Test03father implements Test03uncle, Test03friend{

	@Override
	public void speed() {
		System.out.println("speed()");
		
	}
	
	public void study() {
		System.out.println("study()");
		slow();
		getMoney();
		study();
		drink();
	}

	@Override
	public void drink() { // ��Ű���� �ٸ��� ���� ������ �ٲ�
		System.out.println("drink()");
	}
	
}
