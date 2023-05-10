package chap06;

public class CarInfoExample {

	public static void main(String[] args) {
		CarInfo car1 = new CarInfo();
		System.out.println("car1.company = "+car1.company);
		System.out.println();
		
		CarInfo car2 = new CarInfo("테슬라");
		System.out.println("car2.company = "+car2.company);
		System.out.println("car2.model = "+car2.model);
		System.out.println();
	
		CarInfo car3 = new CarInfo("포드","졸라멋진색");
		System.out.println("car3.company = "+car3.company);
		System.out.println("car3.model = "+car3.model);
		System.out.println("car3.color = "+car3.color);
		System.out.println("car3.maxspeed = "+car3.maxspeed);
		System.out.println();
		
		CarInfo lastcar = new CarInfo("아주비싼모델","아주비싼색",10000);
		System.out.println("lastcar.company = "+lastcar.company);
		System.out.println("lastcar.model = "+lastcar.model);
		System.out.println("lastcar.color = "+lastcar.color);
		System.out.println("lastcar.maxspeed"+lastcar.maxspeed);
		System.out.println();
				
	}

}
