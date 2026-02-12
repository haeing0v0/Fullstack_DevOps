package cloud;

public class StudentArray {
	public static void main(String[] args) {
		
		Student[] sts = new Student[3]; //배열 선언 및 초기화
		
		sts[0] = new Student(1001, "홍길동");
		sts[1] = new Student(1002, "김유신");
		sts[2] = new Student(1003, "강감찬");
		
		//sts[0].showInfo();
		
		for(int i = 0; i < sts.length; i++) {
			sts[i].showInfo();
		}
	}
}
