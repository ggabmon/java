package chap07_self;

public class Dog extends Animal{
	public Dog() {
		this.kind ="개과";
	}
	
	@Override
	public void sound() {
		System.out.println("컹컹ㅋ어컹");
	}
}
