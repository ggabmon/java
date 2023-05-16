package chap07_self;

public class Cat extends Animal{
	public Cat() {
		this.kind="고양이과";
	}
	
	@Override
	public void sound() {
		System.out.println("야아ㅏㅏㅏㅏㅏㅏㅏ옹");
	}
}
