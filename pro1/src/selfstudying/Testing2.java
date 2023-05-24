package selfstudying;

import java.util.Arrays;

public class Testing2 {
public static void main(String[] args) {
	int[] B = new int[] {1,2,3,4,5,6,7,8,9,10};
	
	int[] A = Arrays.copyOfRange(B, 2, 4);
	for(int i=0;i<A.length;i++) {
	System.out.println(A[i]);
	}
}

}