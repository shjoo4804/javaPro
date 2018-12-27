package test.com.model;

public class RoomVO {
	private int num;
	private int time; // 이용시간
	private int remain; // 이용중:1, 이용안함:0

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

}
