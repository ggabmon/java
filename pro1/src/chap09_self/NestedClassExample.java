package chap09_self;

public class NestedClassExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		Car.Tire tire = mycar.new Tire();
				// 인스턴스멤버는 생성된 객체를 이용하자.
		Car.Engine engine = new Car.Engine();		
				// 정적멤버는 그냥 새로 만들자
	}

}
