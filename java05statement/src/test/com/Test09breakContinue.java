package test.com;

public class Test09breakContinue {

	public static void main(String[] args) {

		System.out.println("break...continue");

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) { // ¦�����
				System.out.print(i);
			}
		}
		System.out.println();

		
		for (int i = 0; i < 10; i+=2) { // i++  i+=1 �� ������
			System.out.print(i);
		}
		System.out.println();
		
		
		for (int i = 0; i < 10; i++) { 
			if(i==4) { // 4�� ������� ����
				continue; // �ؿ� �ڵ��� �����ϰ� ��� ������ �̵��϶�� ��(if�� �� ����), �۰� �ٽ� �ݺ�
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
					//break; // 5���Ǹ� ���� for ��������
					continue; // 5�϶� �����ϰ� ���
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
