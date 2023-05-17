package chap08_self;

public interface RemoteControl {
	
	//상수필드 선언.. 인터페이스는 객체생성안되니 생성자도 못씀 따라서 변수 X
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//메소드 선언.. 위와같은이유로 추상메소드만 선언가능 추상메소드를 구현해줄 친구를 만들자
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
