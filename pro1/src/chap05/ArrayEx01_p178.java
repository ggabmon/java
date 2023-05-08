package chap05;

//배열(Array) 배워봅시다. p178
/*배열(Array) : 	동일 타입의 데이터를 연속된 공간에 나열,
 				각 데이터의 index를 부여해 놓은 자료구조
 *배열선언 및 값할당
 	타입[] 변수명; 또는 타입 변수명[]; <<선언만하고 null 상태
 	타입[] 변수명 = new 타입[길이]; << 크기 직접지정해주지않으면 error
 	타입[] 변수명 = {값0, 값1, 값2,....}; <<크기 자동할당
 	타입[] 변수명 = new 타입[]{값0, 값1, 값2,....}; << 윗줄과 동일함

 *값 할당시키기
 *변수명[index번호] = 값0;
 *
 */
public class ArrayEx01_p178 {

	public static void main(String[] args) {
		//배열선언 및 값할당(p184)
		//타입[] 변수명 = new 타입[길이];
		int[] arr1 = new int[3];// 주소를 3개 만들어 intArray에 할당
		System.out.println("arr1="+arr1);// arr1은 주소를 보여준다. 값이 아니다!
		// [I@15db9742 ( @ : at ) << [I 에서 15db9742
		// 주소지(index)를 문자열화 시켜놓은것임.

		System.out.println("------------------------");
		
		int[] arr2 = {10, 20, 30, 99999999}; //
		System.out.println("arr2="+arr2);
		// [I@6d06d69c 를 출력한다. 주소지가 arr1과 다름을 확인.
		System.out.println("arr2[0]="+arr2[0]); // 10
		System.out.println("arr2[1]="+arr2[1]); // 10
		System.out.println("arr2[2]="+arr2[2]); // 39
		System.out.println("arr2[3]="+arr2[3]); // 99999999
		System.out.println("------------------------");//이렇게 처리하면 너무 피곤하다...
		
		int[] arr3 = new int[] {1, 2, 3, 5, 100, 999999};// 배열공간을 먼저 생성 후 arr3에 주소를 할당시킴
		System.out.println("arr3="+arr3);
		// [I@7852e922 를 출력한다. 주소지가 arr2, arr1과 다름을 확인.
		System.out.println("arr3.length="+arr3.length);
		for(int i=0;i<arr3.length;i++) {System.out.println("arr3["+i+"]="+arr3[i]);}
		// for문을 이용하여 값들을 출력하기
		
		System.out.println("------------------------");
		// 값을 변경
		//arr3의 인덱스0의 값을 10으로 변경하고싶을때
		arr3[0] = 10;
		System.out.println("arr3[0]="+arr3[0]);
		System.out.println("------------------------");

		int i =0;
		while(i<arr3.length) {
			arr3[i] = arr3[i]*10;
			System.out.println("arr3["+i+"]="+arr3[i]);
			i++;
		}

		
	}

}
