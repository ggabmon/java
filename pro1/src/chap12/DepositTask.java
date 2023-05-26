package chap12;
//출금업무
public class DepositTask implements Runnable {
	//필드
	private BankAccount account;
	
	//생성자
	DepositTask(BankAccount account){
		this.account=account;
	}
	
	//메서드
		
	@Override // 추상에서 받기때문에 메서드에 파라미터도 없다
	public synchronized void run() {
		account.deposit(10000);
		
	}

}
