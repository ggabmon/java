package chap05;

public class GivenCode08_p198 {

	public static void main(String[] args) {
		int[] scores = { 100, 98, 73, 80, 52, 99,100,100 };
	
		int sum =0;
	
		for(int score:scores) { // int타입 score를 선언한다. 이때 배열의 끝이 나타날때까지 Score에 순차적으로 대입
			sum = sum + score;
		}
		System.out.println(sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("평균은"+avg);

	}
}
