package chap12;
// 이러한 것들은 서로 스레드끼리 영향을 주면 큰일나니까 만들어보는연습임 ㅎㅎ


public class BankSystem {
	public static void main(String[] args) {
		//계좌생성
		BankAccount account = new BankAccount(1000);
		
		//입금 thread 
		Thread deposit1 = new Thread(new DepositTask(account));
		Thread deposit2 = new Thread(() -> {
			account.deposit(500);
		});
		deposit1.start();
		deposit2.start();
		//출금 thread
		Thread withdraw1 = new Thread(new WithdrawlTask(account));
		withdraw1.start();
		Thread withdraw2 = new Thread(() ->  {
			account.withdraw(20);
		});
		withdraw2.start();
		//잔액조회 thread
		Thread balance1 = new Thread(new BalanceTask(account));
		balance1.start();
		Thread balance2 = new Thread(() ->  {
			System.out.println("잔액은>"+account.getBalance() );
		});
		balance2.start();
		
		System.out.println("");
		
		//메서드로 실행해볼것
		//입금
		account.deposit(500);		
		//출금
		account.withdraw(100000);
		//잔액조회
		System.out.println(account.getBalance());
		
//		입금T.start
//		출금T.start
//		잔액조회T.start
		
	}
}
