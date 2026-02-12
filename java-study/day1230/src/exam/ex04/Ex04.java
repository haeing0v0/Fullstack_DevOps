package exam.ex04;

import cloud.Book;
import exam.ex05.Dog;

public class Ex04 {

	public static void main(String[] args) {
		//Dog 인스턴스를 5개 생성하여 배열에 추가하고, for문과 향상된 for문에서
		//Dog 클래스의 showDogInfo() 메서드를 사용하여 배열에 추가한 Dog 정보를 모두 출력하세요.
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("강아지1", "검은색");
		dogs[1] = new Dog("강아지2", "흰색");
		dogs[2] = new Dog("강아지3", "회색");
		dogs[3] = new Dog("강아지4", "노란색");
		dogs[4] = new Dog("강아지5", "갈색");
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		System.out.println("=====향상된 for문=====");
		for (Dog d : dogs) {
			System.out.println(d.showDogInfo());
		}
	}
}
