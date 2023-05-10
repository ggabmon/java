package chap06;

public class AdCal {
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double result = plus(x,y)/(double)2;
		return result;
	}
	
	void execute() {
		double result = avg(7,19);
		System.out.println("실행결과는 "+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
