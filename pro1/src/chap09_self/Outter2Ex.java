package chap09_self;

public class Outter2Ex {

	public static void main(String[] args) {
		Outter2 outter = new Outter2();
		Outter2.Nested nested = outter.new Nested();
		
		nested.print();
	}

}
