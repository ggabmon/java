package chap07_re;

//this :  해당클래스의 객체주소가 저장된 참조변수
//this(): (동일클래스내의) 다른 생성자 호출
//반드시 생성자 내의 첫번째 줄에서 호출해야한다.

//super : 해당 클래스의 상위클래스의 객체주소가 저장된 참조변수
//super() : 해당 클래스의 상위클래스의 생성자를 호출한다.

class GrandMom {
	int a;
	GrandMom(){
		System.out.println("GrandMom() 기본생성자 호출했음");
	}
	GrandMom(int a){
		System.out.println("GrandMom(int a) 생성자 호출했음.");
	}
	void run() {
		System.out.println("할머님달리신다");
	}
}  

class Mom extends GrandMom{
	Mom(){
		System.out.println("Mom() 기본생성자 호출했음");
		
	}
	Mom(int a){
		super();
		System.out.println("Mom(int a) 생성자 호출했음");
	}
	void run() {
		System.out.println("엄마달린다");
	}

}

class Kid extends Mom {
	Kid(){
		super(); // 명시적으로 부모의 Field를 불러와주는 것 ※생성자내에서 부를경우 유효하다. ※super는 생성자이기때문에 제일 처음에 나와야한다.
		System.out.println("Kid() 기본생성자 호출했음");
	}
	Kid(int a){
		super();
		System.out.println("Kid(int a) 기본생성자 호출했음");
	}
	void run() {
		System.out.println("아이달린다");
	}
//	void kidMethod() {super;} // ※메서드내에서 super를 부르는 것은 의미가 없다. super는 생성자를 불러오는것인데..

}






public class Super_p248 {
	public static void main(String[] args) {
		Kid kid1 = new Kid(5);
		kid1.run();
		
		GrandMom GM1 = new GrandMom();
		GM1.run();
		
	}
}
