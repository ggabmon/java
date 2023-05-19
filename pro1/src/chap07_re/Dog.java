package chap07_re;

public class Dog extends Animal{
	Dog(){
		System.out.println("Dog() 생성자");
		this.kind = "포유류";
	}
	@Override
	public void sound(){
		System.out.println("개가 왈왈");
	}
	public void breath() {
		System.out.println("개가 숨쉰다");
	}
}
