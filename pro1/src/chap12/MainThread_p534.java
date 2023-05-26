package chap12;

public class MainThread_p534 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		calculator.setMemory(50);
		System.out.println(user1.getName());
		System.out.println(calculator.getMemory());
		
		
		
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		System.out.println(user2.getName());
	}

}
