package chap05;

public class GivenCode01_p180 {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		for(int i=0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		int sum =0;
		for(int i=0; i < scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println(sum);
		System.out.println("평균:"+((double)sum/scores.length));
	}

}
