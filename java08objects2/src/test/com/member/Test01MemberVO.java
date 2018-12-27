package test.com.member;

public class Test01MemberVO {
	// VO:Value Object, DTO:Data Transfer Object - obj�� ���⿡ ���� : ���� �����ϴ� �Ϳ� ������ ����
	public int num; // ȸ����ȣ
	public String id;
	public String pw;
	public String name;
	public String tel; // ��ȭ��ȣ
	
	// �⺻���� ���·� ���� �� ������, ������ �� �ְ� �� ������, ��� ��츦 �� ������ ������ ...
	
	public Test01MemberVO() {
		num = 1;
		id = "admin";
		pw = "hi123456";
		name = "kim";
		tel = "010";
	}
	
	public Test01MemberVO(int num, String id, String pw, String name, String tel) {
		this.num = num; 
		// �Ű������� ���������� �̸��� �����ϸ�
		// �ڹٿ����� �������� ��� �Ű������� �ν��ع����Ƿ� ���������� this. �߰�
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	
		
} // end class
