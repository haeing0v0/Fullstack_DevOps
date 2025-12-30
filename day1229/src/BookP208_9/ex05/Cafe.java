package BookP208_9.ex05;

public class Cafe {
	String cafeName;

    public Cafe(String cafeName) {
        this.cafeName = cafeName;
    }

    public void sellCoffee(Coffee coffee, Person person) {
        person.money -= coffee.price;
        System.out.println(person.name + "는 " + cafeName + "에서 "
                + coffee.price + "원을 내고 " + coffee.name + "를 사 마셨습니다. (잔액: "
                + person.money + "원)");
    }
}
