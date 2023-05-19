package chap08_re;
//p372
public interface RemoteControl {
	//필드
	//[public] [static final] 상수필드 = 초기값;
						int	MAX_VALUE = 10 ; // 최대값 10
	public static final int MIN_VALUE = 1 ; // 최소값 0
	//둘다 동일한 효과를 가져요~
	
	
	//생성자 없음!!!!!!!!!!!!!!!!!!!
	
	//메서드
	//[public] [abstract] 리턴유형 메서드(파라미터);
	//추상이니까 절대로 실행부 넣지 말것!!!!!!!!!!!!!!
	public void machineStart();
	public void machineOff();
	public abstract void setDifficulty();
	
}
