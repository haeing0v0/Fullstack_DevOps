package BookP208_9.ex09;

public class Ex09 {
	//학생마다 각각 다른 학생 카드가 발급되도록 구현해봅시다. 학생 카드 번호는 학번에 100을 더한 값입니다.
	//Student 클래스를 만들어 학생 카드 번호 인스턴스 변수를 추가하고,
	//학생이 생성될 때마다 학생 카드 번호를 부여합니다.
	//StudentTest 클래스를 만들어 학생 두명을 생성합니다. 두 학생의 카드 번호를 출력해보세요.
	
	public static void main(String[] args) {
		
		Student hong = new Student();
		System.out.println("학번 : " + hong.studentId + ", 카드번호 : " + hong.cardNumber);
		
		Student kang = new Student();
		System.out.println("학번 : " + hong.studentId + ", 카드번호 : " + hong.cardNumber);
	}
}
