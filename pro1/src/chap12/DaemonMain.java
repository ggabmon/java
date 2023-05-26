package chap12;

public class DaemonMain {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작합니다");
		
		AutoSaveThread asthread = new AutoSaveThread();
		asthread.setDaemon(true);
		asthread.start();
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("워드작업 끝");
		System.out.println("메인 스레드 종료합니다.");
	}
}
