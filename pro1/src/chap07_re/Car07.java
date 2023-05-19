package chap07_re;

public class Car07 {
	//필드
	int price = 10;
	String company = "중현자동차 ^^"; 
	
	Tire fl = new KumhoTire(3);
	Tire fr = new KumhoTire(2);
	Tire bl = new KiaTire(1);
	Tire br = new KiaTire(0);
	
	//생성자
	Car07(){
		System.out.println("Car07을 제작했습니다.");
	}
	
	//메서드
	int run(){
		if(fl.roll()==false) {System.out.println("앞좌 타이어 교체해");return 1;}
		if(fr.roll()==false) {System.out.println("앞우 타이어 교체해");return 2;}
		if(bl.roll()==false) {System.out.println("뒤좌 타이어 교체해");return 3;}
		if(br.roll()==false) {System.out.println("뒤우 타이어 교체해");return 4;}
		System.out.println("");
		return 0;
	}
	
	void setTire(Tire tire,int currentRotation) {
		System.out.println(tire+"위치의 타이어 마모수를"+currentRotation+"으로 고침");
		tire.currentRotation= currentRotation;
	}
	
}
