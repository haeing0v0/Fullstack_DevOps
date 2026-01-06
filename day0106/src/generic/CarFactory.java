package generic;

public class CarFactory<T extends Car> { //차를 생각하며 제네릭 처리

	public void addFuel(T t) {
		t.addFuel(100);
    }
	
	public void fixCar(T t) { //매개변수 제네릭
		System.out.println(t.name + "를 수리했습니다.");
	}
}
