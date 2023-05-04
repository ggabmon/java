package selfstudying;

import java.util.Scanner;

public class HolJjakGamePractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
	
		int rannum;
	 	rannum = (int)(Math.random()*2);
	 	
	 	System.out.println("내숫자 : "+num%2);
	 	System.out.println("컴퓨터의숫자 : "+rannum);
	 	
	 	if(num%2 == rannum%2) System.out.println("내가 이겼다!");
	 	else System.out.println("내가 졌다!");
	 input.close();
		

	}

}
