package chap09_self;

public class Outter {
	//자바 7 이전은 final을 붙인여서 이야기하자.
	
	public void method1(final int arg) {
		int localVariable=1; // 내부클래스에서 쓰이는 변수는 말하지 않아도 fianl 처리된다고 생각하자.
//		arg=100; // final 처리된 매개변수는 값을 바꿀수 없다!
//		localVariable=100;
		
		class Inner{
			public void method() {
				int result = arg + localVariable; // 에러 발생 이유: 내부클래스에서 외부클래스 변수를 사용하고 싶으면 final 선언된것만..!
			}
		}
	}
}
