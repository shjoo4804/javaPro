package test.com.ex02;

public class Test02this_super extends Test01Bus {
	
	int x;
	int y;
	int y2;
	int y3;
	int y4;
	
	public Test02this_super() {
		super(); //new Test01Bus()와 같음 (생략가능) // super생성자
		x = 10; 
		y = 20;
		y2 = 30;
		y3 = 40;
		y4 = 50;
	}
	
	public Test02this_super(int x) {
		this(); // Test02this_super()가 초기화한 값을 그대로 씀 // this생성자 - super랑은 쓸수없음
		this.x = x; // 대신 x값은 바꾸겠다
	}
	
	public Test02this_super(int y2, int y3) {
//		this();
		this(33); // Test02this_super(int x)로 감
		this.y2 = y2;
		this.y3 = y3;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("this.  this()  super.  super()");
		
		
		
	} // end main()

}
