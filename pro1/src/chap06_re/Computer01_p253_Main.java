package chap06_re;

//이 클래스는 Computer01_p253클래스의 실행클래스이다
public class Computer01_p253_Main {

	public static void main(String[] args) {
		//Computer01_p253클래스의 객체생성
		Computer01_p253 com1 = new Computer01_p253();
		
		//Computer01_p253클래스의 add메서드 콜
		//int r0 = com1.add(10);//에러발생
		//The method add(int, int) in the type Computer01_p253 is not applicable for the arguments (int)
		//=>메서드의 매개변수의 개수가 일치해야 한다
		
		//int r0 = com1.add(30.14, 100);//에러발생
		//The method add(int, int) in the type Computer01_p253 is not applicable for the arguments (double, int)
		//해결방법=>메서드의 매개변수의 타입과 일치해야 한다
		
		//int r0 = com1.add(30, 100);//에러발생
		//에러발생이유 :The method add(int, byte) in the type Computer01_p253 is not applicable for the arguments (int, int)
		//해결방법=>메서드의 매개변수의 타입과 일치해야 한다
		//코드화   =>int r0 = com1.add(30,(byte)100);
		
		int r0 = com1.add(10, 90);
		System.out.println("add(10, 90)의 결과="+r0);
		
		//Computer01_p253클래스의 sum2()호출
		//2개의 값을 제시한 경우
		r0 = com1.sum2(10, 90);
		System.out.println("sum2(10, 90)의 결과="+r0);
		
		//3개의 값을 제시한 경우
		r0 = com1.sum2(10, 90, 100);
		System.out.println("sum2(10, 90, 100)의 결과="+r0);
		
		//5개의 값을 제시한 경우
		//=>sum2()는 가변인자배열로 선언되었기에 n개의 값을 제시할 수 있다
		r0 = com1.sum2(10, 90, 100,1,2,3);
		System.out.println("sum2(10, 90, 100,1,2,3)의 결과="+r0);
		
		System.out.println("-------------");
		System.out.println();
		int[] arr = new int[] {10,90};
		System.out.println("-아래는 int[]배열");
		r0 = com1.sum1(arr); //10, 90
		//The method sum1(int[]) in the type Computer01_p253 is not applicable for the arguments (int, int)		
		System.out.println("sum1(10, 90)의 결과="+r0);
		arr[2] = 100;
		//3개의 값을 제시한 경우
		r0 = com1.sum1(arr); // 10,90,100
		System.out.println("sum1(10, 90, 100)의 결과="+r0);
		arr[3]=1;
		arr[4]=2;
		arr[5]=3;
		//5개의 값을 제시한 경우
		//=>sum2()는 가변인자배열로 선언되었기에 n개의 값을 제시할 수 있다
		r0 = com1.sum1(arr); // 10 ,90 ,100 ,1 ,2, 3
		System.out.println("sum1(10, 90, 100,1,2,3)의 결과="+r0);
	}

}









