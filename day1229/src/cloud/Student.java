package cloud;

public class Student {

	//서브클래스 : 데이터를 제공하는 클래스
	//데이터 사용을 위한 입, 출력 방법
	//입력 : 생성자 메서드에 매개변수 정의, set 메서드 정의
	//출력 : get 메서드 정의
	
	int num;
	private static int serialNum; //static 멤버
	private int studentId; //인스턴스 멤버
	private String name; //인스턴스 멤버
	
	public Student() {
		
	}
	
	public Student(int studentId, String name) { //생성자를 명시하고 매개변수를 정의한다.
		this.studentId = studentId;
		this.name = name;
	}
	
	//출력 메서드 작성 (get 메서드)
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public int getStudentId() {
		int num = 100; //메서드 내에 정의된 변수는 로컬변수이다.
		System.out.println("getStudentId()의 로컬변수 num = " + num);
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
