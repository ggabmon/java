package chap05;

public class GivenCode05_p195 {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java"; // strArray[0] 과 같은 객체(주소)를 참조하여 대답
		strArray[2] = new String("java"); // new String으로 지정할 경우 무조건 새로운 객체 취급
		
		System.out.println(strArray[0] == strArray[1]);//참조하는 주소가 같기때문에 성립 
		System.out.println(strArray[0] == strArray[2]);//참조하는 주소가 서로 다름
		System.out.println(strArray[0].equalsIgnoreCase(strArray[2]));//문자열은 서로 같음

	}

}
