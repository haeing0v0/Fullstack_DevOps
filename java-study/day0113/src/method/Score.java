package method;

public class Score {

	int kor, eng, math, sum;
	double avg;
	
	//메서드명 : int total(), double average()
	int total(int kor, int eng, int math) {
		return  kor + eng + math;
	}
	
	double average(int kor, int eng, int math) {
		int sum =  kor + eng + math;
		return sum / 3.0;
	}
}
