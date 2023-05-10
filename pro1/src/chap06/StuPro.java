package chap06;

public class StuPro {
	int mathSco;
	int korSco;
	int engSco;
	boolean todayCheck;
	String name = "김중앙" ;
	
	double MathGiveupAvg() {
		double avg = ((double)korSco + engSco)/2;
		return avg;
	}
	double totalAvg() {
		double avg = ((double)korSco + engSco+ mathSco)/3;
		return avg;
	}
	void callName() {
		System.out.println("출석을 부르겠습니다.");
		System.out.println(name);
		if(todayCheck==true) {System.out.println("네");return;}
		System.out.println("자리에 없으니 결석처리하겠습니다.");
		return;
	}
}
	
	
	
	
	
	
	

