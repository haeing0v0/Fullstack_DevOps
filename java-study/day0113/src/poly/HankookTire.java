package poly;

public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
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
