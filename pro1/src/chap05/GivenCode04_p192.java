package chap05;

public class GivenCode04_p192 {

	public static void main(String[] args) {
	
		int[][] mathScores = new int[2][3]; // 2칸에 3개씩 들어가는 2차원배열 생성 > 총 6개
		for(int i=0;i<mathScores.length;i++) {
		for(int k=0;k<mathScores[i].length;k++) {
		System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
		}

	} System.out.println();
	
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
	
		for(int i=0;i<englishScores.length;i++) {
			for(int j=0;j<englishScores[i].length;j++) {
				System.out.println("englishScores["+i+"]["+j+"]="+englishScores[i][j]);
		}
		}System.out.println();
		
		int[][] javaScores = { {100, 90}, {30, 50, 75}};
		for(int i=0;i<javaScores.length;i++) {
			for(int j=0;j<javaScores[i].length;j++) {
				System.out.println("javaScores["+i+"]["+j+"]="+javaScores[i][j]);
		}
		}

	}
}

