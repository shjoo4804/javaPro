package test.go;

import java.util.Date;

public class Test03Board {

	String title; // ����
	String content; // ����
	String writer; // �۾���
	Date wDate; // �ۼ�����
	// protected ��ӵ� ���賢���� ������ �޶� ��
	// private �� Ŭ���� �ȿ����� ���
	// default
	// public �ٸ� ��Ű�������� ���� ����

	// �������� �� ���� : �Ӽ�(�ʵ�) �ʱ�ȭ
	public Test03Board() { // public�� ������ ���� ����(��Ű��)�� �־�߸� ��밡����
		title = "����";
		content = "����";
		writer = "ȫ�浿";
		wDate = new Date();
	}
	// �����ε� : ���� �̸��� ������(�޼ҵ�)�� ���� �� ���� ��, �Ű������� ����/Ÿ��/������ �ٸ�
	public Test03Board(String x) {
		title = x;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	
	public Test03Board(int x) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	
	public Test03Board(int x, int y) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	
	public Test03Board(String y, int x) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	public Test03Board(int x, String y) {
//		title = x;
//		content = y;
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(wDate);
	}
	

	

} // end class
