package chap08_self;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)-----------------------");
		
		MyClass class1 = new MyClass();
		class1.rc.turnOn();
		class1.rc.setVolume(5);
		System.out.println("2)-----------------------");
		
		MyClass class2 = new MyClass(new Audio());
				
		System.out.println("3)-----------------------");
		
		MyClass class3 = new MyClass();
		class3.methodA();
		
		
		System.out.println("4)-----------------------");
		MyClass class4 = new MyClass();
		class4.methodB(new Television());
	}

}
