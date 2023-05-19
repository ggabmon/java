package chap09_self;

public class Outter2 {
	String Field = "아우터2 필드에요";
	void method() {
		System.out.println("아우터2 메소드에요");
	}
	
	class Nested{
		String field = "네스티드 필드에요";
		void method() {
			System.out.println("네스티드 메소드");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter2.this.Field);
			Outter2.this.method();
			
		}	
		
	}
}
