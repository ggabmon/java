package chap07_self;

public class PhoneExample {

	public static void main(String[] args) {
		//추상 클래스의 실체클래스는 생성자로 객체 생성가능
		//추상 클래스는 호출하여 객체 만들려고 해도 안된다..
		SmartPhone fold4 = new SmartPhone("조중현");
		
		fold4.turnOn();
		fold4.internetSearch();
		fold4.turnOff();

	}

}
