package cahp11;


import java.text.SimpleDateFormat;
import java.util.Date; // java 상위패키지의 util 하위 패키지의 Date 클래스이다.
	//Date클래스(p514): 객체 간의 날짜 정보를 주고 받을 때, 매개변수, 리턴타입으로 
public class Date_p514 {
	//Date 클래스에 대해 알아보자.
	

	
	public static void main(String[] args) {
		Date today = new Date();

		System.out.println(today);//패.클명@16해시코드 이어야하는데 왜 날짜가??
		System.out.println(today.toString());
		//today에서 자동으로 toString이라는 메소드를 자동으로 호출한다.
		// Mon May 15 12:31:33 KST 2023 출력
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy냔 MM월 dd일");
		String showToday =sdf.format(today);
		System.out.println(showToday);

	}
}
