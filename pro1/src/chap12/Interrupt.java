package chap12;

public class Interrupt {

	public static void main(String[] args) {
		PrintThread1 thread = new PrintThread1();
		
		thread.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();//스레드 종료
		
	}

}
