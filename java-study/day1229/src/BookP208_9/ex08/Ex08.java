package BookP208_9.ex08;

public class Ex08 {
	//택시 객체와 Edward 학생이 택시 타는 과정을 구현해봅시다. 이때, 택시 요금은 10,000원입니다.
	
	public static void main(String[] args) {
		Student edward = new Student("edward", 30000);
		Taxi taxi = new Taxi("카카오 택시");
		
		edward.takeTaxi(taxi);
		edward.showInfo();
		taxi.showInfo();
	}
}
