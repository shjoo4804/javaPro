package test.com;

import java.util.Date; // Ctrl Shift O : import �ڵ����� �־��ֱ�

import test.go.Test03Board;

public class Test03BoardMain {

	public static void main(String[] args) {
		System.out.println("Board Main");
		
		Test03Board tb = new Test03Board(); // Ŭ������ tb = new ������;
		System.out.println(tb);
//		System.out.println(tb.title);
//		System.out.println(tb.content);
//		System.out.println(tb.writer);
//		System.out.println(tb.wDate);
//		
//		tb.title = "AAA";
//		tb.content = "BBB";
//		tb.writer = "kim";
//		tb.wDate = new Date();
//		System.out.println(tb.title);
//		System.out.println(tb.content);
//		System.out.println(tb.writer);
//		System.out.println(tb.wDate);
		
		
		// ������ �̸��� ������(�޼ҵ�)�� ���� �� ������ ��
		// �Ű������� Ÿ��, ����, ������ �ٸ��� ���־���Ѵ�.
		// �̸� �޼ҵ�� �������� �����ε��̶�� �Ѵ�.
		Test03Board tb2 = new Test03Board("AAA");
		Test03Board tb3 = new Test03Board(333);
		Test03Board tb4 = new Test03Board(333,44);
		Test03Board tb5 = new Test03Board(333,"AA");
		
		
		
	} // end main()

} // end class
