package chap06_re;

//이 클래스는 Car01의 실행클래스 입니다.
// 타입 참조변수선언[=null 해도됨];
// 변수명 = new 타입;
//

public class Car01_Ex {


	public static void main(String[] args) {
		Car01 car1 = null; // 참조 변수를 선언했다.
		System.out.println(car1); //null을 print할것
		car1 = new Car01(); // 객체(Object) 생성
		System.out.println(car1); // chap06_re.Car01@15db9742
		
		
//		Car01 mycar = new Car01(); // Car01이라는 Class에서 객체를 하나 생성하자 그 이름은 mycar
//		System.out.println("내 차 색깔이 뭐니? "+mycar.color);
//		mycar.color = "황금색";
//		System.out.println("내 차 색이 바뀌었니?"+mycar.color);
//		System.out.println("-----------------------------");
//		
//		Car01 yourcar = new Car01();
//		System.out.println("네 차 색깔은 그대로니?"+yourcar.color);
//		
//		System.out.println("-----------------------------");
//		
//		System.out.println("내차 시동을 걸어보세요");
//		mycar.powerOn();
//		System.out.println("내차 시동을 꺼보세요");
//		mycar.powerOff();
//		
//		System.out.println("니 차 시동을 걸어보세요");
//		yourcar.powerOn();
//		System.out.println("니 차 시동을 꺼보세요");
//		yourcar.powerOff();

	}

}
