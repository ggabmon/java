package chap07_re;

public class CarRunningSimulation {

	public static void main(String[] args) {
		Car07 mycar = new Car07();
		
		mycar.setTire(mycar.br , 1);
		
		
		for(int i=0;i<20;i++) {
			int proNum = mycar.run();
			switch(proNum){
			case 1:
				System.out.println("앞좌타이어를 교체합니다.");
				mycar.fl = new KumhoTire(0);
				System.out.println("새 금호타이어로 앞좌타이어를 교체");
				break;
			case 2:
				System.out.println("앞우타이어를 교체합니다.");
				mycar.fr = new Tire(0);
				System.out.println("새 타이어로 앞우타이어를 교체");
				break;
			case 3:
				System.out.println("뒤좌타이어를 교체합니다.");
				mycar.bl = new KiaTire(0);
				System.out.println("새 기아타이어로 뒤좌타이어를 교체");
				break;
			case 4:
				System.out.println("뒤우타이어를 교체합니다.");
				mycar.br = new Tire(0);
				System.out.println("새 타이어로 뒤우타이어를 교체");
				break;
			}
			System.out.println("");
			}
		}
	}



