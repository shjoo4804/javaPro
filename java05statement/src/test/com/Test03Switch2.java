package test.com;

public class Test03Switch2 {

	public static void main(String[] args) {
		System.out.println("switch");
		
		// key : ����, ������, String(Java7����)
		int key = 3;
		switch (key) {
		case 10: //key�� 10�϶�
			System.out.println(100*key);
//			break; //break�� if�� �ȿ� ������� ������ if�� ���{}�� �ִ� �������������
			if (100*key>500) {
				break;
			}
			System.out.println("Aaaa"); // if�� �Ʒ������� �� ���� ����
		case 9:
			System.out.println(90*key);
			break;
		case 8:
			System.out.println(80*key);
			break;

		default:
			System.out.println(0*key);
			break;
		}

	} // end main()

} // end class
