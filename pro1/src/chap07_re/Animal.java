package chap07_re;

/* 추상클래스
abstract 제어자를 사용하여 선언한다.
필드, 일반메서드, abstract 메서드를 가질 수 있다.
다른 클래스에서 상속이 가능하나 단일 상속만 가능하다.
생성자가 있다 but 직접 호출할수 없다. > 하위클래스에서만 호출이 가능하다.
하위 클래스에서 필요한부분만 오버라이딩하여 선택적 사용가능
클래스의 확장을 위해서 쓰인다.
클래스이므로 단일상속만 된다고 생각하자.
	
	
	인터페이스
interface 사용하여 선언
상수, abstract 메서드를 가진다. (일반필드, 일반메서드 XXXXX)
실제 구현/동작 되는 클래스가 존재한다
생성자가 없다.
구현클래스에서 반드시 오버라이딩을 해야만한다.
구현이 주된목적이다.
다중상속 허용한다 (클래스가 아니니까)

*/
public abstract class Animal {
	Animal(){
		System.out.println("Animal() 생성자");
	}
	public String kind;
	public abstract void sound();
	public abstract void breath();
}
