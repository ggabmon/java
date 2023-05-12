package chap06_re;

//p253 실습예제_ 매개변수의 개수를 모를 경우
//[접근제어자] [제어자] class 클래스명{
public class Computer01_p253 {
	//field :data(명사적형태)
	//[접근제어자] [제어자] 타입 필드명[=초기화];
	
	//constructor(생성자):객체생성.필드초기화 주로 사용
	//[접근제어자] 클래스명(매개변수리스트){}
	
	//method:기능.동작(동사적형태)
	//[접근제어자] [제어자] 리턴유형   메서드명(매개변수리스트){}
	  //add(10, 90)
	int add(int a, int b){
		return a+b;  //10+90
	}
	
	int  sum1(int[] values){
		int sum = 0;
		for(int i=0; i<values.length ;i++) {
			sum=sum+values[i];
			//sum+=values[i];
		}
		return sum;
	}

	//가변인자배열로 선언
	//문법> 타입 ... 매개변수
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length ;i++) {
			sum=sum+values[i];
			//sum+=values[i];
		}
		return sum;
	}
}












