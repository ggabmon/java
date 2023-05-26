package chap12;

public class User2 extends Thread {
	//필드
		private Calculator calculator;
		//생성자
		
		//메서드
		public void setCalculator(Calculator calculator) {
			this.calculator = calculator;
			this.setName("User2");
		}
		//Thread의 run을 override햇다.
		//Runnable 인터페이스에서 선언한 추상메서드엿음.
		public void run() {
			calculator.setMemory(50);
		}
}
