package chap05;

public class GivenCode06_p195 {

	public static void main(String[] args) {
		int[] oldArray = {1, 2, 3};
		int[] newArray = new int[5];
		
		for(int i=0;i<oldArray.length;i++) { //for문을 이용해 하나하나 대입해나간다.
			newArray[i] = oldArray[i];
		}
		
		for(int i=0;i<newArray.length;i++) {
		System.out.println("newArray["+i+"]="+newArray[i]);
		}// 값을 받지 못한 newArray는 0을 반환한다. 이유: int 초기값 0
	}

}
