package chap05;

/*향상된 for문 => 배열(Array) 또는 컬렉션(Collection)
 * for( : 배열명 or 컬렉션명){     <<배열의 내용을 꺼내올때 사용
 * 
 * }
 *반복실행코드
*/
public class ArrayEx03_p197 {

	public static void main(String[] args) {
		//10,20,30,40,50을 int배열 arr1에 할당한 후 출력
		

		int i = 0;
		int[] arr1 = new int[5];
		for(i=0;i<arr1.length;i++) {
			arr1[i] = (i+1)*4;
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		for(int temp : arr1) { // "향상된 for문" > arr1에서 하나씩 꺼내서 temp에 반복될때마다 하나씩 넣는다.
			System.out.println(temp);
		}
		int sum =0;
		
		// int 배열인 arr1에 할당 된 모든 값의 총합 출력
		for(int temptemp : arr1)
		{ sum += temptemp; }
		System.out.println(sum);
		double avg = sum / arr1.length;
		System.out.println(avg);
		sum=0;
		int[] arr2 = {10,20,30,40,56,67};
		for(int temptemp : arr2)
		{ sum += temptemp; }
		avg = (double)sum/arr2.length; // 더한것이 double 형이 되어야 올바른 평균값이 나온다. 정수끼리 나눗셈을 하여 쓸경우 절삭되어 남는것이 없다.
		System.out.println(avg);
	}

}
