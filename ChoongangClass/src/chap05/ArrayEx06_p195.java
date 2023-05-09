package chap05;

import java.util.Arrays;


public class ArrayEx06_p195 {

	public static void main(String[] args) {

		int[] oriArr = {11,12,13,14,15}; // 원본배열의 선언
		for( int j : oriArr )
		{System.out.println(j);
		}

		int[] copyArr = new int[oriArr.length*2];// 복사배열을 선언했다. 그 길이는 원본배열의 2배!
		//새로운 배열이 선언되었기때문에 주소가 다르다. 따라서 데이터가 들어있지않다.
		for( int j : copyArr )
		{System.out.println(j);
		}
		
	
		
		
	}
}