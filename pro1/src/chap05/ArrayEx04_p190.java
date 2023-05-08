package chap05;
//다차원배열 (p190) : 행과 열로 구성된 배열을 2차원 배열이라고 한다.
//행 = row = (줄) < DB에서는 레코드라고도 부름
//열 = column = (칸) < 
public class ArrayEx04_p190 {

	public static void main(String[] args) {
		
		
		int[] mathScores = 	{10,20,30,40,50};
		System.out.println("mathScores="+mathScores);
		System.out.println("mathScores.length="+mathScores.length);
		
		int[] kormathScores = {20,30,40,50,60};
		System.out.println("kormathScores="+kormathScores);
		System.out.println("kormathScores.length="+kormathScores.length);
		
		int[][] scores = {	{10,20,30,40,50},
							{20,30,40,50,60},
							{30,40,50,60,70}
							};
		
		System.out.println("scores[0]="+scores[0]);
		System.out.println("scores[1]="+scores[1]);
		System.out.println("scores[2]="+scores[2]);
		System.out.println("scores[0].length="+scores[0].length);
		//length는 저장된 배열의 길이 , length()는 문자열의 길이
		
		for(int i=0;i<scores.length;i++){
			System.out.println("scores["+i+"]="+scores[i]);
				for(int j=0;j<scores[i].length;j++ ) {
					System.out.println("scores["+i+"]["+j+"]="+scores[i][j]);}
		}
		
		int[][] scores1= { 	{10,20,30},
							{20,30,40},
							{30,40,50,60,70}}; // 가변배열 = 배열의 갯수가 항상 같지는 않다.
		
		for(int i=0;i<scores1.length;i++){
			System.out.println("scores1["+i+"]="+scores1[i]);
				for(int j=0;j<scores1[i].length;j++ ) {
					System.out.println("scores1["+i+"]["+j+"]="+scores1[i][j]);}
		}
	}

}
