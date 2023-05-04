package chap05;

public class FinalExample04_p200 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
			for(int a=0;a<array.length-1;a++) { // 앞뒤값을 비교해가면서 작성했음 ㅠㅠ
				if(array[a]<array[a+1])	max = array[a+1]; //코드가 꽤나 길어졌음.
				else max = array[a];
			}
		System.out.println("max: "+max);	
		
		int max2 = 0;
		int[] array2 = {1,5,3,8,2};
			for(int a=0;a<array.length;a++) {
				if(max2<array2[a]) max2 = array2[a];	
					
				}	
		
		System.out.println("max2: "+max2);
	}

}
