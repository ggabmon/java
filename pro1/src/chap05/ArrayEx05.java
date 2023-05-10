package chap05;

import java.util.Arrays;

//Arrays클래스 : 배열을 다루는데 필요한 유용한 여러 method를 제공한다.
//			Arrays의 모든 method는 static method이다.
//			객체를 생성하지않고 Class명.Method명
//			Ex. Arrays.toString()

public class ArrayEx05 {

	public static void main(String[] args) {
		//static method로 toString으로 사용된다.
		
		//int형 숫자데이터를 저장하기 귀한 배열 arr1을 선언
		// 11 12 13 14 15 값을 초기값으로 저장
		int[] arr1 = {11,12,13,14,15};
//		arr1[5] = 55;
		//선언된 index범위를 벗어났으니 에러가 발생할 수 밖에...
		
		// java.lang.ArrayIndexOutOfBoundsException 
		// runtime error는 컴파일 오류가 아니라 더 찾기 어려우니 조심합시다.
		
		System.out.println("arr1의변수명: "+arr1);
		//[I@15db9742가 출력되는데 1차원 배열이므로 [로 시작한다.
		//@(at)뒤로 16진수로 표현된 주소이며, 우리는 이것을 hash코드라고 부른다.
		
		//for문 이용하여 출력해보자.
		for(int i=0;i<arr1.length;i++)
				{System.out.println("arr1["+i+"]="+arr1[i]);
				}
		System.out.println(Arrays.toString(arr1));
		
		
		//향상된 for문을 이용하여 출력해보자.
		//향상된 for문 >> for(데이터 타입 변수명 : 배열명)
		for( int j : arr1 )
		{System.out.println(j);
		}
		
		
		
	}
}