package chap09_self;

public class AMain {

	public static void main(String[] args) {
		A a = new A();
		
//		인스턴스 멤버클래스 객체 생성
		A.B b = a.new B(); //a라는 객체가 있기때문에 만들수있따!
		b.field1 = 3;
		b.method1();
		
//		정적멤버 클래스 객체 생성
		A.C c= new A.C(); // A를 만들어서 만들어진 것이 아니다.. 한방에 만들수잇다!
		c.field3 = 3;
		c.method3();
		
		c.field4 = 3;
		c.method4();
		
		a.method(); 
		
		

	}

}
