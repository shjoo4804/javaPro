package test.com.ex02;

public class Test02this_super extends Test01Bus {
	
	int x;
	int y;
	int y2;
	int y3;
	int y4;
	
	public Test02this_super() {
		super(); //new Test01Bus()�� ���� (��������) // super������
		x = 10; 
		y = 20;
		y2 = 30;
		y3 = 40;
		y4 = 50;
	}
	
	public Test02this_super(int x) {
		this(); // Test02this_super()�� �ʱ�ȭ�� ���� �״�� �� // this������ - super���� ��������
		this.x = x; // ��� x���� �ٲٰڴ�
	}
	
	public Test02this_super(int y2, int y3) {
//		this();
		this(33); // Test02this_super(int x)�� ��
		this.y2 = y2;
		this.y3 = y3;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("this.  this()  super.  super()");
		
		
		
	} // end main()

}
