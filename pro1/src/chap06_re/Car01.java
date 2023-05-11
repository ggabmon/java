package chap06_re;
//이 아래에 있는 pulic 또한 접근제어자 이다.
/* 	★field : data 보관 생성 등등.. 명사적형태의 것들. DB의 column과 동일하게 생각하자.
	>문법
 	[접근제어자] [제어자] 타입 필드명[=초기값(생략가능)];
	[AccessModifier] [Modifier] Type FieldName [];
	>>내부에서 제시
	
	★constructor(생성자) : ▼객체를 생성해준다▼ 필드값의 초기화를 위해 주로 사용된다.
	>문법
	[접근제어자] 클래스명(매개변수리스트){}
	[Access] ClassName(parameterlist){}
	>>외부에서 제시
	
	★method : 기능과 동작을 표현 동사적형태의 것들
	>문법
	[접근제어자] [제어자] 리턴유형 메서드명(매개변수리스트){}
	[AccessModifier] [Modifier] ReturnType MethodName(parameterlist) [];
*/

public class Car01 {
	//field 선언하기
					//	>문법
					// 	[접근제어자] [제어자] 타입 필드명[=초기값(생략가능)];
					//	자주사용하는것 일수록 위로 두는것이 관례
					// 고유데이터
	private String color = "red";		//	색상 
	//접근제어자 추가! 
	private int rpm = 10000;			//	RPM
	private String brand = "볼보";		//	브랜드
	private double feulEfficiency = 10.5;	//	연비
	boolean navi = true;		//	네비게이션유무
	char aiGet= 'Y';			//	AI탑재유무
					// 상태데이터 
	int speed =0;			//	현재속도  
	int maxspeed=300;		//	최대속도
	boolean boot = false;
					// 부품데이터
	
	
					//행동 제어 메소드
	void powerOn() {
		System.out.println("시동을 겁니다.");
		boot = !boot;
	} 		// 전원 켜기 
	void powerOff() {
		System.out.println("시동을 끕니다.");
		boot = !boot;
	} 		// 전원 끄기
	
	
	public String getBrand() {
		return brand;
	}//private으로 막혀있는 brand를 같은 class내에서 getBrand라는 method가 호출했을때엔 막혀있지 않아 다른 클래스에서 사용이 가능하게 해준다.
	
	//필드의 값을 외부에 제공하는 getter method를 선언해보자.
	// 하나하나 다 만들어야한다.... 굳이해야하나?
	public String getcolor() {
		return color;
	}
	
	
}
