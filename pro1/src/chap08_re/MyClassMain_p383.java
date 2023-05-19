package chap08_re;
//p383 - 인터페이스를 사용해보자!
public class MyClassMain_p383 {

	public static void main(String[] args) {
	MyClass_p382 mc1 = new MyClass_p382();
	mc1.rc.machineStart(); // mc1의 필드 rc에서 machineStart를 호출!
	System.out.println("===================");
	}
	RemoteControl a;
	MyClass_p382 mc2 = new MyClass_p382(a);
	MyClass_p382 mc3 = new MyClass_p382();
	
	
}
