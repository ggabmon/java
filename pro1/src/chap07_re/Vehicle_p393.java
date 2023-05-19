package chap07_re;

public interface Vehicle_p393 {
	
	// 인터페이스 필드 선언해보기
	int a = 0;
	
	
	// 이 필드의 값은 상수값을 필요로한다.
	// ※ static final > 상수를 선언하는 방식
	// 이유 : 전역변수이자 final 이므로 모든곳에서 동일하게 쓰이기 때문!
	// 인터페이스는 상수값만을 필드로 갖기 때문에 static final의 성질이 말하지 않아도 쓰인다!
}
