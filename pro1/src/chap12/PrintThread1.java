package chap12;

public class PrintThread1 extends Thread {
	private boolean stop = false;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
			try {
				while(true) {
				System.out.println("run이 실행중이에요...");
				Thread.sleep(1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();		//돌아다닌 경로를 추척해서 출력해라
			
		}
		System.out.println("자원을 정리하겠습니다.");
		System.out.println("실행종료!");
	}
	
	
}
