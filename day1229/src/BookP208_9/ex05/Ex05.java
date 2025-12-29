package BookP208_9.ex05;

public class Ex05 {
	//아침 출근길에 김씨는 4000원을 내고 별다방에서 아메리카노를 사마셨습니다.
	//이씨는 콩다방에서 4500원을 내고 라떼를 사마셨습니다. 객체지향으로 프로그래밍해보세요.
	public static void main(String[] args) {
		
		Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 10000);

        Cafe starCafe = new Cafe("별다방");
        Cafe beanCafe = new Cafe("콩다방");

        Coffee americano = new Coffee("아메리카노", 4000);
        Coffee latte = new Coffee("라떼", 4500);

        starCafe.sellCoffee(americano, kim);
        beanCafe.sellCoffee(latte, lee);
	}
}
