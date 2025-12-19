package operand;

public class Operand {
	public static void main(String[] args) {
		
		int num1 = 10;
		num1++; //단항연산
		int num2 = 10;
		int sum = num1 + num2; //이항연산
		char ch;
		ch = (num1 == num2) ? 'A' : 'B'; 
		//삼항연산자(조건이 참이면 'A', 거짓이면 'B')
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("sum = " + sum);
		System.out.println("ch = " + ch);
	}
}
