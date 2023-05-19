package chap08_re;

/*
클래스 선언시
인터페이스는 클래스의 필드에
생성자의 매개변수, 생성자의 지역변수
메서드의 매개변수, 메서드의 지역변수
로 선언할 수 있다.

무슨말인지 알아보자
*/
public class MyClass_p382 {
	//필드
	RemoteControl rc = new Machine1();
	
//	//기본생성자
//	MyClass_p382(){}
//	MyClass_p382(){
//		System.out.println("생성자없음");
//		rc.machineStart();
//		rc.machineOff();
//	}
	//매개변수 1 생성자
	MyClass_p382(){
		RemoteControl rc = new Machine1();
		System.out.println("생성자없음");
		rc.machineStart();
		rc.machineOff();
		
	}
	//생성자의 매개변수에 선언된 인터페이스
	MyClass_p382(RemoteControl rc1){
		this.rc=rc1;
		rc1 = new Machine1();
		rc1.machineStart();
		rc1.machineOff();
	}

	//메서드
	void test1(RemoteControl remotecontrol){
		this.rc = remotecontrol;
		rc.machineStart();
		rc.machineOff();
	}
	void test2(RemoteControl remotecontrol){
		this.rc = remotecontrol;
		rc.machineStart();
		rc.machineOff();
	}
}
