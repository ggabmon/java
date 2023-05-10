package chap06;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values = new int[]{1,2,3};
		
		int result1 = myCom.sum1(values);
		System.out.println("sum1을 시행 "+result1);
		
		int result2 = myCom.sum2(new int[]{1,2,3,4,5,6});
		System.out.println("sum2을 시행 "+result2);
		
		int result3 = myCom.sum2(1,2,3,4,5);
		System.out.println("...으로 선언한 매개변수합="+result3);
		int result4 = myCom.sum2(1,2,3,4,5,6,7);
		System.out.println("...으로 선언한 매개변수합="+result4);

	}

}
