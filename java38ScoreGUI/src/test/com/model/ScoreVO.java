package test.com.model;

public class ScoreVO {

	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

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
		total = kor+eng+math;
		return total;
	}
//
//	public void setTotal(int total) {
//		this.total = total;
//	}

	public double getAvg() {
		avg = total/3.0;
		return avg;
	}
//
//	public void setAvg(double avg) {
//		this.avg = avg;
//	}

	public String getGrade() {
		if(avg>=90) {
			grade = "A"; 
		} else if(avg>=80) {
			grade = "B"; 
		} else if(avg>=70) {
			grade = "C"; 
		} else {
			grade = "F";
		}
		return grade;
	}
//
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}

}
