package inher;

public class Avg extends Score {
	
	@Override
	int sum(int x, int y, int z) {
		int sum = x + y + z;
		return sum;
	}

	//메서드 작성 : double avg(int x)
	double avg(int x) {
		return x / 3.0; 
	}
}
