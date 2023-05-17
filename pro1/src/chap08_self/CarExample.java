package chap08_self;

public class CarExample {

	public static void main(String[] args) {
		Car cho = new Car();
		
		cho.run();
		
		cho.backLeft = new HankookTire();
		cho.backRight = new HankookTire();
		
		cho.run();
	}

}
