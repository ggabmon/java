package chap07_re;

public class Cat extends Animal {
	Cat(){
		System.out.println("Cat() 생성자");
		this.kind = "포유류";
	}
	@Override
	public void sound(){
		System.out.println("고양이가 야옹");
	}
	public void breath() {
		System.out.println("고양이가 숨쉰다");
	}
}
