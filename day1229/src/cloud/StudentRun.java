package cloud;

public class StudentRun {

	public static void main(String[] args) {
		
		//Student 객체 생성 ==> Student 데이터를 사용하겠다.
		//1. 클래스 타입 선언, 2. 변수 작성, 3. new 연산자 사용, 4. 생성자 호출
		Student st1 = new Student();
		//st1.setStudentId(250002);
		//st1.setName("이순신");
		
		int studentId = st1.getStudentId();
		String name = st1.getName();
		
		Student.getSerialNum(); //static 멤버
		//st1.getSerialNum(); //인스턴스 멤버
		
		Student st3 = new Student();
		
//		Student st2 = new Student(250001, "홍길동");
//		int studentId = st2.getStudentId();
//		String name = st2.getName();
		
		//인스턴스 멤버 방법 처리(객체를 생성하지 않으면 사용할 수 없다.)
		st1.setSerialNum(00001); //static 멤버는 지금처럼 인스턴스로 처리하지 않는다.
		int serialNum = st1.getSerialNum(); //static 멤버는 지금처럼 인스턴스로 처리하지 않는다.
		System.out.println("Student serialNum = " + serialNum);
		
		//static 멤버 방법 처리(클래스 이름을 쓰고 메서드를 호출해서 사용한다.)
		Student.setSerialNum(00002);
		int serialNum1 = Student.getSerialNum();
		System.out.println("Student.serialNum1 = " + serialNum1);
		
		System.out.println("studentId = " + studentId + ", name = " + name);
		System.out.println("Student st1 = " + st1.toString());
		System.out.println("Student st3 = " + st3.toString());
	}
}
