package chap05;

public class GivenCode03_p187 {

	public static void main(String[] args) {//처음에 args가 설정하지 않으면 배열이 존재하지 않는다. 따라서 없음~
		System.out.println(args.length);
		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		String strnum1 = args[0];
		String strnum2 = args[1];
		
		int num1 = Integer.parseInt(strnum1);
		int num2 = Integer.parseInt(strnum2);
		
		int result = num1 + num2;
		System.out.println(num1+"+"+num2+"="+result);

	}

}
