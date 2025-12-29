package cloud;

public class Student {

	//서브클래스 : 데이터를 제공하는 클래스
	//데이터 사용을 위한 입, 출력 방법
	//입력 : 생성자 메서드에 매개변수 정의, set 메서드 정의
	//출력 : get 메서드 정의
	
	private int studentId;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int studentId, String name) { //생성자를 명시하고 매개변수를 정의한다.
		this.studentId = studentId;
		this.name = name;
	}
	
	//출력 메서드 작성 (get 메서드)
	public int getStudentId() {
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
