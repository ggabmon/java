package chap06_re;

public class Static_p277 {
	//필드
	String f1="인스턴스필드";//인스턴스필드,전역변수
	static String f2="정적필드";//정적필드(static필드),전역변수
	
	void m1() {
		this.f1="m1()메서드에서접근";
		this.f2="m1()메서드에서접근";
		f2="m1()메서드에서접근";
	}
	
	static void m2() {
		//this.f1="m2()메서드에서접근";//에러발생
		//Cannot use this in a static context
		System.out.println("static m2()에 진입");
		f2="m2()메서드에서접근";
	}
	
	public static void main(String[] args) {
		Static_p277 r = new Static_p277();
		r.m1(); // 객체를 만들경우엔 접근이 가능하다.
		r.f1="내가 접근했따";
		System.out.println(r.f1);
		System.out.println("원래 뭐라 r객체의 f2는 뭘까"+r.f2);
		r.f2="변경하기전에 내가 하는말";
		System.out.println(r.f2);
		m2();
		System.out.println(r.f2);
		

		
//		f1();//f1필드접근 >> 접근불가
//		f2();//f2필드접근
//		m1();//m1(호출)
//		m2();//m2(호출) 가능
	}
}







