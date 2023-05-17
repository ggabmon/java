package chap08_self;

public class Television implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켰습니다.");
	}
	public void turnOff() {
		System.out.println("TV를 껐습니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV의 볼륨 :"+this.volume);
	}
}
