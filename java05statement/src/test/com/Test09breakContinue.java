package test.com;

public class Test09breakContinue {

	public static void main(String[] args) {

		System.out.println("break...continue");

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) { // 짝수찍기
				System.out.print(i);
			}
		}
		System.out.println();

		
		for (int i = 0; i < 10; i+=2) { // i++  i+=1 과 같은뜻
			System.out.print(i);
		}
		System.out.println();
		
		
		for (int i = 0; i < 10; i++) { 
			if(i==4) { // 4를 출력하지 않음
				continue; // 밑에 코딩을 무시하고 블록 끝으로 이동하라는 뜻(if문 블럭 제외), 글고 다시 반복
			}
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
		}
		System.out.println();
		
		
		for (int i = 0; i < 10; i++) { 
			if(i%2 == 0) { 
				continue; 
			}
			System.out.print(i);
		}
		System.out.println();
		
		
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) { 
				if(i==5) { 
					//break; // 5가되면 안의 for 빠져나감
					continue; // 5일때 제외하고 출력
				}
				System.out.print(x+":"+i+" ");
			}
			System.out.println();
		}
		System.out.println("===");
		
		
		// go to
		aaa : for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) { 
				if(i==5) { 
					//break aaa; 
					continue aaa;
				}
				System.out.print(x+":"+i+" ");
			}
			System.out.println();
		}
		

	} // end main()

} // end class
