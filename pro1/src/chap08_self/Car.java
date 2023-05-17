package chap08_self;

public class Car {
	Tire frontLeft = new HankookTire();
	Tire frontRight = new HankookTire(); 
	Tire backLeft = new KumhoTire();
	Tire backRight = new KumhoTire();
	
	void run() {
		frontLeft.roll();
		frontRight.roll();
		backLeft.roll();
		backRight.roll();
	}
}
