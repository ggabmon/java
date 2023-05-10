package chap06;

public class CalculatiorExample {
	public static void main(String[] args) {
		Calculator var1 = new Calculator();
		var1.powerOn();
		
		double result = var1.divide(7, 2);
		System.out.println("result = "+result);
		
		byte a = 5;
		byte b = 3;
		result = var1.divide(a, b);
		System.out.println("result = "+result);
		
		var1.powerOff();
	}
}
