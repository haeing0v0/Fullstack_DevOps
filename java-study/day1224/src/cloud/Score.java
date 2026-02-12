package cloud;

public class Score {
	
	private int kor, math, eng;
	private double avg;
	
	//get(출력), set(입력) 메서드
	
	public int getKor() {
		return this.kor;
	}
	
	public void setKor() {
		this.kor = kor;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public void setMath() {
		this.math = math;
	}
	
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setMath(int math) {
		this.math = math;
	}

	int total(int n1, int n2, int n3) {
		int total = n1 + n2 + n3;
		
		return total;
	}
	
	double average(int n1, int n2, int n3) {
		avg = total(n1, n2, n3) / 3.0;
		
		return avg;
	}
}
