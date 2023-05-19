package chap08_re;

public class Machine2 implements RemoteControl, Searchable{
	@Override
	public void search() {
 		
	}
	@Override
	public void machineStart() {}
	public void machineOff() {}
	public void setDifficulty() {
		
		
	RemoteControl rc;	//인터페이스 필드 생성
	rc = new Machine2();//인터페이스 필드에 클래스객체 생성하여 대입
	rc.machineStart();
	
	Searchable s;
	s = new Machine2();
	s.search();
	
	
	
	}
	
	
	
	
}
