package chap06;

public class CarA_Ex {

	public static void main(String[] args) {
		CarA car = new CarA();
		
		car.keyTurnOn();
		int nowSpeed = 0;
		System.out.println("현재속도"+nowSpeed);
		
		car.run();
		
		nowSpeed = car.getSpeed();
		System.out.println("현재속도"+nowSpeed);

	}

}
