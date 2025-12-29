package cloud;

public class StudentRun {

	public static void main(String[] args) {
		
		//Student 객체 생성 ==> Student 데이터를 사용하겠다.
		//1. 클래스 타입 선언, 2. 변수 작성, 3. new 연산자 사용, 4. 생성자 호출
		Student st1 = new Student();
		st1.setStudentId(250002);
		st1.setName("이순신");
		
		int studentId = st1.getStudentId();
		String name = st1.getName();
		
		Student st3 = new Student();
		
//		Student st2 = new Student(250001, "홍길동");
//		int studentId = st2.getStudentId();
//		String name = st2.getName();
		
		System.out.println("studentId = " + studentId + ", name = " + name);
		System.out.println("Student st1 = " + st1.toString());
		System.out.println("Student st3 = " + st3.toString());
	}
}
