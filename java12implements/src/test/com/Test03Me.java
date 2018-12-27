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
	public void drink() { // 패키지가 다르면 넓은 범위로 바뀜
		System.out.println("drink()");
	}
	
}
