package chap11_re;

import java.util.*;
//Generic을 이용한 컬렉션 사용해보기
public class Generic_p566 {

	public static void main(String[] args) {
		//List 인터페이스 참조하는 ArrayList 클래스객체 생성
		List<String> list = new ArrayList();
		//String 타입으로만 받을것이라고 명시함
		list.add("던");
		list.add("메");
		list.add("로");
		
		// Object로도 사용이 가능하다 (다형성) , 그러나 매번 String을 Object으로 자동 타입변환을 해주어야하기에 부하가 발생하여
		// 성능이 저하된다.
		for(String E : list) { 
			System.out.println(E);
		}
		
		for(Object E : list) { // String을 object로 자동 형변환
			System.out.println((String)E);  // object를 String으로 강제 형변환.. 오래걸리겠다.
		}
		
		Iterator K = list.iterator();
		for(int i=0;i<list.size();i++) {
			System.out.println();
		}
		
		
		//Set 인터페이스 참조하는 HashSet 클래스객체 생성
		Set<String> set = new HashSet<String>();
		set.add("으아11");
		set.add("으아2222");
		set.add("으아3333333");
		Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				String str = iter.next();
				System.out.println("글자의 길이가 몇? >>"+str.length());
			}
		

	}

}
