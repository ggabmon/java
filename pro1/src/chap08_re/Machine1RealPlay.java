package chap08_re;

public class Machine1RealPlay {

	public static void main(String[] args) {
		Machine1 mac1 = new Machine1();
		RemoteControl rc;
		rc = new Machine1();
		
		mac1.machineStart();
		mac1.showDifficulty();
		mac1.setDifficulty();
		mac1.showDifficulty();
		mac1.insertCoin();
		mac1.machineOff();
		
		rc.machineStart();
		rc.setDifficulty();
		
	}

}
