package chap06;

public class ObbaCar {
	int gas;
	
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("(달립니다. 현재 gas의 잔량은 : "+gas+ ")");
			gas -=1;
			} else {
				System.out.println("멈춥니다. gas가 떨어졌습니다.");
				return; //run 메소드를 마무리한다.
			}
		}
	}
	
}
