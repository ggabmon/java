package chap12;

public class ThreadB {

	public static void main(String[] args) {
		ThreadB ta = new ThreadA();
		System.out.println("스레드이름은 ");
		ThreadB ta2 = new ThreadB();
		System.out.println();
		ThreadB ta3 = new ThreadB();
		System.out.println();
	}

}
