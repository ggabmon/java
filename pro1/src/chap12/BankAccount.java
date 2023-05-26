package chap12;

public class BankAccount {
	//필드
	
	private int balance;
	
	//생성자
	public BankAccount(int balance) {
		this.balance=balance;
	}

	
	
	
	
	//메서드
//	
//	 sync 	입금deposit
	public synchronized void deposit(int amount){
		
		balance += amount;
		System.out.println(amount+"원이 입금되었습니다.");
		System.out.println("현재 잔액>"+balance);
	}
	
//	 sync	출금 withdraw
	public synchronized void withdraw(int amount){
		if(balance - amount<0) {
			System.out.println("금액부족 인출불가");
		}else {
		balance -= amount;
		System.out.println(amount+"원이 출금되었습니다.");
		System.out.println("현재 잔액>"+balance);
		}
	}
	
//	 sync	get잔액
	public synchronized int getBalance() {
		return balance;
	}
//	
}
