package method;

public class Fee {
	
	final double PAY = 370;
	final double KW_PAY = 52.0;
	
	//메서드 작성 : double ElecPay(int kw)
	double ElecPay(int kw) {
		return PAY + (kw * KW_PAY) + ((PAY + (kw * KW_PAY))* 0.05);
	}
}
