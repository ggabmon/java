package chap07_self;

public class AnimalExample {

	public static void main(String[] args) {
		Dog haneul = new Dog();
		Cat himChan = new Cat();
		haneul.sound();
		himChan.sound();
		System.out.println("-----------절취선-------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("-----------절취선-------------");

		animalSound(new Dog());
		animalSound(new Cat());
	}
		public static void animalSound(Animal animal) {
			animal.sound();
		}
}


