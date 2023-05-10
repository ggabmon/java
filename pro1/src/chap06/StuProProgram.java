package chap06;

import java.util.Scanner;

public class StuProProgram {

		public static void main(String[] args) {
			System.out.println("출석과 점수 확인 프로그램입니다.");
			StuPro stu01 = new StuPro();
			Scanner input = new Scanner(System.in);
			while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.이름과 출석 | 2. 점수입력 | 3. 평균확인 | 4. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("메뉴를 선택하세요>");
			int switchNum = input.nextInt();
			switch(switchNum) {
				case 1:	
						System.out.print("학생의 이름을 입력하세요> ");
						input.nextLine( );
						stu01.name = input.nextLine();
						System.out.println("");
						System.out.println("학생의 이름은 "+stu01.name);
						System.out.println("학생에게 출석을 부르세요");
						while (true) {
							System.out.print("출석을했다면 1, 결석이라면 2를 입력하세요> ");
							int response = input.nextInt();
							if(response==1) {stu01.todayCheck=true; break;}
							else if(response==2) {stu01.todayCheck=false; break;}
							else {System.out.println("잘못된 입력입니다."); break;}
						}
						stu01.callName();
						break;
				case 2:
						System.out.print("수학점수를 입력하세요>");
						stu01.mathSco = input.nextInt();
						System.out.print("영어점수를 입력하세요>");
						stu01.engSco = input.nextInt();
						System.out.print("국어점수를 입력하세요>");
						stu01.korSco = input.nextInt();
						break;
				case 3:
						if(stu01.korSco==0){System.out.println("국어점수가 입력되지 않았습니다."); break;}
						else if(stu01.mathSco==0) {System.out.println("국어점수가 입력되지 않았습니다."); break;}
						else if(stu01.engSco==0) {System.out.println("국어점수가 입력되지 않았습니다."); break;}
						else {
							System.out.print("당신은 수포자입니까? 대소문자의 주의하여 yes or no 로 응답 >");
							input.nextLine( );
							String mathYN= input.nextLine();; 
							System.out.println("");
							if(mathYN.equals("yes")) {
								System.out.println("당신의 평균은 수학을 빼면 "+stu01.MathGiveupAvg());
							break;}
							else if(mathYN.equals("no")) {
								System.out.println("당신의 전과목 평균은  "+stu01.totalAvg());
							break;}
							else {
								System.out.println("잘못된 입력입니다."); break;
							}
						}
				case 4:
					System.out.println("프로그램을 종료합니다."); 
					input.close();
					return;
			}
		}

	}
}
