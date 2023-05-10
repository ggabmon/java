package chap05;

import java.util.Arrays;


public class ArrayEx06_p195 {

	public static void main(String[] args) {
		/*
		 * 깊은복사(deep copy)
		 * 1) for 문 이용
		 * 2) Object.clone() 이용
		 * 3) Arrays.copyof(,) 이용
		 * 4) Arrays.copyOfRange(,,) 이용
		 * 4) System.arrayCopy(,,,,) 이용
		 *
		 * 얕은복사(shallow copy)
		 */
		
		int[] oriArr = {11,12,13,14,15}; // 원본배열의 선언
		System.out.println(Arrays.toString(oriArr));
		System.out.println("-----------------------------------");
		
		int[] copyArr = new int[oriArr.length*2];// 복사배열을 선언했다. 그 길이는 원본배열의 2배!
		//새로운 배열이 선언되었기때문에 주소가 다르다. 따라서 데이터가 들어있지않다.
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 주소가 서로 다름을 확인
		for(int i=0;i<oriArr.length;i++){ // 방법1. for문을 이용하여 복사본으로 선언한 배열에 그대로 대입해주었다.
			copyArr[i]=oriArr[i];
		}
		
		System.out.println(Arrays.toString(copyArr));
		System.out.println("-----------------------------------");
		
		copyArr=oriArr; // 방법2. 배열복사>  새배열명 = 원본배열명  (얕은복사!!!)
		System.out.println(Arrays.toString(copyArr)); // 내용은 잘 들어갔다! 그러나, 컴파일해보니 뒤의 5자리가 사라졌다..
		
		oriArr[0] = 6662;
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 주소가 서로 같음을 확인
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		System.out.println("-----------------------------------");
		// 방법3. Object.clone(); 이용
		// 원칙적으로 부모클래스인 Object클래스의 clone()을 상속받았다.		
		copyArr = oriArr.clone(); 
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 주소가 서로 다름을 확인 (깊은복사!!)
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		System.out.println("-----------------------------------");
		// 방법4. Arrays.copyOf(); 이용
		// 	Arrays 클래스의 copyOf 라는 method
		// 복사받을배열 = Arrays.copyOf(복사할배열, return받고싶은 copy배열의길이)
		System.out.println("copyOf 시작");
		copyArr = Arrays.copyOf(oriArr,oriArr.length); 
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 이번에도 주소가 다르다(깊은복사~)
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		copyArr = Arrays.copyOf(oriArr,2);
		System.out.println("길이에 2대입");
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 이번에도 주소가 다르다(깊은복사~)
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		System.out.println("-----------------------------------");
		System.out.println("copyOfRange 시작");

		// 방법5. Arrays.copyOfRange(,,); 이용
		// 	Arrays 클래스의 copyOfRange 라는 method
		//	복사받을배열=Arrays.copyOfRange(원본,시작index,마지막index-1)
		copyArr = Arrays.copyOfRange(oriArr,0,oriArr.length); 
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 이번에도 주소가 다르다(깊은복사~)
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		System.out.println("copyOfRange 0to3");
		copyArr = Arrays.copyOfRange(oriArr,0,3); 
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 마지막의 index에서 1을 뺀다 그 이유는 나중에..
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		System.out.println("copyOfRange 1to3");
		copyArr = Arrays.copyOfRange(oriArr,1,3); 
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 이번에도 주소가 다르다(깊은복사~)
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		copyArr = Arrays.copyOfRange(oriArr,1,10); 
		System.out.println("남은 배열의 크기가 더 크면 0으로 채우는것 봅시다");
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 이번에도 주소가 다르다(깊은복사~)
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		System.out.println("9-1번 index까지 표현되기때문에 copyArr의길이는 : "+copyArr.length);
		
		System.out.println("-----------------------------------");
		System.out.println("System.arraycopy 시작");
		// 방법6. System.arraycopy(object src, int srcPos, Object dest, int destPos, int length); 이용
		// 	System 클래스의 arraycopy 라는 method
		//  System.arraycopy(원본배열, 원본배열 시작 index, 새배열, 새배열의 시작 index, 복사해올 배열데이터의 길이);
		//
		System.arraycopy(oriArr, 0, copyArr, 4, 5); // oriArr의 index[0]부터 복사, copyArr의 index[4]부터 5개를 붙여넣는다. 
		System.out.println("oriArr의주소: "+oriArr);
		System.out.println("copyArr의주소: "+copyArr); // 이번에도 주소가 다르다(깊은복사~)
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));

		
		
		
	}
}