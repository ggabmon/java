package chap05;

public class GivenCode07_p196 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "c++","html"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);
		//Syste.arraycopy(복사할배열, 복사할배열의 시작인덱스, 복사받을배열, 복사받을배열의 시작 인덱스, 복사할 길이);
		for(int i=0;i<newStrArray.length;i++) {
		System.out.println("newStrArray["+i+"]"+newStrArray[i]);
		}
	
	}
}