package chap06_re;

public class P228_Main {

	public static void main(String[] args) {
		// test 클래스를 참조하는 값들
		System.out.println("초기값을 보여주세요");
		Car02_p228 test = new Car02_p228();
		System.out.println("byte b="+test.b);
		System.out.println("short s="+test.s);
		System.out.println("int price="+test.price);
		System.out.println("long l="+test.l);
		System.out.println("float s="+test.f);
		System.out.println("double d="+test.d);
		System.out.println("boolean bool="+test.bool);
		System.out.println("char c="+test.c);
		System.out.println("String str="+test.str);
	
		//Car01 클래스의 필드를 모두 가져와서 써보자
		Car01 tCar = new Car01();
		System.out.println(tCar.aiGet);
		System.out.println(tCar.boot);
		System.out.println(tCar.brand);
		System.out.println(tCar.color);
		System.out.println(tCar.feulEfficiency);
		System.out.println(tCar.maxspeed);
		System.out.println(tCar.navi);
		System.out.println(tCar.rpm);
		System.out.println(tCar.speed);
		
	}

}
