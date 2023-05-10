package chap06;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0;i<values.length;i++)
		{
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) { // 배열의 길이를 모를때 우리는 이것을 ... 으로 받아서 배열처리 해준다.
		int sum = 0;
		for(int i=0;i<values.length;i++)
		{
			sum += values[i];
		}
		return sum;
	}
	
}
