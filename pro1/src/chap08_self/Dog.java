package chap08_self;

public class Dog implements Soundable{

	@Override
	public String Sound() {
		Soundable sound = new Dog();
		return "멍멍";
	}
}
