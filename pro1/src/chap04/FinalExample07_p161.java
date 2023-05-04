package chap04;

import java.util.Scanner;

public class FinalExample07_p161 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner input = new Scanner(System.in);
		
		while(run){
			System.out.println("-----------------------------");
			System.out.println("1. 예금 | 2. 출금|3. 잔고|4. 종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int select = Integer.parseInt(input.nextLine());
			switch(select) {
			case 1:
				System.out.print("예금액>");
				balance += Integer.parseInt(input.nextLine());
				break;
			case 2:
				System.out.print("출금액>");
				balance -= Integer.parseInt(input.nextLine());
				break;
			case 3:
				System.out.println("잔고>"+balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다");
				
			}
			if(select==4) break;
		}
		input.close();
	}

}
