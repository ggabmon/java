package chap07_re;

public class KiaTire extends Tire{
	KiaTire(int currentRotation){
		super(currentRotation);
		this.currentRotation=currentRotation;
	}
	
	@Override
	boolean roll() {
		if(currentRotation+1 < maxRotation) {
			System.out.println("Kia바퀴를 굴렸습니다.");
			System.out.println("현재 사용 바퀴수:"+currentRotation);
			currentRotation++;
			return true;
		}else if(currentRotation+1==maxRotation) {
			System.out.println("한바퀴 더 가면 Kia바퀴 교체");
			System.out.println("현재 사용 바퀴수:"+currentRotation);
			currentRotation++;
			return true;
		}else {
			System.out.println("Kia바퀴 폭파!");
			System.out.println("Kia바퀴를 교체해주세요");
			return false;
		}
	}
}