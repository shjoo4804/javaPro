package test.com.member;

public class Test01MemberVO {
	// VO:Value Object, DTO:Data Transfer Object - obj의 성향에 따라서 : 값만 세팅하는 것에 중점적 역할
	public int num; // 회원번호
	public String id;
	public String pw;
	public String name;
	public String tel; // 전화번호
	
	// 기본값인 상태로 쓰게 할 것인지, 세팅할 수 있게 할 것인지, 모든 경우를 다 적용할 것인지 ...
	
	public Test01MemberVO() {
		num = 1;
		id = "admin";
		pw = "hi123456";
		name = "kim";
		tel = "010";
	}
	
	public Test01MemberVO(int num, String id, String pw, String name, String tel) {
		this.num = num; 
		// 매개변수와 전역변수의 이름을 같게하면
		// 자바에서는 전역변수 대신 매개변수로 인식해버리므로 전역변수에 this. 추가
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	
		
} // end class
