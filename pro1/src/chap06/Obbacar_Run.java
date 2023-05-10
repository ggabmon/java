package chap06;

public class Obbacar_Run {

	public static void main(String[] args) {
		ObbaCar car = new ObbaCar(); // 기본생성자로 객체를 초기화시켜준다.
		
		car.setGas(10); // car객체에서 setGas 메소드를 이용하여 int타입인 gas를 10으로 수정한다.
		boolean gasState = car.isLeftGas();
		
		car.run();
		
		if(gasState) {
			System.out.println("gas가 남아있네요");
		}else {
			System.out.println("오링");
		}

	}

}
