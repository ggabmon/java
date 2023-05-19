package chap09_self;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony  = new Anonymous();
		
		anony.Field.wake();
		
		anony.method1();
		
		anony.method2( 
				new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
				}
				
		);
	}

}
