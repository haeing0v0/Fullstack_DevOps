package poly;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulationRotation;
		if (accumulationRotation < maxRotation) {
			System.out.println(location + "HanKookTire 수명 : "
		+ (maxRotation - accumulationRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HanKookTire 펑크");
			return false;
		}
	}
}
