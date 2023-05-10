package chap06;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
