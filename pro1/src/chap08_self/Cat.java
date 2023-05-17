package chap08_self;

public class Cat implements Soundable{
	
	@Override
	public String Sound() {
		Soundable sound = new Cat();
		return "야옹";
	}
}
