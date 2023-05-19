package chap07_re;
//p347
//Polymorphism(다형성) - 매개변수의 다형성
public class Polymorphism {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		driver.drive(bus);
	}
}

class Driver{
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}


class Vehicle{
	void run() {System.out.println("vehicle 달려요");}
}

class Car extends Vehicle{
	void run() {System.out.println("car 달려요");}
}

class Bus extends Vehicle{
	void run() {System.out.println("bus 달려요");}
}