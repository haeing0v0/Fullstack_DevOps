package cloud;

public class ClassEx01 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		String color = c1.color;
		System.out.println("color = " + color);
		
		Car c2 = new Car();
		
		System.out.println("c1 = " + c1.toString());
		System.out.println("c2 = " + c2.toString());
		
		Student st1 = new Student();
		System.out.println("snum = " + st1.snum + "\n name = "
				+ st1.name + "\n test = " + st1.test);
		
	}
}
