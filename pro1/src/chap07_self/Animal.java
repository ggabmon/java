package chap07_self;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("후하후하");
	}

	public abstract void sound();
}
