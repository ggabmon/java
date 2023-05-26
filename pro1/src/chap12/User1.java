package chap12;

public class User1 extends Thread {
	//필드
	private Calculator calculator;
	//생성자
	
	//메서드
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User1");
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
