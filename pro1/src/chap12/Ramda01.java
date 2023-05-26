package chap12;

/*
	Ramda식(Ramda Expression)
	JAVA8에서 도입.
	함수형 프로그래밍 개념
	익명 함수를 생성하기 위해 간결한 표현방법
	
	작업스레드 객체생성
	public class 작업Thread extends Thread{
		@Override
		public void run(){스레드 실행코드}
	}
	Thread thread = new 작업Thread();
	>>메서드 선언 후 스레드 객체를 생성하는 것과
	
	
	Thread를 익명객체 스타일로 작업스레드 객체생성
	Thread thread = new Thread(){
		public void run(){스레드 실행코드;}
	}
	>>스레드 객체를 선언하면서 바로 메소드를 진행했다.
*/
/*
	Runnable 인터페이스를 구현한 익명 Thread 클래스 객체 생성
	Thread thread = new Thread(new Runnable){
		@Override
		public void run(){스레드 실행 코드;}
	}



*/
/*
	람다식을 구현해보자.
	Thread thread = new Thread(
	() -> {람다식 실행코드}
	);
	
	함수형인터페이스는 단 하나의 추상메서드를 가진 인터페이스
	=>Runnable인터페이스
	=>@FunctionalInterface으로 선언
	
	스레드를 사용하는 프로그램, 이벤트 처리
	
*/
public class Ramda01 {
	Thread thread = new Thread(new Runnable(){
		@Override
		public void run() {
			System.out.println("출력해용");
		}
	});

	
	Thread thread1 = new Thread( () -> {System.out.println("출력해용"); }) ;


	
}


	