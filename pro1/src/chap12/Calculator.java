package chap12;

public class Calculator {
	private int memory;
	private int time;
	
	
	public int getMemory() {
		return memory;
	}
	
	public void pause(int time) {
		try {Thread.sleep(this.time);}
		catch(InterruptedException e) {}
	}

	/*	
		※동기화된 메서드
		동기화된 메서드는 메서드 전체 내용이 임계 영역이므로
		스레드가 동기화 메서드를 실행하는 즉시 객체에 잠금이 일어나고
		스레드가 동기화메서드를 종료하면 잠금이 풀린다.
		
		※임계영역(Critical Section)
		멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역을 말한다.
		자바에서는 임계영역을 지정하기 위해서 동기화(Synchronized)메서드를 제공한다.
		*/
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
}
