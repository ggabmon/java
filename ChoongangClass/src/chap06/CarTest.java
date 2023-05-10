package chap06;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제작회사: "+ myCar.company);
		System.out.println("모델명 :"+ myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		
		myCar.speed=280; // 필드의 값을 바꾸었다!
		
		System.out.println("현재속도: "+myCar.speed);
	}

}
