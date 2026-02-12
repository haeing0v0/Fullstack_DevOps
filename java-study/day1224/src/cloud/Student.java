package cloud;

public class Student {
	
	public Student() {
		
	}
	
	int snum = 250001;
	String name = "홍길동";
	int test;
	
	//접근제한자 : public > protected > default > private
	//public(패키지 어디서나 생성자 호출 가능)
	//protected(현재 패키지에서만 생성자 호출가능, 다른 패키지에 자식 클래스가 있을 경우 자식 클래스 생성자 호출가능)
	//default(현재 패키지에서만 생성자 호출 가능)
	//private(클래스내에서만 생성자 호출 가능)
	
}

class Car {
	public Car () {
		
	}
	
	String color = "red";
	String type = "sedan";
}

class Person {
	public Person() {
		
	}
}