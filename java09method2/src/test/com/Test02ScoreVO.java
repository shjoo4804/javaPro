package test.com;

public class Test02ScoreVO {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		this.total = kor+eng+math;
		return total;
	}
	
	public double getAvg() {
		this.avg = total / 3.0;
		return avg;
	}

	public String getGrade() {
		if(avg>=90) {
			grade = "A";
		} else if(avg>=80) {
			grade = "B";
		} else if(avg>=80) {
			grade = "C";
		} else {
			grade = "°ú¶ô";
		}
		return grade;
	}

	
}
