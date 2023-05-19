package chap08_re;

import java.math.*;
import java.util.Scanner;

public class Machine1 implements RemoteControl, Searchable{
	private int difficulty; // 다른 클래스에서 이건 건드리지 못하게 하자!
	@Override
	public void machineStart() {
		this.difficulty = 3;
		System.out.println("Good morning");
		System.out.println("");
	}
	
	@Override
	public void machineOff() {
		System.out.println("기계를 끕니다.");
		System.out.println("안녕히가세요");
	}
	
	void showDifficulty() {
		System.out.println("현재난이도는 "+ this.difficulty+"입니다");
	}
	@Override	
	public void setDifficulty() {
		System.out.print("난이도를 입력하세요 >");
		Scanner inputDifficulty = new Scanner(System.in);
		this.difficulty = inputDifficulty.nextInt();
		System.out.println("난이도가"+this.difficulty+"로 설정되었습니다.");
		System.out.println("");

	}
	
	public void search() {
		
	}
	
	public void playGame() {
		
		int randNum = (int)(Math.random()*RemoteControl.MAX_VALUE)+1;
		System.out.println(randNum);
		if(randNum==RemoteControl.MAX_VALUE){
			System.out.println("대박!");
		}else if(randNum==RemoteControl.MIN_VALUE) {
			System.out.println("운이 없으시네요");
		}else if(randNum>=difficulty) {
			System.out.println("당신이 이겼습니다!");
		}else {
			System.out.println("당신이 졌습니다!");
		}
	}
	int CoinCount;
	public void insertCoin() {
		Scanner inputCoin = new Scanner(System.in);
		System.out.print("동전의 개수를 입력하세요>");
		int Coin = inputCoin.nextInt();
		System.out.println("Coin = "+Coin);
		
		for(int i=0;i<Coin;i++) {
			this.playGame();
		}
	}


	
}
