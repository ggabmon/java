package chap06_re;

public class HandPhone extends Machine {
	int volume =0;
	
	public HandPhone() {
		
	}	
	public HandPhone(String brand, int productionDay, boolean power, String color) {
		this.brand=brand;
		this.productionDay=productionDay;
		this.power=power;
		this.color=color;
	}
	public void call() {
		System.out.println("전화를 겁니다~");
	}
	public void messageIn() {
		System.out.println("메세지가 왔습니다.");
	}
	public void messageSend() {
		System.out.println("메세지를 전송했습니다.");
	}
	public void volumeUp(int i) {
		volume += i;
		System.out.println("현재볼륨은 "+volume);
	}
	public void volumeDown(int i) {
		volume -= i;
		System.out.println("현재볼륨은 "+volume);
	}
}
