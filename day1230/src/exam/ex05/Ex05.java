package exam.ex05;

import java.util.ArrayList;

import cloud.Book;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList<Dog> lib = new ArrayList<Dog>();
		
		lib.add(new Dog("강아지1", "검정색"));
		lib.add(new Dog("강아지2", "흰색"));
		lib.add(new Dog("강아지3", "회색"));
		lib.add(new Dog("강아지4", "노란색"));
		lib.add(new Dog("강아지5", "갈색"));
		
		for (int i = 0; i < lib.size(); i++) {
			System.out.println(lib.get(i).showDogInfo());
		}
		
		System.out.println("=====향상된 for문=====");
		for (Dog dog : lib) {
			System.out.println(dog.showDogInfo());
		}
	}
}
