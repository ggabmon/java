package chap06_re;

public class MachineExample {

	public static void main(String[] args) {
		HandPhone fold4 = new HandPhone("삼성", 220701, true, "검은색");
		HandPhone iPhone10 = new HandPhone("애플", 211001, true, "흰색");
		System.out.println(fold4.brand);
		
		iPhone10.volumeUp(5);
		
		
		HandPhone noPhone = new HandPhone();
		System.out.println(noPhone.brand);
		noPhone.brand="구글";
		System.out.println(noPhone.brand);
		
		fold4.call();
		fold4.messageIn();
		fold4.volumeUp(5);
		noPhone.powerOn();
		System.out.println(noPhone.power);
	}

}
