package chap12;
//메인 스레드와 작업스레드가 동시에 실행되게 하는것
public class BeepPrintMain2 extends Thread{
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		
		Thread thread = new Thread(beepTask);
		thread.run();
		
		
		
		for(int i=0;i<6;i++) {
			
		}
	}
	
}
