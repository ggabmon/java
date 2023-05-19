package chap08_self;

public class Example {

	public static void main(String[] args) {
		ImplementationC ex = new ImplementationC();
		
		InterA iA = ex;
		iA.methodA();
		
		InterB iB = ex;
		iB.methodB();
		
		InterC iC = ex;
		iC.methodA();
		iC.methodB();
		iC.methodC();
	}

}
