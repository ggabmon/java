package chap07_re;
// Animal 의 실행 클래스
// Aniaml 의 하위클래스를 사용한다.
public class AnimalMain {

	public static void main(String[] args) {
		Cat cat = new Cat();
		//부모클래스 객체가 먼저 생성 된후 해당객체가 생성되는것을 콘솔에서확인가능
		// 내부적으로 super(); 가 존재한다고 생각하자. 아무것도 없으면 무조건 빈 생성자 먼저 부른다
		cat.breath();
		cat.sound();
		Dog dog = new Dog();
		dog.breath();
		dog.sound();
		// 동일하게 애니멀 먼저 생성
	}

}
