package chap12;

/*
p531
스레드의 이름 출력 및 UserThread 생성 및 시작
Thread.currentThread();
참조변수.setName("쓰레드이름")	:쓰레드에 이름설정
참조변수.getName()				:쓰레드 이름 가져오기

*/
public class ThreadName_p531 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("현재 스레드 이름:"+mainThread.getName());
		mainThread.setName("바보");
		System.out.println("현재 스레드 이름:"+mainThread.getName());
	}

}
