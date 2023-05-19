package chap07_re;

public class Tire {
	int maxRotation = 10;
	int currentRotation;
	Tire(int currentRotation){}
	boolean roll() {
		if(currentRotation+1 < maxRotation) {
			System.out.println("바퀴를 굴렸습니다.");
			System.out.println("현재 사용 바퀴수:"+currentRotation);
			currentRotation++;
			
			return true;
		}else if(currentRotation+1==maxRotation) {
			System.out.println("한바퀴 더 가면 바퀴 교체");
			System.out.println("현재 사용 바퀴수:"+currentRotation);
			currentRotation++;
			return true;
		}else {
			System.out.println("바퀴 폭파!");
			System.out.println("바퀴를 교체해주세요");
			return false;
		}
	}
}
