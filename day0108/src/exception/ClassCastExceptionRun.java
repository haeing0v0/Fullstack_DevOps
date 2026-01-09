package exception;

public class ClassCastExceptionRun {
	public static void main(String[] args) {
		
		try {
			Dog dog = new Dog();
			changeDog(dog);
			Cat cat = new Cat();
			changeDog(cat);
		} catch (ClassCastException e) {
			System.out.println("부모 자식 클래스 간에만 Casting이 가능합니다. \n" + e.getMessage());
		}
		
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
	}
}