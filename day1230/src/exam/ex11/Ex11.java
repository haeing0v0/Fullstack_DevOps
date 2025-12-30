package exam.ex11;

import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {
		//ArrayList<Student> 자료형의 ArrayList 선언,
		//ArrayList에 학생 3명 추가, 정보를 출력하시오
		
		ArrayList<Student> std = new ArrayList<Student>();
		std.add(new Student(1001, "홍길동"));
		std.add(new Student(1002, "이순신"));
		std.add(new Student(1003, "강감찬"));
		
		for (int i = 0; i < std.size(); i++) {
			std.get(i).showStudentInfo();
		}
	}
}
