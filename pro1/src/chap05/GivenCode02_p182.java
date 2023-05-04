package chap05;

public class GivenCode02_p182 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 97};
		int sum1 = 0;
		for(int i = 0 ;i<scores.length;i++ ) {
			sum1 += scores[i];
		}
		System.out.println("추가해서 더하면"+sum1);
		
		int sum2 = add ( new int[] {83, 90, 97});
		System.out.println("add를 새로운 메소드로 정하여 계산하면"+sum2);
	}
	public static int add(int[] scores) {
		int sum =0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
			return sum;
	}
		

}
